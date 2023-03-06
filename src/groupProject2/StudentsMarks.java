package groupProject2;
    /*2)We have to calculate the average of marks obtained in three subjects
    by student A and in 4 subjects by student B.
    Create class 'Marks' with an abstract method 'getAverage' that will
    be returning the average of marks. Provide implementation of abstract
    method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its
    parameters and the marks in four subjects as its parameters for
    student B. Test your code*/
public abstract class StudentsMarks {
    public abstract void getAverage();
}
class StudentA extends StudentsMarks{
    double sub1;
    double sub2;
    double sub3;
    StudentA(double sub1,double sub2,double sub3){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    public void getAverage() {

        System.out.println(Double.parseDouble(String.format("%.2f", (sub1 + sub2 + sub3) / 3)));

    }
}
class StudentB extends StudentsMarks{
    double sub1;
    double sub2;
    double sub3;
    double sub4;
    StudentB(double sub1,double sub2,double sub3,double sub4){
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    @Override
    public void getAverage() {
        System.out.println(Double.parseDouble(String.format("%.2f", (sub1 + sub2 + sub3 + sub4) / 4)));
    }
}
