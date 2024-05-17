import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\AGS COMPUTER\\Downloads\\new_student.csv";
        // Membuat objek Scanner untuk membaca input dari pengguna
        try (Scanner scanner = new Scanner(System.in)) {
            // Membuat objek BufferedWriter untuk menulis ke file CSV
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile, true))) {
                while (true) {
                    // Meminta pengguna untuk memasukkan data baru
                    System.out.println("Masukkan data siswa (NIM,NAMA,UMUR), atau ketik 'selesai' untuk mengakhiri:");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("selesai")) {
                        break; // Keluar dari loop jika pengguna mengetikkan 'selesai'
                    } else {
                        // Menulis data ke file CSV
                        bw.write(input);
                        bw.newLine(); // Menambahkan baris baru setelah setiap data
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
