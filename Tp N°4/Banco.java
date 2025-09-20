import java.util.ArrayList;
import java.util.HashSet;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleado;
    private ArrayList<CuentaBancaria> cuentas;
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(new ArrayList<Empleado>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado, ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(p_empleado);
        this.setCuentaBancaria(p_cuentas);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setNroSucursal(int p_nro){
        this.nroSucursal = p_nro;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setEmpleado(ArrayList<Empleado> p_empleado){
        this.empleado = p_empleado;
    } 
    private void setCuentaBancaria(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentas = p_cuentas;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public ArrayList<Empleado> getEmpleado(){
        return this.empleado;
    }
    public ArrayList<CuentaBancaria> getCuentaBancaria(){
        return this.cuentas;
    }
    
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.empleado.add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        if(this.getEmpleado().size() > 1){
            return this.getEmpleado().remove(p_empleado); 
        } else { 
            return false;
        }
    }
    
    public void listarSueldos(){
        for(Empleado e : this.getEmpleado()){
            System.out.println(e.mostrarLinea());
        }
    }
    
    public double sueldoAPagar(){
        double total = 0;
        for(Empleado e : this.getEmpleado()){
            total += e.sueldoNeto();
        }
        return total;
    }
    
    public void mostrar(){
        System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
        System.out.println(this.getLocalidad().mostrar());
        System.out.println("\n");
        this.listarSueldos();
        System.out.println("\n");
        System.out.println("Total a Pagar-----------------------------------"+this.sueldoAPagar());
    }
    
    //Ejercicio 4
    
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
       return this.cuentas.add(p_cuenta);
    }
    
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
         if(this.getCuentaBancaria().size() > 1){
            return this.getCuentaBancaria().remove(p_cuenta); 
        } else { 
            return false;
        }
    }
    
    public void listarCuentasConSaldoCero(){
        System.out.println("Cuentas sin saldo:");
        System.out.println("--- Cuenta -------------------- Apellido y Nombre -----------");
    
        if (this.getCuentaBancaria() != null) {
            for(CuentaBancaria cuenta : this.getCuentaBancaria()){
                if(cuenta.getSaldo() == 0){
                    // Usamos apeYNom() para obtener "Apellido, Nombre"
                    System.out.println(cuenta.getNroCuanta() + "\t" + cuenta.getTitular().apeYNom());
                }
            }
        }
    }
    
    public HashSet<Persona> listaDeTitulares(){
    HashSet<Persona> titularesUnicos = new HashSet<Persona>();
    
    // Verificamos que la lista de cuentas no sea null
    if (this.getCuentaBancaria() != null) {
        for (CuentaBancaria cuenta : this.getCuentaBancaria()) {
            titularesUnicos.add(cuenta.getTitular());
        }
    }
    
    // Mostrar el listado formateado
    System.out.print("Listado de Clientes: ");
    
    int contador = 0;
    for (Persona titular : titularesUnicos) {
        System.out.print(titular.apeYNom());
        contador++;
        if (contador < titularesUnicos.size()) {
            System.out.print("; ");
        }
    }
    System.out.println(); // Salto de línea final
    
    return titularesUnicos;
    }
    
    private int cuentasSaldoActivo(){
        int contador = 0;
    // Verificamos que la lista de cuentas no sea null
        if (this.cuentas != null) {
            for (CuentaBancaria cuenta : this.cuentas) {
                // Contamos las cuentas con saldo mayor a 0
                if (cuenta.getSaldo() > 0) {
                    contador++;
                }
            }
        }
    
        return contador;
    }
    
    public void mostrarResumen(){
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