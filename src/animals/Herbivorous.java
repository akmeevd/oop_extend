package animals;

import java.util.Objects;

public class Herbivorous extends Mammal{

    protected String typeOfEat;
    public Herbivorous(String name, Integer age, String livingEnvironment, Integer moveSpeed, String typeOfEat ) {
        super(name, age, livingEnvironment, moveSpeed);
        if (typeOfEat != null || !typeOfEat.isBlank() || !typeOfEat.isEmpty()) {
            this.typeOfEat = typeOfEat;
        }
    }

    public void pasture() {
        System.out.println("меня пасут");
    }
    public String getTypeOfEat() {
        return typeOfEat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(typeOfEat, that.typeOfEat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfEat);
    }

    @Override
    public String toString() {
        return "Herbivorous{" +
                "typeOfEat='" + typeOfEat + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", moveSpeed=" + moveSpeed +
                ", name='" + name + '\'' +
                ", age.=" + age +
                '}';
    }
}
