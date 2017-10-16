import java.util.Scanner;

public class QuestionHelper {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean askQuestion(Question question) {
        System.out.println(question.getQuestion());

        System.out.println("a) " + question.getOptions().get(0));
        System.out.println("b) " + question.getOptions().get(1));
        System.out.println("c) " + question.getOptions().get(2));
        System.out.println("d) " + question.getOptions().get(3));

        System.out.print("Saisinko vastauksen kiitos: ");

        String answer = scanner.nextLine();
        if (answer.equals(question.getAnswer())) {
            return true;
        }
        return false;
    }
}
