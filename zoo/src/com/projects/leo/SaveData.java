package com.projects.leo;

import java.io.*;


public class SaveData {
    protected static void SaveAnimal() {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("zoo.ser");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(Zoo.Animals);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
