/**
 * Class Producto.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Producto{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio lab;
     /**
     * Metodo Constructor de Producto.
     * @param p_codigo asigna el codigo del producto.
     * @param p_rubro asigna el rubro del producto.
     * @param p_desc asigna la descripcion del producto.
     * @param p_costo asigna el costo al producto.
     * @param p_porcPtoRepo asigna el porcPtoRepo del producto.
     * @param p_existMinima asigna la existencia minima del producto.
     * @param p_lab asigan un objeto de la clase Laboratoria.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLab(p_lab);
        this.setStock(0);
    }
    /**
     * Metodo Constructor de Producto.
     * @param p_codigo asigna el codigo del producto.
     * @param p_rubro asigna el rubro del producto.
     * @param p_desc asigna la descripcion del producto.
     * @param p_costo asigna el costo al producto.
     * @param p_lab asigan un objeto de la clase Laboratoria.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDesc(p_desc);
        this.setCosto(p_costo);
        this.setLab(p_lab);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setStock(0);
    }
    
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    private void setCosto(double p_costo){
        this.costo = p_costo;
    } 
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    } 
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    private void setLab(Laboratorio p_lab){
        this.lab = p_lab;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getRubro(){
        return rubro;
    }
    public String getDesc(){
        return descripcion;
    }
    public double getCosto(){
        return costo;
    } 
    public int getStock(){
        return stock;
    }
    public double getPorcPtoRepo(){
        return porcPtoRepo;
    } 
    public int getExistMinima(){
        return existMinima;
    }
    public Laboratorio getLab(){
        return lab;
    }
    /**
    * Método ajuste
    * Permite modificar el valor de stock.
    */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    /**
    * Método precioLista
    * Devuelve el valor que resulta de sumar un 12% al costo del producto.
    */
    public double precioLista(){
        return this.getCosto() * 1.12;
    }
    /**
    * Método precioContado
    * Devuelve el valor que resulta de restar un 5% al precioLista del producto.
    */
    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05);
    }
    /**
    * Método stockValorizado
    * Devuelve el valor que resulta de multiplicar el stock por el precio de costo mas un 12%.
    */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    /**
    * Método ajustarPtoRepo
    * Permite asignar un nuevo valor a el atributo porcPtoRepo.
    */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    /**
    * Método ajustarExistMin
    * Permite asignar un nuevo valor a el atributo existMinima.
    */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    /**
    * Método mostrar
    * Muestra en pantalla el nombre y domicilio del objeto de la clase Laboratorio.
    * Muestra en pantalla el rubro, descripcion, precio de costo, stock y stock valorizado del producto.
    */
    public void mostrar(){
        System.out.println("Laboratorio: " + this.getLab().getNombre());
        System.out.println("Domicilio: " + this.getLab().getDomicilio());
        System.out.println("\n");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDesc());
        System.out.println("Precio costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - " + "Stock Valorizado: " + this.stockValorizado() + "\n");
    }
    /**
    * Método mostrarLinea
    * Devuelve un string con el nombre, el precio de lista y el precio contado del producto.
    */    
    public String mostrarLinea(){
        return this.getDesc() + "\t" + this.precioLista() + " " + this.precioContado() + "\n"; 
    }
}