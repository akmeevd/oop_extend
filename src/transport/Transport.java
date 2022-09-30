package transport;

public abstract class Transport {

    protected String brand;
    protected String model;
    protected Integer productionYear;
    protected String productionCountry;
    protected String colour;
    protected Double speed;

    public Transport(String brand, String model, Integer productionYear, String productionCountry, String colour, Double speed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.colour = colour;
        this.speed = speed;
    }

    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColour() {
        return colour;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setColour(String colour) {
        if (colour != null || !colour.isEmpty() || !colour.isBlank()) {
            this.colour = colour;
        }
    }

    public void setSpeed(Double speed) {
        if (speed != null) {
            this.speed = speed;
        }

    }

    @Override
    public String toString() {
        return "transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", colour='" + colour + '\'' +
                ", .speed=" + speed +
                '}';
    }
}
