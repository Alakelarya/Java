/**
 * Created by Maria on 08.04.2019.
 */
public class Pupil {
    int id;

    public Pupil(int id) {
        this.id = id;
    }
    ExamResult[] examResult = new ExamResult[2];

    public void setExams(String ex[], int marks[]){
        if(ex.length==marks.length){
            for(int i =0; i<ex.length;i++){
                if ((marks[i] > 0) && (marks[i] < 6)) {
                    examResult[i] = new ExamResult(ex[i], marks[i]);
                        } else System.out.println("Некорректная оценка");
                    }
                } else System.out.println("неправильно задано количество предметов");
            }

            @Override
            public String toString() {
                StringBuilder results = new StringBuilder();
                for (int i = 0; i < examResult.length; i++){
                    results.append("\n");
                    results.append(examResult[i].toString());
                }
                return "Студент " + id + results;
    }
}
