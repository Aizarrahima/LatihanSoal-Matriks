package NestedLoop;

/**
 *
 * @author Aizar
 */
public class Matriks {

    public static void main(String[] args) {
        int a, b, Un = 0; // deklarasi variabel a sebagai ordo matriks 1x1
        // deklarasi variabel b sebagai beda tiap ordo
        // deklarasi variabel Un sebagai rumus mencari nilai setiap ordo
        a = 10; // vatiabel a bernilai 10
        b = 5; // variabel b bernilai 5

        int n = 0; // untuk mendeklarasikan dan memulai perulangan nilai tiap ordo
        int Sn = 0; // untuk mendeklarasikan jumlah deret aritmatika

        System.out.println("Deret Aritmatikanya adalah : "); // menampilkan teks
        for (int c = 0; c < 3; c++) { // untuk perulangan sebagai baris
            for (int y = 0; y < 5; y++) { // untuk perulangan sebagai kolom
                n++; // untuk menambah 1 tiap perulangan
                Un = a + (n - 1) * b; // operator untuk mencari hasil tiap ordo
                Sn += Un; // operator untuk mencari hasil penjumlahan deret aritmatika
                System.out.print(Un + " "); // untuk menampilkan hasil setiap ordo
            }
            System.out.println(""); // untuk membentuk pola matriks
        }
        System.out.println("Jumlah deret Aritmatika : " + Sn); // untuk menampilkan hasil penjumlahan deret aritmatika
    }
}
