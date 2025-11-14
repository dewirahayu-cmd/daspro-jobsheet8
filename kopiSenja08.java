import java.util.Scanner;

public class kopiSenja08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();
        
        System.out.println("\n=== Input Penjualan Per Cabang ===\n");
        
        int totalPelangganSeluruh = 0;
        int totalItemSeluruh = 0;
        
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            
            int totalItemCabang = 0;
            
            // Perulangan untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int jumlahItem = sc.nextInt();
                totalItemCabang += jumlahItem;
            }
            
            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + "\n");

            totalPelangganSeluruh += jumlahPelanggan;
            totalItemSeluruh += totalItemCabang;
        }
        
        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSeluruh + " orang");
        System.out.println("Item terjual: " + totalItemSeluruh + " item");
        
        sc.close();

    }
    
}
