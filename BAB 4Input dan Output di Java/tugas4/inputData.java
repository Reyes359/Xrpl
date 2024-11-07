package tugas;
import java.util.Scanner;

public class inputData {
    public static void main(String[] args) {
        Scanner input
 = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan nomor induk siswa: ");
        String nomorIndukSiswa = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println("\nBiodata Anda:");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Nomor Induk Siswa: " + nomorIndukSiswa);
        System.out.println("Umur: " + umur + " tahun");

        input.close();
    }
}
