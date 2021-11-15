package id.ac.upj.tif;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                int bill1, bill2, hasil = 0;
                System.out.print("Masukan bilangan 1: ");
                bill1 = sc.nextInt();
                System.out.print("Masukan bilangan 2: ");
                bill2 = sc.nextInt();

                hasil = bill1 / bill2;

                System.out.println("Hasil = " + hasil);
            } catch (ArithmeticException e) {
                System.out.println("Terjadi error arithmetic, yaitu bill 2 tidak boleh 0 " + e);
                continue;
            } catch (InputMismatchException e) {
                System.out.println("Input data harus bilangan bulat");
                continue;
            } catch (Exception e) {
                System.out.println("Terjadi error yang tidak diketahui: " + "(" + e + ")");
                continue;
            }
            System.out.println("Akhir Program");
            break;
        }
    }
}