package class29_HW;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class HomeworkClass29 {
    public static void main(String[] args) {

        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Esat Brunswick");
        cities.add("Marlboro");
        cities.add("Albany");
        cities.add("Manalapan");
        cities.add("Arlington");
        cities.add("Linden");
        cities.add("Atlanta");
        cities.add("Trenton");

        cities.removeIf(s ->s.startsWith("A"));
        System.out.println(cities);

        HashMap<Integer,String> students=new HashMap<>();
        students.put(001,"Michael");
        students.put(002,"Mike");
        students.put(003,"Marie");
        students.put(011,"Angel");
        students.put(023,"Olga");
        students.put(021,"Marie");
        students.put(005,"Holger");

        System.out.println(students);
        System.out.println(students.values());
        for (String s : students.values()) {
            System.out.println(s);

        }

        System.out.println(students.keySet());
        for (Integer i : students.keySet()) {
            System.out.println(i);

        }
        HashMap<String,Integer> students1=new HashMap<>();
        students1.put("Michael",1001);
        students1.put("Mike",1002);
        students1.put("Marie",1003);
        students1.put("Angel",1011);
        students1.put("Olga",1023);
        students1.put("Marie",1021);
        students1.put("Holger",1005);

        System.out.println(students1);
        System.out.println(students1.values());
        for (Integer b : students1.values()) {
            System.out.println(b);

        }

        System.out.println(students1.keySet());
        for (String i : students1.keySet()) {
            System.out.println(i);

        }


    }
}
