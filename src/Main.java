import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        //ДЗ 1 задание1

        Car car = new Car("BMW", "X5", 2020, "Germany",
                "black", 200.0, 3.0, "automat", "sedan",
                "x000xx000", 4, "summer");
        System.out.println(car);

        //ДЗ 1 задание 2

        Train train = new Train("Ласточка", "В-901", 2011, "Россия",
                null, 301.0, 3500.0, null, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия",
                null, 270.0, 1700.0, null, "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(train);

        //Дз 1 задание 3

        Bus bus = new Bus("Mercedez", "1", 2015, "Германия",
                "черный", 120.0);
        Bus bus2 = new Bus("Volkswagen", "2", 2013, "Германия", "белый",
                110.0);
        Bus bus3 = new Bus("BMW", "3", 2016, "Германия", " красный",
                110.0);
        System.out.println(bus);
        System.out.println(bus2);
        System.out.println(bus3);

        //ДЗ 2 задание 1

        train.refill();
        bus.refill();
        bus2.refill();
        car.refill();

        //Дз3

        Herbivorous gazelle = new Herbivorous("Газель", 5, "Африка", 40, "Трава");
        Herbivorous giraffe = new Herbivorous("Жираф", 7, "Африка", 20, "Листья");
        Herbivorous horse = new Herbivorous("Лошадь", 10, "Евразия, Северная Америка, Южная Америка",
                50, "Сено");
        Predator hyena = new Predator("Гиена", 5, "Африка", 35, "Мясо");
        Predator tiger = new Predator("Тигр", 10, "Африка", 40, "Мясо");
        Predator bear = new Predator("Медведь", 5, "Евразия, Северная Америка, Антарктика",
                30, "Мясо");

        Amphibians frog = new Amphibians("Лягушка", 2, "Евразия, Южная и Северная Америка, Африка");
        Amphibians snake = new Amphibians("Уж пресноводный", 3, "Евразия, Южная и Северная Америка, Африка");
        UnflyingBird peacock = new UnflyingBird("Павлин", 5, "Азия", "ходьба");
        UnflyingBird penguin = new UnflyingBird("Пингвин", 5, "Антарктика", "ходьба");
        UnflyingBird dodo = new UnflyingBird("Птица додо", 0, "Нигде", "ходьба");

        FlyingBird seagull = new FlyingBird("Чайка", 5, "Евразия", "летать");
        FlyingBird albatross = new FlyingBird("Альбатрос", 3, "Евразия", "летать");
        FlyingBird falcon = new FlyingBird("Сокол", 5, "Евразия", "летать");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(dodo);
        System.out.println(penguin);
        System.out.println(peacock);
        System.out.println(snake);
        System.out.println(frog);
        System.out.println(bear);
        System.out.println(hyena);
        





    }
}