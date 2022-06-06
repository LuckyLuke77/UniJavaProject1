package com.projects.leo;

public class Main {

    public static ZooForm form; // im a genius
    public static void main(String[] args) {
        Zoo.Animals = RetrieveData.SavedAnimals(); // Every time the program runs save all the existing animals in the list
        form = new ZooForm(); // Create a new ZooForm Object
        System.out.println("Select an action using the Action Panel");
    }

    protected static void HelpAction() { // Print all the available actions
        System.out.println("All the Actions:");
        System.out.println("Show All - print the names of all the animals");
        System.out.println("Add - add a new animal");
        System.out.println("Delete - delete an animal by its code");
        System.out.println("Search by name - show the details of an animal based on its name");
        System.out.println("Search by code - show the details of an animal based on its code");
        System.out.println("Edit - edit an animal's details");
        System.out.println("Exit - exit the program");
    }

    protected static void exitAction() {
        System.exit(0);
    } // Exit the program method
}
