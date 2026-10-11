import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println(v);
        v.remove(1);
        System.out.println(v);
        v.set(1,2);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.contains(2));
        System.out.println(v.capacity());
        v.clear();
        System.out.println(v.isEmpty());
    }
}