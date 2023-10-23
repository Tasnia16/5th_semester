package Assignment1;

public class Square implements IRectangle{
    private Integer sideLength;
    public Square(Integer sideLength){
        this.sideLength=sideLength;
    }
    @Override
    public Integer getArea() {
        return this.sideLength*this.sideLength;
    }
}
