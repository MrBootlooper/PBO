package id.ac.upj.tif;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Latihan {
    public int inputBilInt(int i) {
        int bil;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Masukan Bilangan bulat ke " + i + " : ");
                bil = sc.nextInt();
                if (bil == 0) {
                    throw new ArithmeticException("Bilangan tidak boleh nol");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Masukan bilangan bulat");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return bil;
    }

    public static void main(String[] args) {
        Latihan obj = new Latihan();

        int bil1, bil2, hasil;
        bil1 = obj.inputBilInt();
        bil2 = obj.inputBilInt();
        hasil = bil1 / bil2;
        System.out.println("Hasil = " + hasil);

    }
}