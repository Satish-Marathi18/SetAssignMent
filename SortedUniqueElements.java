
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SortedUniqueElements {
    static TreeSet<Integer> getSortedUniqueElements(List<Integer> list){
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        return treeSet;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 2, 9, 1, 2, 9);

        TreeSet treeSet = getSortedUniqueElements(list);
        System.out.println(treeSet);

    }
}
