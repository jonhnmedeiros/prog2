/**
 *
 * @author Johnny
 */

public class Carro {
    private double consumo;
    private int capTanque;
    private double combustivel;
    
    public void setCapTanque (int cap) {
        capTanque = cap;
    }
    
    public void setConsumo (double cons) {
        consumo = cons;
    }
    
    public void andar (int km) {
        double litrosCons = km/consumo;
        combustivel = combustivel - litrosCons;        
    }
    
    public double getCombustivel () {
        return combustivel;
    }
    
    public boolean abastecer (double lt) {
        if (combustivel + lt < capTanque) {
            combustivel = combustivel + lt;
            return true; // abastecimento bem sussedido
        } else {
            return false; // abastecimento não pode ser efetuado
        }
    }
}
