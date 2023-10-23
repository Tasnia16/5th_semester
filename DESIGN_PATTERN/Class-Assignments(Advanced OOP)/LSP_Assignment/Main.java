package LSP_Assignment;

public class Main {
    public static void main (String[] args)
    {
         Rectangle rectangle=new Rectangle(7,3);
         Square square=new Square(5);

         System.out.println("Area of Rectangle  : "+rectangle.Area());
         System.out.println("Area of Square  : "+square.Area());
    }
}
