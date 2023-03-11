package class30_HW;

import java.util.Map;
import java.util.TreeMap;

public class HomeworkPart2 {
    public static void main(String[] args) {

        Map<Integer,Person1> info=new TreeMap<>();
        info.put(10001,new Person1("John","Doe",35,85000));
        info.put(10002,new Person1("Michael","Dudikov",56,245000));
        info.put(10003,new Person1("Jane","Doe",33,90000));
        info.put(10004,new Person1("Samuel","L.Jackson",58,345000));

        for (Person1 p : info.values()) {
            p.userDetails();
            System.out.println();
        }


    }
}
class Person1{
    String name;
    String lastName;
    int age;
    int salary;

    public Person1(String name, String lastName, int age, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void userDetails(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }




}

