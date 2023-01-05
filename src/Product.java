
import java.io.Serializable;

public class Product implements Serializable {

    double screen;
    double weight;
    String brand;
    String model;
    int year;
    int price;

    public Product(String proccesor, double screen, double weight, String storage, String brand, String model, int year, String operatingSystem, int price, int ram) {

        this.screen = screen;
        this.weight = weight;

        this.brand = brand;
        this.model = model;
        this.year = year;

        this.price = price;

    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
