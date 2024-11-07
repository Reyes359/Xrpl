import java.util.Scanner;

public class tugas7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int AngkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int AngkaKedua = scanner.nextInt();

        int AngkaMax = Math.max(AngkaPertama, AngkaKedua);

        System.out.println("Angka terbesar dari dua angka yang anda input adalah: " + AngkaMax);


    }
}