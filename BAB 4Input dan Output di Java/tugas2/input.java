package tugas;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama sekolah: ");
        String namaSekolah = input.nextLine();

        System.out.print("Masukkan jarak rumah ke sekolah (km): ");
        double jarak = input.nextDouble();

        input.nextLine(); // Membersihkan buffer

        System.out.print("Masukkan kode plat nomor kendaraan: ");
        char kodePlat = input.nextLine().charAt(0);

        System.out.print("Masukkan anak ke berapa: ");
        int anakKe = input.nextInt();

        System.out.println("\nBiodata Anda:");
        System.out.println("Nama Sekolah: " + namaSekolah);
        System.out.println("Jarak Rumah ke Sekolah: " + jarak + " km");
        System.out.println("Kode Plat Nomor Kendaraan: " + kodePlat);
        System.out.println("Anak ke: " + anakKe);

        input.close();
    }
}
