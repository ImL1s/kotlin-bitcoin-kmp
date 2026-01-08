
rootProject.name = "bitcoin-kmp"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
                useVersion("2.1.0")
            }
        }
    }
}

val secpPath = listOf("../kotlin-secp256k1-kmp", "./kotlin-secp256k1-kmp")
    .map { file(it) }
    .firstOrNull { it.exists() }

if (secpPath != null) {
    includeBuild(secpPath)
}

val cryptoPath = listOf("../kotlin-crypto-pure", "./kotlin-crypto-pure")
    .map { file(it) }
    .firstOrNull { it.exists() }

if (cryptoPath != null) {
    includeBuild(cryptoPath)
}
