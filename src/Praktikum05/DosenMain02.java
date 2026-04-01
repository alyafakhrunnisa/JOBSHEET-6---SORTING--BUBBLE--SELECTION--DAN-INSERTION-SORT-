package Praktikum05;
import java.util.Scanner;

public class DosenMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen02 data = new DataDosen02();
        int pilihan;

        do {
            System.out.println("\n==== MENU DATA DOSEN ====");
            System.out.println("1. Tambah Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC (Selection Sort / Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    System.out.print("Kode : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P) : ");
                    char jk = sc.nextLine().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Usia : ");
                    int usia = sc.nextInt();
                    Dosen02 dosen = new Dosen02(kode, nama, jenisKelamin, usia);
                    data.tambah(dosen);
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("\n--- Data Dosen Setelah Di Sorting ASC ---");
                    data.tampil();
                    break;

                case 4:
                    System.out.println("\n--- Pilih Metode Sorting Untuk DSC ---");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilih metode: ");
                    int pilihanSort = Integer.parseInt(sc.nextLine());

                    if (pilihanSort == 1) {
                        data.sortingDSC();
                        System.out.println("\n--- Data Dosen Setelah Di Sorting DSC (Selection Sort) ---");
                    } else if (pilihanSort == 2) {
                        data.insertionSort();
                        System.out.println("\n--- Data Dosen Setelah Di Sorting DSC (Insertion Sort) ---");
                    } else {
                        System.out.println("Pilihan metode sorting tidak valid.");
                    }
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        sc.close();
    }

    
}
