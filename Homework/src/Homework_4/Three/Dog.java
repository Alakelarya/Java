package Three;
import java.lang.Override;
import java.lang.String;
/**
 * Created by Maria on 08.04.2019.
 */
public class Dog {
    String name;
    int weight;
    int age;
    String color;
    String adress;

    public Dog(String name) {
        this.name = name;
        if (name == null){
            name = "blank";
        }
    }

    public Dog(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        if(weight==0){
            weight = 4;
        }
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Dog(int weight, String color, String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }
    @Override
    public String toString(){
     return name+ " " + weight + " " + age+ " " + color+ " " +adress;
    }

}
