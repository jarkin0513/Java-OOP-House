# OOP Residential Modeling System

A Java program that demonstrates object-oriented programming concepts including inheritance, composition, method overriding, and polymorphism. The system models people living in houses and small apartments, showcasing class hierarchy and relationships.


## Problem Statement
This program demonstrates the principles of object-oriented programming and inheritance. A hierarchy of classes is created to represent two different residential types — a house and a small apartment. It utilizes polymorphism to determine the type of residence a person lives in.

- House: A class with attributes like area (in square feet) and a door with a color.

- SmallApartment: A subclass of House with a fixed area of 500 square feet.

- Person: A class representing an individual associated with either a house or a small apartment.

The program demonstrates class relationships, method overriding, and composition through these entities.

> **Note**: This project was originally part of a private GitLab repository and has been migrated to GitHub as an independent repository. As a result, the commit history starts from the migration point.

## Concepts Demonstrated
- Object-Oriented Programming (OOP)
- Inheritance
- Polymorphism
- Method Overriding
- Encapsulation
- Composition
- Unit Testing (JUnit)

## Developer Documentation

### Main Class
- The ```Main``` class serves as the entry point of the program.
- It demonstrates interactions between ```House```, ```SmallApartment```, and ```Person``` objects, creating instances and displaying their details.

### House Class
- Represents a generic house with an area and a door.
- Demonstrates encapsulation with private attributes and public getters/setters.
- Includes two constructors:
   - A default constructor setting the area to 1500 sq ft and the door color to white.
   - A parameterized constructor to allow subclass customization.

- Provides a ```toString()``` method to display house details.

- The ```getHouseDescription()``` method returns "a house" — overridden by subclasses.

### Door Class
- A nested class within ```House```.

- Encapsulates door properties like color.

- Provides a ```toString()``` method to describe the door.

### SmallApartment Class
- Inherits from ```House```.

- Overrides ```toString()``` and ```getHouseDescription()```.

- Automatically sets the area to 500 sq ft.

- Demonstrates inheritance and method overriding.

### Person Class
- Represents an individual with a name and a residence.

- Demonstrates composition by holding a reference to a ```House``` object.

- The ```toString()``` method dynamically adjusts its output based on whether the person lives in a ```House``` or ```SmallApartment```, and includes door details when applicable.

<br> More details regarding the specifics of each class, method, and variable can be found within the JavaDocs as well as in-line comments located in the source files.


![image](https://github.com/user-attachments/assets/d9348d60-dab5-494c-b96a-40b39870b8c0)

</dl>



## JavaDocs
Java Documents are visible using a local server on the machine. You must have at least the doc folder on your local machine. To access them:
1. Open a terminal
2. Navigate to the `doc/` directory
   ```cd path\to\the\project\doc```
3. Start a local server:
   ```python -m http.server 8000```
4. Open your browser and vist:
   ```http://localhost:8000/package-summary.html```
 
[Java Docs can be accessed here!](https://github.com/jarkin0513/Java-OOP-House/blob/main/doc/package-summary.html) 

## User Documentation
<dl>
 
 <dt> Launching the Program </dt>
  <dd> To start the program navigate to the Main.java file and click the run button from your IDE. 
  <br> The run button should look like a green arrow, or something similar to that. </br>
  </dd>

 <dt> Using the Program </dt>
 <dd> Once the program begins it will display different instances of the classes I have set up. There is no user interaction with the program. You will first see a House, Door, and SmallApartment constructor test that makes sure each of them are correctly set to their default values. The default area for a house is 1500 square feet and its door color is white. For a small apartment, its default area is set to be 500 square feet. The small apartments do not have any other properties, like how the house has a door.
<br> The remaining lines seen in the command-line window show more instances of the classes with set values this time, instead of their default ones. For these, each house or small apartment has a person associated with them that live there. Details of the person's name, the square footage of their house / small apartment, and the color of their door (if they live in a house) will be printed out.
<br> The program will automatically terminate by itself, but the contents that were printed out in the command-line console will still be available to view.
   
 </dd>

<dt> Exiting the Program </dt>
 <dd> Since the program terminates on its own, there is nothing required to exit the program. </dd>

</dl>

## Source Code
[Click here to view the source code](https://github.com/jarkin0513/Java-OOP-House/tree/main/src)
