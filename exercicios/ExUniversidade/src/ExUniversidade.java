/**
 *
 * @author Johnny
 */
public class ExUniversidade {

   public static void main(String args[]) {
        Pessoa p1 = new Pessoa();
        p1.setNomePessoa("Tulio");

        Pessoa p2 = new Pessoa();
        p2.setNomePessoa("Marco");

        Universidade uni1 = new Universidade();
        uni1.setNomeUniversidade("UTFPR");

        Universidade uni2 = new Universidade();
        uni2.setNomeUniversidade("PUCPR");

        p1.setUniversidade(uni1);
        p2.setUniversidade(uni2);

        p1.mostrar();
        p2.mostrar();
        
        
       Departamento d1 = new Departamento();
       d1.setNomeDepartamento("Biblioteca");
       uni1.addDepartamento(d1);
       
        Departamento d2 = new Departamento();
       d2.setNomeDepartamento("DAINF");
       uni1.addDepartamento(d2);
       
       
       for (int i=0; i<uni1.getDepartamentos().size(); i++) {
           System.out.println(uni1.getDepartamentos().get(i).getNomeDepartamento());
       }
      
       
       
    }
}
