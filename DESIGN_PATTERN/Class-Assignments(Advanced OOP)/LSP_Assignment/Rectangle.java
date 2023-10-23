package LSP_Assignment;

public class Rectangle implements Shape{

    double length, width;

    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    @Override
    public double Area()
    {
        return length*width;
    }
}
