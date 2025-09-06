
/**
 * Class Paciente.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Paciente{
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    /**
     * ★ Constructor de objeto de clase Paciente
     * @param p_historia asigna un número de historial clínica.
     * @param p_nombre asigna nombre.
     * @param p_domicilio asigna domicilio.
     * @param p_localidadNacido asigna localidad de nacimiento.
     * @param p_localidadVive asigna localidad donde vive.
     */
    Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    /**
     * Actualiza historia clínica.
     * @param p_historia asigna historial clínica.
     */
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    /**
     * Actualiza nombre.
     * @param p_nombre asigna nombre de paciente.
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Actualiza domicilio.
     * @param p_domicilio asigna domicilio.
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    /**
     * Actualiza localidad de nacimiento.
     * @param p_nacido asigna lugar de nacimiento.
     */
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    /**
     * Actualiza la localidad donde vive
     * @param p_vive asigna localidad donde vive.
     */
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    /**
     * Devuelve la historia clínica.
     * @return historiaClinica.
     */
    public int getHistoriaClinica(){
        return historiaClinica;
    }
    /**
     * Devuelve nombre del paciente
     * @return localidadVive
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve domicilio del paciente.
     * @return domicilio.
     */
    public String getDomicilio(){
        return domicilio;
    }
    /**
     * Devuelve localidad de nacimiento.
     * @return localidadNacido
     */
    public Localidad getNacido(){
        return localidadNacido;
    }
    /**
     * Devuelve localidad de residencia.
     * @return localidadVive
     */
    public Localidad getVive(){
        return localidadVive;
    }
    /**
     * Muestra en pantalla el nombre, historia clínica, domicilio y localidad de residencia.
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() +"\t"+ "Historia Clinica: "+this.getHistoriaClinica()+"\t"+"Domicilio: "+this.getDomicilio());
        System.out.println(getVive().mostrar());
    }
    /**
     * Devuelve el nombre, historia clinica, domicilio y localidad de residencia junto con la provincia del paciente.
     * @return cadena de caracter, nombre, historia clinica, domicilio, localidad de residencia, nombre, localidad de residencia y provincia.
     */
    public String cadenaDeDatos(){
        return this.getNombre() + "......" + this.getHistoriaClinica() + "......" + this.getDomicilio()+"-"+this.getVive().getNombre()+"-"+this.getVive().getProvincia();
    }
}