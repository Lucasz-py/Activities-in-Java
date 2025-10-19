/**
 * Class CuentaBancaria.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public abstract class CuentaBancaria{
    private int nroCuenta;
    private double saldo;
    protected Persona titular;
    
    /**
     * ★ Constructor de objeto de clase CuentaBancaria.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    /**
     * ★ Constructor de objeto de clase CuentaBancaria.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    /**
     * Actualiza número de cuenta.
     * @param p_nroCuenta asigna número de cuenta.
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    /**
     * Actualiza saldo de la cuenta. 
     * @param p_saldo asigna saldo de la cuenta.
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    /**
     * Actualiza titular de la cuenta. 
     * @param p_titular asigna titular de la cuenta.
     */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    /**
     * Devuelve el número de cuenta. 
     * @return nroCuenta.
     */
    public int getNroCuenta(){
        return nroCuenta;
    }
     /**
     * Devuelve el saldo de la cuenta. 
     * @return saldo.
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * Devuelve el titular de cuenta. 
     * @return titular.
     */
    public Persona getTitular(){
        return titular;
    }
     /**
     * Calcula el deposito con el monto. 
     * @param p_importe calcula el importe a depositar.
     * @return nroCuenta.
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**
     * Calcula la extracción con el monto.
     * @aram p_importe ingresa el importe a extraer.
     * @return saldo.
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
     /**
      * Muestra en pantalla el titular de la cuenta y el saldo de la cuenta.
     */
    public void mostrar(){
        System.out.println("- Cuanta Bancaria -");
        System.out.println("Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + " Años)");
        System.out.println("Saldo: " + this.getSaldo());
    }
    /**
     * Devuelve una cadena concatenada del número de cuenta, titular y saldo. 
     * @return una cadena concatenada del numero de cuenta, titular y saldo.
     */
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
    }
}