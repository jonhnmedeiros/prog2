import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Universidade {

    private String nomeUniversidade;
    private List<Departamento> departamentos = new ArrayList(); 

    public String getNome() {
        return nomeUniversidade;

    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }
    
    public List<Departamento> getDepartamentos(){
        return this.departamentos;
    }
    
    public void listaDepartamentos () {
        for (int i=0; i<departamentos.size(); i++) {
            System.out.println(departamentos.get(i).getNomeDepartamento());
        }

    }
    
}