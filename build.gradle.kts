import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.qwwdfsad"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    compilerOptions {
        allWarningsAsErrors = true
    }
    jvmToolchain(21)
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    allWarningsAsErrors = true
}
