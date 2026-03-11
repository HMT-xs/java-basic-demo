public class Phone {
    private String brand;
    private double price;
    private int gb;

    public Phone(){}
    public Phone(String brand,double price,int gb){
        this.brand=brand;
        this.price=price;
        this.gb=gb;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void showInfo(){
        System.out.println("品牌："+brand+",价格："+price+",内存："+gb+"G");
    }
}
