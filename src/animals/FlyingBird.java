package animals;

import java.util.Objects;

public class FlyingBird extends Bird{

    private String typeOfMove;
    public FlyingBird(String name, Integer age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);
        if (typeOfMove != null || !typeOfMove.isEmpty() || !typeOfMove.isBlank()) {
            this.typeOfMove = typeOfMove;
        }
    }

    public void fly() {
        System.out.println("я летаю");
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    @Override
    public void eat() {
        System.out.println("я ем мясцо.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FlyingBird that = (FlyingBird) o;
        return Objects.equals(typeOfMove, that.typeOfMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMove);
    }

    @Override
    public String toString() {
        return "FlyingBird{" +
                "typeOfMove='" + typeOfMove + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
