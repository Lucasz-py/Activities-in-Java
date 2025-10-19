/**
 * Class ArtefactoHogar.
 * Representa la clase abstracta base para los artefactos de hogar (electrodomésticos).
 * Contiene los atributos comunes a todos los artefactos, como marca, precio y stock.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public abstract class ArtefactoHogar{
    private String marca; // Marca o fabricante del artefacto.
    private float precio; // Precio de venta del artefacto.
    private int stock; // Cantidad de unidades disponibles en inventario.
    
    /**
     * Constructor de la clase ArtefactoHogar.
     * @param p_marca Marca del artefacto.
     * @param p_precio Precio de venta.
     * @param p_stock Cantidad de unidades en stock.
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }
    
    /**
     * Establece la marca del artefacto.
     * @param p_marca La nueva marca (String).
     */
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    
    /**
     * Establece el precio de venta del artefacto.
     * @param p_precio El nuevo precio (float).
     */
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    
    /**
     * Establece el stock del artefacto.
     * @param p_stock La nueva cantidad en stock (int).
     */
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    /**
     * Devuelve la marca del artefacto.
     * @return La marca (String).
     */
    public String getMarca(){
        return this.marca;
    }
    
    /**
     * Devuelve el precio de venta del artefacto.
     * @return El precio (float).
     */
    public float getPrecio(){
        return this.precio;
    }
    
    /**
     * Devuelve el stock disponible del artefacto.
     * @return La cantidad en stock (int).
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Método abstracto para calcular el valor de la cuota de crédito con posibles
     * adicionales o descuentos específicos de cada subclase.
     * @param p_cuotas Número de cuotas.
     * @param p_interes Tasa de interés.
     * @return El valor de la cuota final (float).
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
    
    /**
     * Calcula el valor de la cuota base de crédito, aplicando el interés sobre el precio
     * y dividiendo por el número de cuotas.
     * @param p_cuotas Número de cuotas.
     * @param p_interes Tasa de interés (en porcentaje).
     * @return El valor de la cuota base (float).
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        float totalConInteres = this.getPrecio() * (1 + (p_interes / 100));

        return totalConInteres / p_cuotas;
    }
    
    /**
     * Imprime en consola la información básica del artefacto (Marca, Precio, Stock).
     */
    public void imprimir(){
        System.out.println("Marca: "+this.getMarca()+" - Precio:"+this.getPrecio()+" - Stock: "+this.getStock());
    }
}
