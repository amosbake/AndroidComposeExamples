object AndroidX {
    //core包+ktx扩展函数
    // https://mvnrepository.com/artifact/androidx.core/core-ktx
    const val coreKtx = "androidx.core:core-ktx:1.9.0"
    const val core = "androidx.core:core:1.9.0"
    const val customview = "androidx.customview:customview:1.1.0"

    //activity+ktx扩展函数
    // https://mvnrepository.com/artifact/androidx.activity/activity-ktx
    // https://developer.android.com/jetpack/androidx/releases/activity
    const val activityKtx = "androidx.activity:activity-ktx:1.5.1"

    // https://mvnrepository.com/artifact/androidx.fragment/fragment-ktx
    //fragment+ktx扩展函数
    const val fragmentKtx = "androidx.fragment:fragment-ktx:1.5.2"

    // https://mvnrepository.com/artifact/androidx.constraintlayout/constraintlayout
    //约束布局
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.0"

    // https://mvnrepository.com/artifact/androidx.cardview/cardview
    //卡片控件
    const val cardview = "androidx.cardview:cardview:1.0.0"

    // https://mvnrepository.com/artifact/androidx.recyclerview/recyclerview
    //recyclerView
    const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
    // https://mvnrepository.com/artifact/androidx.multidex/multidex
    const val multidex = "androidx.multidex:multidex:2.0.1"
    // https://mvnrepository.com/artifact/com.google.android.flexbox/flexbox
    // https://github.com/google/flexbox-layout
    // https://juejin.im/post/58d1035161ff4b00603ca9c4
    // Android 可伸缩布局 FlexboxLayout ( 支持 RecyclerView 集成 )
    const val flexbox = "com.google.android.flexbox:flexbox:3.0.0"
    //swiperefreshlayout
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout:1.2.0-alpha01"
    // https://mvnrepository.com/artifact/com.google.android.material/material
    // Android Material 组件使用详解 https://blog.csdn.net/magic0908/article/details/101029876
    const val design = "com.google.android.material:material:1.9.0"
    const val datastore = "androidx.datastore:datastore-preferences:1.0.0"
    const val startup = "androidx.startup:startup-runtime:1.1.0"
    const val futures = "androidx.concurrent:concurrent-futures-ktx:1.1.0"
    //https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout?hl=zh-cn
}

object AppCompat {
    private const val version = "1.6.1"
    const val base = "androidx.appcompat:appcompat:${version}"
    const val resource = "androidx.appcompat:appcompat-resources:${version}"
}

object Compose {
    private const val version = "1.0.4"
    const val bom = "androidx.compose:compose-bom:2023.01.00"
    const val ui = "androidx.compose.ui:ui"
    const val material = "androidx.compose.material:material"
    const val material3 = "androidx.compose.material3:material3"
    const val preview = "androidx.compose.ui:ui-tooling-preview"
    const val foundation = "androidx.compose.foundation:foundation"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val navigation = "androidx.navigation:navigation-compose:2.5.3"

    const val activity = "androidx.activity:activity-compose:1.6.1"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
    const val livedata = "androidx.compose.runtime:runtime-livedata"

    //更多compose工具集查看 accompanist项目#https://github.com/google/accompanist
}

object ViewPager {
    //viewpager
    const val viewpager = "androidx.viewpager:viewpager:1.0.0"

    // https://mvnrepository.com/artifact/androidx.viewpager2/viewpager2
    //viewpager2
    const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
}

object Paging {
    private const val version = "3.1.0-alpha03"
    const val runtime = "androidx.paging:paging-runtime:$version"
    const val runtimeKtx = "androidx.paging:paging-runtime-ktx:$version"

    // optional - RxJava2 support
    const val rxjava2 = "androidx.paging:paging-rxjava2:$version"
    const val rxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:$version"

    // optional - RxJava3 support
    const val rxjava3 = "androidx.paging:paging-rxjava3:$version"

    // optional - Guava ListenableFuture support
    const val guava = "androidx.paging:paging-guava:$version"

    // alternatively - without Android dependencies for tests
    const val testingCommon = "androidx.paging:paging-common:$version"
    const val testingCommonKtx = "androidx.paging:paging-common-ktx:$version"

    // optional - Jetpack Compose integration
    const val compose = "androidx.paging:paging-compose:1.0.0-alpha12"
}


// https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx
// https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
// https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-ktx
// https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-savedstate
// https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common-java8
object Lifecycle {
    private const val version = "2.5.1"

    const val livedata = "androidx.lifecycle:lifecycle-livedata:$version"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:$version"
    const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"

    //Saved state module for ViewModel
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"

    //Annotation processor 注释处理器
    //use kapt,not implementation
    const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"

    // if using Java8, use the following instead of lifecycle-compiler
    //提供了DefaultLifecycleObserver接口
    const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$version"

    //helpers for implementing LifecycleOwner in a Service
    const val service = "androidx.lifecycle:lifecycle-service:$version"

    //ProcessLifecycleOwner provides a lifecycle for the whole application process
    const val process = "androidx.lifecycle:lifecycle-process:$version"

    const val runtime = "androidx.lifecycle:lifecycle-runtime:$version"
    const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
}

object Camera{
    private const val camerax_version  = "1.1.0-beta01"
    const val core = "androidx.camera:camera-core:${camerax_version}"
    const val camera2 = "androidx.camera:camera-camera2:${camerax_version}"
    const val lifecycle = "androidx.camera:camera-lifecycle:${camerax_version}"
    const val video = "androidx.camera:camera-video:${camerax_version}"
    const val view = "androidx.camera:camera-view:${camerax_version}"
    const val extensions = "androidx.camera:camera-extensions:${camerax_version}"
}

object Navigation {
    private const val nav_version = "2.6.0-alpha08"
    const val fragment = "androidx.navigation:navigation-fragment-ktx:$nav_version"
    const val ui = "androidx.navigation:navigation-ui-ktx:$nav_version"
    const val dynamic = "androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

}

object Room{
    private const val room_version = "2.5.0"
    const val runtime = "androidx.room:room-runtime:$room_version"
    const val compiler = "androidx.room:room-compiler:$room_version"
    const val test = "androidx.room:room-testing:$room_version"
}