# CRUD Backend App

This is a simple CRUD (Create, Read, Update, Delete) backend application built using Java and JDBC. It provides a console-based interface for managing data in a database.

## Features

- Create new records in the database.
- Read existing records from the database.
- Update existing records in the database.
- Delete records from the database.

## Requirements

- Java Development Kit (JDK) installed.
- JDBC driver for your preferred database system.
- Database connection details (URL, username, password).

## Setup

1. Clone the repository to your local machine.


2. Compile the Java source files.


3. Run the application.


4. Follow the on-screen instructions to perform CRUD operations on the database.

## Configuration

1. Open the `Main.java` file in a text editor.

2. Update the database connection details in the `getConnection()` method. Replace the placeholders with your actual connection URL, username, and password.

```java
String url = "jdbc:mysql://localhost:3306/mydatabase";
String username = "your-username";
String password = "your-password";
