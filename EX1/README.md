📄 Description - Exercise Statement
In a music group, there are different types of musical instruments. There are wind, string, and percussion instruments.

All instruments have attributes such as their name and price. Additionally, they have a method called play(). This method is abstract in the base class Instrument, and therefore must be implemented in the child classes.

If a wind instrument is being played, the method should print to the console: "A wind instrument is playing".

If a string instrument is being played: "A string instrument is playing".

If a percussion instrument is being played: "A percussion instrument is playing".

The class loading process occurs only once. Demonstrate that the class can be loaded either by creating the first instance of the class or by accessing a static member of it.

Research information about initialization blocks and static blocks in Java.

💻 Technologies Used

Java 17 (or compatible version)

IntelliJ IDEA / Eclipse (recommended IDE)

JDK (Java Development Kit)

📋 Requirements

Java JDK 17 or higher

An IDE or terminal for compiling and running Java code

Git (optional, for cloning the project)

Basic understanding of OOP (Object-Oriented Programming) in Java

🛠️ Installation

Clone the repository (if applicable): https://github.com/anaberod/S1.01.Inherance_polymorphism.L1/tree/209d11bd088a1dabda83f5aa2075c62c8e52a2c6/EX1

Open the project in your preferred IDE.

Make sure the JDK is properly configured.

▶️ Execution

Compile the project:

bash

javac Main.java
Run the project:

bash

java Main

You should see messages indicating which instrument is playing and when class loading occurs via static blocks.

🌐 Deployment

This is a local Java project for learning purposes. No deployment to a server or production environment is required. You can package it into a .jar file if needed using:

bash

jar cfe instruments.jar Main *.class

🤝 Contributing

If you'd like to contribute:

Fork the repository

Create a new branch (git checkout -b feature-name)

Commit your changes (git commit -m "Add new feature")

Push to the branch (git push origin feature-name)

Open a Pull Request

Please ensure your code is well-documented and follows Java naming conventions.