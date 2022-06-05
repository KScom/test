package Seriazable;

import java.io.*;

public class Externalizable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("people2.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Dog dog = new Dog("Nevada");

        dog.writeExternal(objectOutputStream);

        objectOutputStream.close();

        Dog dog2 = new Dog();

        FileInputStream fileInputStream = new FileInputStream("people2.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        dog2.readExternal(objectInputStream);

        System.out.println(dog2.getName());

        objectInputStream.close();
    }
}
