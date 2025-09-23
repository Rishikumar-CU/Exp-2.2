Overview of Experiment 2.2 (All parts - a,b,c)
This repository contains three Java programs demonstrating core concepts of efficient data processing and management. Each part focuses on a different feature of Java — from autoboxing/unboxing to object serialization and file handling — with practical, real-world examples.




Part A – Sum of Integers Using Autoboxing and Unboxing
Accepts multiple integer inputs as strings.

Parses strings into int values using Integer.parseInt().

Stores values in an ArrayList<Integer> (autoboxing).

Calculates the sum using enhanced for-loops (unboxing).

Demonstrates seamless conversion between primitives and wrapper classes.




Part B – Serialization and Deserialization of a Student Object
Defines a Student class with studentID, name, and grade.

Implements Serializable to allow object persistence.

Uses ObjectOutputStream to serialize and save the object to a file.

Uses ObjectInputStream to deserialize and reconstruct the object.

Prints student details to verify successful deserialization.




Part C – Menu-Based Employee Management System Using File Handling
Menu-driven application with options to:

Add Employee – prompts for details and saves to a file.

Display All Employees – reads and displays records from the file.

Exit – closes the application gracefully.

Uses BufferedWriter/BufferedReader for text-based storage.

Demonstrates persistent storage and retrieval of structured data.
