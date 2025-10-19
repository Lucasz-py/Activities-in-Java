import java.util.ArrayList;
/**
 * Write a description of class Jardin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jardin{
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList<FiguraGeometrica> getFigura(){
        return this.figuras;
    }
    
    public boolean agregarFigura(FiguraGeometrica p_figuras) {
        return this.figuras.add(p_figuras);
    }
    
     public boolean quitarFigura(FiguraGeometrica p_figuras) {
        if(this.getFigura().size() > 1){
            return this.getFigura().remove(p_figuras); 
        } else { 
            return false;
        }
    }
    
    public double cuantosMetros(){
        double totalSuperficie = 0.0;
        
        for (FiguraGeometrica figura : this.getFigura()) {
            totalSuperficie += figura.superficie();
        }
        return totalSuperficie;
    }
    
    public double cuantosLitros(){
        // (Litros / m2) = (4 / 20) = 0.2
        double litrosM2 = 4.0 / 20.0; 
        return this.cuantosMetros() * litrosM2;
    }
    
    public int cuantasLatas(){
        // Litros por lata es 4.0
        double latasNecesarias = this.cuantosLitros() / 4.0;
        // Se usa Math.ceil para redondear hacia arriba y asegurar que haya suficiente pintura.
        return (int) Math.ceil(latasNecesarias);
    }
    
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre()+"\n");
        for (FiguraGeometrica figura : this.getFigura()) {
            System.out.println(figura.nombreFigura());
            figura.mostrarSuperficie(); // Usa el método de FiguraGeometrica
        }
        
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: "+ this.cuantosMetros());
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
        System.out.println("\n");
    }
}