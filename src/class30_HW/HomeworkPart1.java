package class30_HW;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

public class HomeworkPart1 {
    public static void main(String[] args) {

        // 1)
        System.out.println("*******************-1-*******************");
        Map<Integer,String> BBY=new HashMap<>();
        BBY.put(7664847,"Printer");
        BBY.put(7879885,"TV");
        BBY.put(5243568,"Projector");
        BBY.put(1234567,"I-Phone");
        BBY.put(1000235,"Samsung-Phone");
        BBY.put(9990223,"Fridge");
        for (Map.Entry<Integer, String> a : BBY.entrySet()) {
            System.out.println(a);
        }

        System.out.println("*******************-3-**********************");

        // 3)
        var empSal=new HashMap<String,Integer>();
        //Map<String,Integer>empSal=new HashMap<>();
        empSal.put("John Doe",95000);
        empSal.put("Kevin Costner",945000);
        empSal.put("Arnold Schwarzenegger",1475000);
        empSal.put("Sylvester Stalone",1395000);
        empSal.put("Angelina Joulie",1195000);
        empSal.put("The Rock",2095000);
        empSal.put("Mr. President",25000);

        int highestSalary2=0;
        String employee1="";
        for (var sal : empSal.entrySet()) {
            if(sal.getValue()>highestSalary2){
                highestSalary2=sal.getValue();
                employee1=sal.getKey();
            }
        }
        System.out.println(employee1+" "+highestSalary2);


        int highestSalary=0;
        String employee="";
        for (var s : empSal.entrySet()) {
            String emp=s.getKey();
            int salary=s.getValue();
            if(salary>highestSalary){
                highestSalary=salary;
                employee=emp;

            }
        }
        System.out.println(employee+"="+highestSalary);



        // Create HashMap to store Employee names and salaries
        var employeeSalaries = new HashMap<String, Integer>();

// Add sample data to the Map
        employeeSalaries.put("John Smith", 100000);
        employeeSalaries.put("Jane Doe", 90000);
        employeeSalaries.put("Bob Johnson", 110000);

// Find employee with highest salary and output the result
        var highestSalaryEmployee = "";
        var highestSalary1 = Integer.MIN_VALUE;

        for (var entry : employeeSalaries.entrySet()) {
            var employeeName = entry.getKey();
            var salary = entry.getValue();

            if (salary > highestSalary1) {
                highestSalary1 = salary;
                highestSalaryEmployee = employeeName;
            }
        }

        System.out.println(highestSalaryEmployee + "=$" + highestSalary1);
                    /*In this example, we use the var keyword to declare the employeeSalaries,
                    highestSalaryEmployee, highestSalary, employeeName, and salary variables.
                    The var keyword allows the Java compiler to infer the type of the variable
                    from the initialization expression. We then iterate over the entries in the
                    Map using a for-each loop, and for each entry, we check if its salary is higher
                    than the current highestSalary. If so, we update highestSalary and highestSalaryEmployee
                    to the corresponding values. Finally, we output the result using
                    () -> System.out.println(highestSalaryEmployee + "=$" + highestSalary);
                    Since we only need to output one string, we can concatenate the parts directly in
                    the output statement without using StringBuilder.*/


        System.out.println("*******************-4-********************");


        LinkedHashSet<String> obj=new LinkedHashSet<>();
        obj.add("I");
        obj.add("will");
        obj.add("get");
        obj.add("a");
        obj.add("job");

        String newString="";
        for (String s : obj) {
            newString +=(s+" ");
        }
        System.out.println(newString);



        // Use StringBuilder to concatenate all strings in the collection
        StringBuilder concatenatedString = new StringBuilder();
        for (String s1 : obj) {
            concatenatedString.append(s1+" ");
        }

        // Print the concatenated string
        System.out.println(concatenatedString);

        for (String s2 : obj) {
            System.out.print(s2+" ");
        }
        System.out.println();


        System.out.println("*******************-5-*******************");


        var num=new LinkedList<Integer>();
        num.add(22);
        num.add(12);
        num.add(10);
        num.add(10);
        num.add(8);
        num.add(8);

        int sum=0;
        for (var number : num) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
