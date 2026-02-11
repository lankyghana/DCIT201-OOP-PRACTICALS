public class Car {
    private String brand;
    private String model;
    private Double speed = 0.0;

    public Car (String brand, String model, Double speed){
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getSpeed() {
        return speed;
    }

    public void accelerate(Double speed){
        this.speed = speed;
    }
}
