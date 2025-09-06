
/**
 * Class Hospital.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Hospital{
    private String nombreHospital;
    private String nombreDirector;
    
    /**
     * Constructor de objeto de clase Hospital.
     * @param p_nombre asigna el nombre.
     * @param p_director asigna el director.
     */
    public Hospital(String p_nombre, String p_director){
        this.setNombre(p_nombre);
        this.setDirector(p_director);
    }
    /**
     * Actualiza el nombre del hospital.
     * @param p_nombre asigna nombre.
     */
    private void setNombre(String p_nombre){
        this.nombreHospital = p_nombre;
    }
    /**
     * Actualiza el nombre del director.
     * @param p_director asigna director.
     */
    private void setDirector(String p_director){
        this.nombreDirector = p_director;
    }
    /**
     * Actualiza el nombre del hospital.
     * @return nombreHospital.
     */
    public String getNombre(){
        return nombreHospital;
    }
    /**
     * Actualiza el nombre del hospital.
     * @param nombreDirector.
     */
    public String getDirector(){
        return nombreDirector;
    }
    /**
     * Muestra en pantalla el nombre y nombre del director del Hospital junto con el nombre del paciente y su historia clínica.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombre() + "\t" + "Director: " + this.getDirector());
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Paciente: " + p_paciente.getNombre() + "\t" + "Historia Clinica: " + p_paciente.getHistoriaClinica() + "\t" + "Domicilio: "+ p_paciente.getDomicilio());
        System.out.println(p_paciente.getVive().mostrar());
    }
}