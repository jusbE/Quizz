import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionsGenerator {
    public static List<Question> generateQuestions(){
        List<Question> questions = new ArrayList<>();
        Question q1 = new Question("Mikä on koira", Arrays.asList("Eläin","Kirja","Talo","Tietokone"), "a");
        Question q2 = new Question("Mikä on Tietokone", Arrays.asList("Eläin","Kirja","Talo","Tietokone"), "d");
        Question q3 = new Question("Mikä on Talo", Arrays.asList("Eläin","Kirja","Talo","Tietokone"), "c");
        Question q4 = new Question("Mikä on Kirja", Arrays.asList("Eläin","Kirja","Talo","Tietokone"), "b");
        Question q5 = new Question("Mikä on Jussi", Arrays.asList("Kova koodariäijä","Kirja","Talo","Tietokone"), "a");
        questions.addAll(Arrays.asList(q1,q2,q3,q4,q5));
        return questions;
    }
}
