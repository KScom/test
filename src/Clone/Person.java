package Clone;

import java.io.*;

public class Person extends Human implements Cloneable, Serializable {

    private String name;
    private int age;
    private Car car;

    public Person(Person person) throws CloneNotSupportedException {
        super(person.getSex(), person.getSpecies());
        this.name = person.name;
        this.age = person.age;
        car = (Car) person.getCar().clone();
    }

    public Person(Car car, int age, String name, String sex, String species) {
        super(sex,species);
        this.car = car;
        this.age = age;
        this.name = name;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       // this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                "} " + super.toString();
    }

}
