import java.util.*;
/**
 * Class EmpleadoConJefe.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class EmpleadoConJefe{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;
    
    /**
     * ★ Constructor de objeto de clase EmpleadoConJefe.
     * @Param p_cuil asigna el cuil del empleado.
     * @param p_apellido asigna apellido al empleado.
     * @param p_nombre asigna nombre al empleado.
     * @param p_importe asigna importe del empleado.
     * @param p_fecha asigna fecha de ingreso.
     * @param p_jefe asigna jefe.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    /**
     * ★ Constructor de objeto de clase EmpleadoConJefe.
     * @Param p_cuil asigna el cuil del empleado.
     * @param p_apellido asigna apellido al empleado.
     * @param p_nombre asigna nombre al empleado.
     * @param p_importe asigna importe del empleado.
     * @param p_fecha asigna fecha de ingreso.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha){
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
     * @param p_fecha asigna fecha de ingreso.
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
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
     * @param p_apellido asigna el apellido.
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
     * Actualiza el cuil.
     * @param p_cuil asigna cuil.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza el sueldo basico.
     * @param p_sueldoBasico asigna sueldo basico.
     */
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    /**
     * Actualiza la de fecha ingreso.
     * @param p_fechaIngreso asigna fecha de ingreso.
     */
    private void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    /**
     * Actualiza el año de ingreso.
     * @param p_anio asigna año de ingreso.
     */
    private void setAnioIngreso(int p_anio){
        Calendar fecha = new GregorianCalendar(p_anio, Calendar.JANUARY, 1);
        this.fechaIngreso = fecha;
    }
    /**
     * Actualiza al jefe.
     * @param p_jefe asigna jefe.
     */
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
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
     * Devuelve el nombredel empleado.
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
     * Devuelve el año de ingreso
     * @return anioIngreso.
     */
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    /**
     * Devuelve el jefe.
     * @return jefe
     */
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    /**
     * Calcula la antiguedad del empleado.
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        /* 
        if (fechaHoy.get(Calendar.MONTH) < this.fechaIngreso.get(Calendar.MONTH) ||
            (fechaHoy.get(Calendar.MONTH) == this.fechaIngreso.get(Calendar.MONTH) &&
             fechaHoy.get(Calendar.DAY_OF_MONTH) < this.fechaIngreso.get(Calendar.DAY_OF_MONTH))) {
            antiguedad--;
        }*/
        int antiguedad = fechaHoy.get(Calendar.YEAR) - this.fechaIngreso.get(Calendar.YEAR);
        
        return antiguedad;
    }
    /**
     * Realiza el descuento por seguro de vida al empleado.
     * @return la suma entre el sueldo basico por el descuento de obra social y el seguro de vida.
     */
    private double descuento(){
        return (this.getSueldoBasico() * 0.02) + 1500;
    }
    /**
     * Calcula el adicional dependiendo de la antiguedad del empleado en la organización.
     */
    private double adicional(){
        if(antiguedad() >= 0 && antiguedad() < 2){
            return this.getSueldoBasico() * 0.02;
        }else if(antiguedad() >= 2 && (antiguedad() < 10)){
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }
    /**
     * Devuelve el sueldo neto
     * @return la - entre el sueldo básico y el descuento + el adicional.
     */
     public double sueldoNeto(){
        return this.getSueldoBasico() - this.descuento() + this.adicional(); 
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
    public String mostrarLinea(){
        return this.getCuil() + "\t" + this.getApellido() + "," + this.getNombre() + "\t" + "..............." + "$ " + this.sueldoNeto();
    }
    /**
     * Muestra en pantalla nombre, apellido, cuil y sueldo neto del empleado. También si responde a un Gerente o si responde a un jefe.
     */
    public void mostrarPantalla(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("CUIL: "+this.getCuil());
        System.out.println("Sueldo Neto: " + "$" + this.sueldoNeto());
        if(this.getJefe() == null){
            System.out.println("Responde a GERENTE GENERAL");
        } else {
            System.out.println("Responde a: "+this.getJefe().nomYApe());
        }
    }
}