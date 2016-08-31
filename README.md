# Example Geb and Cucmber JVM Project


### Description
This is a customization of https://github.com/geb/geb-example-cucumber-jvm.git

#### Original description from https://github.com/geb/geb-example-cucumber-jvm.git
This is an example project for using [Geb](http://geb.codehaus.org/ "Geb - Groovy Browser Automation")
with the [Cucumber-JVM](http://cukes.info/install-cucumber-jvm.html "Cucumber JVM") testing framework.

### Usage
This example is a [Gradle](http://www.gradle.org/ "Gradle") project and uses the
[Gradle Cucumber Plugin](https://github.com/samueltbrown/gradle-cucumber-plugin/ "Gradle Cucumber Plugin").
The project is using the [Gradle wrapper](http://www.gradle.org/docs/current/userguide/gradle_wrapper.html),
so if you don't need to have Gradle installed if you execute the appropriate script in the project directory
and Gradle will be downloaded for you.

To run the tests, just run `./gradlew -Dgeb.env=<host environment> -Dgeb.feature.path=<feature folder path>cucumber` on *nix or `gradlew.bat cucumber` on Windows.

See the `src/test/resources/GebConfig.groovy` file for how to run the tests with different browsers and to configure different environments.
See `build.gradle` file for how to use the geb.env system property


