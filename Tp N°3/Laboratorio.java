
/**
 * Class Laboratorio.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Laboratorio{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    /**
     * Metodo Constructor de Laboratorio.
     * @param p_nombre asigna el nombre al laboratorio.
     * @param p_domicilio asigna el domicilio del laboratorio.
     * @param p_telefono asigna un telefono al laboratorio.
     * @param p_compraMin asigna una compra minima.
     * @param p_diaEnt asigna un dia de entrega.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    /**
     * Metodo Constructor de Laboratorio.
     * @param p_nombre asigna el nombre al laboratorio.
     * @param p_domicilio asigna el domicilio del laboratorio.
     * @param p_telefono asigna un telefono al laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(0);
        this.setDiaEntrega(0);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public String getTelefono(){
        return telefono;
    }    
    public int getCompraMin(){
        return compraMinima;
    }
    public int getDiaEnt(){
        return diaEntrega;
    }
    /**
    * Método nuevoCompraMin
    * Permite asignar una nuevo valor a la compra minima.
    */    
    public void nuevaCompraMinima(int p_compraMin){
        this.setCompraMin(p_compraMin);
    }
    /**
    * Método nuevoDiaEntrega
    * Permite asignar una nuevo valor al atributo diaEntrega.
    */ 
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    /**
    * Método mostrar
    * retorna un string con el nombre, domicilio y telefono del laboratorio.
    */     
    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + "\n" +
               "Domicilio: " + this.getDomicilio() + "\n" +
               "Teléfono: " + this.getTelefono();
    }

}