// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************
import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26]; // array untuk menghitung frekuensi huruf
        Scanner scan = new Scanner(System.in);

        // Mendapatkan input kata dari pengguna
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Mengubah semua huruf menjadi huruf kapital
        word = word.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                // Mengonversi karakter menjadi indeks array
                counts[word.charAt(i) - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menangani karakter yang bukan huruf
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Menampilkan hasil frekuensi
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
