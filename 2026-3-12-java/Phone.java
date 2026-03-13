public class Phone {
    String brand;
    double price;

    public Phone(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    public void call(){
        System.out.println(brand+"手机正在打电话"+",价格；"+price);
    }
}
