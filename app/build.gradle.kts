plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("plugin.serialization")  version "1.6.21"

    // id("com.squareup.sqldelight")

    /* Hilt
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
     */

    //id("org.jlleitschuh.gradle.ktlint")
}

val composeUiVersion = "1.2.0-beta01"

android {
    namespace = "com.example.androidtemplate"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.androidtemplate"
        minSdk = 26
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            setProguardFiles(listOf(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"))
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0-beta01"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Lifecycle
    implementation(AndroidX.core.ktx)
    implementation(AndroidX.lifecycle.runtimeKtx)

    // Compose
    implementation(AndroidX.constraintLayout.compose)
    implementation(AndroidX.activity.compose)
    implementation(AndroidX.compose.ui)
    implementation(AndroidX.compose.ui.tooling)
    implementation(AndroidX.compose.material)
    implementation(COIL.compose)

    // Async
    implementation(KotlinX.coroutines.core)
    // Serialization
    implementation(KotlinX.serialization.json)
    // Network
    implementation(Ktor.client.okHttp)
    implementation(Ktor.client.serialization)
    implementation(Ktor.client.logging)

    // Cache
    // implementation(Square.sqlDelight.drivers.android)
    // implementation(Square.sqlDelight.extensions.coroutines)

    // SharedPreferences
    // implementation(AndroidX.dataStore.core)

    // DI
    // implementation(Google.Dagger.hilt.android)
    // kapt(Google.Dagger.hilt.compiler)

    debugImplementation(AndroidX.compose.ui.tooling)
    debugImplementation(AndroidX.compose.ui.testManifest)

    testImplementation(Testing.junit4)
    testImplementation(KotlinX.coroutines.test)
    testImplementation(CashApp.turbine)
    testImplementation(AndroidX.test.ext.junit)

    androidTestImplementation(AndroidX.test.espresso.core)
    androidTestImplementation(AndroidX.compose.ui.testJunit4)

}