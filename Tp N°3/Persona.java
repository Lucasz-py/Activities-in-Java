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
     * Constructor de Persona
     * @param p_dni asigna el DNI de la persona.
     * @param p_nombre asigna el nombre de la persona.
     * @param p_apellido asigna el apellido de la persona.
     * @param p_anio asigna el año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
    * Método setDNI
    * @param dni
    * actualiza el dni con el parametro p_dni
    */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    /**
    * Método setNombre
    * @param p_nombre
    * actualiza el nombre con el parametro p_nombre
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
    * Método setApellido
    * @param p_apellido
    * actualiza el apellido con el parametro p_apellido
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
    * Método setFechaNacimiento
    * @param p_fecha
    * actualiza la fecha de nacimiento a p_fecha
    */
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    /**
    * Método setAnioNacimiento
    * @param p_anio
    * actualiza el año de nacimiento a p_anio
    */
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public int getDNI(){
        return this.nroDni;
    }
    /**
    * Método getNombre
    * retorna el nombre de la persona.
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
    * Método getApellido
    * retorna el apellido de la persona.
    */
    public String getApellido(){
        return this.apellido;
    }
    /**
    * Método getFechaNacimiento
    * retorna la fecha de nacimiento.
    */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    /**
    * Método getAnioNacimiento
    * retorna el año de nacimiento
    */
    public int getAnioNacimiento(){
        return (this.getFechaNacimiento()).get(Calendar.YEAR);
    }
    /**
    * Método edad
    * retorna el cálculo de la edad segun su fecha de nacimiento.
    */
    public int edad(){
        Calendar hoy = new GregorianCalendar();
        int anioHoy = hoy.get(Calendar.YEAR);
        int anioNac = this.getFechaNacimiento().get(Calendar.YEAR);
        int edad = anioHoy - anioNac;
        
        int mesHoy = hoy.get(Calendar.MONTH);
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesNac = this.getFechaNacimiento().get(Calendar.MONTH);
        int diaNac = this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH);
        
        if(mesHoy < mesNac || (mesHoy == mesNac && diaHoy < diaNac)){
            edad--;
        }
        return edad;
    }
    /**
    * Método esCumpleanio
    * retorna true si es el cumpleaños y false si no es.
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
    * Método nomYApe
    * retorna el nombre y apellido.
    */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
    * Método apeYNom
    * retorna una concatenación de cadena del apellido y nombre.
    */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
    * Método mostrar
    * muestra en pantalla el nombre y apellido, el dni y la edad.
    */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Edad: " + edad());
    }
}