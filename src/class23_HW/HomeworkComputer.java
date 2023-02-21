package class23_HW;
        /*Create a Class Computer that will have 4 subclasses as Apple,
        Lenovo, HP, Dell. Define common behavior within and some fields
        in parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Create objects of child classes and store them into array.
        Loop through each object and execute available methods.*/
public class HomeworkComputer {

        void popularity(){
                System.out.println(" the popularity is : ....");
        }
        void system(){
                System.out.println("The used System is : ....");
        }
        void price(){
                System.out.println("The Price is :.....");
        }
        void restrictions(){
                System.out.println("different features are:.....");
        }
        final void necessity(){
                System.out.println("It is not really necessary to have a computer");
        }
}
class Apple extends HomeworkComputer{
        void popularity(){
                System.out.println(" the popularity is :very popular");
        }
        void system(){
                System.out.println("The used System is :IOS");
        }
        void price(){
                System.out.println("The Price is :very Expensive");
        }
        void restrictions(){
                System.out.println("different features are: For all additional features you have to pay");
        }
}
class Lenovo extends HomeworkComputer{
        void popularity(){
                System.out.println("the popularity is :Popular as a business computer");
        }
        void system(){
                System.out.println("The used System is :Windows");
        }
        void price(){
                System.out.println("The Price is : cheap ");
        }
        void restrictions(){
                System.out.println("different features are: very flexible to download and adjust new features to it for free");
        }
}
class HP extends HomeworkComputer{
        void popularity(){
                System.out.println("the popularity is :Not so Popular ");
        }
        void system(){
                System.out.println("The used System is :Windows");
        }
        void price(){
                System.out.println("The Price is : cheap ");
        }
        void restrictions(){
                System.out.println("different features are: very flexible to download and adjust new features to it for free");
        }
}
class Dell extends HomeworkComputer{
        void popularity(){
                System.out.println("the popularity is :Popular as a business computer");
        }
        void system(){
                System.out.println("The used System is :Windows");
        }
        void price(){
                System.out.println("The Price is : cheap ");
        }
        void restrictions(){
                System.out.println("different features are: very flexible to download and adjust new features to it for free");
        }
}
class ComputerInfo{
        public static void main(String[] args) {
                HomeworkComputer[] computer={new Apple(),new Lenovo(),new HP(),new Dell()};
                for(HomeworkComputer co:computer) {
                        co.popularity();
                        co.system();
                        co.price();
                        co.restrictions();
                        co.necessity();
                        System.out.println("*************************");
                }
        }
}
