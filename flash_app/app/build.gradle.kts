plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.android_tuts.hotelbooking"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android_tuts.hotelbooking"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures{
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    val navVersion = "2.7.6" ;
    val appcompatVersion = "1.6.1"
    // Java language implementation
    implementation("androidx.navigation:navigation-fragment: $navVersion")
    implementation("androidx.navigation:navigation-ui: $navVersion")
    // Kotlin
    implementation ("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation ("androidx.navigation:navigation-ui-ktx:$navVersion")
    // Feature module Support
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:$navVersion")
    // Testing Navigation
    androidTestImplementation ("androidx.navigation:navigation-testing:$navVersion")
    // Jetpack Compose Integration
    implementation ("androidx.navigation:navigation-compose:$navVersion")
    implementation("androidx.appcompat:appcompat:$appcompatVersion")
    implementation("androidx.appcompat:appcompat-resources:$appcompatVersion")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}