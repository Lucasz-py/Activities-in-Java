import java.util.ArrayList;
import java.util.HashSet;

/**
 * Representa un banco que administra empleados y cuentas bancarias.
 * Permite registrar empleados, manejar cuentas, calcular sueldos
 * y generar distintos listados e informes.
 * 
 * @author Gabriel F.
 * @author Lucas E.
 * @version 01/09/2025
 */
public class Banco{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleado;
    private ArrayList<CuentaBancaria> cuentas;
    
    /**
     * Crea un banco con un único empleado inicial y sin cuentas.
     *
     * @param p_nombre nombre del banco.
     * @param p_localidad localidad de la sucursal.
     * @param p_nroSucursal número de sucursal.
     * @param p_empleado empleado inicial.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(new ArrayList<Empleado>());
        this.agregarEmpleado(p_empleado);
    }
    
    /**
     * Crea un banco con una lista de empleados iniciales y sin cuentas.
     *
     * @param p_nombre nombre del banco.
     * @param p_localidad localidad de la sucursal.
     * @param p_nroSucursal número de sucursal.
     * @param p_empleado lista de empleados iniciales.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
    }
    
    /**
     * Crea un banco con empleados y cuentas iniciales.
     *
     * @param p_nombre nombre del banco.
     * @param p_localidad localidad de la sucursal.
     * @param p_nroSucursal número de sucursal.
     * @param p_empleado lista de empleados iniciales.
     * @param p_cuentas lista de cuentas bancarias iniciales.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado, ArrayList<CuentaBancaria> p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
        this.setCuentaBancaria(p_cuentas);
    }
    
    // ---- Setters privados ----
    
    /**
     * Establece el nombre del banco.
     *
     * @param p_nombre nombre del banco.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el número de sucursal.
     *
     * @param p_nro número de sucursal.
     */
    private void setNroSucursal(int p_nro) {
        this.nroSucursal = p_nro;
    }

    /**
     * Establece la localidad del banco.
     *
     * @param p_localidad localidad de la sucursal.
     */
    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    /**
     * Establece la lista de empleados.
     *
     * @param p_empleado lista de empleados.
     */
    private void setEmpleado(ArrayList<Empleado> p_empleado) {
        this.empleado = p_empleado;
    }

    /**
     * Establece la lista de cuentas bancarias.
     *
     * @param p_cuentas lista de cuentas bancarias.
     */
    private void setCuentaBancaria(ArrayList<CuentaBancaria> p_cuentas) {
        this.cuentas = p_cuentas;
    }
    
    // ---- Getters públicos ----
    
    /**
     * Obtiene el nombre del banco.
     *
     * @return nombre del banco.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene el número de sucursal.
     *
     * @return número de sucursal.
     */
    public int getNroSucursal() {
        return this.nroSucursal;
    }

    /**
     * Obtiene la localidad del banco.
     *
     * @return localidad de la sucursal.
     */
    public Localidad getLocalidad() {
        return this.localidad;
    }

    /**
     * Obtiene la lista de empleados.
     *
     * @return lista de empleados.
     */
    public ArrayList<Empleado> getEmpleado() {
        return this.empleado;
    }

    /**
     * Obtiene la lista de cuentas bancarias.
     *
     * @return lista de cuentas bancarias.
     */
    public ArrayList<CuentaBancaria> getCuentaBancaria() {
        return this.cuentas;
    }
    
    // ---- Gestión de empleados ----
    
