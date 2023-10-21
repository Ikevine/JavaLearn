//There are two ways to create thread by extend thread or by implement Runnable interface
public class Threads extends Thread{

    //includes run() method which include the functionality that is supposed to
    //be implemented

    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args){
        Threads thread = new Threads();
        thread.start(); //create a thread and make it runnable
    }
}


