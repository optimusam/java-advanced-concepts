package multithreading;
import java.lang.Runnable;

class RunnableInterfaceDemo implements Runnable {
    public void run() {
        for(int i=0; i<2; i++) {
            try {
                System.out.println("Current Thread: " + Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception is caught: " + e.getMessage());
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
            Thread t1 = new Thread(new RunnableInterfaceDemo());
            Thread t2 = new Thread(new RunnableInterfaceDemo());
            Thread t3 = new Thread(new RunnableInterfaceDemo());
            t1.start();
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            try {
                t1.join();
            }
            catch (InterruptedException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
            t2.start();
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            try {
                t2.join();
            } catch (InterruptedException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
            t3.start();
        // }
    }
}
    