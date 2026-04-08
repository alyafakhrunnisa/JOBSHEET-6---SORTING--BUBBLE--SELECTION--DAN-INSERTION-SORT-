package Praktikum05;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa :");
        int j = sc.nextInt();
         MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(j);
        sc.nextLine(); // Consume newline left-over
        int jumMhs = j; //


        for (int i = 0; i < j; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = Double.parseDouble(sc.nextLine()); // Read as string and parse to double
            System.out.println("-----------------------");
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }

        list.tampil();
        //melukakan pencarian data sequential 
        System.out.println("-------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK yang ingin dicari : ");
        System.out.print("IPK : ");
        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("---------------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("---------------------------------------");

        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pss2 = (int) posisi2; // Cast to int since findBinarySearch returns int
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

    
        // System.out.println("menggunakan sequntial searching");
        // double posisi = list.sequentialSearch(cari);
        // int pss = (int) posisi; // Cast to int since sequentialSearch returns int
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();
        // list.bubbleSort();

        
        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.tampil();
        // sc.close();

        // System.out.println("Data yang sudah terurut menggunkan SELECTION SORT (ASC) : ");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunkan INSERTION SORT (DCS) : ");
        // list.insertionSort();
        // list.tampil();
    }

    
}
