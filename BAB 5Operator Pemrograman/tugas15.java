import java.util.Scanner;

public class tugas15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("masukkan nilai b: ");
        int b = scanner.nextInt();

        int shiftKiri = a << 2;
        int shiftKanan = b >> 2;

        System.out.println("shift kiri (a << 2): " + shiftKiri);
        System.out.println("shift kanan (b >> 2): " + shiftKanan);
    }
}