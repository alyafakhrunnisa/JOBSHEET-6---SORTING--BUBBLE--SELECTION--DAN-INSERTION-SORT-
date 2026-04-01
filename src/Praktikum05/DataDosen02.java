package Praktikum05;

public class DataDosen02 {
    Dosen02[] dataDosen02 = new Dosen02[10];
    int idx;

    DataDosen02() {
    }

    DataDosen02(int kapasitas) {
        dataDosen02 = new Dosen02[kapasitas];
        idx = 0;
    }

    void tambah(Dosen02 dsn) {
        if (idx < dataDosen02.length) {
            dataDosen02[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen02[i].tampil();
            System.out.println("-----------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen02[j].usia < dataDosen02[j - 1].usia) {
                    Dosen02 tmp = dataDosen02[j];
                    dataDosen02[j] = dataDosen02[j - 1];
                    dataDosen02[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen02[j].usia > dataDosen02[idxMax].usia) {
                    idxMax = j;
                }
            }

            Dosen02 tmp = dataDosen02[idxMax];
            dataDosen02[idxMax] = dataDosen02[i];
            dataDosen02[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen02 temp = dataDosen02[i];
            int j = i;
            while (j > 0 && dataDosen02[j - 1].usia < temp.usia) {
                dataDosen02[j] = dataDosen02[j - 1];
                j--;
            }
            dataDosen02[j] = temp;
        }
    }
}
