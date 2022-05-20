package com.projects.leo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    static ArrayList<Animal> Animals = new ArrayList<>();
    static protected void PrintAllAnimals() {
        String printMessage;
        for (Animal animal : Animals) {
            printMessage = String.format("name: %s, code: %s",animal.name,animal.code);
            System.out.println(printMessage);
        }
    }
    static protected void AddAnimal() {
        Scanner s = new Scanner(System.in);
        String ans;
        System.out.println("Enter the name of the new animal: ");
        ans = s.nextLine();
        String newName = ans;
        System.out.println("Enter the code of the new animal: ");
        ans = s.nextLine();
        String newCode = ans;
        Animal newAnimal = new Animal(newName, newCode);
        Animals.add(newAnimal);
        String successMessage = String.format("Successfully added the animal %s with the code %s",newName,newCode);
        SaveData.SaveAnimal(); //Save the new animal
        System.out.println(successMessage);
    }

    // delete an animal based on its code
    static protected int DeleteAnimal() {
        Scanner s = new Scanner(System.in);
        String animalCode;
        System.out.println("Enter the code of the animal you would like to delete:");
        animalCode = s.nextLine();
        int i = SearchAnimalByCode(animalCode);
        if (i == -1) return -1;
        String successMessage = String.format("Successfully deleted the animal %s with the code %s",Animals.get(i).name,Animals.get(i).code);
        System.out.println(successMessage);
        Animals.remove(i);
        SaveData.SaveAnimal();
        return 0;
    }

    // Searches for an animal based on its code inside the Animals list
    // returns its position if found
    // returns -1 if not found
    static protected int SearchAnimalByCode(String code) {
        int i = 0;
        for (Animal animal : Animals) {
            if (animal.code.equals(code)) {
                return i;
            }
            i++;
        }
        String failMessage = String.format("No animal with the code %s found",code);
        System.out.println(failMessage);
        return -1;
    }

    // Searches for an animal based on its name inside the Animals list
    // same as searchAnimalByCode()
    static protected int SearchAnimalByName(String name) {
        int i = 0;
        for (Animal animal : Animals) {
            if (animal.name.equals(name)) {
                return i;
            }
            i++;
        }
        String failMessage = String.format("No animal with the name %s found",name);
        System.out.println(failMessage);
        return -1;
    }

    // Prints the details of a specific animal
    // the animal is searched by its code if byCode=True
    // else its searched by its name
    static protected int ShowAnimal(boolean byCode) {
        Scanner s = new Scanner(System.in);
        String ans;
        String printMessage;
        Animal animal;
        int i;
        if (byCode) {
            System.out.println("Enter the code of the animal you would like to search for: ");
            ans = s.nextLine();
            i = SearchAnimalByCode(ans);
        } else {
            System.out.println("Enter the name of the animal you would like to search for: ");
            ans = s.nextLine();
            i = SearchAnimalByName(ans);
        }
        if (i == -1) return -1;
        animal = Animals.get(i);
        printMessage = String.format("name=%s\ncode=%s",animal.name,animal.code);
        System.out.println(printMessage);
        return 0;
    }

    static protected int editAnimal() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the code of the animal you would like edit for: ");
        String animalCode = s.nextLine();
        int i = SearchAnimalByCode(animalCode);
        if (i == -1) return -1;
        // what detail from the animal would you like to edit?
        //Animals.get(i).name = "test";
        return 0;
    }
}
