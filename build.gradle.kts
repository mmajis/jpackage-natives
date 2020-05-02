import org.gradle.internal.os.OperatingSystem

plugins {
    java
    application
    id("org.beryx.jlink") version("2.17.9")
}

repositories {
    jcenter()
}

dependencies {

}

application {
    mainClassName = "mmajis.App"
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

buildscript {
}

jlink {
    addOptions("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages", "--verbose")
    launcher {
        name = "jpackage-natives"
    }
    jpackage {
        if(OperatingSystem.current().isMacOsX) {
            //installerType = "app-image"
        } else if(OperatingSystem.current().isWindows) {
            //installerType = "msi"
            installerOptions = listOf("--win-per-user-install", "--win-dir-chooser", "--win-menu")
        } else {
            //installerType = "deb"
        }
        installerOptions.add("--verbose")
    }
}
