plugins {
    java
    `jvm-test-suite`
}

repositories {
    mavenCentral()
}

dependencies {
    // This dependency is used by the application.
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            // Configure the built-in test suite
            useJUnitJupiter("5.9.2")
            dependencies {
                implementation("org.assertj:assertj-core:3.24.2")
            }
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}