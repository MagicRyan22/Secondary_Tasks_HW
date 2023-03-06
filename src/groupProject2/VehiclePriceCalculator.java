package groupProject2;

public class VehiclePriceCalculator {
    public static void main(String[] args) {
        Sedan s=new Sedan(45000,24);
        s.calculateSalesPrice();
        Truck t=new Truck(89000,27);
        t.calculateSalesPrice();
    }
}
