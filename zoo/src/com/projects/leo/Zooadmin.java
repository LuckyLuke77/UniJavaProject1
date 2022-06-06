package com.projects.leo;

// The Zooadmin makes sure there are no errors while working with the animals!
public class Zooadmin extends Zookeeper {

    // Zooadmin checks if there already exists an animal with the given code
    protected static boolean notDuplicate(String code) {
        if (SearchAnimalByCode(code, false) == -1) return true;
        String printMessage = String.format("Error: There already exists an animal with the code %s", code);
        System.out.println(printMessage);
        return false;
    }

    // Zooadmin makes sure the category given is valid
    protected static boolean validCategory(String category) {
        switch(category) {
            case "mammal", "bird", "reptile", "amphibian", "fish":
                return true;
            default:
                String printMessage = String.format("Error: %s is not a valid animal category", category);
                System.out.println(printMessage);
                return false;
        }
    }

    // Zooadmin checks if the age of the animal given is too small or too big
    protected static boolean validAge(String ageString) {
        int age = Integer.parseInt(ageString);
        if (age > 0 && age <= 150) return  true;
        String printMessage = String.format("Error: %s is not a valid age", age);
        System.out.println(printMessage);
        return false;
    }

    // Zooadmin checks if the weight of the animal given is too small or too big
    protected static boolean validWeight(String weightString) {
        float weight = Float.parseFloat(weightString);
        if (weight > 0 && weight <= 200000) return  true;
        String printMessage = String.format("Error: %s is not a valid wight", weight);
        System.out.println(printMessage);
        return false;
    }
}



