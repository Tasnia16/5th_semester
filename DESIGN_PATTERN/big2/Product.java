package big2;

public class Product {
    private String name;
    private String description;
    private Double price;

    private Integer inventory;

    public Product(Mediator mediator)
    {
        
    }

//    public Product(String name, String description, Double price, Integer inventory){
//        this.name=name;
//        this.price=price;
//        this.description=description;
//        this.inventory=inventory;
//    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public Double getPrice(){
        return this.price;
    }
    public Integer getInventory(){
        return this.inventory;
    }
    public void setInventory(Integer inventory){
        this.inventory=inventory;
    }
}
