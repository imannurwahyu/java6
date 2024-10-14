import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Menghitung deret bilangan prima dan bukan prima dari 0 – 20
        System.out.println("1. Deret bilangan prima dan bukan prima dari 0-20:");
        
        System.out.print("Bilangan prima: ");
        for (int angka = 0; angka <= 20; angka++) {
            if (cekBilanganPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();  // Pindah baris

        System.out.print("Bukan bilangan prima: ");
        for (int angka = 0; angka <= 20; angka++) {
            if (!cekBilanganPrima(angka)) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();  // Pindah baris

        // 2. Menghitung deret bilangan ganjil dan genap dari 0 – 20
        System.out.println("\n2. Deret bilangan ganjil dan genap dari 0-20:");

        System.out.print("Bilangan genap: ");
        for (int angka = 0; angka <= 20; angka++) {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();  // Pindah baris

        System.out.print("Bilangan ganjil: ");
        for (int angka = 0; angka <= 20; angka++) {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
            }
        }
        System.out.println();  // Pindah baris

        // 3. Menampilkan huruf dari Z – A
        System.out.println("\n3. Huruf dari Z ke A:");
        for (char huruf = 'Z'; huruf >= 'A'; huruf--) {
            System.out.print(huruf + " ");
        }
        System.out.println();  // Pindah baris

        // 4. Lagu “Anak Ayam Turun N”
        System.out.println("\n4. Lagu Anak Ayam Turun N:");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int jumlahAyam = scanner.nextInt();

        for (int ayam = jumlahAyam; ayam > 0; ayam--) {
            if (ayam == 1) {
                System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1) + ".");
            }
        }
    }

    // Fungsi untuk mengecek apakah sebuah bilangan prima
    public static boolean cekBilanganPrima(int bilangan) {
        if (bilangan < 2) return false; 
        for (int pembagi = 2; pembagi <= bilangan / 2; pembagi++) { 
            if (bilangan % pembagi == 0) {
                return false;
            }
        }
        return true;
    }
}
