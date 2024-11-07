package tugas;

import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner input
 = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String namaLengkap = input.nextLine();

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        input.nextLine(); // Membersihkan buffer

        System.out.print("Masukkan kota asal: ");
        String kotaAsal = input.nextLine();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = input.nextDouble();

        System.out.println("Masukkan berat badan (kg)");
        double beratBadan = input.nextDouble();

        System.out.println("\nBiodata Anda:");
        System.out.println("Nama Lengkap: " + namaLengkap);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Kota Asal: " + kotaAsal);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat badan: " + beratBadan + " kg");
        input.close();
    }
}
