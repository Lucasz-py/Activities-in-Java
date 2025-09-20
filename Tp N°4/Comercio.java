import java.util.HashMap;
/**
 * Class Comercio
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Comercio {
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Constructor de Comercio
     * @param p_nombre Nombre del comercio
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Constructor de Comercio con empleados iniciales
     * @param p_nombre Nombre del comercio
     * @param p_empleados HashMap de empleados
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    // Setters privados
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    
    // Getter público
    public String getNombre() {
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleado(){
        return this.empleados;
    }
    
    /**
     * Da de alta un empleado en el comercio
     * @param p_empleado El empleado a agregar
     */
    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleado().put(p_empleado.getCuil(), p_empleado);
    }
    
    /**
     * Da de baja un empleado del comercio
     * @param p_cuil CUIL del empleado a eliminar
     * @return El empleado eliminado o null si no existe
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return this.empleados.remove(p_cuil);
    }
    
    /**
     * @return La cantidad de empleados en el comercio
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleado().size();
    }
    
    /**
     * Verifica si un CUIL pertenece a un empleado del comercio
     * @param p_cuil CUIL a verificar
     * @return true si es empleado, false si no
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleado().containsKey(p_cuil);
    }
    
    /**
     * Busca un empleado por CUIL
     * @param p_cuil CUIL del empleado a buscar
     * @return El empleado encontrado o null si no existe
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleado().get(p_cuil);
    }
    
    /**
     * Muestra el sueldo neto de un empleado por CUIL
     * @param p_cuil CUIL del empleado
     */
    public void sueldoNeto(long p_cuil) {
        Empleado empleado = this.buscarEmpleado(p_cuil);
        
        if (empleado != null) {
            System.out.println("Sueldo neto de " + empleado.apeYNom() + ": $" + 
                empleado.sueldoNeto());
        } else {
            System.out.println("No se encontró empleado con CUIL: " + p_cuil);
        }
    }
    
    /**
     * Emite la nómina de empleados en el formato requerido
     */
    public void nomina() {
         System.out.println("**** Nómina de empleados de " + this.getNombre() + " ****");
        // con values iteramos directamente los Empleados (this.empleados.values() retorna una Collection<Empleado>)
        for (Empleado empleado : this.empleados.values()) {
            System.out.println(empleado.mostrarLinea());
        }
    }
}