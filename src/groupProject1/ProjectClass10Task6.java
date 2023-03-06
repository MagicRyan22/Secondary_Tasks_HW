package groupProject1;
//8)Write a Java Program to print the first 10 numbers of Fibonacci series.
      //  9)Maximum and minimum number in the array?


import java.util.Scanner;

public class ProjectClass10Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("*****************************************");

        int i =0;
        int n =15;
        int firstTerm =0;
        int secondTerm =1;

        System.out.println("Fibonachi Series from 0 to "+n+" :");


        while (i <= n) {
            System.out.println(firstTerm+",");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            i++;
        }

        System.out.println("********************************************");

        int num1[] = new int[]
        {5,20,33,47,52,11,21,30,44,55,68,102,2};

        int SmallestNum=num1[0];
        int LergestNum=num1[0];

        for (int j = 1; j < num1.length; j++) {
            if(num1[j]>LergestNum){
                LergestNum=num1[j];
            }else if(num1[j]<SmallestNum){
                SmallestNum=num1[j];
            }
        }
        System.out.println("Smallest Number is "+SmallestNum);
        System.out.println("Larges Number is "+LergestNum);

    }
}