    /**
     * Agrega un empleado a la lista.
     *
     * @param p_empleado empleado a agregar.
     * @return {@code true} si fue agregado, {@code false} en caso contrario.
     */
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.empleado.add(p_empleado);
    }

    /**
     * Quita un empleado de la lista, siempre que quede al menos uno.
     *
     * @param p_empleado empleado a quitar.
     * @return {@code true} si fue quitado, {@code false} en caso contrario.
     */
    public boolean quitarEmpleado(Empleado p_empleado) {
        if(this.getEmpleado().size() > 1){
            return this.getEmpleado().remove(p_empleado); 
        } else { 
            return false;
        }
    }
    
    /**
     * Lista los sueldos de todos los empleados.
     */
    public void listarSueldos() {
        for(Empleado e : this.getEmpleado()){
            System.out.println(e.mostrarLinea());
        }
    }
    
    /**
     * Calcula el monto total de sueldos a pagar.
     *
     * @return total de sueldos netos.
     */
    public double sueldoAPagar() {
        double total = 0;
        for(Empleado e : this.getEmpleado()){
            total += e.sueldoNeto();
        }
        return total;
    }
    
    /**
     * Muestra en pantalla la información del banco, empleados y total de sueldos.
     */
    public void mostrar() {
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("\n");
        this.listarSueldos();
        System.out.println("\n");
        System.out.println("Total a Pagar-----------------------------------$"+this.sueldoAPagar());
    }
    
    // ---- Gestión de cuentas ----
    
    /**
     * Agrega una cuenta bancaria.
     *
     * @param p_cuenta cuenta bancaria a agregar.
     * @return {@code true} si fue agregada, {@code false} en caso contrario.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.cuentas.add(p_cuenta);
    }
    
    /**
     * Quita una cuenta bancaria, siempre que quede al menos una.
     *
     * @param p_cuenta cuenta bancaria a quitar.
     * @return {@code true} si fue quitada, {@code false} en caso contrario.
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        if(this.getCuentaBancaria().size() > 1){
            return this.getCuentaBancaria().remove(p_cuenta); 
        } else { 
            return false;
        }
    }
    
    /**
     * Lista las cuentas con saldo cero, mostrando número de cuenta y titular.
     */
    public void listarCuentasConSaldoCero() {
        System.out.println("Cuentas sin saldo:");
        System.out.println("--- Cuenta -------------------- Apellido y Nombre -----------");
    
        if (this.getCuentaBancaria() != null) {
            for(CuentaBancaria cuenta : this.getCuentaBancaria()){
                if(cuenta.getSaldo() == 0){
                    System.out.println(cuenta.getNroCuanta() + "\t" + cuenta.getTitular().apeYNom());
                }
            }
        }
    }
    
    /**
     * Devuelve el conjunto de titulares únicos de las cuentas bancarias.
     * Además, imprime el listado formateado en pantalla.
     *
     * @return conjunto de personas titulares de cuentas.
     */
    public HashSet<Persona> listaDeTitulares() {
        HashSet<Persona> titularesUnicos = new HashSet<Persona>();
    
        if (this.getCuentaBancaria() != null) {
            for (CuentaBancaria cuenta : this.getCuentaBancaria()) {
                titularesUnicos.add(cuenta.getTitular());
            }
        }
    
        System.out.print("Listado de Clientes: ");
        int contador = 0;
        for (Persona titular : titularesUnicos) {
            System.out.print(titular.apeYNom());
            contador++;
            if (contador < titularesUnicos.size()) {
                System.out.print("; ");
            }
        }
        System.out.println();
    
        return titularesUnicos;
    }
    
    /**
     * Cuenta la cantidad de cuentas con saldo mayor a cero.
     *
     * @return número de cuentas activas.
     */
    private int cuentasSaldoActivo() {
        int contador = 0;
        if (this.cuentas != null) {
            for (CuentaBancaria cuenta : this.cuentas) {
                if (cuenta.getSaldo() > 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
    
    /**
     * Muestra un resumen de las cuentas bancarias:
     * cantidad total, activas, con saldo cero y titulares únicos.
     */
    public void mostrarResumen() {
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("************************************************************\nRESUMEN DE CUENTAS BANCARIAS\n************************************************************");
        System.out.println("Numero total de Cuentas Bancarias: "+this.cuentas.size());
        System.out.println("Cuentas Activas: "+this.cuentasSaldoActivo());
        
        int contador = 0;
        if (this.cuentas != null) {
            for (CuentaBancaria cuenta : this.getCuentaBancaria()) {
                if (cuenta.getSaldo() == 0) {
                    contador++;
                }
            }
        }
        System.out.println("Cuentas con Saldo Cero: "+contador);
        System.out.println("-------------------------------------------------------------");
        this.listarCuentasConSaldoCero();
        System.out.println("-------------------------------------------------------------");
        this.listaDeTitulares();
        System.out.println("-------------------------------------------------------------");
    }
}
