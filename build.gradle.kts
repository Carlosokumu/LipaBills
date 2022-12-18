buildscript {
    ext {
        //compose_version = '1.1.0-beta01'
        val compose_version by extra("1.1.0-beta01")
        val kotlin_version by extra("1.5.31")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id 'com.android.application' version '7.2.2' apply false
//    id 'com.android.library' version '7.2.2' apply false
//    id 'org.jetbrains.kotlin.android' version '1.5.31' apply false
//}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}




dependencies {

    classpath(libs.agp)
    classpath(libs.kotlin.gradlePlugin)
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
}