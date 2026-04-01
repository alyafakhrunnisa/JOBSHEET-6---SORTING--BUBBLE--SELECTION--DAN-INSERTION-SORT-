package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Clear buffer

        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.println("--- Masukkan data mahasiswa ke-" + (i + 1)+ "---");
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine()); // Read as string and parse to double
            sc.nextLine(); // Clear buffer

            Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        list.bubbleSort();

        
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.tampil();
        sc.close();
    }
}
