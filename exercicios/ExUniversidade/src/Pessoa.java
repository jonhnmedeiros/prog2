/**
 *
 * @author Johnny
 */
public class Pessoa {

    private String nomePessoa;
    private Universidade universidade;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    
    public void mostrar() {
        System.out.println("Nome: " + this.nomePessoa);
        if (this.universidade != null) {
            System.out.println("Universidade: " + this.universidade.getNome());
        }
    }

    public Pessoa() {
    }
}