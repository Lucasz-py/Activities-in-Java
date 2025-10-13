/**
 * Write a description of class Elipse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elipse extends FiguraGeometrica{
    private double sEjeMayor;
    private double sEjeMenor;
    
    public Elipse(double p_sEjeMayor, double p_sEjeMenor, Punto p_centro){
        super(p_centro);
        this.setSEjeMayor(p_sEjeMayor);
        this.setSEjeMenor(p_sEjeMenor);
    }
    
    private void setSEjeMayor(double p_sEjeMayor){
        this.sEjeMayor = p_sEjeMayor;
    }
    
    private void setSEjeMenor(double p_sEjeMenor){
        this.sEjeMenor = p_sEjeMenor;
    }
    
    public double getSEjeMayor(){
        return this.sEjeMayor;
    }
    
    public double getSEjeMenor(){
        return this.sEjeMenor;
    }
    
    public Punto getCentro(){
        return super.getOrigen();
    }
    
    public String nombreFigura(){
        return "****Elipse****";
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    public double superficie(){
        return (Math.PI * this.getSEjeMayor() * this.getSEjeMenor());
    }
    
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Centro: " + this.getCentro().coordenadas()+" - Semieje Mayor: "+this.getSEjeMayor()+" - Semieje Menor: "+this.getSEjeMenor());
        System.out.println("Superficie: " + this.superficie());
        System.out.print("\n");
    }
  
    public double distanciaA(Elipse otroElipse){
        return this.getCentro().distanciaA(otroElipse.getCentro());
    }

    public Elipse elMayor(Elipse otroElipse){
        if(this.superficie() >= otroElipse.superficie()){
            return this;
        } else {
            return otroElipse;
        }
    }
    
    
}