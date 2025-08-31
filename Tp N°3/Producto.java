
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public void ajuste(int p_cantidad){
        this.setStock(this.getStock() + p_cantidad);
    }
    
    public double precioLista(){
        return this.getCosto() * 1.12;
    }
    
    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05);
    }
    
    public double stockValorizado(){
        return (this.getStock() * this.getCosto()) * 1.12;
    }
    
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    public void mostrar(){
        System.out.println("Laboratorio: " + this.getLab().getNombre());
        System.out.println("Domicilio: " + this.getLab().getDomicilio());
        System.out.println("\n");
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDesc());
        System.out.println("Precio costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - " + "Stock Valorizado: " + this.stockValorizado() + "\n");
    }
    
    public String mostrarLinea(){
        return this.getDesc() + "\t" + this.precioLista() + " " + this.precioContado() + "\n"; 
    }
}