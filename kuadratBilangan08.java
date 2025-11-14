import java.util.Scanner;

public class kuadratBilangan08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        System.out.println();
        
        for (int i = 1; i <= n; i++) {
            int jumlah = 0;
            String tampilan = "n = " + i + " Jumlah kuadrat = ";
            
       
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlah += kuadrat;
    
                if (j == 1) {
                    tampilan += kuadrat;
                } else {
                    tampilan += " + " + kuadrat;
                }
            }
            
            tampilan += " = " + jumlah;
            System.out.println(tampilan);
        }
        
        sc.close();
    }
    }
  