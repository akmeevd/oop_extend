package animals;

import java.util.Objects;

public class Predator extends Mammal{

    private String typeOfEat;
    public Predator(String name, Integer age, String livingEnvironment, Integer moveSpeed, String typeOfEat) {
        super(name, age, livingEnvironment, moveSpeed);
        if (typeOfEat != null || !typeOfEat.isBlank() || !typeOfEat.isEmpty()) {
            this.typeOfEat = typeOfEat;
        }
    }
    public void hunt() {
        System.out.println("я охочусь");
    }

    public String getTypeOfEat() {
        return typeOfEat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return Objects.equals(typeOfEat, predator.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfEat);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "typeOfEat='" + typeOfEat + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", moveSpeed=" + moveSpeed +
                ", name='" + name + '\'' +
                ", .age=" + age +
                '}';
    }
}
