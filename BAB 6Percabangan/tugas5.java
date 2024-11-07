import java.util.Scanner;

public class tugas5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int input = scanner.nextInt();

        String hari = null;

        System.out.println("Nama hari: " + hari);


        switch (input) {
            case 1:
                hari = "Minggu";
                break;
            case 2:
                hari = "Senin";
                break;
            case 3:
                hari = "Selasa";
                break;
            case 4:
                hari = "Rabu";
                break;
            case 5:
                hari = "Kamis";
                break;
            case 6:
                hari = "Jum'at";
                break;
            case 7:
                hari = "Sabtu";
                break;
            default:
                hari = "Invalid input";
                break;
                
        }
            if (input >= 8) {
                System.out.println("Hari yang Diinput Salah");
            } else {
                System.out.println("Hari yang sesuai nomor masukkan adalh " + hari);
            }
    }
    }
            

    
