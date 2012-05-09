
import java.util.Scanner;
/**
 *
 * @author Johnny
 */
public class CalcInterface {
    Scanner teclado = new Scanner(System.in);
    
    public double recebeOperando() {
        System.out.println("num 1");
        return teclado.nextDouble();         
    }
    
    public char recebeOperacao() {
        System.out.println("num 2");
        return teclado.nextLine().charAt(0);      
    }
    
    public void mostraResultado(double res) {
        System.out.println(" = " + res);
    }
    
}
