import java.io.Serializable;

public class SerializationL implements Serializable {

    private static final long serialVersionUID = 1L;
    transient int a;
    static int b; //static keyword is used to variable which is common to all the instances of the class
    String name;
    int age;

    public SerializationL(int a, String name, int age) {
        this.a = a;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SerializationL{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



