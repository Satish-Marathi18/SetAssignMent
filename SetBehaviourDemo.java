import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

class SetBehaviourDemo {
static void displaySetBehaviour(List<Integer> numbers){
    HashSet<Integer> hashSet = new HashSet<Integer>(numbers);
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(numbers);
    TreeSet<Integer> treeSet = new TreeSet<>(numbers);

    System.out.println(numbers);
    System.out.println("HashSet: "+hashSet);
    System.out.println("LinkedHashSet: "+linkedHashSet);
    System.out.println("TreeSet: "+treeSet);
}

public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(5,3,5,1,2);

    displaySetBehaviour(nums);
}
}