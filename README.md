<div align="center">

<h3 align="center">Software Design Patterns in Java</h3>

  <p align="center">
    Implementation of common GoF design patterns in Java.
    <br />
     <a href="https://github.com/tridibbanik17/software-design-i">github.com/tridibbanik17/software-design-i</a>
  </p>
</div>

## Table of Contents

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#key-features">Key Features</a></li>
      </ul>
    </li>
    <li><a href="#architecture">Architecture</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

## About The Project

This project provides Java implementations of several Gang of Four (GoF) design patterns, offering practical examples for understanding and applying these patterns in software development. The included patterns are: Command, Decorator, MVC (Model-View-Controller), and Singleton.

### Key Features

- **Command Pattern:** Demonstrates encapsulating a request as an object, allowing for parameterization of clients with different requests, queuing of requests, and logging of requests.
- **Decorator Pattern:** Shows how to add responsibilities to objects dynamically, providing a flexible alternative to subclassing for extending functionality.
- **MVC Pattern:** Illustrates the separation of concerns by dividing the application into Model (data), View (user interface), and Controller (input handling) components.
- **Singleton Pattern:** Provides a way to ensure that only one instance of a class exists and provides a global point of access to it.

## Architecture

The project is structured into separate directories for each design pattern, with each directory containing the necessary Java files to demonstrate the pattern's implementation.

- **Command:** Contains `Caller.java` and the `Command` interface (not present in the provided code but implied).
- **Decorator:** Includes `Client.java`, `Component.java`, `ConcreteComponent.java`, `ConcreteDecorator.java`, and `Decorator.java` to showcase dynamic object extension.
- **MVC:** Consists of `Client.java`, `Controller.java`, `Model.java`, `Observer.java`, `Subject.java`, and `View.java` to exemplify the separation of concerns in application design.
- **Singleton:** Features `Client.java` and `Singleton.java` to demonstrate the creation of a single instance class.

The project utilizes Java as the primary language for implementing the design patterns.  No external libraries are explicitly required, focusing on core Java concepts.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed.
  ```sh
  # Example: Check Java version
  java -version
  ```

### Installation

To run the examples, clone the repository and compile the Java files using a Java compiler (like `javac`). Then, execute the `Client.java` file in each pattern's directory to see the pattern in action.

1. Clone the repository:
   ```sh
   git clone https://github.com/tridibbanik17/software-design-i
   ```
2. Navigate to the directory of the pattern you want to run (e.g., `Decorator`):
   ```sh
   cd software-design-i/Decorator
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the `Client.java` file:
   ```sh
   java Client
   ```
   Repeat steps 2-4 for other patterns (Command, MVC, Singleton).

## Acknowledgments

- This README was created using [gitreadme.dev](https://gitreadme.dev) — an AI tool that looks at your entire codebase to instantly generate high-quality README files.
