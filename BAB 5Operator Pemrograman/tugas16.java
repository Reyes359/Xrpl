import java.util.Scanner;

public class tugas16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan kelas anda saat ini (1-6): ");
        int kelasSaatini = scanner.nextInt();

        System.out.print("masukkan nilai ujian akhir anda (0-100): ");
        int nilaiUjianakhir = scanner.nextInt();

        String kenaikanKelas = (nilaiUjianakhir >= 80) ? "Naik Kelas" : "Tidak Naik Kelas";

        System.out.println("Kamu sekarang berada pada kelas " + kelasSaatini + ". dengan nilai akhir ujian " + nilaiUjianakhir + ", kamu " + kenaikanKelas + ".");
    }
}
