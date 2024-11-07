import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        int belanja = scanner.nextInt();

        if (belanja >= 500000) {
            System.out.print("Selamat! Anda mendapatkan hadiah voucher diskon");
        
        } else {
            int selisihbelanja = 500000 - belanja;
            System.out.println("Belanja anda kurang dari Rp. 500.000");
            System.out.println("Silahkan tambah lagi belanjanya sebesar Rp " + selisihbelanja);
            System.out.println("Jika Anda ingin mendapatkan voucher diskon");
        }
    }
}