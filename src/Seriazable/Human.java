package Seriazable;

import java.io.Serializable;

public class Human implements Serializable {

    private final String sex;
    private String species;

    public Human(String sex, String species) {
        this.sex = sex;
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Human{" +
                "sex='" + sex + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
