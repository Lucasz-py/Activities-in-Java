import java.util.ArrayList;
/**
 * Clase Jardin.
 * Representa un espacio que contiene diferentes figuras geométricas y
 * calcula la superficie total a cubrir, los litros de pintura necesarios
 * y la cantidad de latas a comprar.
 * * @authors (Lucas Escobar, Gabriel Fernandez)
 * @version (10/10/2025)
 */
public class Jardin {
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;
    
    /**
     * Constructor de la clase Jardin.
     * Inicializa el jardín con un nombre y una colección inicial de figuras.
     * * @param p_nombre El nombre que se asigna al jardín.
     * @param p_figuras La lista inicial de figuras geométricas en el jardín.
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras){
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }
    
    /**
     * ★ Establece el nombre del jardín.
     * * @param p_nombre El nuevo nombre del jardín.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * ★ Establece la colección de figuras geométricas.
     * * @param p_figuras La nueva lista de figuras.
     */
    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras){
        this.figuras = p_figuras;
    }
    
    /**
     * Getter ★ Retorna el nombre del jardín.
     * * @return El nombre actual del jardín.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Getter ★ Retorna la lista de figuras geométricas.
     * * @return La lista (ArrayList) de objetos FiguraGeometrica.
     */
    public ArrayList<FiguraGeometrica> getFigura(){
        return this.figuras;
    }
    
    /**
     * Agrega una nueva figura geométrica a la colección del jardín.
     * * @param p_figuras La figura geométrica a agregar.
     * @return true si la figura fue agregada exitosamente.
     */
    public boolean agregarFigura(FiguraGeometrica p_figuras) {
        return this.figuras.add(p_figuras);
    }
    
    /**
     * Quita una figura geométrica específica de la colección,
     * siempre y cuando queden al menos dos figuras en total.
     * * @param p_figuras La figura geométrica a quitar.
     * @return true si la figura fue quitada, false si no se pudo quitar (por ejemplo, si queda solo una figura o no se encuentra).
     */
    public boolean quitarFigura(FiguraGeometrica p_figuras) {
        if(this.getFigura().size() > 1){
            return this.getFigura().remove(p_figuras); 
        } else { 
            return false;
        }
    }
    
    /**
     * Calcula la superficie total a cubrir sumando las superficies de todas las figuras.
     * * @return La superficie total en metros cuadrados (double).
     */
    public double cuantosMetros(){
        double totalSuperficie = 0.0;
        
        for (FiguraGeometrica figura : this.getFigura()) {
            totalSuperficie += figura.superficie();
        }
        return totalSuperficie;
    }
    
    /**
     * Calcula la cantidad total de litros de pintura necesarios,
     * asumiendo que se requieren 4 litros por cada 20 m2 (0.2 L/m2).
     * * @return La cantidad total de litros requeridos (double).
     */
    public double cuantosLitros(){
        // Litros por m2 es (4 / 20) = 0.2
        double litrosM2 = 4.0 / 20.0; 
        return this.cuantosMetros() * litrosM2;
    }
    
    /**
     * Calcula la cantidad de latas de pintura a comprar,
     * asumiendo que cada lata contiene 4.0 litros. El resultado
     * se redondea hacia arriba para asegurar la cobertura total.
     * * @return La cantidad mínima de latas (entero).
     */
    public int cuantasLatas(){
        // Cada lata contiene 4.0 litros.
        double latasNecesarias = this.cuantosLitros() / 4.0;
        // Se usa Math.ceil para redondear hacia arriba.
        return (int) Math.ceil(latasNecesarias);
    }
    
    /**
     * Muestra el detalle completo del presupuesto del jardín,
     * incluyendo el nombre, la superficie de cada figura, la superficie
     * total y la cantidad de latas a comprar.
     */
    public void detalleFiguras(){
        System.out.println("Presupuesto: " + this.getNombre()+"\n");
        for (FiguraGeometrica figura : this.getFigura()) {
            System.out.println(figura.nombreFigura());
            figura.mostrarSuperficie(); // Usa el método de FiguraGeometrica
        }
        
        System.out.println("----------------------------------");
        System.out.println("Total a cubrir: "+ this.cuantosMetros() + " m2");
        System.out.println("Comprar " + this.cuantasLatas() + " latas");
        System.out.println("\n");
    }
}
