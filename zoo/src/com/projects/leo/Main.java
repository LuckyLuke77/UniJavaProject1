package com.projects.leo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zoo.Animals = RetrieveData.SavedAnimals(); // Every time the program runs save all the existing animals in the list
        System.out.println("Type help for a list of actions.");
        Action();
    }

    private static int Action() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an action: ");
        String ans = s.nextLine();
        if (ans.equals("exit")) return -1;
        if (ans.equals("help")) HelpAction();
        else if (ans.equals("show all")) Zoo.PrintAllAnimals();
        else if (ans.equals("add")) Zoo.AddAnimal();
        else if (ans.equals("delete")) Zoo.DeleteAnimal();
        else if (ans.equals("search by code")) Zoo.ShowAnimal(true);
        else if (ans.equals("search by name")) Zoo.ShowAnimal(false);
        else if (ans.equals("edit")) Zoo.editAnimal();
        else System.out.println("Invalid action - press help for the list of actions");
        Action();
        return 0;
    }

    private static void HelpAction() {
        System.out.println("show all - print the names of all the animals");
        System.out.println("add - add a new animal");
        System.out.println("delete - delete an animal by its code");
        System.out.println("search by name - show the details of an animal based on its name");
        System.out.println("search by code - show the details of an animal based on its code");
        System.out.println("exit - exit the program");
    }
}
