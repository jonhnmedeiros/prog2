/**
 *
 * @author jonathan
 */

import java.util.Scanner;

public class CalcInterface {
    Scanner teclado = new Scanner(System.in);
   
    
    public double recebeOperando() {
        System.out.println("Digite o operando:");
        return teclado.nextDouble();
        
    }
    
    public char recebeOperacao() {
        System.out.println("Digite a operação:");
        System.out.println("'+' para soma");
        System.out.println("'-' para subtração");
        System.out.println("'/' para divisão");
        System.out.println("'*' para multiplicação");
        System.out.println("'s' para sair");
        teclado.nextLine(); // Limpa o buffer /n

        return teclado.nextLine().charAt(0);

    }
    
    public void mostraResultado(double res) {
        System.out.println(" = " + res);
    }
    
}
