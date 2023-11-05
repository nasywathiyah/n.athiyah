// Nama : Nasywa Athiyah Rabbani
// NIM : 235150707111003
// Kelas : TI-A
// Tugas : Konversi Bilangan (tugas AOK)

import java.util.Scanner;

public class aok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Pilih jenis konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Heksadesimal");
            System.out.println("4. Heksadesimal ke Biner");
            System.out.println("5. Desimal ke Heksadesimal");
            System.out.println("6. Heksadesimal ke Desimal");
            System.out.println("0. Keluar");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    String binaryInput = input.next();
                    int decimalOutput = Integer.parseInt(binaryInput, 2);
                    System.out.println("Hasil konversi: " + decimalOutput);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    int decimalInput = input.nextInt();
                    String binaryOutput = Integer.toBinaryString(decimalInput);
                    System.out.println("Hasil konversi: " + binaryOutput);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    String binaryInput2 = input.next();
                    int decimalOutput2 = Integer.parseInt(binaryInput2, 2);
                    String hexOutput = Integer.toHexString(decimalOutput2).toUpperCase();
                    System.out.println("Hasil konversi: " + hexOutput);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexInput = input.next();
                    int decimalOutput3 = Integer.parseInt(hexInput, 16);
                    String binaryOutput2 = Integer.toBinaryString(decimalOutput3);
                    System.out.println("Hasil konversi: " + binaryOutput2);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    int decimalInput2 = input.nextInt();
                    String hexOutput2 = Integer.toHexString(decimalInput2).toUpperCase();
                    System.out.println("Hasil konversi: " + hexOutput2);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    String hexInput2 = input.next();
                    int decimalOutput4 = Integer.parseInt(hexInput2, 16);
                    System.out.println("Hasil konversi: " + decimalOutput4);
                    break;
                case 0:
                    System.out.println("Gomawo!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 0);
        input.close();
    }
}