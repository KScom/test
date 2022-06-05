package Clone;

import java.io.Serializable;

public class Car implements Cloneable, Serializable {

    private String color;

    Car(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "color car='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
