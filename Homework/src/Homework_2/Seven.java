/**
 * Created by Maria on 20.03.2019.
 */
public class Seven {
    public static void main(String args[]){
        int matches =0;
        for(int i=12;i<=24;i++){
            for(int j=01;j<60;j++){
                if(((i%10)== (j / 10)) && ((i / 10) == (j % 10))) {
                    matches++;
                }
            }
        }
        System.out.println("Количество одинаковых комбинаций " + matches);
    }
}

