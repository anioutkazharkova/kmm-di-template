buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.7.20")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven(url = "https://jitpack.io")
    }
}