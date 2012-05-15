/**
 *
 * @author jonathan
 */

public class CalcDados {
    private double [] operando;
    private char operacao;
    
    public void setOperando(int i, double valor) {
        if (operando == null) {
            operando = new double[2];
        }
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
