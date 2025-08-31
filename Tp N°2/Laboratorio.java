
/**
 * Class laboratorio
 * 
 * @authors (Gabriel .F - Lucas .E) 
 * @version (13/08/2025)
 */
public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMin;
    private int diaEntrega;
    
    /**
     * Constructor de Laboratorio.
     * @param p_nombre asigna el nombre del laboratorio.
     * @param p_domicilio asigna el nombre del domicilio.
     * @param p_telefeno asigna el telefono del laboratorio.
     * @param p_compraMin asigna la compra minima del laboratorio.
     * @param p_diaEnt asigna el número de día de entrada.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    /**
     * Constructor de Laboratorio.
     * @param p_nombre asigna el nombre del laboratorio.
     * @param p_domicilio asigna el nombre del domicilio.
     * @param p_telefeno asigna el telefono del laboratorio.
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMin(0);
        this.setDiaEntrega(0);
    }
    /**
     * Método setNombre.
     * @param p_nombre
     * Actualiza el nombre al parametro p_nombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
     /**
     * Método setDomicilio.
     * @param p_domicilio.
     * Actualiza la variable de instancia nombre al parametro p_nombre.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Método setTelefono.
     * @param p_telefono.
     * Actualiza la variable de instacia telefono al parametro p_telefono.
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    } 
    /**
     * Método setCompraMin.
     * @param p_compraMin.
     * Actualiza la variable de instancia compraMin al parametro p_compraMin.
     */
    private void setCompraMin(int p_compraMin){
        this.compraMin = p_compraMin;
    }
    /**
     * Método setCompraMin.
     * @param p_compraMin.
     * Actualiza la variable de instancia diaEntrega al parametro p_diaEnt.
     */
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
        /**
     * Método getCompraMin.
     * Actualiza la variable de instancia nombre.
     */
    public String getNombre(){
        return this.nombre;
    }
        /**
     * Método getDomicilion.
     * retorna la variable de instancia domicilio.
     */
    public String getDomicilio(){
        return this.domicilio;
    }
        /**
     * Método getTelefono.
     * Retorna la variable de instancia telefono.
     */
    public String getTelefono(){
        return this.telefono;
    }
        /**
     * Método getCompraMin.
     * Retorna la variable de instancia compraMin.
     */
    public int getCompraMin(){
        return this.compraMin;
    }
    /**
     * Método getDiaEntrega.
     * Retorna la variable de instancia diaEntrega.
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    /**
     * Método nuevoCompraMinima.
     * @param p_compraMin.
     * Actualiza la variable de instancia compraMin al parametro p_compraMin.
     */
    public void nuevaCompraMinima(int p_compraMin){
        this.compraMin = p_compraMin;
    }
    /**
     * Método nuevoDiaEntrega.
     * @param p_diaEnt.
     * Actualiza la variable de instancia diaEntrega al parametro p_diaEnt.
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    /**
     * Método mostrar.
     * Muestra en pantalla el nombre del laboratorio, domicilio y número.
     */
    public String mostrar(){
        return  "Laboratorio: " +   this.nombre + "\n" +
                "Domicilio: "   +   this.domicilio + " - Teléfono: " 
                + this.telefono;
    }
    
}