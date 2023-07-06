plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace = "io.yanhao.compose"
    compileSdk = 33

    defaultConfig {
        applicationId = "io.yanhao.compose"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation (AndroidX.coreKtx)
    implementation (AppCompat.base)
    implementation (AndroidX.design)
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    val composeBom = platform(Compose.bom)
    implementation(composeBom)
    androidTestImplementation(composeBom)
    implementation(Compose.foundation)
    implementation(Compose.ui)
    implementation(Compose.material3)
    implementation(Compose.preview)
    debugImplementation(Compose.uiTooling)
    debugImplementation(Compose.navigation)

    implementation(Compose.activity)
    implementation(Compose.viewmodel)
    implementation(Compose.livedata)


    testImplementation (Testing.junit)
    androidTestImplementation (Testing.espresso)
}