
import java.util.Scanner;
public class hacim {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double hacim = 0;
     double h = 0;
     double r = 0;
     System.out.println("h  : ");
     h = scanner.nextDouble();
     System.out.println("r  : ");
     r = scanner.nextDouble();
     hacim =(( 1.0 / 3.0 ) * ( Math.PI * r * r) * h );
    
        System.out.println("Hacim ::"+hacim);
  }

}
