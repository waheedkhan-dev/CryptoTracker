# 🚀 CryptoTracker

**Crypto Coin Tracker** is a sleek and modern Android application that provides real-time cryptocurrency tracking with a minimalist dark theme design.  
Built with **Clean Architecture** and **MVI pattern**, the app delivers a seamless experience for monitoring major cryptocurrencies like **Bitcoin**, **Ethereum**, and various **stablecoins**.

---

## 🎨 Modern UI with Jetpack Compose

The app features a carefully crafted UI using **Jetpack Compose**, optimized for a dark theme and smooth crypto trading experience.

---

### 📱 Coin List Screen

- ✅ **Clean, minimalist list** showing key cryptocurrencies  
- ✅ **Custom vector icon** for each cryptocurrency  
- ✅ **Current price in USD** displayed clearly  
- ✅ **24-hour price change percentage** with color indicators:  
  - 🟢 Green for positive change  
  - 🔴 Red for negative change  
- ✅ **Smooth navigation** between list and detail views  
- ✅ **Responsive design** for both **phone** and **tablet** layouts  

---

### 📈 Coin Detail Screen

- 🪙 **Large coin icon and name** as header  
- 📊 **Key metrics displayed in card format**:
  - Market Cap  
  - Current Price  
  - 24h Price Change  
- 📈 **Interactive price chart** with:
  - Time-based price data  
  - Grid lines for clarity  
  - Timestamp markers  
- 📱 **Responsive layout** for different screen sizes  

---

### 🖼️ Screenshots

#### 📱 Coin List Screen (Light & Dark Mode)

<div>
  <img src="https://github.com/user-attachments/assets/f70eea93-8f32-46f4-81f2-af23d1a58de5" alt="Coin List Light" width="250"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/3570b377-e466-4933-af4c-a8bbe45dca5e" alt="Coin List Dark" width="250"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/f01faab3-6c12-4079-9cfa-6bcafcebc06c" alt="Coin Detail 1" width="250"/>
</div>

<br/>

#### 📈 Coin Detail Screen

<div>
  <img src="https://github.com/user-attachments/assets/0a2f453c-7948-481a-b1c8-84b762e93e94" alt="Coin Detail 2" width="400"/>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/ffd3a1ce-2c4f-4a65-9021-44b67c71e64e" alt="Coin Detail 3" width="400"/>
</div>


---

## 🛠️ Tech Stack & Open-Source Libraries

### 🧱 Architecture

- **Clean Architecture** – Separation of concerns between UI, domain, and data layers  
- **MVI (Model-View-Intent)** – Unidirectional state management for predictable UI updates  

### 🧩 Layers

- **Data Layer** – Handles application data and business logic (e.g., repository, API, caching)  
- **Domain Layer** – Contains use cases and core logic reused across the app  
- **UI Layer** – Displays data, responds to user interactions, and updates the UI accordingly  

---

### 🔧 Core Libraries & Tools

- [Jetpack Compose](https://developer.android.com/jetpack/compose) – Declarative UI toolkit for modern Android development  
- [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) – Asynchronous programming with structured concurrency  
- [Flow](https://kotlinlang.org/docs/flow.html) – Reactive stream API for emitting asynchronous values  
- [Koin](https://insert-koin.io/) – Lightweight dependency injection framework  
- [Ktor](https://ktor.io/) – HTTP client for making API requests  
- **Adaptive Navigation** – Seamlessly adapts to screen sizes (phone/tablet)  
- **Canvas API** – Custom drawing and chart rendering in Compose  

---
