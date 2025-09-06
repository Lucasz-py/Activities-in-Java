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
     * @Param p_cuil asigna el cuil del empleado.
     * @param p_apellido asigna apellido al empleado.
     * @param p_nombre asigna nombre al empleado.
     * @param p_importe asigna importe del empleado.
     * @param p_fecha asigna fecha de ingreso.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    /**
     * Constructor de empleado.
     * @Param p_cuil asigna el cuil del empleado.
     * @param p_apellido asigna apellido al empleado.
     * @param p_nombre asigna nombre al empleado.
     * @param p_importe asigna importe del empleado.
     * @param p_anio asigna año de ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
    }
    /**
     * Actualiza el cuil.
     * @param p_cuil asigna cuil.
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    /**
     * Actualiza el apellido.
     * @param p_apellido asigna apellido.
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
     * Actualiza el sueldo básico.
     * @param p_sueldoBasico asigna el sueldo básico.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    /**
     * Actualiza el año de ingreso.
     * @param p_anioIngreso asigna el año de ingreso.
     */
    private void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    /**
     * Devuelve el cuil del empleado
     * @return cuil.
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
     * Devuelve el nombre del empleado.
     * @return nombre.
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Devuelve el sueldo básico del empleado.
     * @return sueldoBasico.
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    /**
     * Devuelve la fecha de ingreso
     * @return fechaIngreso
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    /**
     * Calcula la antiguedad del empleado.
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
     * Realiza el descuento por seguro de vida al empleado.
     * @return la suma entre el sueldo basico por el descuento de obra social y el seguro de vida.
     */
    private double descuento(){
        return (this.sueldoBasico * 0.02) + 1500;
    }
    /**
     * Calcula el adicional dependiendo de la antiguedad del empleado en la organización.
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
     * Devuelve el sueldo neto
     * @return la - entre el sueldo básico y el descuento + el adicional.
     */
    public double sueldoNeto(){
        return sueldoBasico - descuento() + adicional(); 
    }
    /**
     * Devuelve una cadena con el nombre y apellido.
     * @return nombre y apellido.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Devuelve una cadena con el apellido y nombre.
     * @return apellido y nombre.
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
     * Muestra en pantalla el nombre y apellido, cuil y sueldo neto del empleado.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("CUIL: " + getCuil() + " Años de servicio: " + antiguedad());
        System.out.println("Sueldo Neto: " + "$" + sueldoNeto());
    }
    /**
     * Muestra en pantalla como una cadena de caracteres el cuil, apellido y nombre del empleado.
     * @return cuil, apellido, nombre y sueldo neto.
     */
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.getApellido() + "," + this.getNombre() + "\t" + "..............." + "$ " + this.sueldoNeto();
    }
    /**
     * Evalúa si es el aniversario del empleado en la empresa.
     * @return true si es el aniversario del empleado en la empresa.
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