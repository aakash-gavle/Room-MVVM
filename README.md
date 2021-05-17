# Room-MVVM
Room implementation on Android using Kotlin and one of it’s Coroutine feature with MVVM architecture


# plugins

    id 'kotlin-kapt'
    id 'kotlin-android-extensions'

#dependencies

    def room_version = "2.3.0"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation "androidx.room:room-ktx:$room_version"

    // - - ViewModel and LiveData
    def lifecycle_version = "2.3.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    // - - Kotlin Coroutines
    def coroutines_version = "1.3.9"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"
