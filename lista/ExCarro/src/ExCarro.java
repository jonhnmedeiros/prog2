/**
 *
 * @author Johnny
 */

public class ExCarro {

    
    public static void main(String[] args) {
       // Novo carro gol
        Carro gol = new Carro(); 
        gol.setConsumo(12); // 12 quilômetros por litro de combustível,
        gol.setCapTanque(45);  //capacidade do tanque é 45 litros
        
        // Novo carro uno
        Carro uno = new Carro();
        uno.setConsumo(14);
        uno.setCapTanque(40);
        
        // Abastecimento do Uno
        boolean resultUno = uno.abastecer(50);
        if (resultUno == true) {
            System.out.println("Uno abastecido com sucesso");
        } else {
            System.out.println("Capacidade do carro Uno exedida, abastecimento não foi efetuado");        
        }
        
        // Abastecimento do Gol
        boolean resultGol = gol.abastecer(20);
        if (resultGol == true) {
            System.out.println("Gol abastecido com sucesso");
        } else {
            System.out.println("Capacidade do carro Gol exedida, abastecimento não foi efetuado");        
        }
        
        // Andar uno
        uno.andar(150); // anda 150 quilômetros.
        
        // Andar gol
        gol.andar(15); // anda 15 quilêmetros
        
        // Exibe o combustível que resta no tanque.
        double sobraUno = uno.getCombustivel(); 
        System.out.println("Litros restantes no Uno: " + sobraUno); 
        
        // Exibe o combustível que resta no tanque.
        double sobraGol = gol.getCombustivel();
        System.out.println("Litros restantes no Gol: " + sobraGol);
    }
}
