import java.time.Year;

/**
 * Clase Cargo.
 * Representa un cargo o puesto dentro de una estructura organizacional, 
 * incluyendo información sobre el sueldo, la antigüedad y las horas de docencia.
 * Permite calcular el sueldo final basado en la antigüedad.
 *
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Cargo{
    private String nombreCargo; // Nombre descriptivo del cargo.
    private double sueldoBasico; // Monto base del sueldo, sin adicionales.
    private int anioIngreso; // Año en que la persona ingresó a ese cargo.
    private int horasDeDocencia; // Cantidad de horas dedicadas a docencia.
    
    /**
     * Constructor para la clase Cargo.
     * @param p_nombreCargo El nombre del cargo (String).
     * @param p_sueldo El sueldo básico asociado al cargo (double).
     * @param p_anio El año de ingreso al cargo (int).
     * @param p_horasDocencia La cantidad de horas de docencia (int).
     */
    public Cargo(String p_nombreCargo, double p_sueldo, int p_anio, int p_horasDocencia){
        this.setNombreCargo(p_nombreCargo);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDocencia(p_horasDocencia);
    }
    
    /**
     * Establece el nombre del cargo.
     * @param p_nombre Nombre del cargo (String).
     */
    private void setNombreCargo(String p_nombre){
        this.nombreCargo = p_nombre;
    }

    /**
     * Establece el sueldo básico del cargo.
     * @param p_sueldo Sueldo básico (double).
     */
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    /**
     * Establece el año de ingreso al cargo.
     * @param p_anio Año de ingreso (int).
     */
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    /**
     * Establece la cantidad de horas de docencia.
     * @param p_horasDocencia Horas de docencia (int).
     */
    private void setHorasDocencia(int p_horasDocencia){
        this.horasDeDocencia = p_horasDocencia;
    }
    
    /**
     * Obtiene el nombre del cargo.
     * @return El nombre del cargo (String).
     */
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    
    /**
     * Obtiene el sueldo básico.
     * @return El sueldo básico (double).
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * Obtiene el año de ingreso.
     * @return El año de ingreso (int).
     */
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    /**
     * Obtiene la cantidad de horas de docencia.
     * @return Las horas de docencia (int).
     */
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }
    
    /**
     * Calcula la antigüedad del empleado en el cargo, restando el año de ingreso al año actual.
     * Utiliza la clase Year.now() para obtener el año actual.
     * @return La antigüedad en años (int).
     */
    public int antiguedad(){
        int anioActual = Year.now().getValue();
        return anioActual - this.getAnioIngreso();
    }
    
    /**
     * Calcula el porcentaje de adicional por antigüedad.
     * El adicional es del 1% del sueldo básico por cada año de antigüedad.
     * @return El factor de adicional (porcentaje expresado en decimal, e.g., 0.01 por año) (double).
     */
    private double adicionalXAntiguedad(){
        // El factor de adicional es (antigüedad * 0.01) del sueldo básico
        double adicional = this.antiguedad() * 0.01;
        return adicional;
    }
    
    /**
     * Calcula el sueldo final del cargo, sumando el sueldo básico y el adicional por antigüedad.
     * La fórmula es: $\text{sueldo básico} + (\text{adicionalXAntiguedad} \times \text{sueldo básico})$.
     * @return El sueldo final calculado (double).
     */
    public double sueldoDelCargo(){ 
        double sueldoC = (this.adicionalXAntiguedad() * this.getSueldoBasico()) + this.getSueldoBasico();
        return sueldoC;
    }
    
    /**
     * Muestra por consola los detalles completos del cargo, incluyendo nombre, 
     * sueldo básico, sueldo total, antigüedad y horas de docencia.
     */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo()+ " - Sueldo Basico: $"+this.getSueldoBasico()+" - Sueldo Cargo: $"+
        this.sueldoDelCargo()+" - Antiguedad: "+this.antiguedad()+ " - Horas Docencia: "+ this.getHorasDocencia());
    }
}
