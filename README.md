Java OOP Exercises: Instruments & Car Class
This repository contains two Java exercises designed to practice and reinforce Object-Oriented Programming (OOP) concepts in Java, specifically focusing on inheritance, polymorphism, and the use of static and final keywords.

📄 Description - Exercise Statements
1. Instruments Exercise
In a music group, there are different types of musical instruments: wind, string, and percussion.

All instruments share common attributes: name and price.

There is a base abstract class called Instrument which includes an abstract method play(). Each child class must implement this method.

The play() method must behave as follows:

Wind instrument: "A wind instrument is playing"

String instrument: "A string instrument is playing"

Percussion instrument: "A percussion instrument is playing"

This exercise also includes:

Demonstration of class loading via static blocks.

Use of static initialization in Java.

2. Car Class Exercise
This task involves creating a Java class named Car with the following attributes:

brand → static final

model → static

power → final

The purpose is to:

Demonstrate the difference between static, final, and static final.

Show which fields can be initialized in the constructor.

Explore the behavior of static vs. instance members.

Additionally, the class includes:

A static method brake() that prints: "The vehicle is braking"

A non-static method accelerate() that prints: "The vehicle is accelerating"

The main() method shows how to invoke both static and non-static methods properly.

💻 Technologies Used
Java 17 (or compatible version)

IntelliJ IDEA / Eclipse / NetBeans

JDK (Java Development Kit)

Terminal or IDE for compilation

📋 Requirements
Java JDK 17 or higher

An IDE or terminal for compiling and running Java code

Basic understanding of:

Java inheritance and polymorphism

Abstract classes and methods

Static vs. instance members

Final variables and their constraints

🛠️ Installation
Clone the repository (optional):

bash

git clone https://github.com/anaberod/S1.01.Inherance_polymorphism.L1.git

Open the project in your preferred Java IDE and ensure that Java 17+ is properly configured.

▶️ Execution
Compile the program:
bash

javac Main.java

Run the program:
bash

java Main

You should see console outputs demonstrating:

Instrument-specific play() behaviors.

Class loading via static blocks.

Car class methods and attribute behaviors.

🌐 Deployment
This is a local Java project for learning purposes only. No production deployment is required.

You may package the project into a .jar file using:

bash

jar cfe ProjectName.jar Main *.class

🤝 Contributing
To contribute:

Fork the repository

Create a new branch:

bash

git checkout -b feature-name

Make your changes and commit:

bash

git commit -m "Add new feature"

Push the branch:

bash

git push origin feature-name

Open a Pull Request

Please follow Java naming conventions and keep the code clean and well-documented.
