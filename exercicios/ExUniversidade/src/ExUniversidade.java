/**
 *
 * @author Johnny
 */
public class ExUniversidade {

   public static void main(String args[]) {
        Pessoa p1 = new Pessoa();
        p1.setNomePessoa("Einstein");

        Pessoa p2 = new Pessoa();
        p2.setNomePessoa("Issac");

        Universidade uni1 = new Universidade();
        uni1.setNomeUniversidade("UTFPR");

        Universidade uni2 = new Universidade();
        uni2.setNomeUniversidade("PUCPR");

        Departamento d1 = new Departamento();
        d1.setNomeDepartamento("DAINF");
        uni1.addDepartamento(d1);
       
        Departamento d2 = new Departamento();
        d2.setNomeDepartamento("RH");
        uni2.addDepartamento(d2);
        
        // Seta relacionamento com universidade
        p1.setUniversidade(uni1);
        p2.setUniversidade(uni2);
        
        // Seta relacionamento com departatamento
        p1.setDepartamento(d1);
        p2.setDepartamento(d2);
        
        // Mostrando os dados de pessoa
        p1.mostrar();
        p2.mostrar();
        
        
       
       
       // Mostrando os departamentos de cada universidade
        
        System.out.println(uni1.getNome());
        uni1.listaDepartamentos();
        
        System.out.println(uni2.getNome());
        uni2.listaDepartamentos();
        
       
       
      
       
       
    }
}
