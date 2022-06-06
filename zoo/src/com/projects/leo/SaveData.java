package com.projects.leo;

import java.io.*;

// save the Animals ArrayList on the Serialized file ZooAnimals.ser
public class SaveData implements SerializedFile {
    protected static void SaveAnimal() {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(fileName);
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
