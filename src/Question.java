public class Question {
    public String[] key = new String[10];
    public String[] answers = new String[10];
    public String[] questions = new String[10];
    public String name;

    public Question(){
        makeQuestions();
        makeKey();
    }

    public void makeQuestions(){
        questions[0]= "What is the capital of California?";
        questions[1]= "What ocean is on the coast of California?";
        questions[2]= "What is the name of the city with the initials L.A?";
        questions[3]= "In what city is UC Berkeley located?";
        questions[4]= "What is the last name of the governor of California in 2019?";
        questions[5]= "In what year did California become a State?";
        questions[6]= "What is the name of the fault line which inspired a Dwayne Johnson movie?";
        questions[7]= "What is the name of the city with the initials S.F?";
        questions[8]= "What natural disaster has become increasingly problematic in California? (hint: forests)";
        questions[9]= "Fill in the blank: The _____ Area. (It has to do with California)";
    }

    public void makeKey(){
        key[0]= "sacramento";
        key[1]= "pacific";
        key[2]= "los angeles";
        key[3]= "berkeley";
        key[4]= "newsom";
        key[5]= "1850";
        key[6]= "san andreas";
        key[7]= "san francisco";
        key[8]= "fires";
        key[9]= "bay";
    }

    public void processAnswers() {
        int count = 0;
        for(int i=0; i<10; i++){
            if(answers[i].toLowerCase().equals(key[i])){
                count++;
            }
        }
        System.out.println("Final Score: " + count + " out of 10");
    }
}
