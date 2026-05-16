package Exercise7;

public class Phone {
    private String brand;
    private int Price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, int price, String color) {
        this.brand = brand;
        Price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
