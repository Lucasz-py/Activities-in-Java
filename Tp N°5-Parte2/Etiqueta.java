/**
 * Write a description of class Etiqueta here.
 * La clase abstracta Etiqueta representa el concepto base de una etiqueta a imprimir,
 * con un costo base y métodos abstractos para calcular su precio final.
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public abstract class Etiqueta{
    private double costo; // El costo base de la etiqueta (sin adicionales ni descuentos).
    
    /**
     * Constructor de la clase Etiqueta.
     * @param p_costo Costo base de la etiqueta (double).
     */
    public Etiqueta(double p_costo){
        this.setCosto(p_costo);
    }
    
    /**
     * Establece el costo de la etiqueta.
     * @param p_costo El nuevo costo de la etiqueta (double).
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    /**
     * Obtiene el costo base de la etiqueta.
     * @return El costo base de la etiqueta (double).
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Método abstracto para calcular el precio total de un pedido de etiquetas.
     * La implementación varía en las subclases (Comun, Premium).
     * @param q La cantidad de etiquetas a cotizar (int).
     * @return El precio total a pagar por la cantidad especificada (double).
     */
    public abstract double precio(int q);
    
    /**
     * Método abstracto protegido para obtener el tipo específico de etiqueta.
     * Usado internamente para el método toString().
     * @return El tipo de etiqueta como String.
     */
    protected abstract String tipo();
    
    /**
     * Devuelve una representación en String de la etiqueta, incluyendo su tipo.
     * @return Representación en String de la etiqueta.
     */
    public String toString() {
        return "tipo " + this.tipo();
    }
}
