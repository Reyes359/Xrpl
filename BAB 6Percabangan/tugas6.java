import java.util.Scanner;

public class tugas6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor kendaraan: ");
        String kodePlat = scanner.next().toUpperCase();

        String kota = getKota(kodePlat);

        System.out.println("Kota: " + kota);
    }

    public static String getKota(String kodePlat) {
        if (kodePlat.equals("P")) {
            return "Jember, Banyuwangi, Bondowoso, Situbondo";
        } else if (kodePlat.equals("L")) {
            return "Surabaya";
        } else if (kodePlat.equals("M")) {
            return "Madura";
        } else if (kodePlat.equals("N")) {
            return "Lumajang";
        } else if (kodePlat.equals("AG")) {
            return "Aceh";
        } else if (kodePlat.equals("B")) {
            return "DKI Jakarta";
        } else if (kodePlat.equals("D")) {
            return "Bandung";
        } else if (kodePlat.equals("F")) {
            return "Bogor";
        } else {
            return "Kode plat tidak dikenal";
        }
    }
}