/**
 * Subclase Premium de Etiqueta.
 * Representa una etiqueta de mayor calidad con un costo adicional
 * basado en la cantidad de colores de impresión.
 * * @author (Lucas E. Gabriel F.)
 * @version (18/10/2025)
 */
public class Premium extends Etiqueta {
    private int colores; // Número de colores de impresión.
    
    /**
     * Constructor de la clase Premium.
     * @param p_costo Costo base de la etiqueta (double).
     * @param p_colores Cantidad de colores de impresión (int).
     */
    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }
    
    /**
     * Establece la cantidad de colores de impresión.
     * @param p_colores Cantidad de colores (int).
     */
    private void setColores(int p_colores) {
        this.colores = p_colores;
    }
    
    /**
     * Obtiene la cantidad de colores de impresión.
     * @return Cantidad de colores (int).
     */
    public int getColores() {
        return this.colores;
    }
    
    /**
     * Calcula el plus adicional por la cantidad de colores, como porcentaje del costo base.
     * - 1 color: 0%
     * - 2 colores: 5%
     * - 3 colores: 7%
     * - > 3 colores: 7% + 4% adicional por cada color extra (sobre 3).
     * @return El monto del plus a añadir al costo base (double).
     */
    public double plus() {
        int colores = this.getColores();
        double porcentaje = 0.0;
        
        if (colores == 1) {
            porcentaje = 0.0;
        } else if (colores == 2) {
            porcentaje = 0.05;
        } else if (colores == 3) {
            porcentaje = 0.07;
        } else if (colores > 3) {
            // 7% base para 3 colores + 4% por cada color extra sobre 3
            porcentaje = 0.07 + (colores - 3) * 0.04; 
        }
        
        return this.getCosto() * porcentaje;
    }
    
    /**
     * Calcula el precio total por una cantidad de etiquetas Premium, 
     * incluyendo el costo base y el plus por colores.
     * @param q La cantidad de etiquetas a cotizar (int).
     * @return El precio total a pagar (double).
     */
    public double precio(int q) {
        double costoUnitario = this.getCosto() + this.plus();
        return costoUnitario * q;
    }
    
    /**
     * Devuelve el tipo de etiqueta.
     * @return El String "Premium".
     */
    protected String tipo() {
        return "Premium";
    }
    
    /**
     * Devuelve una representación en String de la etiqueta Premium.
     * @return Representación en String con tipo, costo y cantidad de colores.
     */
    public String toString() {
        return super.toString() + " - Costo: $" + this.getCosto() + " - Colores: " + this.getColores();
    }
}
