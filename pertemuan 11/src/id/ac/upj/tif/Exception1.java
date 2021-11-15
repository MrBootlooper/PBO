package id.ac.upj.tif;

public class Exception1 {

    //input nilai array langsung ke program tanpa scanner

    public static void main(String[] args) {

        System.out.println("Awal Program");
        try {
            int[] bilangan = {1,2,3};
            System.out.println("bilangan ke-4: " + bilangan[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index ke-" + e.getMessage() + " tidak ada pada array");
        } catch (Exception e) {
            System.out.println("Terjadi Error (" + e + ")");
        } finally {
            System.out.println("Try Catch sudah dilakukan");
        }

        System.out.println("Akhir Program");
    }
}
