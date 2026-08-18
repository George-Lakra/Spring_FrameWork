# 🌱 Spring Framework Learning

A hands-on Spring Framework learning repository covering Spring Core concepts from **Traditional Java Application Design** to **Annotation-Based Configuration**.

## 📚 Topics Covered

### 1. 🏗️ Traditional Java

* 🔗 Tight Coupling
* 🔄 Interface and Implementation
* 🆕 Dependency creation using the `new` keyword
* ⚠️ Limitations of tightly coupled applications

### 2. 💉 Dependency Injection

* 🔓 Loose Coupling
* 🏗️ Constructor Injection
* 🔧 Setter Injection
* 📦 Dependency Injection using Spring Container

### 3. 📄 XML Configuration

* ⚙️ Spring Bean Configuration using XML
* 🫘 Bean Creation
* 🏗️ Constructor Injection using XML
* 🔧 Setter Injection using XML
* 🌱 `ApplicationContext`
* 📂 `ClassPathXmlApplicationContext`

### 4. ☕ Java-Based Configuration

* ⚙️ `@Configuration`
* 🫘 `@Bean`
* 🔨 Bean creation using Java configuration
* 💉 Dependency Injection using Java configuration
* 📦 `AnnotationConfigApplicationContext`

### 5. 🏷️ Annotation-Based Configuration

* 🧩 `@Component`
* 🔍 `@ComponentScan`
* 💉 `@Autowired`
* 🎯 `@Qualifier`
* ⭐ `@Primary`
* 🔀 Multiple Bean resolution

## 🧪 Examples

The repository contains practical examples based on:

* 🎓 **Student Management** – Traditional Java and XML Configuration
* 🚗 **Car & Engine** – Constructor Dependency Injection
* 👨‍💼 **Employee & Repository** – Setter Dependency Injection
* 🎮 **Game Character** – Java-Based Configuration
* 🏍️ **Bike & Engine** – Annotation-Based Configuration with `@Autowired`, `@Qualifier`, and `@Primary`

## 📂 Project Structure

```text
Spring_Learn/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── spring/
│       │           ├── traditional/
│       │           ├── DependencyInjection/
│       │           │   ├── mycar/
│       │           │   └── myoffice/
│       │           ├── xmlconfig/
│       │           ├── javaconfig/
│       │           └── annotationconfig/
│       │
│       └── resources/
│           ├── spring.xml
│           ├── mycar.xml
│           └── myoffice.xml
│
├── pom.xml
└── readme.md
```

## 🛠️ Technologies

* ☕ Java 24
* 🌱 Spring Framework 7
* 📦 Maven
* 🔧 Git & GitHub

## 🎯 Purpose

This repository is part of my **Spring Framework learning journey**, where concepts are implemented practically and progressively to understand how Spring handles **object creation, dependency management, configuration, and dependency injection**.
