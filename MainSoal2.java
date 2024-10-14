import java.util.Scanner;

public class MainSoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int ukuran = input.nextInt();

        if (ukuran > 10) {
            System.out.println("Nilai n tidak boleh lebih dari 10.");
            return;
        }

        System.out.println("Tabel Perkalian " + ukuran + "x" + ukuran + ":");
        
        for (int baris = 1; baris <= ukuran; baris++) {
            for (int kolom = 1; kolom <= ukuran; kolom++) {
                System.out.print(baris * kolom + "\t"); 
            }
            System.out.println();
        }
    }
}

