import java.util.Scanner;

public class PenambahanNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Anda: ");
        int score = scanner.nextInt();

        char grade = getGrade(score);

        System.out.println("Nilai Peringkat Anda: : " + grade);
    }

    public static char getGrade(int score) {
        if (score >= 81 && score <= 100) {
            return 'A';
        } else if (score >= 71 && score <= 80) {
            return 'B';
        } else if (score >= 51 && score <= 70) {
            return 'C';
        } else if (score >= 21 && score <= 50) {
            return 'D';
        } else if (score >= 0 && score <= 20) {
            return 'E';
        } else {
            return 'X';
        }
    }
}