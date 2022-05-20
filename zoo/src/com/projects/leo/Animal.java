package com.projects.leo;

import java.io.Serializable;

/*public class Animal {
    final String name;
    final String code;
    final String category;
    final String diet;
    final float weight;
    final int age;
    final boolean friendly;

    public Animal(
            String name,
            String code,
            String category,
            String diet,
            float weight,
            int age,
            boolean friendly)
    {
        this.name = name;
        this.code= code;
        this.category = category;
        this.diet = diet;
        this.weight = weight;
        this.age = age;
        this.friendly = friendly;
    }
}*/

public class Animal implements Serializable {
    final String name;
    final String code;

    public Animal(
            String name,
            String code)
    {
        this.name = name;
        this.code = code;
    }
}
