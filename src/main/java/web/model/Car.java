package web.model;

// 2. Создайте модель Car с тремя произвольными полями

public class Car {
    private String make;
    private String model;
    private Double price;

    public Car() {
    }

    public Car(String make, String model, Double price) {
        setMake(make);
        setModel(model);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
