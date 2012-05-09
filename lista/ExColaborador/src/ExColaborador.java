
import java.util.Scanner;


public class ExColaborador {

    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       Colaborador [] cadastrado;
       cadastrado = new Colaborador[3];
       String nomeF;
       int tempServ;
       int tipVinc;
       double vlrHr;
       int numHrs;
       
       System.out.println("--- Cadastro de Funcionário ----");
       for (int i = 0; i < 3; i++) {
           System.out.println("---- Funcionário " + (i+1) + " ----");
           System.out.println("Digite o nome do funcionário:");
           nomeF = s.nextLine();
           System.out.println("Digite o tipo de funcionário:");
           System.out.println("0 - Estagiário");
           System.out.println("1 - Empregado");
           System.out.println("2 - Sócio");
           tipVinc = s.nextInt();
           
           cadastrado[i] = new Colaborador(nomeF,tipVinc); //passa parâmetros para construtora
           
           System.out.println("Digite o tempo de serviço:");
           cadastrado[i].setTempoServico(s.nextInt());
           
           System.out.println("Digite a quantidade de horas trabalhadas:");
           cadastrado[i].setNumHoras(s.nextInt());
           
           System.out.println("Digite o valor da hora:");
           cadastrado[i].setValorHora(s.nextDouble());
           
           nomeF = s.nextLine(); // Limpa o buffer, ou seja, consome o "/n" que o nextDouble e o nextInt 
                                 // não consumiram
           
       }
       
       System.out.println("------ Resultados ------");
       int maiorRend = 0;
       int maiorCusto = 0;
       
       for (int i = 0; i < 3; i++) {
           
           System.out.println("Funcionário: " + cadastrado[i].getNome());
           System.out.println("Rendimentos: R$ " + cadastrado[i].calculaRendimentos());
           System.out.println("Custo: R$ " + cadastrado[i].calculaCusto());
           
           if (cadastrado[i].calculaRendimentos() > cadastrado[maiorRend].calculaRendimentos()) {
               maiorRend = i;
           }
           
           if (cadastrado[i].calculaCusto() > cadastrado[maiorCusto].calculaCusto()) {
               maiorCusto = i;
           }    
                
           System.out.println(" ");
       }       
       
       System.out.println("Funcionário com maior rendimento: " + cadastrado[maiorRend].getNome());
       System.out.println("R$ " + cadastrado[maiorRend].calculaRendimentos());
       System.out.println("Funcionário com maior custo: " + cadastrado[maiorCusto].getNome());
       System.out.println("R$ " + cadastrado[maiorCusto].calculaCusto());
       
        
    }
}
