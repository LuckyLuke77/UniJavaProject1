package com.projects.leo;

import java.util.ArrayList;
import java.util.Scanner;

public class Zookeeper extends Zoo{
    static protected void PrintAllAnimals() {
        String printMessage;
        for (Animal animal : Animals) {
            printMessage = String.format("name: %s, code: %s",animal.getName(),animal.getCode());
            System.out.println(printMessage);
        }
    }
    static protected int AddAnimal() {
        Scanner s = new Scanner(System.in);
        String printMessage;
        String ans;
        System.out.println("Enter the name of the new animal: ");
        ans = s.nextLine();
        String newName = ans;
        System.out.println("Enter the code of the new animal: ");
        ans = s.nextLine();
        int i = SearchAnimalByCode(ans, false);
        if (i != -1) {
            printMessage = String.format("Error: There already exists an animal with the code %s", ans);
            System.out.println(printMessage);
            return -1;
        }
        String newCode = ans;
        Animal newAnimal = new Animal(newName, newCode);
        Animals.add(newAnimal);
        printMessage = String.format("Successfully added the animal %s with the code %s",newName,newCode);
        SaveData.SaveAnimal(); //Save the new animal
        System.out.println(printMessage);
        return 0;
    }

    // delete an animal based on its code
    static protected int DeleteAnimal() {
        Scanner s = new Scanner(System.in);
        String animalCode;
        System.out.println("Enter the code of the animal you would like to delete:");
        animalCode = s.nextLine();
        int i = SearchAnimalByCode(animalCode, true);
        if (i == -1) return -1;
        String successMessage = String.format("Successfully deleted the animal %s with the code %s",Animals.get(i).getName(),Animals.get(i).getCode());
        System.out.println(successMessage);
        Animals.remove(i);
        SaveData.SaveAnimal();
        return 0;
    }

    // Searches for an animal based on its code inside the Animals list
    // returns its position if found
    // returns -1 if not found
    static private int SearchAnimalByCode(String code, boolean failMessage) {
        int i = 0;
        for (Animal animal : Animals) {
            if (animal.getCode().equals(code)) {
                return i;
            }
            i++;
        }
        if (!failMessage) return -1;
        String printMessage = String.format("Error: No animal with the code %s found",code);
        System.out.println(printMessage);
        return -1;
    }

    // Searches for an animal based on its name inside the Animals list
    // same as searchAnimalByCode()
    static private int SearchAnimalByName(String name) {
        int i = 0;
        for (Animal animal : Animals) {
            if (animal.getName().equals(name)) {
                return i;
            }
            i++;
        }
        String failMessage = String.format("Error: No animal with the name %s found",name);
        System.out.println(failMessage);
        return -1;
    }

    // Prints the details of a specific animal
    // the animal is searched by its code if byCode=True
    // else its searched by its name
    static protected int ShowAnimal(boolean byCode) {
        Scanner s = new Scanner(System.in);
        String ans;
        int i;
        if (byCode) {
            System.out.println("Enter the code of the animal you would like to search for: ");
            ans = s.nextLine();
            i = SearchAnimalByCode(ans, true);
        } else {
            System.out.println("Enter the name of the animal you would like to search for: ");
            ans = s.nextLine();
            i = SearchAnimalByName(ans);
        }
        if (i == -1) return -1;
        Animal animal = Animals.get(i);
        System.out.println(animal.AnimalDetails());
        return 0;
    }

    static protected int editAnimal() {
        Scanner s = new Scanner(System.in);
        String ans;
        System.out.println("Enter the code of the animal you would like edit: ");
        ans = s.nextLine();
        int i = SearchAnimalByCode(ans, true); // search for the animal
        if (i == -1) return -1; // end function if animal not found
        String printMessage;
        Animal selectedAnimal = Animals.get(i);
        System.out.println(selectedAnimal.AnimalDetails()); // print the details of the selected animal
        System.out.println("Enter the detail of the animal you would like to edit (name, code): ");
        ans = s.nextLine();
        switch(ans) {
            case "name":
                System.out.println("Enter the new name of the animal: ");
                ans = s.nextLine();
                printMessage = String.format("Successfully changed the name of the animal from %s to %s!",selectedAnimal.getName(), ans);
                selectedAnimal.setName(ans);
                break;
            case "code":
                System.out.println("Enter the new code of the animal: ");
                ans = s.nextLine();
                i = SearchAnimalByCode(ans, false);
                if (i != -1) {
                    printMessage = String.format("Error: There already exists an animal with the code %s", ans);
                    System.out.println(printMessage);
                    return -1;
                }
                printMessage = String.format("Successfully changed the code of the animal from %s to %s!",selectedAnimal.getCode(), ans);
                selectedAnimal.setCode(ans);
                break;
            default:
                System.out.println("Error: Invalid Input");
                return -1;
        }
        System.out.println(printMessage);
        SaveData.SaveAnimal();
        return 0;
    }
}
