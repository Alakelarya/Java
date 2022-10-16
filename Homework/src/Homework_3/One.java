import java.lang.reflect.Array;

/**
 * Created by Maria on 20.03.2019.
 */
import java.util.Arrays;
public class One {
    public static void main(String[] args) {
        int a[] =new int[10];
        for(int i=0, index=2; i<10; i++){
            a[i] = index;
            System.out.println(a[i]+"  ");
            index=index+2;
        }
        System.out.println("");
        for(int i=0, index=2; i<10; i++) {
            a[i] = index;
            System.out.print(a[i]);
            index = index + 2;
        }
    }
}
