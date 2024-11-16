public class PrimitiveType {
    public static void main(String[] args) {

        byte angkaKecil = 100; // Tipe data primitif - angka bulat kecil (rentang: -128 hingga 127)

        short angkaPendek = 30000; // Tipe data primitif - angka bulat pendek (rentang: -32,768 hingga 32,767)

        int angkaBulat = 150000; // Tipe data primitif - angka bulat standar (rentang: -2^31 hingga 2^31-1)

        // Tipe data primitif - angka bulat besar (rentang: -2^63 hingga 2^63-1)
        // Perlu ditambahkan 'L' di akhir untuk menunjukkan bahwa ini tipe long
        long angkaBesar = 10000000000L;

        // Tipe data primitif - angka desimal kecil (presisi: sekitar 7 angka signifikan)
        // Perlu ditambahkan 'f' di akhir untuk menunjukkan bahwa ini tipe float
        float angkaDesimalKecil = 3.14f;

        double angkaDesimalBesar = 3.141592653; // Tipe data primitif - angka desimal besar (presisi: sekitar 15-16 angka signifikan)

        char karakter = 'A'; // Tipe data primitif - karakter tunggal (dikelilingi oleh tanda kutip tunggal)

        boolean logika = true; // Tipe data primitif - nilai logika (hanya bisa bernilai true atau false)

        System.out.println("byte: " + angkaKecil);
        System.out.println("short: " + angkaPendek);
        System.out.println("int: " + angkaBulat);
        System.out.println("long: " + angkaBesar);
        System.out.println("float: " + angkaDesimalKecil);
        System.out.println("double: " + angkaDesimalBesar);
        System.out.println("char: " + karakter);
        System.out.println("boolean: " + logika);
    }
}
