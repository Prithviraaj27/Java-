import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MyComparator implements Comparator<Integer> {
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


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}