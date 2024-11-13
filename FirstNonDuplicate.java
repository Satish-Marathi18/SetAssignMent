import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FirstNonDuplicate {
    static Integer getFirstNonDuplicate(List<Integer> nums){
        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        Set<Integer> unique = new LinkedHashSet<Integer>();

        for(Integer num : nums){
            if(unique.contains(num)){
                if(!duplicate.contains(num)){
                    unique.remove(num);
                    duplicate.add(num);
                }
            }
            else{
                unique.add(num);
            }
        }
      Iterator<Integer> iterator = unique.iterator();
      return iterator.hasNext() ? iterator.next() :null;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        Integer firstNonDuplicate = getFirstNonDuplicate(nums);
        System.out.println(firstNonDuplicate);
    }
}
