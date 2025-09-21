import java.util.HashMap;

/**
 * Representa un comercio que administra una colección de empleados.
 * Permite dar de alta, baja, consultar y mostrar información de empleados.
 * 
 * @author Gabriel F.
 * @author Lucas E.
 * @version 01/09/2025
 */
public class Comercio {
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    /**
     * Crea un comercio sin empleados iniciales.
     *
     * @param p_nombre nombre del comercio.
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    /**
     * Crea un comercio con empleados iniciales.
     *
     * @param p_nombre nombre del comercio.
     * @param p_empleados colección de empleados identificados por su CUIL.
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    /**
     * Establece el nombre del comercio.
     *
     * @param p_nombre nombre del comercio.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Establece la colección de empleados del comercio.
     *
     * @param p_empleados colección de empleados identificados por su CUIL.
     */
    private void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    
    /**
     * Obtiene el nombre del comercio.
     *
     * @return nombre del comercio.
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Obtiene la colección de empleados.
     *
     * @return HashMap con los empleados del comercio.
     */
    public HashMap<Long, Empleado> getEmpleado() {
        return this.empleados;
    }
    
    /**
     * Da de alta (agrega) un empleado en el comercio.
     *
     * @param p_empleado empleado a incorporar.
     */
    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleado().put(p_empleado.getCuil(), p_empleado);
    }
    
    /**
     * Da de baja (elimina) un empleado por su CUIL.
     *
     * @param p_cuil número de CUIL del empleado a eliminar.
     * @return el empleado eliminado, o {@code null} si no existía.
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return this.empleados.remove(p_cuil);
    }
    
    /**
     * Obtiene la cantidad de empleados del comercio.
     *
     * @return número de empleados registrados.
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleado().size();
    }
    
    /**
     * Verifica si un CUIL pertenece a un empleado del comercio.
     *
     * @param p_cuil número de CUIL a verificar.
     * @return {@code true} si el CUIL corresponde a un empleado, 
     *         {@code false} en caso contrario.
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleado().containsKey(p_cuil);
    }
    
    /**
     * Busca un empleado por su CUIL.
     *
     * @param p_cuil número de CUIL del empleado.
     * @return el empleado encontrado, o {@code null} si no existe.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleado().get(p_cuil);
    }
    
    /**
     * Imprime en pantalla el sueldo neto de un empleado identificado por su CUIL.
     * Si no existe, muestra un mensaje de error.
     *
     * @param p_cuil número de CUIL del empleado.
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
     * Imprime en pantalla la nómina de empleados del comercio.
     * Incluye el nombre del comercio y una línea descriptiva por cada empleado.
     */
    public void nomina() {
        System.out.println("**** Nómina de empleados de " + this.getNombre() + " ****");
        for (Empleado empleado : this.empleados.values()) {
            System.out.println(empleado.mostrarLinea());
        }
    }
}
