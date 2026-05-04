# Singleton Design Pattern

## Overview
This project demonstrates the **Singleton Design Pattern**, a creational design pattern that ensures a class has **only one instance** and provides a global point of access to it.

The Singleton pattern is widely used in scenarios where a single shared resource is required, such as configuration settings, logging, or database connections.

---

## Concept

The Singleton pattern:
- Restricts instantiation of a class to one object
- Provides a global access point to that instance
- Controls access to shared resources efficiently

> It ensures only one instance exists and is reused throughout the application. :contentReference[oaicite:1]{index=1}

---

## Structure

The project follows the standard Singleton structure:

- **Private Static Instance** → Holds the single object
- **Private Constructor** → Prevents external instantiation
- **Public Static Method** → Provides access to the instance

---

## Technologies Used
- Java (update if your repo uses another language)

---

## Project Structure

src/

├── Singleton.java

├── Main.java


---

## How It Works

1. The class constructor is made private
2. A static instance of the class is created
3. A public method (`getInstance()`) returns the same instance every time

Example flow:

Client → getInstance() → Same Object Returned

---

## How to Run

1. Clone the repository:
git clone https://github.com/sandu2098/Singleton-Pattern.git
2. Navigate to the project folder:
cd Singleton-Pattern
3. Compile and run:
javac Main.java
java Main

## Author

Udara Rathnayake


---

### Want to upgrade this README?
I can help you:
- :contentReference[oaicite:3]{index=3}
- :contentReference[oaicite:4]{index=4}
- :contentReference[oaicite:5]{index=5}
- :contentReference[oaicite:6]{index=6}

Just tell me
::contentReference[oaicite:2]{index=2}
