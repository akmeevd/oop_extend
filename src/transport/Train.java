package transport;

public class Train extends Transport {

    private Double cost;
    private Double time;
    private String startingStation;
    private String endingStation;
    private Integer wagon;

    public Train(String brand, String model, Integer productionYear, String productionCountry, String colour, Double speed,
                 Double cost, Double time, String startingStation, String endingStation, Integer wagon) {
        super(brand, model, productionYear, productionCountry, colour, speed);
        this.cost = cost;
        this.time = time;
        this.startingStation = startingStation;
        this.endingStation = endingStation;
        this.wagon = wagon;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public String getStartingStation() {
        return startingStation;
    }

    public void setStartingStation(String startingStation) {
        this.startingStation = startingStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public Integer getWagon() {
        return wagon;
    }

    public void setWagon(Integer wagon) {
            this.wagon = wagon;

    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять дизелем");
    }

    @Override
    public String toString() {
        return "transport.Train{" +
                "cost=" + cost +
                ", time=" + time +
                ", startingStation='" + startingStation + '\'' +
                ", endingStation='" + endingStation + '\'' +
                ", wagon=" + wagon +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", colour='" + colour + '\'' +
                ", .speed=" + speed +
                '}';
    }
}
