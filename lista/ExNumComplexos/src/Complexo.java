public class Complexo {
    protected float real,imag;
    
    public Complexo(float r, float i) {
        real = r;
        imag = i;
    }
    
    public float modulo() {
        return (float) Math.sqrt((real*real) + (imag*imag));
    }
    
    public double angulo() {
        if (real >= 0 && imag >= 0){
            return Math.toDegrees(Math.atan(imag/real));
	} else {
            if (real < 0 && imag >= 0){
                return 180.0-(Math.toDegrees(Math.atan(imag/real)));
            } else {
                if (real < 0 && imag < 0){
                    return 180.0+(Math.toDegrees(Math.atan(imag/real)));
                } else {
                    return 360.0-(Math.toDegrees(Math.atan(imag/real)));
		}
            }
	}
    }
    
    
    
    
    
    
    
    
}
