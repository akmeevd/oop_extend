package animals;

import java.time.LocalDate;
import java.util.Objects;

public class Animals {
    protected String name;
    protected Integer age;

    public Animals(String name, Integer age) {
        if (name != null || !name.isBlank() || !name.isEmpty()) {
            this.name = name;
        }
        if (age != null) {
            this.age = age;
        }
    }

    public void eat() {
        System.out.println("Я ем");
    }

    public void sleep() {
        System.out.println("Я сплю");
    }

    public void move() {
        System.out.println("Я перемещаюсь");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name) && Objects.equals(age, animals.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
