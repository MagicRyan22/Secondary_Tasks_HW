package class28_HW;
        /*1) Create an ArrayList that will store 5 names into it.
        Find out whether the given ArrayList is empty or not?
        Check whether the specific name is present in an ArrayList or not?
        Find the size of your arrayList and print all values from that
        2)Create an arraylist of cars and retrieve all the values using 3 different ways.

        3)Create an arrayList of words. Remove every word that ends with “e”.

        4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        5)Create an arrayList of even numbers from 1 to 500. Remove any number
                that is divisible by 5 from that arrayList.
        */

import java.util.ArrayList;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {

        // Task 1

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Sam");
        arrayList.add("Mike");
        arrayList.add("Don");
        arrayList.add("Boris");
        arrayList.add("Anna");

        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains("Mike"));
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        System.out.println("*************************");

        // Task 2

        ArrayList<String>cars=new ArrayList<>();
        cars.add("Porsche");
        cars.add("Bentley");
        cars.add("Ferrari");
        cars.add("Maserati");
        cars.add("Ford");

        System.out.println(cars);

        System.out.println("*************************");


        // Task 3

        ArrayList<String> words=new ArrayList<>();
        words.add("apple");
        words.add("Sky");
        words.add("Tom");
        words.add("Bowl");
        words.add("Bore");

        words.removeIf(s ->s.endsWith("e"));
        System.out.println(words);

        System.out.println("*****************************");

        //Task 4

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Mojito");
        drinks.add("Champaign");
        drinks.add("Beer");
        drinks.add("Whiskey");
        drinks.add("Cognac");

        for(int i=0; i<drinks.size(); i++) {
            String drink = drinks.get(i);
            if(drink.contains("e") || drink.contains("a")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);

        drinks.replaceAll(drink -> drink.contains("a") || drink.contains("e") ? "Water" : drink);
        System.out.println(drinks);

        System.out.println("***********************************************");

        // Task 5

        ArrayList<Integer>evenNumbers=new ArrayList<>();
        for (int i=0;i<=500;i+=2){
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        evenNumbers.removeIf(num -> num % 5 == 0);
        System.out.println(evenNumbers);

        System.out.println("************************************************");




    }
}
