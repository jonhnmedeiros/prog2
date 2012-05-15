/**
 *
 * @author jonathan
 */

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Item> listaItem;
    
    public void adicionarItem(Item i){
        if (this.listaItem == null) {
            this.listaItem = new ArrayList<Item>();
        }
        this.listaItem.add(i);
    }
    
    public void removerItem(Item i) {
        if (this.listaItem != null) {
            this.listaItem.remove(i);
        } 
    }
                                                                                                                                                                    
    public void imprimirLista() {
        System.out.println("---------------- LISTA DE COMPRAS ----------------");
        System.out.println("QUANTIDADE  |  PRODUTO    |    VALOR");
        
        for(Item i:listaItem) {
            System.out.println(i.getQtd() +"    " +  i.getNome());
        }
    }
    
    public double getValotTotal() {
        double total = 0;
        
        for (Item i : this.listaItem) {
            total += i.getValorTotal();
            
        }
        
        return total;   
        
    }
}
