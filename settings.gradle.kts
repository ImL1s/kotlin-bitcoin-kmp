
rootProject.name = "bitcoin-kmp"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.android.library") useModule("com.android.tools.build:gradle:${requested.version}")
        }
    }
}

if (File("../kotlin-secp256k1-kmp").exists()) {
    includeBuild("../kotlin-secp256k1-kmp")
}
