import java.util.*;
/**
 * Class Persona.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (13/08/2025)
 */

public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    /**
     * Constructor de Persona
     * @param p_dni asigna el DNI de la persona.
     * @param p_nombre asigna el nombre de la persona.
     * @param p_apellido asigna el apellido de la persona.
     * @param p_anio asigna el año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido,int p_anio){
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
    * Método setDNI
    * @param dni
    * actualiza el dni con el parametro p_dni
    */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
    * Método setDNI
    * @param dni
    * actualiza el dni con el parametro p_dni
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
    * Método setDNI
    * @param p_anio
    * actualiza la variable de instancia anioNacimiento con el parametro p_dni
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
    * Método getDNI
    * retorna el dni de la persona.
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public String getApellido(){
        return this.apellido;
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - anioNacimiento;
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
    * Método getDNI
    * retorna el dni de la persona.
    */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Edad: " + edad());
    }
}