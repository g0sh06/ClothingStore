package ClothingStore;

public class Object {
    String name;
    String brand;
    double price;
    String size;
    String color;

    private int a;
    private String Size;

    public void getSizeJacketsandTrousers(String Size) {
        this.size = size;
    }
    public void getSizeShoes(int a) {
        this.a = a;
    }
    public void getSizeJacketsandTrousers(int a) {
        this.a = a;
    }


    public Object(String name, String brand, double price,String size, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
