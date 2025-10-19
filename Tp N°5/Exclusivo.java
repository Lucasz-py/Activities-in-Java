/**
 * Clase Exclusivo.
 * Representa un tipo de cargo con dedicación exclusiva, extendiendo la información 
 * del Cargo base con la cantidad de horas dedicadas a investigación y extensión. 
 * Hereda de la clase Cargo.
 *
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Exclusivo extends Cargo{
    private int horasDeInvestigacion; // Cantidad de horas dedicadas a investigación.
    private int horasDeExtencion; // Cantidad de horas dedicadas a extensión universitaria.
    
    /**
     * Constructor para la clase Exclusivo.
     * Llama al constructor de la superclase Cargo e inicializa las horas de investigación y extensión.
     * @param p_nombreCargo El nombre del cargo (String).
     * @param p_sueldo El sueldo básico asociado al cargo (double).
     * @param p_anio El año de ingreso al cargo (int).
     * @param p_horas La cantidad de horas de docencia (int) (gestionado por la superclase).
     * @param p_horasInv La cantidad de horas dedicadas a investigación (int).
     * @param p_horasExten La cantidad de horas dedicadas a extensión (int).
     */
    public Exclusivo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horas, int p_horasInv, int p_horasExten){
        super(p_nombreCargo, p_sueldo, p_anio, p_horas);
        this.setHorasInvestigacion(p_horasInv);
        this.setHorasExtencion(p_horasExten);
    }
    
    /**
     * Establece la cantidad de horas de investigación.
     * @param p_horasEx Horas de investigación (int).
     */
    private void setHorasInvestigacion(int p_horasEx){
        this.horasDeInvestigacion = p_horasEx;
    }

    /**
     * Establece la cantidad de horas de extensión.
     * @param p_horasExten Horas de extensión (int).
     */
    private void setHorasExtencion(int p_horasExten){
        this.horasDeExtencion = p_horasExten;
    }
    
    /**
     * Obtiene la cantidad de horas de investigación.
     * @return Las horas de investigación (int).
     */
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }

    /**
     * Obtiene la cantidad de horas de extensión.
     * @return Las horas de extensión (int).
     */
    public int getHorasExtencion(){
        return this.horasDeExtencion;
    }
    
    /**
     * Muestra por consola los detalles del cargo.
     * Sobrescribe el método de la superclase Cargo para incluir la información
     * de las horas de investigación, horas de extensión y el carácter exclusivo.
     */
    @Override
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("\n");
        System.out.println("--- Cargo de caracter Exclusivo ---");
        System.out.println("Horas de investigacion: " + this.getHorasInvestigacion());
        System.out.println("Horas de extension: " + this.getHorasExtencion());
    }
}
