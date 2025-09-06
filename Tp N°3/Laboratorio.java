
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
     * ★ Constructor de objeto de clase Laboratorio.
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
     * ★ Constructor de objeto de clase Laboratorio.
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
    /**
     * Actualiza el nombre del laboratorio.
     * @param p_nombre asigna el nombre del laboratorio.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza el domicilio del laboratorio.
     * @param p_domicilio asigna el domicilio del laboratorio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Actualiza el valor de diaEntrega al de p_DiaEntrega.
     * @param p_diaEnt asigna el día de entrega.
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    /**
     * Actualiza el valor de diaEntrega al de p_DiaEntrega.
     * @param p_diaEnt asigna el día de entrega.
     */
    private void setCompraMin(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    /**
     * Actualiza el valor de diaEntrega al de p_DiaEntrega.
     * @param p_diaEnt asigna el día de entrega.
     */
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    /**
     * Devuelve el nombre del laboratorio.
     * @return nombre.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve el número de teléfono.
     * @return telefono.
     */
    public String getDomicilio(){
        return domicilio;
    }
    /**
     * Devuelve el número de teléfono.
     * @return telefono.
     */
    public String getTelefono(){
        return telefono;
    }
    /**
     * Devuelve la compra Mínima.
     * @return compraMinima.
     */
    public int getCompraMin(){
        return compraMinima;
    }
    /**
     * Devuelve el día entrega.
     * @return diaEntrega.
     */
    public int getDiaEnt(){
        return diaEntrega;
    }
    /**
    * Asigna un nuevo valor (cuando el usuario quiera) a la compra mínima.
    * @param p_compraMin asigna la nueva compra mínima.
    */    
    public void nuevaCompraMinima(int p_compraMin){
        this.setCompraMin(p_compraMin);
    }
    /**
    * Asigna nuevo valor (cuando quiera el usuario) al día de entrega
    * @param p_diaEnt asigna el nuevo día de entrega.
    */ 
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    /**
    * Muestra el nombre, domicilio y telefono del laboratorio en pantalla.
    * @return  un string con el nombre, domicilio y telefono del laboratorio.
    */     
    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + "\n" +
               "Domicilio: " + this.getDomicilio() + "\n" +
               "Teléfono: " + this.getTelefono();
    }

}