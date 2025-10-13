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
}