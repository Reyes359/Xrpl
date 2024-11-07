import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        String question = "Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?";
        String[] options = {"Operator Indosat", "Operator Aritmatika", "Operator Telkomsel", "Operator Assignment"};
        String correctAnswer1 = "Operator Aritmatika";
        String correctAnswer2 = "Operator Assignment";

        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("Enter your answer (1-4): ");
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        String userAnswerString = options[userAnswer - 1];

        if (userAnswerString.equals(correctAnswer1) || userAnswerString.equals(correctAnswer2)) {
            System.out.println("Benar! Jawaban yang tepat adalah " + correctAnswer1 + " atau " + correctAnswer2);
        } else {
            System.out.println("Salah. Jawaban yang tepat adalah " + correctAnswer1 + " atau " + correctAnswer2);
        }
    }
}