package multithreading;
import java.lang.Thread;
public class CreatingThreads extends Thread {
    public void run() {
        try {
            System.out.println("Hello " + Thread.currentThread().getId());
        }
        catch (Exception e) {
            System.out.println("Exception is caught: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            CreatingThreads obj = new CreatingThreads();
            obj.start();
        }
    }
}