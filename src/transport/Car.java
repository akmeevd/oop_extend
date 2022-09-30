package transport;

import java.util.Objects;

public class Car extends Transport {

    private Double engineVolume;
    private String transmission;
    private String bodyType;
    private String regisrtrationNumber;
    private Integer seats;
    private String tyreType;
    private Insurance insurance;

    public static class Key {

        private String remoteStartOfEngine;
        private String keyLessAccess;

        public Key(String remoteStartOfEngine, String keyLessAccess) {
            this.remoteStartOfEngine = Objects.requireNonNullElse(remoteStartOfEngine, "Информация не указана");
            this.keyLessAccess = Objects.requireNonNullElse(keyLessAccess, "Информация не указана");
        }

        public String getRemoteStartOfEngine() {
            return remoteStartOfEngine;
        }

        public String getKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {
        private Integer insuranceValidityPeriod;
        private Integer costInsurance;
        private String numberInsurance;

        public Integer getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public Integer getCostInsurance() {
            return costInsurance;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }


        @Override
        public String toString() {
            return "Insurance{" +
                    "insuranceValidityPeriod=" + insuranceValidityPeriod +
                    ", costInsurance=" + costInsurance +
                    ", numberInsurance='" + numberInsurance + '\'' +
                    '}';
        }

        public Insurance(Integer insuranceValidityPeriod, Integer costInsurance, String numberInsurance) {
            if (costInsurance == null || costInsurance < 0) {
                this.costInsurance = 0;
            } else {
                this.costInsurance = costInsurance;
            }
            if (numberInsurance == null || numberInsurance.isEmpty() || numberInsurance.isBlank()) {
                this.numberInsurance = "Инфо нет";
            } else if (numberInsurance.length() != 9) {
                this.numberInsurance = "Номер некорректный";
            } else {
                this.numberInsurance = numberInsurance;
            }
            if (insuranceValidityPeriod != null) {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            } else if (insuranceValidityPeriod == 0) {
                System.out.println("Поменяйте страховку");
            } else if (insuranceValidityPeriod < 0) {
                System.out.println("Некорректно");
            }


        }

    }

    public Car(String brand, String model, Integer productionYear, String productionCountry,
               String colour, Double speed, Double engineVolume,
               String transmission,
               String bodyType,
               String regisrtrationNumber,
               Integer seats,
               String tyreType) {
        super(brand, model, productionYear, productionCountry, colour, speed);
        this.tyreType = tyreType;
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.regisrtrationNumber = regisrtrationNumber;
        this.seats = seats;

    }


    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegisrtrationNumber() {
        return regisrtrationNumber;
    }

    public Integer getSeats() {
        return seats;
    }

    public String getTyreType() {
        return tyreType;
    }


    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем или на электро-парковке");
    }

    @Override
    public String toString() {
        return "transport.Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regisrtrationNumber='" + regisrtrationNumber + '\'' +
                ", seats=" + seats +
                ", tyreType='" + tyreType + '\'' +
                ", insurance=" + insurance +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}

