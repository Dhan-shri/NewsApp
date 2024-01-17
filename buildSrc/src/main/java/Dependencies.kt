

// THis is central dependencies management
object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtx}" }
//    "androidx.activity:activity-compose:1.8.2"
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
//    "androidx.compose:compose-bom:2023.08.00"
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }

    val composeUi by lazy { "androidx.compose.ui:ui" }

    val composeUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }

    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }

//    "androidx.appcompat:appcompat:1.6.1"
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
//    "com.google.android.material:material:1.11.0"
    val androidMaterial by lazy { "com.google.android.material:material:${Versions.androidMaterial}" }
//    "junit:junit:4.13.2"
    val junit by lazy { "junit:junit:${Versions.junit}" }
//    "androidx.test.ext:junit:1.1.5"
    val androidTestExtJunit by lazy { "androidx.test.ext:junit:${Versions.androidTestExtJunit}" }
//    "androidx.test.espresso:espresso-core:3.5.1"

    val androidTestEspressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.androidTestEspressoCore}" }

    val lifecycleViewModelKts by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleRuntimeKtx}" }

    val lifecycleViewmodelCompose by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModelKts}" }
    val lifecycleViewmodel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKts}" }
    val lifecycleLivedata by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleViewModelKts}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleViewModelKts}" }




}


//use utitlies module in app module
object Modules {

    const val utilities = ":utilities"

}