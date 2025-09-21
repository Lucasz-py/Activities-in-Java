import java.util.HashMap;

/**
 * Representa un comercio que administra una coleccion de empleados.
 * Permite dar de alta, baja, consultar y mostrar informacion de empleados.
 * @authors (Gabriel F. - Lucas E.)
 * @version (20/08/2025)
 */
public class Comercio {
    private String nombre;
    // La coleccion ahora es de tipo raw, sin generics.
    private HashMap empleados; 
    
    /**
     * Crea un comercio sin empleados iniciales.
     *
     * @param p_nombre nombre del comercio.
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap());
    }
    
    /**
     * Crea un comercio con empleados iniciales.
     *
     * @param p_nombre nombre del comercio.
     * @param p_empleados coleccion de empleados identificados por su CUIL.
     */
    public Comercio(String p_nombre, HashMap p_empleados) {
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
     * Establece la coleccion de empleados del comercio.
     *
     * @param p_empleados coleccion de empleados identificados por su CUIL.
     */
    private void setEmpleados(HashMap p_empleados) {
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
     * Obtiene la coleccion de empleados.
     *
     * @return HashMap con los empleados del comercio.
     */
    public HashMap getEmpleado() {
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
     * @param p_cuil numero de CUIL del empleado a eliminar.
     * @return el empleado eliminado, o {@code null} si no existía.
     */
    public Empleado bajaEmpleado(long p_cuil) {
        // Se requiere un cast explicito del objeto retornado.
        return (Empleado) this.empleados.remove(p_cuil);
    }
    
    /**
     * Obtiene la cantidad de empleados del comercio.
     *
     * @return numero de empleados registrados.
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleado().size();
    }
    
    /**
     * Verifica si un CUIL pertenece a un empleado del comercio.
     *
     * @param p_cuil numero de CUIL a verificar.
     * @return {@code true} si el CUIL corresponde a un empleado, 
     * {@code false} en caso contrario.
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleado().containsKey(p_cuil);
    }
    
    /**
     * Busca un empleado por su CUIL.
     *
     * @param p_cuil numero de CUIL del empleado.
     * @return el empleado encontrado, o {@code null} si no existe.
     */
    public Empleado buscarEmpleado(long p_cuil) {
        // Se requiere un cast explicito del objeto retornado.
        return (Empleado) this.getEmpleado().get(p_cuil);
    }
    
    /**
     * Imprime en pantalla el sueldo neto de un empleado identificado por su CUIL.
     * Si no existe, muestra un mensaje de error.
     *
     * @param p_cuil numero de CUIL del empleado.
     */
    public void sueldoNeto(long p_cuil) {
        // Se requiere un cast explicito del objeto retornado.
        Empleado empleado = (Empleado) this.buscarEmpleado(p_cuil);
        
        if (empleado != null) {
            System.out.println("Sueldo neto de " + empleado.apeYNom() + ": $" + 
                empleado.sueldoNeto());
        } else {
            System.out.println("No se encontro empleado con CUIL: " + p_cuil);
        }
    }
    
    /**
     * Imprime en pantalla la nomina de empleados del comercio.
     * Incluye el nombre del comercio y una linea descriptiva por cada empleado.
     */
    public void nomina() {
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
        // El bucle for-each ya no puede inferir el tipo, por lo que se itera sobre Object
        // y se requiere un cast en cada iteracion.
        for (Object obj : this.empleados.values()) {
            Empleado empleado = (Empleado) obj; // Casting explicito
            System.out.println(empleado.mostrarLinea());
        }
    }
}