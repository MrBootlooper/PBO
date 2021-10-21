
// Online IDE - Code Editor, Compiler, Interpreter
import java.util.Scanner;
public class HargaPercakapan
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int second, minute, pulsa, price;
        double x, y, hour;
        
        System.out.print("Jumlah detik : "); second = input.nextInt();
        
        hour = second/3600;
        x = second%3600;
        
        minute = (int) x/60;
        y = x%60;
        
        pulsa = second / 5;
        price = pulsa * 150;
        
        System.out.println (second+" detik = " + hour + " jam," + minute + " menit,"+ y +" detik");
        
        System.out.println ("Total Harga Pulsa = " + price);
        
    }
}
