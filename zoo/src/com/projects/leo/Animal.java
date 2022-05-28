package com.projects.leo;

import java.io.Serializable;

public class Animal implements Serializable {
    // Animal's details
    private String name;
    private String code;
    private String category;
    private int age;
    private float weight;

    // Animal's constructor
    protected Animal(
            String name,
            String code,
            String category,
            int age,
            float weight)
    {
        this.name = name;
        this.code = code;
        this.category = category;
        this.age = age;
        this.weight = weight;
    }

    // Animal's details getters
    protected String getName() {
        return this.name;
    }

    protected String getCode() {
        return this.code;
    }

    protected String getCategory() {
        return this.category;
    }

    protected int getAge() {
        return this.age;
    }

    protected float getWeight() {
        return this.weight;
    }

    // Animal's details setters
    protected void setName(String newName) { this.name = newName;}

    protected void setCode(String newCode) { this.code = newCode; }

    protected void setCategory(String newCategory) { this.category = newCategory; }

    protected void setAge(int newAge) { this.age = newAge; }

    protected void setWeight(float newWeight) { this.weight = newWeight; }

    // return animal details neatly
    protected String AnimalDetails() {
        return "name=" + name + "\n" +
                "code=" + code +"\n" +
                "category=" + category +"\n" +
                "age=" + age + "\n" +
                "weight=" + weight;
    }
}
