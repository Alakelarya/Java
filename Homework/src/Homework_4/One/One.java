package One;

import java.util.LinkedList;

/**
 * Created by Maria on 01.04.2019.
 */
public class One {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();    // Создаем связанный 1 список
        System.out.println("list1: " + list1);

        list1.add(0);
        System.out.println("list1: " + list1);

        list1.add(1);
        System.out.println("list1: " + list1);
        list1.add(2);
        System.out.println("list1: " + list1);
        list1.add(3);
        System.out.println("list1: " + list1);

        System.out.println(list1);

        list1.remove();
        System.out.println(list1);
    }
}
