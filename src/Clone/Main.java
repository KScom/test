package Clone;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

        Car car = new Car("Green");

        Person originalPerson = new Person(car,25,"Mike","male","asian");
        Person clonePerson = (Person) originalPerson.clone();
        Person superClonePerson = new Person(originalPerson);

        superClonePerson.getCar().setColor("Gold");
        originalPerson.getCar().setColor("Red");
        originalPerson.setSpecies("european");
        clonePerson.getCar().setColor("Black");

        System.out.println(originalPerson);
        System.out.println(clonePerson);
        System.out.println(superClonePerson);

    }
}
