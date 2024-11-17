import java.util.Scanner;

public class ExerciseType {
    public static void main(String[] args) {
        soal1();
        System.out.println("====================================");
        soal2();
        System.out.println("====================================");
        soal3();
        System.out.println("====================================");
        soal4();
        System.out.println("====================================");
        soal5();
        System.out.println("====================================");
        soal6();
        System.out.println("====================================");
        soal7();
        System.out.println("====================================");
        soal8();
        System.out.println("====================================");
        soal9();
        System.out.println("====================================");
        soal10();
    }

    // Soal 1
    public static void soal1() {
        byte usia = 120;
        long bumiKeBulan = 384400L;
        double beratBadan = 50.5;
        char satuHurufAbjad = 'R';
        boolean lampuMenyala = true;

        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Bumi ke bulan : " + bumiKeBulan + " km");
        System.out.println("Berat badan : " + beratBadan + " kg");
        System.out.println("Satu huruf abjad : " + satuHurufAbjad);
        System.out.println("Lampu menyala : " + lampuMenyala);
    }

    // Soal 2
    public static void soal2() {
        String nama = "Rizki";
        int usia = 22;
        double tinggiBadan = 159.5;
        boolean sudahMenikah = false;

        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Tinggi badan : " + tinggiBadan + " cm");
        System.out.println("Sudah menikah : " + sudahMenikah);
    }

    // Soal 3
    public static void soal3() {
        // kecepatan rata rata (km/jam)
        int kecepatan = 60;

        // waktu perjalan (jam)
        double waktu1 = 1.5;
        double waktu2 = 2.0;
        double waktu3 = 3.5;

        // menghitung jarak masing-masing
        double jarak1 = kecepatan * waktu1;
        double jarak2 = kecepatan * waktu2;
        double jarak3 = kecepatan * waktu3;

        // menghitung total
        double jarakTotal = jarak1 + jarak2 + jarak3;

        System.out.println("Jarak tempuh pertama : " + jarak1 + " km");
        System.out.println("Jarak tempuh kedua : " + jarak2 + " km");
        System.out.println("Jarak tempuh ketiga : " + jarak3 + " km");
        System.out.println("Jarak total : " + jarakTotal + " km");
    }

    // Soal 4
    public static void soal4() {
        int panjangLadang = 25;
        int lebarLadang = 10;

        int luasLadang = panjangLadang * lebarLadang;
        int kelilingLadang = 2 * (panjangLadang + lebarLadang);

        System.out.println("Luas ladang : " + luasLadang + " m2");
        System.out.println("Keliling ladang : " + kelilingLadang + " m");
    }

    // Soal 5
    public static void soal5() {
        double tangki1 = 1.000;
        double tangki2 = 2.500;
        double tangki3 = 1.750;
        double tangki4 = 3.200;

        double totalTangki = tangki1 + tangki2 + tangki3 + tangki4;
        double rataRataTangki = totalTangki / 4;

        System.out.println("Total kapasitas minyak : " + totalTangki + " liter");
        System.out.println("Rata-rata kapasitas per tangki : " + rataRataTangki + " liter");
    }

    // Soal 6
    public static void soal6() {
        int kandangAyam = 45;
        int kandangBebek = 30;
        int kandangKambing = 15;
        int kandangSapi = 10;

        int totalJumlahHewan = kandangAyam + kandangBebek + kandangKambing + kandangSapi;
        double rataRataHewan = (double) totalJumlahHewan / 4;

        System.out.println("Total jumlah hewan : " + totalJumlahHewan + " ekor");
        System.out.println("Rata-rata jumlah hewan per kandang : " + rataRataHewan + " ekor");
    }

    // Soal 7
    // Rumus : Luas = π × radius2
    public static void soal7() {
        double radius = 7.5;
        double luasLingkaran = Math.PI * Math.pow(radius, 2);

        int nilai1 = 85;
        int nilai2 = 90;
        int nilai3 = 80;
        int totalNilai = nilai1 + nilai2 + nilai3;

        double rataRataNilai = (double) totalNilai / 3;

        System.out.println("Luas lingkaran : " + luasLingkaran + " satuan luas");
        System.out.println("Total nilai : " + totalNilai);
        System.out.println("Rata-rata nilai : " + rataRataNilai);
    }

    // Soal 8
    public static void soal8() {
        int value1 = 10;
        double konversiToDouble = (double) value1;
        System.out.println("Konversi int ke double : " + konversiToDouble);

        double value2 = 20.5;
        int konversiToInt = (int) value2;
        System.out.println("Konversi double ke int : " + konversiToInt);

        char value3 = 'A';
        int konversiToInt2 = (int) value3;
        System.out.println("Konversi char ke int : " + konversiToInt2);
    }

    // Soal 9
    public static void soal9() {
        int[] angkaWeton = { 7, 14, 21, 28 };
        String[] namaHari = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat" };

        System.out.println("Angka elemen pertama : " + angkaWeton[0]);
        System.out.println("Days elemen pertama : " + namaHari[0]);

        for (int angka : angkaWeton) {
            System.out.println(angka);
        }

        for (String hari : namaHari) {
            System.out.println(hari);
        }
    }

    // Soal 10
    public static void soal10() {
        // 1. Membuat Objek (Scanner) untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // 2. Menerima input dari pengguna
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        System.out.print("Masukkan tinggi badan (cm) : ");
        double tinggiBadan = input.nextDouble();
        System.out.print("Apakah Anda suka coding (true/false) : ");
        boolean sukaCoding = input.nextBoolean();

        // 3. Menampilkan hasil input dari pengguna
        System.out.println("\n=== Data Pengguna ===");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Tinggi badan : " + tinggiBadan + " cm");
        System.out.println("Suka coding : " + (sukaCoding ? "Iya" : "Tidak"));
    }
}
