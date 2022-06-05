import java.io.Serializable;

public class Car implements Cloneable, Serializable {

    public static void main(String[] args) {

        StringBuilder number1 = new StringBuilder("9999999991");

        Integer.parseInt(String.valueOf(number1.reverse()));
    }

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
