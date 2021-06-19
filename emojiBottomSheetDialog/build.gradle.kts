plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(29)
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

mavenPublish {
    targets {
        // Modify the existing uploadArchives task
        // Deprecated, have to migrate
//        tasks.named<com.vanniktech.maven.publish.MavenPublishTarget>("uploadArchives") {
//            releaseRepositoryUrl = "https://oss.sonatype.org/service/local/staging/deploy/maven2/"
//            snapshotRepositoryUrl = "https://oss.sonatype.org/content/repositories/snapshots/"
//            repositoryUsername = SONATYPE_NEXUS_USERNAME
//            repositoryPassword = SONATYPE_NEXUS_PASSWORD
//        }
    }
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.21")
    implementation("com.google.android.material:material:1.2.1")

    api("androidx.emoji:emoji:1.1.0")

    implementation("androidx.recyclerview:recyclerview:1.1.0")
}
