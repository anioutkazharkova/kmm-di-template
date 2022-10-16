plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.7.20")
    implementation ("androidx.core:core-ktx:1.9.0")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.2")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.2")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.google.dagger:hilt-android:2.44")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha01")
    kapt ("com.google.dagger:hilt-android-compiler:2.44")
    kapt("androidx.hilt:hilt-compiler:1.0.0-alpha01")
    implementation ("com.squareup.picasso:picasso:2.71828")
}

android {
    compileSdkVersion(32)
    defaultConfig {
        applicationId = "com.azharkova.kmmdi.androidApp"
        minSdkVersion(29)
        targetSdkVersion(32)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}
