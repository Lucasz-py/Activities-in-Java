/**
 * Class Cocina.
 * Representa un electrodoméstico de tipo Cocina (o estufa), extendiendo la funcionalidad de ArtefactoHogar.
 * Incluye características como el número de hornallas, potencia calorífica (calorías) y sus dimensiones.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Cocina extends ArtefactoHogar{
    private int hornallas; // Número de quemadores o fuegos de la cocina.
    private int calorias; // Potencia calorífica total (o equivalente) en calorías/hora.
    private String dimensiones; // Dimensiones físicas de la cocina (ej: "60x60x90 cm").
    
    /**
     * Constructor de la clase Cocina.
     * @param p_marca Marca de la cocina.
     * @param p_precio Precio de venta.
     * @param p_stock Cantidad de unidades en stock.
     * @param p_hornallas Número de hornallas.
     * @param p_calorias Potencia calorífica en calorías/hora.
     * @param p_dimensiones Dimensiones físicas (String).
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }
    
    /**
     * Establece el número de hornallas.
     * @param p_hornallas El nuevo número de hornallas (int).
     */
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    
    /**
     * Establece la potencia calorífica.
     * @param p_calorias La potencia calorífica en calorías/hora (int).
     */
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    
    /**
     * Establece las dimensiones físicas de la cocina.
     * @param p_dimensiones Las dimensiones (String).
     */
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    
    /**
     * Devuelve el número de hornallas.
     * @return El número de hornallas (int).
     */
    public int getHornallas(){
        return this.hornallas;
    }
    
    /**
     * Devuelve la potencia calorífica.
     * @return La potencia calorífica en calorías/hora (int).
     */
    public int getCalorias(){
        return this.calorias;
    }
    
    /**
     * Devuelve las dimensiones de la cocina.
     * @return Las dimensiones (String).
     */
    public String getDimensiones(){
        return this.dimensiones;
    }
    
    /**
     * Calcula el valor de la cuota de crédito sin aplicar adicionales específicos en esta subclase.
     * Simplemente devuelve la cuota base calculada por la superclase.
     * @param p_cuotas Número de cuotas.
     * @param p_interes Tasa de interés aplicada.
     * @return El valor de la cuota de crédito (float).
     */
    public float creditoConAdicional(int p_cuotas, float p_interes){
        float baseCuota = super.cuotaCredito(p_cuotas, p_interes);
        return baseCuota;
    }
    
    /**
     * Imprime en consola la información detallada de la Cocina,
     * incluyendo las características específicas de la subclase.
     */
    public void imprimir(){
        System.out.println("**** Cocina ****");
        super.imprimir();
        System.out.println("Hornallas: "+this.getHornallas());
        System.out.println("Calorias: "+this.getCalorias());
        System.out.println("Dimenciones: "+this.getDimensiones());
    }
}
