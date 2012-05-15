public class Real extends Complexo {
    
    public Real(float r) {
        super(r, 0);
    }

    public int sinal(){
        if(real>=0) {
            return 1;
	} else {
            return -1;
	}
    }
}
