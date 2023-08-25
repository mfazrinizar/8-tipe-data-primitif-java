import java.util.Scanner;

public class Solusi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih tipe data operasi:");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.println("3. Float");
        System.out.println("4. Short");
        System.out.println("5. Long");
        System.out.println("6. Byte");
        System.out.println("7. Boolean");
        System.out.println("8. Char");
        System.out.print("Masukkan pilihan (1/2/3/4/5/6/7/8): ");
        int pilihanTipeData = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = scanner.nextDouble();

        switch (pilihanTipeData) {
            case 1:
                operasiInteger(angkaPertama, angkaKedua);
                break;
            case 2:
                operasiDouble(angkaPertama, angkaKedua);
                break;
            case 3:
                operasiFloat(angkaPertama, angkaKedua);
                break;
            case 4:
                operasiShort(angkaPertama, angkaKedua);
                break;
            case 5:
                operasiLong(angkaPertama, angkaKedua);
                break;
            case 6:
                operasiByte(angkaPertama, angkaKedua);
                break;
            case 7:
                operasiBoolean(angkaPertama, angkaKedua);
                break;
            case 8:
                operasiChar(angkaPertama, angkaKedua);
                break;
            default:
                System.out.println("Pilihan tipe data tidak valid.");
        }

        scanner.close();
    }

    public static void operasiInteger(double angkaPertama, double angkaKedua) {
        int hasil = (int) (angkaPertama + angkaKedua);
        System.out.println("Hasil Penjumlahan (Integer): " + hasil);

    }

    public static void operasiDouble(double angkaPertama, double angkaKedua) {
        double hasil = angkaPertama + angkaKedua;
        System.out.println("Hasil Penjumlahan (Double): " + hasil);

    }

    public static void operasiFloat(double angkaPertama, double angkaKedua) {
        float hasil = (float) (angkaPertama + angkaKedua);
        System.out.println("Hasil Penjumlahan (Float): " + hasil);

    }

    public static void operasiShort(double angkaPertama, double angkaKedua) {
        short hasil = (short) (angkaPertama + angkaKedua);
        System.out.println("Hasil Penjumlahan (Short): " + hasil);

    }

    public static void operasiLong(double angkaPertama, double angkaKedua) {
        long hasil = (long) (angkaPertama + angkaKedua);
        System.out.println("Hasil Penjumlahan (Long): " + hasil);

    }

    public static void operasiByte(double angkaPertama, double angkaKedua) {
        byte hasil = (byte) (angkaPertama + angkaKedua);
        System.out.println("Hasil Penjumlahan (Byte): " + hasil);

    }

    public static void operasiBoolean(double angkaPertama, double angkaKedua) {
        boolean hasil = angkaPertama > angkaKedua;
        System.out.println("Hasil Pembandingan (" + angkaPertama + " > " + angkaKedua + ") (Boolean): " + hasil);

    }

    public static void operasiChar(double angkaPertama, double angkaKedua) {
        char hasil = (char) ((int) angkaPertama + (int) angkaKedua);
        System.out.println("Hasil Konversi ke Char: " + hasil);

    }
}
