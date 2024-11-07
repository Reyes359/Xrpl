import java.util.Scanner;

public class tugas14 {
    public static void main(String[] args) {
        
        int[] nisNumbers = {1001, 1002, 1003, 1004};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an NIS number: ");
        int userInput = scanner.nextInt();

        boolean isLulus = false;
        for (int nis : nisNumbers) {
            if (nis == userInput) {
                isLulus = true;
                break;
            }
        }

        if (isLulus) {
            System.out.println("True (Lulus)");
        } else {
            System.out.println("False (Tidak Lulus)");
        }
    }
}