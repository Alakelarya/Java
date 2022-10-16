package Four;

/**
 * Created by Maria on 08.04.2019.
 */
public class Four {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Перчик", 4,8, 30);
        Cat cat2 = new Cat("Черныш",2,7,24);

        System.out.println(cat1.name + " против " + cat2.name + " - " + cat1.fight(cat2));
        System.out.println(cat2.name + " против " + cat1.name + " - " + cat2.fight(cat1));
    }
}
