package Seriazable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {



    public static void main(String[] args) {

        Person.setRegion(77);

        Person person1 = new Person("Nike", 25, new Car("Redd"),"male", "asian");
        Person person2 = new Person("Bob", 43, new Car("Black"), "male", "european");

        try {

            FileOutputStream fileOutputStream = new FileOutputStream("people.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            System.out.println(person1);
            System.out.println(person2);

            //Person.writeStatic(objectOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
