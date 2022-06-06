<div align="center">
  <h1>
    Αντικειμενοστρεφής Προγραμματισμός – Java <br>
    2ο Εξάμηνο <br>
    Ατομική εργασία 2022
  </h1>
</div>

# Description

For the implementation of this project I have created seven Classes and one interface.

## :toolbox: Classes:
### - Main <br>
The Main class contains the methods:
1. `main()`
   - Creates the Form
   - Loads all the saved animals from the serialized file into the program
2. `HelpAction()`
   - Prints all the available actions into the console
3. `exitAction()`
   - Stops the program
### - Animal <br>
The Animal Class is used to generate the Animal objects created by the user. <br>
It contains the fields **name**, **code**, **category**, **age** and **weight** as well as their *getters* and *setters*. <br>
Lastly, it contains the `@Overide` method `toString()` that prints all the aforementioned fields neatly arranged.
### - Zoo <br>
The Zoo Class contains the *static* ArrayList Animals.
### - Zookeeper <br>
The Zookeeper Class extends the Class ***Zoo*** and it contains all the basic methods in respect of the Animals.
1. `showAll()`
   - Prints all the details of all the animals inside the ArrayList Animals, on to the console.
2. `addAnimal()`
   - Asks the user for the details of the new animal
   - If the details are valid, it creates a new Object Animal and adds it into the Animals ArrayLIst.
3. `DeleteAnimal()`
   - Asks the user for the code of the animals that wants deleted.
   - If an animal with the given code exists, it removes it form the Animals ArrayList.
4. `SearchAnimalByCode()`
   - Searches an animal by its code.
   - If found, it returns the animal's index inside of the Animals ArrayList.
   - otherwise, it return *-1*.
5. `SearchAnimalByName()`
   - Searches an animal by its name.
   - If found, it returns the animal's index inside of the Animals ArrayList.
   - otherwise, it return *-1*.
6. `ShowAnimal(boolean byCode)`
   - Searches and prints all the details of .
   - If found, it returns the animal's index inside of the Animals ArrayList.
   - otherwise, it return *-1*.
