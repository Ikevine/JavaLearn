public class Runner implements Runnable {
    public Runner() {
    }

    public void run() {
        System.out.println("thread is running");
    }
    public static  void main(String[] args){

        Thread run = new Thread(new Runner());
        run.start();
    }
}
