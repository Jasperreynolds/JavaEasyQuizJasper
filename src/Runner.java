import java.util.Scanner;

public class Runner {

    public static void main(String[] args){
        Question q = new Question();
        Scanner sc = new Scanner(System.in);
        q.makeQuestions();
        for(int i = 0; i < q.questions.length; i++){
            System.out.println(q.questions[i]);
            q.answers[i] = sc.nextLine();

        }

        q.processAnswers();


    }
}
