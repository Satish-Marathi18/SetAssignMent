
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person person = (Person) obj;
            return this.name == person.name && this.age == person.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Name: "+name+"  Age: "+age;
    }
}



