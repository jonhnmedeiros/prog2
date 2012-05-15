/**
 *
 * @author jonathan
 */

public class Item {
    private String nome;
    private double valor;
    private int quantidade;
    
    public Item (String n, double vlr, int qtd) {
        nome = n;
        valor = vlr;
        quantidade = qtd;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getQtd(){
        return quantidade;
    }
    
    public double getValorTotal() {
        return valor * quantidade;
    }
    
    
    
}
