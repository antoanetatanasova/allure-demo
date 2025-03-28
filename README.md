# 🧩 Allure Demo Project

This is a simple **Java + TestNG + Allure** demo project to showcase how to integrate Allure reports with TestNG framework using Maven.

---

## 📄 Project Structure

```
allure-demo
├── src
│   └── test
│       ├── java
│       │   └── DemoTest.java
│       └── resources
│           └── allure.properties
├── target
├── pom.xml
└── README.md
```

---

## 🚀 Setup Instructions

### ✅ Prerequisites
- Java 17+
- Maven 3.8+
- Allure CLI installed and available in your system PATH  
  You can install Allure CLI using:
  ```bash
  brew install allure   # on Mac
  choco install allure  # on Windows
  ```

---

### 🔥 Project Configuration

This project uses:
- **TestNG** as test framework
- **Allure TestNG adapter**
- **AspectJ Weaver** (for annotations to work)
- Maven Surefire Plugin configured to support Allure

The Allure listener is attached in the `DemoTest.java`:
```java
@Listeners({io.qameta.allure.testng.AllureTestNg.class})
```

The `allure.properties` file is configured to save results in:
```
target/allure-results
```

---

## 🧪 How to Run Tests & Generate Allure Report

1. **Run the tests**
   ```bash
   mvn clean test
   ```

2. **Serve the Allure Report**
   ```bash
   allure serve target/allure-results
   ```

3. The Allure Report will automatically open in your browser.  
   You should see the result of `DemoTest`.

---

## ✅ Troubleshooting

If the report is empty:
- Make sure `target/allure-results` folder is populated with `.json` and `.txt` files after running `mvn clean test`.
- If the folder is empty, check if the Allure listener is attached properly in your test class.
- Ensure **Allure CLI** is correctly installed and available in your terminal.

---

## 📚 Further Reading

- [Allure TestNG Documentation](https://allurereport.org/docs/testng/)
#   a l l u r e - d e m o 
 
 
