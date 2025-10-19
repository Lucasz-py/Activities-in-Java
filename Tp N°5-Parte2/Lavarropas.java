/**
 * Class Lavarropas.
 * Representa un electrodoméstico de tipo Lavarropas, extendiendo la funcionalidad de ArtefactoHogar.
 * Incluye características como el número de programas, capacidad en kilos y si es automático.
 * * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Lavarropas extends ArtefactoHogar{
    private int programas; // Número de programas de lavado.
    private float kilos; // Capacidad de carga en kilos.
    private boolean automatico; // Indica si el lavarropas es automático (true) o semiautomático (false).
    
    /**
     * Constructor de la clase Lavarropas.
     * @param p_marca Marca del lavarropas.
     * @param p_precio Precio de venta del lavarropas.
     * @param p_stock Cantidad de unidades en stock.
     * @param p_programas Número de programas de lavado.
     * @param p_kilos Capacidad de carga en kilos.
     * @param p_automatico Indica si es automático (true) o no (false).
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }
    
    /**
     * Establece el número de programas.
     * @param p_programas Número de programas (int).
     */
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    
    /**
     * Establece la capacidad de carga en kilos.
     * @param p_kilos Capacidad en kilos (float).
     */
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    
    /**
     * Establece si el lavarropas es automático.
     * @param p_automatico true si es automático, false si es semiautomático (boolean).
     */
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    
    /**
     * Devuelve el número de programas del lavarropas.
     * @return El número de programas (int).
     */
    public int getProgramas(){
        return this.programas;
    }
    
    /**
     * Devuelve la capacidad de carga en kilos.
     * @return La capacidad en kilos (float).
     */
    public float getKilos(){
        return this.kilos;
    }
    
    /**
     * Devuelve si el lavarropas es automático.
     * @return true si es automático, false si es semiautomático (boolean).
     */
    public boolean getAutomatico(){
        return this.automatico;
    }
    
    /**
     * Calcula el valor de la cuota de crédito con un posible adicional o descuento.
     * Aplica un descuento del 2% (multiplica por 0.98) si el lavarropas NO es automático.
     * @param p_cuotas Número de cuotas.
     * @param p_interes Tasa de interés aplicada.
     * @return El valor de la cuota de crédito final (float).
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float baseCuota = super.cuotaCredito(p_cuotas, p_interes);
        if(this.getAutomatico() == false){
            // Descuento del 2% si no es automático.
            return baseCuota * 0.98f;
        } else {
            return baseCuota;
        }
    }
    
    /**
     * Imprime en consola la información detallada del Lavarropas,
     * incluyendo las características específicas de la subclase.
     */
    public void imprimir(){
        System.out.println("**** Lavarropas ****");
        super.imprimir();
        System.out.println("Programas: "+this.getProgramas());
        System.out.println("Kilos: "+this.getKilos());
        System.out.println("Automático: "+ (this.getAutomatico() ? "Si" : "No"));
    }
}
