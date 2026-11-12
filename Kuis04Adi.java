import java.util.Scanner;

public class Kuis04Adi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nim2 = 44;
        int k = (nim2 % 3) + 3;
        System.out.println("Nilai k: " + k);

        int index = 1;
        int porsi = 0;
        int total = 0;
        int jumlahTransaksi = 0;
        int maxPorsi = 0;
        int moreThanTwoPorsi = 0;
        int discountTotal = 0;

        do {
            System.out.println("Transaksi " + index);
            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            if (porsi == 0) {
                break;
            }
            if (porsi < 1 || porsi > 10) {
                System.out.println("Input tidak valid");
                continue;
            }
            if (maxPorsi < porsi) {
                maxPorsi = porsi;
            }
            if (porsi > 2) {
                moreThanTwoPorsi++;
            }
            
            double biaya = 15000 + (porsi - 1) * 12000;
            if (index % k == 0) {
                double discount = biaya * 0.5;
                biaya = biaya - discount;
                discountTotal += discount;
                System.out.print("Diskon 50%! ");
            }
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            jumlahTransaksi++;
            index++;
        } while (porsi != 0);

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan : Rp " + total);
        System.out.println("Total diskon : Rp " + discountTotal);
        System.out.println("Porsi Terbanyak dalam satu transaksi : " + maxPorsi + " porsi");
        System.out.println("Transaksi dengan porsi lebih dari 2 : " + moreThanTwoPorsi + " transaksi");
    }
}