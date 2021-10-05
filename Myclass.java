import javax.print.event.PrintEvent;

public class Myclass {
    int x;

    public Myclass(int y){
       x = y;  
    }

    public static void main(String[]args) {
        Myclass myObj = new Myclass(3);

        System.out.println(myObj.x);
    }
}
