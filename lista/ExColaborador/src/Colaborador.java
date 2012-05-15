/**
 *
 * @author jonathan
 */
public class Colaborador {
    private String nome;
    private int tempoServico;
    private int tipoVinculo;
    private double valorHora;
    private int numHoras;


    public Colaborador (String n, int t) {
        nome = n;
        tipoVinculo = t;
    }

    public void setTempoServico (int tmpServ) {
        tempoServico = tmpServ;
    }

    public void setValorHora (double vlrHr) {
        valorHora = vlrHr;
    }

    public void setNumHoras (int nHrs) {
        numHoras = nHrs;
    }

    public String getNome () {
        return nome;
    }


    public double calculaRendimentos() {
        double result = 0;

        // estagiário
        if (tipoVinculo == 0) {
            result = valorHora * 80;
        }

        // empregado
        if (tipoVinculo == 1) {
            double temp = numHoras * valorHora;
            result = temp + ((temp * 0.10)* tempoServico);
            if (numHoras > 144) {
                temp = (numHoras - 144) * (valorHora*0.5);
                result = result + temp;
            }
        }

        // sócio
        if (tipoVinculo == 2) {
            result = numHoras * valorHora;
        }

        return result;
    }

    public double calculaCusto () {
        if (tipoVinculo == 0 || tipoVinculo == 1) {
            return calculaRendimentos();
        } else {
            double result = calculaRendimentos();
            return result + result*0.8;
        }

    }
}
