## Problem Statement
This program addresses the creation of an application that demonstrates the principles object-oriented programming and inheritance. A hierarchy of classes is created that uses inheritance to represent the two different residential types (a house and a small apartment). It utilizes polymorphism to determine the type of residence a person lives in.
<br>The main class is the House class. 
It has attributes such as an area (in square feet) and a door with a color. The toString method provides a description of the house, including its area and door color. </br>
<br> The SmallApartment class is a subclass of House with a fixed area of 500 square feet. Its toString method provides a description of the small apartment. </br>
<br> The Person class represents an individual with a name that lives in either a house or small apartment. Its toString method displays their name, the type of residence they live, the area of the residence, and the color of the door if applicable.

## Developer Documentation
<dl>
The 'Main' class serves as the entry point of the program, demonstrating interactions between objects of the 'House', 'Person', and 'SmallApartment' classes. It creates instances of houses, small apartments, and people. It demonstrates various scenarios, like modifying house attributes and assigning people to different types of residences.
<br> The 'House' class represents just a generic house with attributes such as area and a door with a door color. The goal is to demonstrate object-orientated programming ideas, including encapsulation, constructors, setters, getters, and method overriding. </br>
<br> I set up 'House' to have two constructors, one for initializing the area to 1500 square feet and setting the door color to be white, as well as a constructor that is parameterized to set the area of the sub class 'SmallApartment'. Because I used the key word 'super' for the 'SmallApartment' constructor and it was an integer, it had to have that second constructor in 'House' that was parametrized for the int area. The 'House' class includes getter and setter methods for the area and the door. I decided to opt out of validity checking for the setters because I did not deem them to be completely necessary for the kind of program this is. If it was an application to be used by others, I would have included them. </br>
<br> A method called 'toString' is included to display information regarding the specific house object, which includes its area. </br>
<br> The one notable method I decided to include later towards the end of development was the 'getHouseDescription' method. This method is used to get a description of the type of residence. Inside 'House' it returns "a house" and in 'SmallApartment' it gets overridden to return "a small apartment". This was done to make the 'Person's class 'toString' method easier to function and easier to understand. This ensures that a person living in a house would have the house's description and a person in a small apartment would have the apartment's description. </br>
<br> </br>

<br> The 'Door' class which is nested within 'House' encapsulates the door's color and demonstrates the concept of nested classes. </br>
<br> There was not a lot that went into the creation of this class. It includes a simple constructor  to initialize the door with a specified color, setters and getters for its color, and its own 'toString' method to generates a description of the door, including its color. </br>
<br> </br>

<br> The 'SmallApartment' class is a sub class of 'House'. The purpose of this class is to extend the 'House' class. It represents another specific type of residence with a predefined area of 500 square feet. Inheritance and method overriding are demonstrated within this class. </br>
<br> Its constructor simply just sets its area to that set 500 square feet. It uses the 'super' keyword to call the parent constructor, which in this case is the 'House' class parameterized constructor. The two overridden methods within this class include the 'toString' and 'getHouseDescription' methods from 'House'. The 'toString' is meant to provide a description of the small apartment including its area. The 'getHouseDescription' is used to just return, "a small apartment" like previously mentioned regarding the 'House' class. </br>
<br> Based on problem specifications, a 'toString' method was not mentioned to be included within this class. Because of the freedom we were presented with for creating this programs, I decided to add it in. This helped ensure that 'SmallApartment' objects would display the correct information when this method was called. During development, I encountered an issue where the 'SmallApartment' objects would display information about a house, but this fixed that up and in a simple manner. </br>
<br> </br>

<br> The 'Person' class represents an individual with a name and a place where they live. This class demonstrates the use of composition by holding instances of the 'House' class as an attribute. This is not the "classic" use of composition since the 'Person' class does not own the 'House' class, rather it references it. A 'Person' object contains a reference to a 'House' object to represent where they live. </br>
<br> The constructor of this class contains two parameters, a string for the person's name, and a reference to 'House' to initialize their house. I opted to only include a getter for the person's name since it is just retrieving what it was already set as in the constructor. A 'toString' method is included within this class in order to display information about what type of residence they live  in, its area, and details about its door if available. This method uses the 'getHouseDescription' from either the 'House' or 'SmallApartment' classes depending on where they live. If the 'getDoor' method from the house object does not return null, then the 'toString' method knows that the person lives in a house with a door and includes it within the description printed. </br>
<br> </br>

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
