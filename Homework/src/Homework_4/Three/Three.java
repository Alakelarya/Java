package Three;

/**
 * Created by Maria on 08.04.2019.
 */
public class Three {
    public static void main(String[] args) {
        Dog dog = new Dog("Пушистик");
        System.out.println(dog);

        dog = new Dog("Джой", 12,2);
        System.out.println(dog);

        dog = new Dog("Рекс",5);
        System.out.println(dog);

        dog = new Dog(3,"чёрный");
        System.out.println(dog);

        dog = new Dog(1,"рыжий", "ул. Мира, д. 5");
        System.out.println(dog);
    }
}
