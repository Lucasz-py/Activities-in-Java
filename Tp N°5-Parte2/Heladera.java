/**
 * Class Heladera.
 * Representa un electrodoméstico de tipo Heladera, extendiendo la funcionalidad de ArtefactoHogar.
 * Incluye características como el tamaño en pies, número de puertas y si posee compresor.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Heladera extends ArtefactoHogar{
    private int pies;
    private int puertas; 
    private boolean compresor; 
    
    /**
     * Constructor de la clase Heladera.
     * @param p_marca Marca de la heladera.
     * @param p_precio Precio de venta de la heladera.
     * @param p_stock Cantidad de unidades en stock.
     * @param p_pies Tamaño en pies cúbicos.
     * @param p_puertas Número de puertas.
     * @param p_compresor Indica si tiene compresor.
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }
    
    /**
     * Establece el tamaño en pies cúbicos.
     * @param p_pies El nuevo tamaño en pies cúbicos (int).
     */
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    
    /**
     * Establece el número de puertas.
     * @param p_puertas El nuevo número de puertas (int).
     */
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    
    /**
     * Establece si la heladera tiene compresor.
     * @param p_compresor true si tiene compresor, false si no (boolean).
     */
    private void setCompresor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    
    /**
     * Devuelve el tamaño en pies cúbicos.
     * @return El tamaño en pies cúbicos (int).
     */
    public int getPies(){
        return this.pies;
    }
    
    /**
     * Devuelve el número de puertas.
     * @return El número de puertas (int).
     */
    public int getPuertas(){
        return this.puertas;
    }
    
    /**
     * Devuelve si la heladera tiene compresor.
     * @return true si tiene compresor, false si no (boolean).
     */
    public boolean getCompresor(){
        return this.compresor;
    }
    
    /**
     * Calcula el valor de la cuota de crédito con un posible adicional.
     * Añade un adicional de $50.0 a la cuota base si la heladera tiene compresor.
     * @param p_cuotas Número de cuotas.
     * @param p_interes Tasa de interés aplicada.
     * @return El valor de la cuota de crédito final (float).
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float baseCuota = super.cuotaCredito(p_cuotas, p_interes);
        if(this.getCompresor()){
            return baseCuota + 50.0f;
        } else {
            return baseCuota;
        }
    }
    
    /**
     * Imprime en consola la información detallada de la Heladera,
     * incluyendo las características específicas de la subclase.
     */
    public void imprimir(){
        System.out.println("**** Heladera ****");
        super.imprimir();
        System.out.println("Pies: "+this.getPies());
        System.out.println("Puertas: "+this.getPuertas());
        System.out.println("Compresor: " + (this.getCompresor() ? "Si" : "No"));
    }
}
