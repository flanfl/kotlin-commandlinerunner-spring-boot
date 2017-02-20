# CommandLineRunner Spring Boot Kotlin sample project

This is the source code for the a sample CommandLineRunner Spring Boot application developed with Kotlin.

You can launch the application with by running:

		$ ./gradlew bootRun

The project can be build with

		$ ./gradlew clean build
		
And it is possible to run the jar file located in the build/lib folder

		$ java -jar arg1 arg2
		
This project uses `kotlin-spring` plugin to avoid requiring `open` modifier on proxified
classes and methods, see [this blog post](https://blog.jetbrains.com/kotlin/2016/12/kotlin-1-0-6-is-here/) for more details.

Make sure you have at least IntelliJ IDEA 2016.3 and Kotlin plugin 1.0.6 since `kotlin-spring` require this version.

This project uses a [Kotlin based Gradle](https://blog.gradle.org/kotlin-meets-gradle) configuration,
but `build.gradle.kts` auto-complete is currently not available since Kotlin `1.1-M04` IDEA
plugin needed for that does not allow to use `kotlin-spring` compiler in a reliable way.

This project is based on [sdeleuze](https://github.com/sdeleuze/spring-boot-kotlin-demo) own sample projet.