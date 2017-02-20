buildscript {
    val springBootVersion = "1.4.3.RELEASE"
    val kotlinVersion = "1.0.6"
    extra["kotlinVersion"] = kotlinVersion

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion")
        classpath("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

apply {
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("org.springframework.boot")
    plugin("application") // used to build the jar with the required dependencies.
}

version = "0.0.1-SNAPSHOT"

configure<JavaPluginConvention> {
    setSourceCompatibility(1.8)
    setTargetCompatibility(1.8)
}

// Define where is the main method so the project can be run as a standard jar.
configure<ApplicationPluginConvention> {
    mainClassName = "demat.ApplicationKt"
}

repositories {
    mavenCentral()
}

val kotlinVersion = extra["kotlinVersion"] as String

dependencies {
    compile("org.springframework.boot:spring-boot-starter")
    compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    compile("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
    compile("org.apache.commons:commons-lang3:3.3.1")
    testCompile("org.springframework.boot:spring-boot-starter-test")
}

