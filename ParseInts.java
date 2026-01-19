// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts {

    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Memproses setiap token dalam input
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Parsing integer
                sum += val;
            } catch (NumberFormatException e) {
                // Menangani input yang bukan angka, tetapi melanjutkan ke token berikutnya
                continue;
            }
        }

        // Menampilkan jumlah total
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
