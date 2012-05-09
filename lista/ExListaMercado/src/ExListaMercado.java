public class ExListaMercado {

    public static void main(String[] args) {
        ListaDeCompras lista = new ListaDeCompras();
        
        Item item1 = new Item("Leite(s)", 2.50, 2);
        Item item2 = new Item("Desodorante(s)", 8.50, 2);
        Item item3 = new Item("Pães", 0.25, 10);
        Item item4 = new Item("Ovo(s)", 0.50, 4);
        Item item5 = new Item("Gillete(s)", 5.90, 1);
        
        // Adicionando itens a lista
        lista.adicionarItem(item1);
        lista.adicionarItem(item2);
        lista.adicionarItem(item3);
        lista.adicionarItem(item4);
        lista.adicionarItem(item5);
        
        // Preview da lista
        lista.imprimirLista();
        
        // excluir um item
        
        lista.removerItem(item5);
        
        // Preview da lista
        lista.imprimirLista();
        
        // Mostrar valor total da lista
        System.out.println("Valor total da lista: " + "R$ " + lista.getValotTotal());
        
        
        
        
        
    }
}
