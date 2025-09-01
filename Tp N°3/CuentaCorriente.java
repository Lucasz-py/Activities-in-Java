
/**
 * Write a description of class CuentaCorriente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaCorriente{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public int getNroCuenta(){
        return nroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double getLimiteDescubierto(){
        return limiteDescubierto;
    }
    public Persona getTitular(){
        return titular;
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    
    public void extraer(double p_importe){
        if (this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        } else {
            System.out.println("El deposito de extraccion sobrepasa el limite de descubierto!");
        }
    }
        
    private boolean puedeExtraer(double p_importe){
        if ((this.getSaldo() >= p_importe) || (500 >= p_importe)){
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrar(){
        System.out.println("\n"+"-   Cuenta Corriente   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + titular.nomYApe());
        System.out.println("Descubierto: $" + this.getLimiteDescubierto());
    }
}