import java.util.Scanner;
public class BeratIdeal{
static void myMethod(){
    
    Scanner input = new Scanner(System.in);
    Double berat, tinggi, ideal;
    
    System.out.print("Masukan berat badan : "); berat = input.nextDouble();
    System.out.print("Masukan tinggi badan : "); tinggi = input.nextDouble();
    
    ideal = berat / tinggi * tinggi;
   
    if(ideal < 22.9 && ideal > 18.5 ) {
       System.out.println("Berat badan anda ideal");
   }
    else if(ideal > 22.9) {
       System.out.println("Berat badan anda overweight");
   }
    else if(ideal < 18.5) {
       System.out.println("Berat badan anda underweight");
   }
    else{
       System.out.println("error");
   }
   
   
}

    public static void main(String[] args) {
        myMethod();
    }
}
