plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "com.withplum.emojiapp"
        minSdk = 23
        targetSdk = 30
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(project(":emojiBottomSheetDialog"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:_")
    implementation("androidx.constraintlayout:constraintlayout:_")
    implementation("androidx.appcompat:appcompat:_")
}
