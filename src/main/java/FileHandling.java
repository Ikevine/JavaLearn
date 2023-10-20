import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//this is the class so I need to create object in main inorder to get data
public class FileHandling {
    //I'm going to have method for creating , writing into and deleting the file
    //creating file and feedback
    public void createFile(){

        try{
            File file = new File("name.txt");
            if(file.createNewFile()){
                System.out.println("New file created "+ file.getName());
                System.out.println(file.getAbsolutePath() + " This is my location");
            }
            else{
                System.out.println("New file already existed");
                System.out.println(file.getAbsolutePath() + " This is my location");
            }

        }
        catch (IOException e){
            System.out.println("New file failed to be created");
            e.printStackTrace();
        }
    }


    public void writeFile(){
        try{
//          The argument true is for appending if you want override you can omit it or write false
            FileWriter writes = new FileWriter("name.txt", true);

            //writing row data
//            writes.write("Hellow my names are Kevine");
//            writes.close();
//            System.out.println("Data is written");

            //pop user to inter the data
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter what you feels");
            /*reading the next line*/
            String input = scanner.nextLine();
            writes.write(input);
            writes.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(){
        try{
            //we use scanner to read
            File name = new File("name.txt");
            Scanner reader = new Scanner(name);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File can't be written");
            e.printStackTrace();
        }
    }

    public void DeleteFile(){

            //first open the file then delete it
            File name = new File("name.txt");
            if(name.delete()){
                System.out.println("FIle is deleted");
            }
            else {
                System.out.println("Data can't be deleted");
            }
    }
}
