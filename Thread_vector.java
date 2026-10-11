import java.util.ArrayList;
import java.util.Vector;

public class Thread_vector {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                arrlist.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                arrlist.add(i);
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of the arraylist: "+arrlist.size());

        // Using Vector ------------------------------------------------------------

        Vector<Integer> v = new Vector<>();
        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                v.add(i);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                v.add(i);
            }
        });

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of the vector: "+v.size());



    }
}