package Four;

/**
 * Created by Maria on 08.04.2019.
 */
public class Cat {
    String name;
    int age;
    int weight;
    int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    boolean  fight(Cat anotherCat){
        return this.strength > anotherCat.strength;
    }
}
