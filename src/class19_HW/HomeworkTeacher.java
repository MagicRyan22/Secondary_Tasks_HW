package class19_HW;
        //HW: finish creating SuperSavings object and see which feature available to that class
        /*HW: Write program for multilevel inheritance where
        class C inherits from class B and Class B inherits from Class A.

        Write program to inherit class A that has method printF
        which is static and call or reuse that method into class B

        Write a Java program called Teacher.  Identify features and 4 behaviour
        of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher
        and PianoTeacher that would have it their own features and behaviour.
        Test all 4 classes*/
public class HomeworkTeacher {

        String name;
        char gender;
        int age;
        String lesson;

        void moodHappy(){
                System.out.println("Always happy");
        }
        void moodFunny(){
                System.out.println("Always funny");
        }
        void specialization(){
                System.out.println("good knowledge in java");
        }
        void activeness(){
                System.out.println("very active");
        }

}
class MathTeacher extends HomeworkTeacher{
        String lastname;
        char gender;
        void knowledge(){
                System.out.println("Best in math");
        }

}
class ChemistryTeacher extends HomeworkTeacher{
        String lastName;
        char gender;
        void knowledge(){
                System.out.println("Best in chemistry");
        }
}
class PianoTeacher extends HomeworkTeacher{
        String lastName;
        char gender;
        void knowledge(){
                System.out.println("Best in Music");
        }
}
