
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

val secpPath = listOf("../kotlin-secp256k1-kmp", "./kotlin-secp256k1-kmp")
    .map { file(it) }
    .firstOrNull { it.exists() }

if (secpPath != null) {
    includeBuild(secpPath)
}
