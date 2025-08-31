
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo{
    private double radio;
    private Punto centro;
    
    public Circulo(double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0, 0));
    }
    
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro){
        this.centro  = p_centro;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public Punto getCentro(){
        return centro;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    public double superficie(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    public void caracteristicas(){
        System.out.println("******Circulo******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " -Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " -Perimetro: " + this.perimetro());
        System.out.print("\n");
    }
    
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() >= otroCirculo.superficie()){
            return this;
        } else {
            return otroCirculo;
        }
    }
}