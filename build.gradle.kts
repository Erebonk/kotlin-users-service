import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.rohanprabhu.gradle.plugins.kdjooq.*

plugins {
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
    kotlin("jvm") version "1.3.71"
    kotlin("plugin.spring") version "1.3.71"
    id("com.rohanprabhu.kotlin-dsl-jooq") version "0.4.5"
}

group = "com.ere.consumer"
version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    jooqGeneratorRuntime("org.postgresql:postgresql:42.2.0")
    runtimeOnly("org.postgresql:postgresql:42.2.0")
    implementation("org.jooq:jooq")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-amqp")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.postgresql:postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    testImplementation("org.springframework.amqp:spring-rabbit-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}

jooqGenerator {
    configuration("primary", sourceSets.getByName("main")) {
        configuration = jooqCodegenConfiguration {
            jdbc {
                username = "postgres"
                password = "postgres"
                driver = "org.postgresql.Driver"
                url = "jdbc:postgresql://localhost:5432/public"
                schema = "dbo"
            }

            generator {
                target {
                    packageName = "com.ere.consumer"
                    directory   = "${project.buildDir}/generated/jooq/primary"
                }

                database {
                    name = "org.jooq.meta.postgres.PostgresDatabase"
                    inputSchema = "dbo"
                }
            }
        }
    }
}