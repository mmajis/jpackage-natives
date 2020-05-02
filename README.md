# Native Executables with Java jpackage tool

This is a test to see how `jpackage` native executables work out with Github Actions.

The app is a simple hello world built with Gradle and packaged with the [The Badass JLink Plugin](https://badass-jlink-plugin.beryx.org/releases/latest/) which essentially runs `jpackage`.

See the [Github Actions Workflow](.github/workflows/gradle.yml) [Gradle build file](build.gradle.kts) for details.

To do: Add packaging for distribution through Homebrew & Chocolatey
