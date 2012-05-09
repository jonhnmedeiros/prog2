public class Horario {
    private int hora;
    private int min;
    
    public int getHora(){
        return hora;
    } 
    
    public int getMin() {
        return min;
    }
    
    public boolean setHora (int hTemp) {
        if (hTemp <= 23 && hTemp >= 0) {
            hora = hTemp;
            return true;
        } /*else*/ return false;    // nesse caso o else não é necessário
        
        /* *** outra forma ***
          boolean res;
          if (h >= 0 && h <=23) {
            hora = hTemp;
            res = true;
          } else res = false;
          return = res;
         */
        
    }
    
    public boolean setMin (int mTemp) {
        if (mTemp <= 59 && mTemp >= 0) {
            min = mTemp;
            return true;
        } else return false;    
        
    }
        
    public int calculaIntervalo (Horario h) {
        int duracao;
        duracao = (h.getHora()*60 + h.getMin()) - (hora*60 + min);
        return duracao;
        
    }
}
