import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class InsertionOrderDemo {

    static LinkedHashSet<String> getLinkedHashSet(List<String> fruits){
        LinkedHashSet<String> lhs = new LinkedHashSet<>(fruits);
        return lhs;
    }
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");

        LinkedHashSet<String> res = getLinkedHashSet(fruits);
        System.out.println(res);
    }
}
