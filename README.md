# bitcoin-kmp

> [!IMPORTANT]
> **Fork Information**: This project is forked from [ACINQ/bitcoin-kmp](https://github.com/ACINQ/bitcoin-kmp). It has been modified to support **WatchOS** and **Pure Kotlin Cryptography** for specific platforms.

<p align="center">
  <img src="./docs/images/hero.png" alt="Bitcoin KMP Hero" width="100%">
</p>

<p align="center">
  <a href="https://jitpack.io/#ImL1s/kotlin-bitcoin-kmp"><img src="https://jitpack.io/v/ImL1s/kotlin-bitcoin-kmp.svg" alt="JitPack"></a>
  <a href="#"><img src="https://img.shields.io/badge/kotlin-2.1.0-blue.svg?logo=kotlin" alt="Kotlin"></a>
  <a href="#"><img src="https://img.shields.io/badge/Platform-Android%20%7C%20iOS%20%7C%20watchOS%20%7C%20JVM-orange" alt="Platform"></a>
  <a href="#"><img src="https://img.shields.io/badge/WatchOS-Supported-green?style=for-the-badge&logo=apple" alt="WatchOS Supported"></a>
</p>

<p align="center">
  <strong>₿ Powerful Bitcoin Cryptography library for Kotlin Multiplatform.</strong>
</p>

---

## 🏗️ Architecture

```mermaid
graph TD
    subgraph "Apple Target Optimization"
        A[Apple Main] --> B{Platform Check}
        B -->|watchOS| C[CoreCrypto Digest]
        B -->|watchOS| D[Pure Kotlin Pbkdf2]
        B -->|iOS| E[CommonCrypto / Native]
    end

    subgraph "Core Components"
        F[BIP32 / BIP39] --> G[Key Derivation]
        C --> H[Hash Functions]
        D --> I[Key Stretching]
    end
```

---

## ✨ Features
- **WatchOS Native**: Custom `Digest` and `Pbkdf2` implementations optimized for S-series chips.
- **Full BIP Support**: BIP32, BIP39, BIP44, BIP141 (SegWit).
- **CoreCrypto Integration**: High-performance hashing on Apple platforms via native bindings.
- **Pure Kotlin Fallbacks**: Reliability on platforms with limited native library support.

---

## 📦 Installation

```kotlin
// build.gradle.kts
implementation("com.github.ImL1s:kotlin-bitcoin-kmp:0.14.0-watchos")
```

---

## 📄 License
MIT License
