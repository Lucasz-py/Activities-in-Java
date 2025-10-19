/**
 * Clase Renglon.
 * Representa un item o línea de detalle dentro de un pedido,
 * conteniendo la cantidad de etiquetas, el precio total calculado
 * y la referencia a la etiqueta (Etiqueta) solicitada.
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Renglon {
    private int cantidad; 
    private double precio; 
    private Etiqueta item; 
    
    /**
     * Constructor de la clase Renglon.
     * @param p_cantidad Cantidad de etiquetas a incluir en el renglón (int).
     * @param p_precio El precio total ya calculado para el renglón (double).
     * @param p_item La etiqueta (Etiqueta) que representa el item (Comun o Premium).
     */
    public Renglon(int p_cantidad, double p_precio, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setPrecio(p_precio);
        this.setItem(p_item);
    }
    
    /**
     * Establece la cantidad de etiquetas.
     * @param p_cantidad Cantidad de etiquetas (int).
     */
    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }
    
    /**
     * Establece el precio total del renglón.
     * @param p_precio Precio total (double).
     */
    private void setPrecio(double p_precio) {
        this.precio = p_precio;
    }
    
    /**
     * Establece la etiqueta (item) a la que se refiere el renglón.
     * @param p_item Objeto de tipo Etiqueta.
     */
    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }
    
    /**
     * Obtiene la cantidad de etiquetas.
     * @return Cantidad de etiquetas (int).
     */
    public int getCantidad() {
        return this.cantidad;
    }
    
    /**
     * Obtiene el precio total asociado a este renglón.
     * @return El precio total del renglón (double).
     */
    public double getPrecio() {
        return this.precio;
    }
    
    /**
     * Obtiene la etiqueta (item) asociada a este renglón.
     * @return El objeto Etiqueta (Comun o Premium).
     */
    public Etiqueta getItem() {
        return this.item;
    }
    
    /**
     * Muestra por consola la cantidad de etiquetas y la descripción del item
     * (utilizando el método toString() de la Etiqueta).
     */
    public void mostrar() {
        System.out.println(this.getCantidad() + " Etiquetas de " + this.getItem().toString());
    }
}