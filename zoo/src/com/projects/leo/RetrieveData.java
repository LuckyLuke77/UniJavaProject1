package com.projects.leo;

import java.io.*;
import java.util.ArrayList;

// Access the serialized file ZooAnimals.ser and return its contents
public class RetrieveData implements SerializedFile {
    protected static ArrayList<Animal> SavedAnimals() {
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            ArrayList<Animal> savedAnimals = (ArrayList<Animal>)ois.readObject();
            return savedAnimals;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
