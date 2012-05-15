/**
 *
 * @author jonathan
 */

public class CalcControle {
    
    public void executar() {
        //Instancia as classes CalcDados e CalcInterface
        CalcDados dados = new CalcDados();
        CalcInterface inter = new CalcInterface();
        
        // Seta o operando 1
        dados.setOperando(0, inter.recebeOperando());
        
        while (dados.getOperacao() != 's') {
            // Seta a operação
            dados.setOperacao(inter.recebeOperacao());

            if(dados.getOperacao() == 's'){
                System.exit(0);
            }

            // Seta o operando 2
            dados.setOperando(1, inter.recebeOperando());            

            // Mostra o resultado atráve da classe CalcInterface
            inter.mostraResultado(opera(dados.getOperando(0),dados.getOperando(1),dados.getOperacao()));

            // Gravado o resultado no operando 1
            dados.setOperando(0,opera(dados.getOperando(0),dados.getOperando(1),dados.getOperacao()));
        }

        
            
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
