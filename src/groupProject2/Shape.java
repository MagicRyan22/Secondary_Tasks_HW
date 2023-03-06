package groupProject2;
        /*Create an Interface 'Shape' with undefined methods as
        calculateArea and calculatePerimeter.
        Create 2 classes Circle & Square that implements functionality
        defined in the Shape Interface. Test your code.*/
public interface Shape {

         double pi=3.14159265359;
         double calculateArea();

         double calculatePerimeter();
}
class Circle implements Shape{
        double radius;
        Circle(double radius){
                this.radius=radius;
        }
        @Override
        public double calculateArea() {
                double area;
                area= Double.parseDouble((String.format("%.2f",(pi*radius*radius))));
                return  area;
        }

        @Override
        public double calculatePerimeter() {
                double diameter=radius*2;
                double circumference;
                circumference= Double.parseDouble((String.format("%.2f",(pi*diameter))));
                return circumference;
        }
}
class Square implements Shape{
        Square(double length_A){
                this.length_A=length_A;
        }
        double length_A;
        @Override
        public double calculateArea() {
                double area;
                //System.out.println(String.format("%.2f",(length_A*length_A)));
                area= Double.parseDouble(String.format("%.2f",length_A*length_A));
                return area;
        }

        @Override
        public double calculatePerimeter() {
                double peri;
                peri= Double.parseDouble((String.format("%.2f",(length_A*4))));
                return peri;
        }
}
