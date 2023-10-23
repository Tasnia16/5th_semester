package Assignment1;

public class Rectangle implements IRectangle{
    private Integer width;
    private Integer height;
    public Rectangle(Integer width,Integer height){
        this.width=width;
        this.height=height;
    }


    @Override
    public Integer getArea() {
        return this.width*this.height;
    }
}
