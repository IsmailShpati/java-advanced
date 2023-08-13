**Exercise 1 - Alien**
-----------------------------------
Create an Alien class. Include at least three protected data members of your choice, such
as the number of eyes the Alien has. Include a constructor that requires a value for each
data field and a toString() method that returns a String containing a complete description
of the Alien. Save the file as Alien.java.

Create two classes_oop_enum_presentation.classes *Martian* and *Jupiterian* that descend from Alien. Supply each
with a constructor that sets the Alien data fields with values you choose. For example,
you can decide that a Martian has four eyes but a Jupiterian has only two. Save the files
as Martian.java and Jupiterian.java.

Create an application that instantiates one Martian and one Jupiterian. Call the
toString() method with each object and display the results. Save the application as
CreateAliens.java


**Exercise 2 - Zoo**
---------------
Imagine you're building a virtual zoo program in Java. You want to represent 
different types of animals with their specific behaviors, and you also want 
to handle these animals in a unified way using classes_oop_enum_presentation.oop.polymorphism.

Create a base abstract class Animal that has a name and a method that needs to be enforced to
its subclasses that is called makeSound and returns nothing.

Create 3 subclasses for Animal of your choice such as Lion.

Create a Zoo class that manages all the animals. 
It must have one attribute which is an array of the all the animals with an initial capacity of 100
(hint: animals may be of different types but the array is only one and you can define more than 1 attribute if you want
but the animal array is required). 
The Zoo class has the following methods:
- *addAnimal* which takes an animal as a parameter and adds it to the animals arrays
- *makeSounds* takes no parameters and return nothing but runs the method makeSound of every animal 





