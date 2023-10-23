package Assignment1;

public class Main {
    public static void main(String[] args) {
        IRectangle rectangle=new Rectangle(2,3);
        IRectangle square=new Square(3);

        System.out.println("Area of rectangle: "+rectangle.getArea());
        System.out.println("Area of square: "+square.getArea());
    }
}
