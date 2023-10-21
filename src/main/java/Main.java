
public class Main {

    public static void main(String[] args) {
       //file handling
       FileHandling fileHandling = new FileHandling();
       fileHandling.createFile();

       //collection handling
        CollectionFramework collectionFramework = new CollectionFramework();
        collectionFramework.map();


        //Generics
        Generics<Integer> number =new Generics(23, 20);
        number.toString();
    }
}
