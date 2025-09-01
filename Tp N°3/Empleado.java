import java.util.*;
/**
 * Class Empleado.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Empleado
{   
    //Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    /**
     * Constructor de empleado.
     * @Param p_cuil asigna el cuil del empleado
     * @param p_apellido asigna apellido al empleado
     * @param p_nombre asigna nombre al empleado
     * @param p_importe asigna importe del empleado
     * @param p_anio asigna año de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
    }
    /**
     * Método SetCuil
     * @param p_cuil
     * actualiza cuil a p_cuil.
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    /**
     * Método SetApellido.
     * @param p_apellido.
     * actualiza cuil a p_apellido.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
     * Método setNombre.
     * @param p_nombre.
     * actualiza nombre a p_nombre.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Método setSueldoBasico.
     * @param p_sueldoBasico.
     * actualiza sueldoBasico a p_sueldoBasico.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    /**
     * Método SetAnioIngreso.
     * @param p_anioIngreso.
     * actualiza anioIngreso a p_anioIngreso.
     */
    private void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    /**
     * Método getCuil.
     * retorna el cuil del Empleado.
     */
    public long getCuil(){
        return this.cuil;
    }
    /**
     * Método getApellido.
     * retorna el apellido del empleado.
     */
    public String getApellido(){
        return this.apellido;
    }
    /**
     * Método getNombre.
     * retorna el nombre del empleado.
       */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Método getSueldoBasico.
     * retorna el sueldo basico del empleado.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    /**
     * Método SetApellido.
     * @param p_apellido.
     * actualiza cuil a p_apellido.
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    /**
     * Método antiguedad.
     * calcula la antiguedad del empleado.
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int mesHoy = fechaHoy.get(Calendar.MONTH);
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        
        int anioIngreso = this.getFechaIngreso().get(Calendar.YEAR);
        int mesIngreso = this.getFechaIngreso().get(Calendar.MONTH);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        
        int antiguedad = anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
        
        if (mesHoy < mesIngreso || (mesHoy == mesIngreso && diaHoy < diaIngreso)) {
            antiguedad--;
        }
        
        return antiguedad;
    }
    /**
     * Método descuento.
     * realiza el descuento por seguro de vida al empleado.
     */
    private double descuento(){
        return (this.sueldoBasico * 0.02) + 1500;
    }
    /**
     * Método adicional.
     * calcula el adicional dependiendo de la antiguedad del empleado en la organización.
     */
    private double adicional(){
        if(antiguedad() >= 0 && antiguedad() < 2){
            return sueldoBasico * 0.02;
        } if(antiguedad() >= 2 && (antiguedad() < 10)){
            return sueldoBasico * 0.04;
        } else {
            return sueldoBasico * 0.06;
        }
    }
    /**
     * Método sueldoNeto.
     * muestra el sueldo neto del empleado.
     */
    public double sueldoNeto(){
        return sueldoBasico - descuento() + adicional(); 
    }
    /**
     * Método SetApellido.
     * @param p_apellido.
     * actualiza cuil a p_apellido.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Método SetApellido
     * @param p_apellido
     * actualiza cuil a p_apellido
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
     * Método mostrar
     * muestra en pantalla el nombre y apellido, cuil y sueldo neto del empleado.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + " Años de servicio: " + antiguedad());
        System.out.println("Sueldo Neto: " + "$" + sueldoNeto());
    }
    /**
     * Método mostrarLinea
     * muestra en pantalla como una cadena de caracteres el cuil, apellido y nombre del empleado
     */
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.getApellido() + "," + this.getNombre() + "\t" + "..............." + "$ " + this.sueldoNeto();
    }
    /**
     * Método esAniversario
     * devuelve true si es el aniversario del empleado en la empresa
     */
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        
        int mesHoy = hoy.get(Calendar.MONTH);
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesIngre = this.getFechaIngreso().get(Calendar.MONTH);
        int diaIngre = this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        
        if (diaHoy == diaIngre && mesHoy == mesIngre){
            return true;
        } else {
            return false;
        }
    }
}