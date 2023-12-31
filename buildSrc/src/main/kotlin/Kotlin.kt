object Kotlin {
    var kotlin_version = "1.8.0"
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib
    var stdlib ="org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"
    val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
    val test = "org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version"
    val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"



}
//协程
object Coroutines{
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
    private const val version = "1.6.4"
    const val core ="org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    const val android ="org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
}