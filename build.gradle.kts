plugins {
    kotlin("jvm") version "2.2.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "xyz.lncvrt"
version = "1.0.2-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/") {
        name = "papermc-repo"
    }
    maven("https://oss.sonatype.org/content/groups/public/") {
        name = "sonatype"
    }
    maven("https://repo.lncvrt.xyz/releases") {
        name = "lncvrtRepositoryReleases"
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.4-R0.1-SNAPSHOT")
    compileOnly("xyz.lncvrt:galaxyapi:1.0.6")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

val targetJavaVersion = 21
kotlin {
    jvmToolchain(targetJavaVersion)
}

tasks {
    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")
    }

    build {
        dependsOn("shadowJar")
    }

    processResources {
        val props = mapOf("version" to version)
        inputs.properties(props)
        filteringCharset = "UTF-8"
        filesMatching("plugin.yml") {
            expand(props)
        }
    }

    runServer {
        minecraftVersion("1.21.4")
    }
}