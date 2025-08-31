
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setNroCuenta(int p_nroCuanta){
        this.nroCuenta = p_nroCuanta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    public int getNroCuanta(){
        return nroCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public Persona getTitular(){
        return titular;
    }
    
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    public void mostrar(){
        System.out.println("- Cuanta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + " Años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    public String toString(){
        return this.getNroCuanta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
    }
}