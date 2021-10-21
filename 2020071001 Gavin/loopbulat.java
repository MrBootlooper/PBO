import java.util.Scanner;
public class Loopbulat{
static void myMethod(){
    
    Scanner input = new Scanner(System.in);
    int x, y;
    y = 0;
    
    for (int i = 1; i < 11; i++){
        System.out.print("masukan anka ke " + i + " = "); x = input.nextInt();
        y = y + x;
        x = 0;
    }
    
    System.out.println("Total Hasil = " + y);
    
    
    }
    public static void main (String[] args) {
        myMethod();
    }
}