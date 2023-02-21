package class19_HW;

public class HomeworkTeacherTester {
    public static void main(String[] args) {

        HomeworkTeacher HW=new HomeworkTeacher();
        HW.age=39;
        HW.gender='M';
        HW.specialization();

        System.out.println(HW.gender);
        System.out.println(HW.age);

        System.out.println("-----------creating an obj from checking---------------");


        ChemistryTeacher bill=new ChemistryTeacher();
        bill.age=30;
        bill.gender='M';
        bill.lastName="Branks";
        bill.lesson="Math";
        System.out.println(bill.age);
        System.out.println(bill.gender);
        System.out.println(bill.lastName);
        System.out.println(bill.lesson);
        bill.knowledge();



        System.out.println("-----------creating an obj from saving---------------");

        ChemistryTeacher Sam=new ChemistryTeacher();
        Sam.age=48;
        Sam.gender='M';
        Sam.lastName="Obama";
        Sam.lesson="Chemistry";
        System.out.println(Sam.age);
        System.out.println(Sam.gender);
        System.out.println(Sam.lastName);
        System.out.println(Sam.lesson);
        Sam.knowledge();



        System.out.println("-----------creating an obj from saving---------------");

        PianoTeacher Monica=new PianoTeacher();
        Monica.age=35;
        Monica.gender='F';
        Monica.lastName="Lewinsky";
        Monica.lesson="Music";
        System.out.println(Monica.age);
        System.out.println(Monica.gender);
        System.out.println(Monica.lastName);
        System.out.println(Monica.lesson);
        Monica.knowledge();


    }
}
