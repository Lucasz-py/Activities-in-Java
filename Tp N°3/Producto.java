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
    /**
    * Actualiza el valor de código.
    * @param p_cantidad obtiene el valor del código.
    */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    /**
    * Actualiza el nombre del rubro.
    * @param p_rubro obtiene el nombre del rubro.
    */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    /**
    * Actualiza la descripción del producto.
    * @param p_desc obtiene la descripción.
    */
    private void setDesc(String p_desc){
        this.descripcion = p_desc;
    }
    /**
    * Actualiza el valor de costo.
    * @param p_costo obtiene el precio del producto.
    */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    } 
    /**
    * Actualiza el valor de código.
    * @param p_stock obtiene la cantidad de stock.
    */
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    /**
    * Actualiza el valor del porcentaje de punto de reposición.
    * @param p_porcPtoRepo obtiene el porcentaje de punto de reposición.
    */
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    } 
    /**
    * Método setExistMinima - actualiza el valor de la existencia mínima.
    * @param p_existMinima obtiene la existencia mínima.
    */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    /**
    * Actualiza los atributos de Laboratorio.
    * @param p_lab obtiene el objeto Laboratorio.
    */
    private void setLab(Laboratorio p_lab){
        this.lab = p_lab;
    }
    /**
    * Retorna el código de producto.
    * @return codigo.
    */
    public int getCodigo(){
        return codigo;
    }
    /**
    * Retorna el nombre del rubro.
    * @return rubro.
    */
    public String getRubro(){
        return rubro;
    }
    /**
    * Retorna la descripción de producto.
    * @return descripcion.
    */
    public String getDesc(){
        return descripcion;
    }
    /**
    * Retorna el costo del producto.
    * @return costo.
    */
    public double getCosto(){
        return costo;
    } 
    /**
    * Retorna el stock.
    * @return stock.
    */
    public int getStock(){
        return stock;
    }
    /**
    * Retorna el código de producto.
    * @return codigo.
    */
    public double getPorcPtoRepo(){
        return porcPtoRepo;
    } 
    /**
    * Retorna la existencia minima.
    * @return existMinima.
    */
    public int getExistMinima(){
        return existMinima;
    }
   /**
    * Retorna el objeto Laboratorio.
    * @return lab.
    */
    public Laboratorio getLab(){
        return lab;
    }
    
    /**
    * Método ajuste - Permite modificar el valor de stock.
    * @param p_cantidad permite modificar el stock.
    */
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    /**
    * Calcula el precio de Lista.
    * @return Devuelve el valor que resulta de sumar un 12% al costo del producto.
    */
    public double precioLista(){
        return this.getCosto() * 1.12;
    }
    /**
    * Devuelve el precio contado.
    * @return la resta entre el precio de lista y la multiplicación entre la lista y un 0.05.
    */
    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05);
    }
    /**
    * Devuelve el valor que resulta de multiplicar el stock por el precio de costo mas un 12%.
    * @return la multiplicación del costo y stock por 1.12 (que es el valor del costo multiplicado por el mismo).
    */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    /**
    * Permite asignar un nuevo valor a el atributo porcPtoRepo.
    */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    /**
    * Permite asignar un nuevo valor a el atributo existMinima.
    */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    /**
    * Muestra nombre, domicilio, rubro, descripcion, precio de costo, stock y stock valorizado del producto en pantalla.
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
    * Muestra un string con el nombre, el precio de lista y el precio contado del producto.
    * @return devuelve un string con el nombre, el precio de lista y el precio contado del producto.
    */    
    public String mostrarLinea(){
        return this.getDesc() + "\t" + this.precioLista() + " " + this.precioContado() + "\n"; 
    }
}