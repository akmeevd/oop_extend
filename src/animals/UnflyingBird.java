package animals;

import java.util.Objects;

public class UnflyingBird extends Bird {
    private String typeOfMove;
    public UnflyingBird(String name, Integer age, String livingEnvironment, String typeOfMove) {
        super(name, age, livingEnvironment);
        if (typeOfMove != null || !typeOfMove.isEmpty() || !typeOfMove.isBlank()) {
            this.typeOfMove = typeOfMove;
        }
    }

    public void walk() {
        System.out.println("я гуляю");
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UnflyingBird that = (UnflyingBird) o;
        return Objects.equals(typeOfMove, that.typeOfMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMove);
    }

    @Override
    public String toString() {
        return "UnflyingBird{" +
                "typeOfMove='" + typeOfMove + '\'' +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
