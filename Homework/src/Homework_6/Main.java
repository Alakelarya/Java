/**
 * Created by Maria on 08.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        Pupil pupil = new Pupil(1324);
        String ex[] = {"Математика","Биология"};
        int marks[] = {2,5};
        pupil.setExams(ex,marks);
        System.out.println(pupil);
    }
}
