import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Merk Celana (Levis,Charhartt): ");
        String merk = scanner.nextLine();

        System.out.print("Masukkan ukuran celana: (26-32 atau 33-35): ");
        int ukuran = scanner.nextInt();

        double harga = 0;

        if (merk.equalsIgnoreCase("(Levis)")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 160000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 180000;
            } else {
                System.out.println("Ukuran tidak tersedia untuk merk (Levis)");
            }
        } else if (merk.equalsIgnoreCase("Charhartt")) {
            if (ukuran >= 26 && ukuran <= 30) {
                harga = 210000;
            } else if (ukuran >= 31 && ukuran <= 34) {
                harga = 220000;
            } else {
                System.out.println("Ukuran tidak tersedia untuk merk Charhartt");
            }
        } else {
            System.out.println("Merk tidak tersedia");
        }

        if (harga > 0) {
            System.out.println("Harga celana adalah Rp. " + harga);
        }
    }
}