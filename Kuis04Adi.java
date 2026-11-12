import java.util.Scanner;

public class Kuis04Adi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;

        do {
            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            if (porsi == 0) {
                break;
            }
            
            int biaya = 15000 + (porsi - 1) * 12000;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            jumlahTransaksi++;
        } while (porsi != 0);

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}