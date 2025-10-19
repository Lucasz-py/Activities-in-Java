/**
 * Subclase Comun de Etiqueta.
 * Representa una etiqueta de tipo común con un costo adicional fijo por diseño
 * y descuentos por volumen basados en la cantidad solicitada.
 * * @author (Lucas E. Gabriel F.)
 * @version (18/10/2025)
 */
public class Comun extends Etiqueta {
    private double plus; // Costo adicional fijo por diseño o concepto.
    
    /**
     * Constructor de la clase Comun.
     * @param p_costo Costo base de la etiqueta (double).
     * @param p_plus Costo adicional fijo por diseño (double).
     */
    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }
    
    /**
     * Establece el costo adicional (plus) de la etiqueta Común.
     * @param p_plus Costo adicional (double).
     */
    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }
    
    /**
     * Obtiene el costo adicional (plus) de la etiqueta Común.
     * @return El costo adicional (double).
     */
    public double getPlus() {
        return this.plus;
    }
    
    /**
     * Calcula el porcentaje de descuento aplicable basado en la cantidad solicitada (q).
     * - 1 a 10 unidades: 0%
     * - 11 a 50 unidades: 2%
     * - 51 a 100 unidades: 5%
     * - > 100 unidades: 5% + 1% por cada bloque de 10 unidades adicionales sobre 100.
     * @param q La cantidad de etiquetas (int).
     * @return El porcentaje de descuento como un valor decimal (ej: 0.05 para 5%).
     */
    private double descuento(int q) {
        if (q >= 1 && q <= 10) {
            return 0.0;
        } else if (q >= 11 && q <= 50) {
            return 0.02; // 2%
        } else if (q >= 51 && q <= 100) {
            return 0.05; // 5%
        } else if (q > 100) {
            // 1% cada 10 unidades adicionales sobre 100
            int unidadesExtra = q - 100;
            int bloquesDeDiez = unidadesExtra / 10;
            return 0.05 + (bloquesDeDiez * 0.01);
        }
        return 0.0;
    }
    
    /**
     * Calcula el precio total por una cantidad de etiquetas Común, 
     * aplicando el descuento por volumen.
     * El costo unitario es Costo Base + Plus Fijo.
     * @param q La cantidad de etiquetas a cotizar (int).
     * @return El precio total final a pagar (double).
     */
    public double precio(int q) {
        double costoUnitario = this.getCosto() + this.getPlus();
        double precioSinDescuento = costoUnitario * q;
        double descuento = this.descuento(q);
        return precioSinDescuento * (1 - descuento);
    }
    
    /**
     * Devuelve el tipo de etiqueta.
     * @return El String "Común".
     */
    protected String tipo() {
        return "Común";
    }
    
    /**
     * Devuelve una representación en String de la etiqueta Común.
     * @return Representación en String con tipo, costo base y plus fijo.
     */
    public String toString() {
        return super.toString() + " - Costo: $" + this.getCosto() + " - Diseño: $" + this.getPlus();
    }
}
