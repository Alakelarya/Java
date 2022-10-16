/**
 * Created by Maria on 08.04.2019.
 */
import java.lang.Override;
import java.lang.String;

public class ExamResult {
    String ex;
    int marks;

    public ExamResult(String ex, int marks) {
        this.ex = ex;
        this.marks = marks;
    }
    @Override
    public String toString(){
        if(marks>2)
            return ex +" сдал";
        else
            return ex + " не сдал";
        }
}

