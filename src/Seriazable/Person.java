package Seriazable;

import java.io.*;

public class Person extends Human implements Serializable {

    private String name;
    private int age;
    private Car car;
    private static int region = 99;

    private static final long serialVersionUID = 2L;

    public Person(Person person) throws CloneNotSupportedException {
        super(person.getSex(), person.getSpecies());
        this.name = person.name;
        this.age = person.age;
        car = (Car) person.getCar().clone();
    }

    public Person(String name, int age, Car car, String sex, String species) {
        super(sex,species);
        this.car = car;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+" {" +
                "age=" + age +
                ", car=" + car +
                ", region=" + region +
                "} " + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void writeStatic(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(region);
    }

    public static void readStatic(ObjectInputStream objectInputStream) throws IOException {
        region = objectInputStream.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public static int getRegion() {
        return region;
    }

    public static void setRegion(int region) {
        Person.region = region;
    }


}
