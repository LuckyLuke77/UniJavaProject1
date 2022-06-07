<div align="center">
  <h1>
    Αντικειμενοστρεφής Προγραμματισμός – Java <br>
    2ο Εξάμηνο <br>
    Ατομική εργασία 2022
  </h1>
</div>

# Description

For the implementation of this project I have created eight Classes and one interface. To use, the user choses their actions by pressing the buttons on the *Zoo Action Panel*, and enters their input on to the console, where the results of their action are also printed.

## ⚙️ Classes:
### :page_facing_up: Main.java <br>
The Main class contains the methods:
1. `main()`
   - Creates the Form
   - Loads all the saved animals from the serialized file into the program
2. `HelpAction()`
   - Prints all the available actions into the console
3. `exitAction()`
   - Stops the program
### :page_facing_up: Animal.java <br>
The Animal Class is used to generate the Animal objects created by the user. <br>
It contains the fields **name**, **code**, **category**, **age** and **weight** as well as their *getters* and *setters*. <br>
Lastly, it contains the `@Overide` method `toString()` that prints on to console all the aforementioned fields neatly arranged.
### :page_facing_up: Zoo.java <br>
The Zoo Class contains the *static* ArrayList Animals.
### :page_facing_up: Zookeeper.java <br>
The Zookeeper Class extends the Class ***Zoo*** and it contains all the basic methods in respect of the Animals.
1. `showAll()`
   - Prints all the details of all the animals inside the ArrayList Animals, on to the console.
2. `addAnimal()`
   - Asks the user for the details of the new animal
   - If the details are valid, it creates a new Object Animal, adds and saves it into the Animals ArrayList.
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
   - If **byCode** is true, searches an animal by code using ***SearchAnimalByCode()***.
   - Otherwise, if **byCode** is false, searches an animal by name using ***SearchAnimalByName()***.
   - Prints all the details of the returned animal.
6. `edit()`
   - Asks the user for the code of an animal and searches for it using ***SearchAnimalByCode()***.
   - If found, It asks the user for the detail they want to edit and the detail's new value.
   - Lastly, it prints a success message on to the console, and saves the changes.
### :page_facing_up: Zooadmin.java
The Zooadmin Class extends the Class ***Zookeeper*** and it contains the methods that are used to make sure that the user's inputs are valid.
1. `notDuplicate()`
   - Searches inside the Animals ArrayList using ***SearchAnimalByCode()*** for an animal with the given code
   - If an animal with the given code does **not** exist, it returns *true*
   - Otherwise, it returns *false*
2. `validCategory()`
   - If the given String equals *mammal, bird, reptile, amphibian or fish*, it returns *true*
   - Otherwise, it returns *false*
3. `validAge()` & `validWeight`
   - If the given value is not too crazy it returns *true*.
   - Otherwise it returns *false*
 ### :page_facing_up: SerializedFile.java
 ***SerializedFile*** is a marker interface that contains only the constant name of the serialied file, *"ZooAnimals.ser"*.
 ### :page_facing_up: SaveData.java
The SaveData Class implements the interface ***SerializedFile*** and contains the method `SaveAnimal()` that saves the ArrayList Animals inside the serialized file *"ZooAnimals.ser"*.
### :page_facing_up: RetrieveData.java
The RetrieveData Class implements the interface ***SerializedFile*** and contains the method `SavedAnimals()` that returns the ArrayList Animals saved inside the serialized file *"ZooAnimals.ser"*.
### :page_facing_up: ZooForm.java
The ZooForm Class contains all the code regarding the form.
# ScreenShots

1. Running the program we are presented with a form called *Zoo Action Panel*, and a message in the console
![no action](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooNoAction.png)<br>

2. We press the button *Help* and a list of all the available actions is printed on to the console.
![add new animal](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooHelpAction.png)<br>

3. We press the button *Show All Animals*, and a list of all the available animals inside the Zoo is printed on to the console.
![show all animals](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooShowAll1.png)<br>

4. We press the button *Add Animal* and add a new animal named Giraffe, along with its details.
![add new animal](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooAddGiraffe.png)<br>

5. We press the button *Search by name* and enter the name "dog", but there is no animal inside the zoo with such a name, so we press it again and this time enter the name "Giraffe", and it prints its details on to the console.
![search by name](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooSearchName.png)<br>

6. We press the button *Search by code* and enter the code "1111".
![search by code](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooSearchCode.png)<br>

7. We press the button *Delete* and enter the code "45688", but no animal with such a code exists, so we press it once again and enter the code "1111", consequently the poor hippo gets deleted.
![delete](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooDelete.png)<br>

8. We press the button *Edit Animal* and enter the code "0000", we attemt to change the "gender" of the animal, but "gender" is not a valid option, so no change is made. 
![edit fail](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooEditFail1.png)<br>

9. We press the button *Edit Animal* again and enter the code "0000", we attemt to change the code of the animal, but we enter a code that already exists, so no change is made
![edit fail](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooEditFail2.png)<br>

10. Once more we press *Edit Animal* and enter the code "0000", this time we attempt to change the animal's age, and successfully change it from 23 to 42.
![edit fail](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooEditSuccess.png)<br>

11. We press the button *Show all Animals* once again, and admire our wonderful changes.
![edit fail](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooShowAll2.png)<br>

12. Having had enough Zoo-keeping, we press the button "Exit", and exit our program.
![edit fail](https://github.com/LuckyLuke77/UniJavaProject1/blob/main/Screenshots/ZooExitAction.png)<br>

