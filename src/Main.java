import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What is the capital of India?",
                "A. Mumbai",
                "B. Delhi",
                "C. Pune",
                "D. Chennai",
                'B'));

        questions.add(new Question(
                "Which language is used for Android Development?",
                "A. Python",
                "B. C",
                "C. Java",
                "D. HTML",
                'C'));

        questions.add(new Question(
                "Who developed Java?",
                "A. Microsoft",
                "B. Google",
                "C. Sun Microsystems",
                "D. Apple",
                'C'));

        int score = 0;

        for (Question q : questions) {

            System.out.println("\n" + q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("Enter Answer: ");
            char ans = sc.next().toUpperCase().charAt(0);

            if (ans == q.answer) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
            }
        }

        System.out.println("\nFinal Score: " + score + "/" + questions.size());

        sc.close();
    }
}