import java.io.*;

public class Deserialization {

    private static final long serialVersionUID = 1L;
    public static  void printData(SerializationL object1){
        System.out.println("name: "+object1.name);
        System.out.println("age: " + object1.age);
        System.out.println("a "+object1.a);
        System.out.println("b"+object1.b);
    }

    public static void main(String[] args){
        SerializationL person1 = new SerializationL(2 , "kevine",6);
        String fileName = "Sdata.txt";

        try{
            //Saving object in file serialized object will be written
            FileOutputStream save = new FileOutputStream(fileName); // Specify where binary data will be written
            ObjectOutputStream out = new ObjectOutputStream(save); // FileOutputStream specify where the object will be written while this is used to convert object
             //convert into stream byte

            //method for serialization of object
            out.writeObject(person1); // Seriliaze
            save.close();


            System.out.println("Object has been serialized\n" + "Data before Deserialization");
            printData(person1);
            person1.b = 200;
        }
        catch (IOException e){
            e.printStackTrace();
        }


        //Deserialization

        try{
            //Reading the object from file
            FileInputStream read = new FileInputStream(fileName);
            ObjectInputStream objConvert = new ObjectInputStream(read);

            //Method to Deserialization
            SerializationL person2 = (SerializationL) objConvert.readObject();

            objConvert.close();
            read.close();

            System.out.println("Object after deserialization");
            System.out.println(person2);

        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
