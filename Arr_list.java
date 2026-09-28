import java.util.ArrayList;
import java.util.Collections;

public class Arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(5);
        arraylist.add(2);
        arraylist.add(1);
        arraylist.add(4);
        arraylist.add(1,7);
        System.out.println(arraylist);
        System.out.println(arraylist.size());

        Collections.sort(arraylist);
        System.out.println(arraylist);

//        arraylist.remove(2);
//        System.out.println(arraylist);
//
//        System.out.println(arraylist.size());
//
//        boolean flag = arraylist.contains(5);
//        System.out.println(flag);
    }
}