
import java.util.Scanner;


public class ExEmail {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Email novoEmail;
        novoEmail = new Email();
        
        
        System.out.println("Digite o Assunto do email:");
        String ass = s.nextLine();
        System.out.println("Digite o corpo do email:");
        String txt = s.nextLine();
        
        novoEmail.setAssunto(ass); // Chama a função para definir o assunto
        novoEmail.addTexto(txt); // Chama a função para adicionar ao corpo do texto
        
        novoEmail.mostraDados();
        
        
        
    }
}
