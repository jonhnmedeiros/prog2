import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Johnny
 */
public class Universidade {

    String nomeUniversidade;
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

    
}