plugins {
    id("org.springframework.boot") version "3.0.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("plugin.spring") version "1.7.22"
    kotlin("plugin.jpa") version "1.7.22"
}

dependencies {
    implementation(projects.dbugPresentation)
    implementation(projects.dbugCore)
    implementation(projects.dbugPersistence)
}