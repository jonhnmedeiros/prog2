/**
 *
 * @author jonathan
 */

public class ExNumComplexos {

    
    public static void main(String[] args) {
        Complexo num1 = new Complexo(11,3);
	Real num2 = new Real(-5);

        System.out.println("Testando num1 - Complexo...");
        System.out.println("Modulo: " + num1.modulo());
        System.out.println("Angulo: " + num1.angulo());

        System.out.println("\n");

        System.out.println("Testando num2 - Complexo - Real...");
        System.out.println("Modulo: " + num2.modulo());
        System.out.println("Angulo: " + num2.angulo());
        System.out.print("Sinal: ");
        if(num2.sinal() == 1) {System.out.print("Positivo");}
        if(num2.sinal() == -1) {System.out.print("Negativo");}


    }
}
