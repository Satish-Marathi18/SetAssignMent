
import java.util.HashSet;
import java.util.Set;

public class SubsetOperation {

    static boolean checkSubset(Set<Integer> a, Set<Integer> b){
        for(Integer x : a){
            if(b.contains(x) == false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(5);

        Set set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean res = checkSubset(set1,set2);
        System.out.println(res);
    }
}
