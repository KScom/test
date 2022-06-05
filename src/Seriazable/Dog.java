package Seriazable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Dog implements Externalizable{

    private String name;

    public Dog(){}

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        char[] b = this.getName().toCharArray();

        for (int i = 0; i < b.length; i++){
            b[i] = (char) (b[i] << 2); //шифруем
        }

        out.writeObject(String.valueOf(b));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        String string = (String) in.readObject();
        char[] b = string.toCharArray();

        for (int i = 0; i < b.length; i++){
            b[i] = (char) (b[i] >> 2); //шифруем
        }

        name = String.valueOf(b);
    }
}
