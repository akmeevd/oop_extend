package transport;

public class Bus extends Transport {
    private String refill;
    public Bus(String brand, String model, Integer productionYear, String productionCountry, String colour, Double speed) {
        super(brand, model, productionYear, productionCountry, colour, speed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем");
    }
}
