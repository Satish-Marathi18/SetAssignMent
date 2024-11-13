
import java.util.HashSet;
import java.util.Set;

public class PersonSetDemo {
    Set<Person> personSet = new HashSet<>();
    
    public void addPerson(Person obj){
        if(personSet.add(obj)){
            System.out.println(obj+" added to the Set");
        }
        else
            System.out.println(obj+" already exists in the set");
    }

    public boolean containsPerson(Person obj){
        if(personSet.contains(obj)){
            System.out.println(obj+" is present in the set");
            return true;
        }
        else{
            System.out.println(obj+" is not present in the set");
            return false;
        }
    }

    public static void main(String[] args) {
        PersonSetDemo demo = new PersonSetDemo();

        Person p1 = new Person("Satish", 22);
        Person p2 = new Person("Vikas", 21);
        Person p3 = new Person("Ganesh", 23);

        demo.addPerson(p1);
        demo.addPerson(p2);
        demo.addPerson(p3);
        demo.addPerson(p1);

        System.out.println("-------------------------");

        System.out.println(demo.containsPerson(p3));
    }
}
