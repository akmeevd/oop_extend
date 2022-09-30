package animals;

import java.util.Objects;

public class Bird extends Animals{
    protected String livingEnvironment;
    public Bird(String name, Integer age, String livingEnvironment) {
        super(name, age);
        if (livingEnvironment != null || !livingEnvironment.isEmpty() || !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }
    public void hunt() {
        System.out.println("я охочусь");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
