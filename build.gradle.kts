buildscript {
    dependencies {
        // Uncomment to add plugins to the classpath
        // Cache
          //classpath(Square.sqlDelight.gradlePlugin)
        // DI
          // classpath(Google.Dagger.Hilt.android.gradlePlugin)
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.0-alpha08" apply false
    id("com.android.library") version "7.4.0-alpha08" apply false
    id("org.jetbrains.kotlin.android") version "1.6.21" apply false
    // id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}