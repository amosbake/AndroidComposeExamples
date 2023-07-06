plugins {
    `kotlin-dsl`
}

repositories {
    maven (url= "https://maven.aliyun.com/repository/google" )
    maven (url = "https://maven.aliyun.com/repository/public" )
    maven ( url = "https://maven.aliyun.com/repository/gradle-plugin")

    google()

    // jitpack maven
    maven (url = "https://jitpack.io" )
    // 配置HMS Core SDK的Maven仓地址。
    maven (url = "https://developer.huawei.com/repo/")
}