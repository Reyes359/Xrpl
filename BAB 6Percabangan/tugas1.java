import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.println("Inputkan total belanjaan anda");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat! Anda mendapatkan hadiah gantungan kunci");
        }
    }
}