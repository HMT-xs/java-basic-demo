public class Car {
    private String brand;
    private double price;
    private String color;
    //提供get、set
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
       if(price<0){
           System.out.println("价格不能为负数。");
           this.price=0;
       }
       else {
           this.price=price;
       }

    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void printInfo(){
        System.out.println("汽车品牌："+brand+",价格："+price+",颜色："+color);
    }
}
