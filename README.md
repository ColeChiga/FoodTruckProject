# FoodTruckProject

# Description
The food truck project is a project used to test someones understanding and use of programs in different classes and packages, including using imports, static and non-static fields, and public and private fields, constructors, and methods.

In this program The user is asked to either provide a name for a food truck or to quit. If the user inputs a name they are then asked to give a type of food and a rating for the food truck. This allows the program to create a food truck in the array fleet[]. It assigns the food truck an ID based on the number of trucks entered up too that point. This process repeats until the user enters quit (not case sensitive) or their have been 5 trucks entered

The program then shows a menu to allow the user to choose if they want to: 
1. List all of the food trucks (prints the toString for the truck)
2. See the average rating for the trucks
3. See the highest rated truck (prints the toString for the highest rated truck)
4. Quit the program 

If the user inputs a number that is invalid they will be shown an error. Once a valid choice is made the program will execute the choice and bring up the menu again. This repeats until the user selects 4 (quit). in which the program gives an exit statement and ends.

# Technologies Used
Java, OOP, Eclipse

# Lessons Learned
During this lesson I learned a few things regaarding creating classes in different packages. This includes when to use private versus public fields, constructors, and methods, when to use static and non-static fields, and how to properly use an array of objects.

In this lab I used private fields and a mix of private and public getters and setters to ensure that the data that a user would need to be able to see or change can be accessed appropriatley, while the data that should not be accessable to a user isn't.

This lab also helped me to learn when the appropriate time to use a static field is, such as when you have a number that needs to be iterated based on how many times the class was used. For example, in this lab the ID given to the truck is supposed to change based on how many new trucks are created, this is tracked using a private static field that allows for the tracking to be done within the FoodTruck class (rather than the app). 

I also further developed my understanding of how to create an array of objects and store, change, and access data within that array. In addition, I learned how to properly iterate through an array of an object to access the various types of data stored in the class without error in the program.



