import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {
      @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}

public class Comparator{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(3);
        list.add(15);
        list.add(5);
        System.out.println(list);

        list.sort(new MyComparator());
        System.out.println(list);

    }  
}
