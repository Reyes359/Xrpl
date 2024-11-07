package tugas;
import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner input
 = new Scanner(System.in);

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char jenisKelamin = input.nextLine().toUpperCase().charAt(0); 

        System.out.print("Masukkan nomor sepatu: ");
        int noSepatu =
 input.nextInt();

        input.nextLine(); // Membersihkan buffer

        System.out.print("Apakah sudah menikah? (true/false): ");
        boolean sudahMenikah = input.nextBoolean();

        System.out.println("\nBiodata Anda:");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Nomor Sepatu: " + noSepatu);
        System.out.println("Sudah Menikah: " + sudahMenikah);

        input.close();
    }
}
