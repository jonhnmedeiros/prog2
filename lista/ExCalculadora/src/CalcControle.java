/**
 *
 * @author Johnny
 */
public class CalcControle {
    
    public void executar() {
        //Instancia as classes CalcDados e CalcInterface
        CalcDados dados = new CalcDados();
        CalcInterface inter = new CalcInterface();
        
        // Seta o operando 1
        dados.setOperando(0, inter.recebeOperando());
        
        // Seta o operando 2
        dados.setOperando(1, inter.recebeOperando());
        
        // Seta a operação
        dados.setOperacao(inter.recebeOperacao());
        
        // Caso o usuário digitar s o programa irá sair
        if (dados.getOperacao() == 's') {
            System.exit(0);
        } 
        
        // Mostra o resultado atráve da classe CalcInterface
        inter.mostraResultado(opera(dados.getOperando(0),dados.getOperando(1),dados.getOperacao()));
        
        // Gravado o resultado no operando 1
        dados.setOperando(1,opera(dados.getOperando(0),dados.getOperando(1),dados.getOperacao()));
            
    }
   
    
    private double opera(double opn1,double opn2, char op) {
        double result;
        switch (op) {
            case '+': 
                result = opn1 + opn2; break;
            case '-': 
                result = opn1 - opn2; break;
            case '/': 
                result = opn1 / opn2; break;
            case '*': 
                result = opn1 * opn2; break;
            default:
                result = 0;
            }
        return result;
    }
}
