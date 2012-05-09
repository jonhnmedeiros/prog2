/**
 *
 * @author Johnny
 */
public class CalcDados {
    private double [] operando;
    private char operacao;
    
    public void setOperando(int i, double valor) {
        operando[i] = valor;  
    }
    
    public double getOperando (int i) {
        return operando[i];
    }
    
    public void setOperacao (char op) {
        operacao = op;
    }
    
    public char getOperacao() {
        return operacao;
    }
    
    
    
    
    
}
