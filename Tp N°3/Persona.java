import java.util.*;
/**
 * Class Persona.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */

public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    private int anioNacimiento;
    /**
     * ★ Constructor de objeto de clase Persona.
     * @param p_dni asigna el DNI de la persona.
     * @param p_nombre asigna el nombre de la persona.
     * @param p_apellido asigna el apellido de la persona.
     * @param p_fecha asigna la fecha de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    /**
     * ★ Constructor de objeto de clase Persona.
     * @param p_dni asigna el DNI de la persona.
     * @param p_nombre asigna el nombre de la persona.
     * @param p_apellido asigna el apellido de la persona.
     * @param p_anio asigna el año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
    * Actualiza el DNI de la persona.
    * @param p_dni asigna el DNI.
    */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    /**
    * Actualiza el nombre de la persona.
    * @param p_nombre asigna el nombre.
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
    * Actualiza el apellido.
    * @param p_apellido asigna el apellido.
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
    * actualiza la fecha de nacimiento.
    * @param p_fecha asigna fecha de nacimiento.
    */
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    /**
    * Actualiza el año de nacimiento.
    * @param p_anio asigna año de nacimiento.
    */
    private void setAnioNacimiento(int p_anio){
        Calendar fecha = new GregorianCalendar(p_anio, Calendar.JANUARY, 1);
        this.fechaNacimiento = fecha;
    }
    /**
    * Devuelve el número de DNI.
    * @return nroDni
    */
    public int getDNI(){
        return this.nroDni;
    }
    /**
    * Devuelve el nombre.
    * @return nombre.
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
    * Devuelve el apellido.
    * @return  apellido.
    */
    public String getApellido(){
        return this.apellido;
    }
    /**
    * Devuelve fecha de nacimiento
    * @return fechaNacmiento.
    */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    /**
    * Devuelve el año de nacimiento.
    * @return fechaNacimiento.
    */
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    /**
    * Calcula la edad de la persona.
    * @return edad.
    */
    public int edad(){
        Calendar hoy = new GregorianCalendar();
        /*
        if (hoy.get(Calendar.MONTH) < this.fechaNacimiento.get(Calendar.MONTH) ||
            (hoy.get(Calendar.MONTH) == this.fechaNacimiento.get(Calendar.MONTH) &&
             hoy.get(Calendar.DAY_OF_MONTH) < this.fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        */
        int edad = hoy.get(Calendar.YEAR) - this.fechaNacimiento.get(Calendar.YEAR);

        return edad;
    }
    /**
    * Verifica si es el cumpleaños.
    * @return true si es el cumpleaños y false si no es.
    */
    public boolean esCumpleanios(){
        Calendar hoy = new GregorianCalendar();
        
        int mesHoy = hoy.get(Calendar.MONTH) + 1;
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesNac = this.getFechaNacimiento().get(Calendar.MONTH);
        int diaNac = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        
        if (diaHoy == diaNac && mesHoy == mesNac){
            return true;
        } else {
            return false;
        }
    }
    /**
    * Devuelve una concatenación de cadena del apellido y nombre.
    * @return una concatenación de candena del apellido y nombre.
    */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
    * Devuelve una concatenación de cadena del apellido y nombre.
    * @return una concatenación de cadena del apellido y nombre.
    */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
    * Muestra en pantalla el nombre y apellido, el dni y la edad.
    */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Edad: " + edad());
    }
}