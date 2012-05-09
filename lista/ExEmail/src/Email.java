
public class Email {
    private Assunto ass = new Assunto();
    private Texto txt = new Texto();
    
    
    
    public void setAssunto (String ass) {
        this.ass.setAssunto(ass);      
        
    }
    
    public void addTexto (String txtTemp) {
        txt.addTexto(txtTemp);
        
    }
    
    public void mostraDados (){
        System.out.println("Assunto: " + ass.getAssunto());
        System.out.println("Mensagem: \n" + txt.getTexto());
    }
    
    
}
