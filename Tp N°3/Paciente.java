
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
    
    Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoria(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    private void setNacido(Localidad p_nacido){
        this.localidadNacido = p_nacido;
    }
    private void setVive(Localidad p_vive){
        this.localidadVive = p_vive;
    }
    
    public int getHistoriaClinica(){
        return historiaClinica;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDomicilio(){
        return domicilio;
    }
    public Localidad getNacido(){
        return localidadNacido;
    }
    public Localidad getVive(){
        return localidadVive;
    }
    
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() +"\t"+ "Historia Clinica: "+this.getHistoriaClinica()+"\t"+"Domicilio: "+this.getDomicilio());
        System.out.println(getVive().mostrar());
    }
    
    public String cadenaDeDatos(){
        return this.getNombre() + "......" + this.getHistoriaClinica() + "......" + this.getDomicilio()+"-"+this.getVive().getNombre()+"-"+this.getVive().getProvincia();
    }
}