public class Car {
    private String brand;
    private String color;
    private double price;

    public Car(){}
    public Car(String brand,String color,double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
    }
    public void showInfo(){
        System.out.println("汽车品牌为："+brand+",颜色："+color+",价格："+price);
    }
}
