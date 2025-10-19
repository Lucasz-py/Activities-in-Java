/**
 * Clase SemiExclusivo.
 * Representa un tipo de cargo con dedicación semi-exclusiva, extendiendo la información 
 * del Cargo base con la cantidad de horas dedicadas a investigación. Hereda de la clase Cargo.
 *
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class SemiExclusivo extends Cargo{
    private int horasDeInvestigacion; // Cantidad de horas dedicadas a investigación.
    
    /**
     * Constructor para la clase SemiExclusivo.
     * Llama al constructor de la superclase Cargo para inicializar nombre, sueldo, año de ingreso 
     * y horas de docencia, e inicializa las horas de investigación.
     * @param p_nombreCargo El nombre del cargo (String).
     * @param p_sueldo El sueldo básico asociado al cargo (double).
     * @param p_anio El año de ingreso al cargo (int).
     * @param p_horas La cantidad de horas de docencia (int) (gestionado por la superclase).
     * @param p_horasInv La cantidad de horas dedicadas a investigación (int).
     */
    public SemiExclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInv){
        super(p_nombreCargo, p_sueldo, p_anio, p_horas);
        this.setHorasInvestigacion(p_horasInv);
    }
    
    /**
     * Establece la cantidad de horas de investigación.
     * @param p_horasEx Horas de investigación (int).
     */
    private void setHorasInvestigacion(int p_horasEx){
        this.horasDeInvestigacion = p_horasEx;
    }
    
    /**
     * Obtiene la cantidad de horas de investigación.
     * @return Las horas de investigación (int).
     */
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    /**
     * Muestra por consola los detalles del cargo.
     * Sobrescribe el método de la superclase Cargo para incluir la información
     * de las horas de investigación y el carácter semi-exclusivo.
     */
    @Override
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("\n");
        System.out.println("--- Cargo de caracter Semiexclusivo ---");
        System.out.println("Horas de investigacion: " + this.getHorasInvestigacion());
    }
    
}
