import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Butter");
        list.add("Eggs");
        list.add("Fish");
        System.out.println(list);

        for(String s: list) {
            if (s.equals("Butter")) {
                list.add("Milk");
                System.out.println("milk added");
            }
        }
        System.out.println(list);
    }
}