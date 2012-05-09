import java.util.Scanner;

public class ExHorario {

    
    public static void main(String[] args) {
        int horaE, minE, horaS, minS;
        boolean validacao;
       Scanner s = new Scanner(System.in);
        Horario entrada, saida;
       do
       {
           System.out.println("DIgite a hora de entrada: ");
           horaE = s.nextInt();
           System.out.println("Digite o minuto de entrada: ");
           minE = s.nextInt();

            System.out.println("DIgite a hora de saída: ");
           horaS = s.nextInt();
           System.out.println("Digite o minuto de saída: ");
           minS = s.nextInt();

           //criar os objetos
          
           entrada = new Horario();
           saida = new Horario();

           validacao = entrada.setHora(horaE);
           validacao = validacao && entrada.setMin(minE);
           validacao = validacao && saida.setHora(horaS);
           validacao = validacao && saida.setMin(minS);

           if (validacao == false)
           {
               System.out.println("Algum valor inválido");

           }
       } while (validacao == false);
       
       //calcular o intervalo e o preço
       int intervalo;
       intervalo = entrada.calculaIntervalo(saida);
       double preco;
       //preco
       if (intervalo <= 3*60)
       {
            preco = 4.5;           
       }
       else if (intervalo <= 12*60)
       {
           
           preco = 4.5 + (intervalo - 3*60)*0.75/15;
       }
       else
       {
           preco = 33.0;
       }
       
       //System.out.println("Preço = " + preco);
       System.out.printf("Preço = %.2f", preco);
    }
}
