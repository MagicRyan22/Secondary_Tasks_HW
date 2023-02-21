package class28_HW;
        /*6) Create a class Insurance that will have an attribute as insuranceName
        and unimplemented behaviour as getQuote and cancelInsurance. Create 3
        subclasses Car, Pet, Health. Car class has it’s own attribute as carModel
        and Class Pet has petType attribute. Create 3 objects of the sub classes and
        store them in ArrayList. Using for loop/advanced for loop/ iterator access all
        methods of the class.
        Create a Card class that will have interest rate field and card type
        and a constructor that will initialize the fields.
        Create 3 objects of different card and store them into LinkedList.
        Using for loop/advanced for loop/ iterator access all methods of the class.*/
public class HomeworkClassInsurance {

        String insuranceName;

        public void getQuote(){

        }
}
class Car extends HomeworkClassInsurance{
     String CarModel;
}
class Pet extends HomeworkClassInsurance{
        String petType;
}
class Health extends HomeworkClassInsurance{

}
