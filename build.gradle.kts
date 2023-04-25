plugins {
    kotlin("jvm") version "1.7.22"
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        version = "1.7.22"
    }

    dependencies {
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    }
}

allprojects {
    group = "com.dbugbackend.jp.kr"
    version = "0.0.1-SNAPSHOT"

    tasks{
        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "17"
            }
        }

        compileJava {
            sourceCompatibility = JavaVersion.VERSION_17.majorVersion
        }
    }

    repositories {
        mavenCentral()
    }
}

