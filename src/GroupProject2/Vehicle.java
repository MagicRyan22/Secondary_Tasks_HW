package GroupProject2;
        /*3) Create a Class Vehicle that would have the following fields:
        vehiclePrice and method calculateSalePrice() which should be returning a
        price of the Vehicle. Create 2 sub classes: Sedan and Truck.
        The Truck class has field as weight and has its own implementation of
        calculateSalePrice() method in which returned price calculated as
        following: if weight>2000 then returned price car should include
        10% discount, otherwise 20% discount.
        The Sedan class has field as length and also does it is own implementation
        of calculateSalePrice(): if length of sedan is >20 feet then returned
        car price should include 5% discount, otherwise 10% discount*/
public class Vehicle {
    double vehiclePrice;
    public void calculateSalesPrice(){
    }

}
class Sedan extends Vehicle{
    double length;
    Sedan(double vehiclePrice,double length){
        super.vehiclePrice=vehiclePrice;
        this.length=length;

    }

    @Override
    public void calculateSalesPrice() {
        if (length>20){
            System.out.println(vehiclePrice*1.05);
        }else{
            System.out.println(vehiclePrice*1.1);
        }
    }
}
class Truck extends Vehicle{
    double weight;
    Truck(double vehiclePrice,double weight){
        super.vehiclePrice=vehiclePrice;
        this.weight=weight;

    }
    @Override
    public void calculateSalesPrice(){
        if(weight>2000){
            System.out.println(String.format("%.2f", (((vehiclePrice/100)*10)+vehiclePrice)));
        } else {
            System.out.println(String.format("%.2f", (((vehiclePrice/100)*20)+vehiclePrice)));
        }
    }

}
