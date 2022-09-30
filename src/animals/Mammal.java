package animals;

import java.util.Objects;

public class Mammal extends Animals {

    protected String livingEnvironment;
    protected Integer moveSpeed;
    public Mammal(String name, Integer age, String livingEnvironment, Integer moveSpeed ) {
        super(name, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
        if (moveSpeed != null) {
            this.moveSpeed = moveSpeed;
        }
    }

    public void walk() {
        System.out.println("гуляю.");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public Integer getMoveSpeed() {
        return moveSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(livingEnvironment, mammal.livingEnvironment) && Objects.equals(moveSpeed, mammal.moveSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, moveSpeed);
    }
}
