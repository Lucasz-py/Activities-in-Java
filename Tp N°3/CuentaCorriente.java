
/**
 * Class CuentaCorriente.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class CuentaCorriente{
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500);
    }
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    /**
     * Actualiza el número de cuenta.
     * @param p_nroCuenta asigna número de cuenta.
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    /**
     * Actualiza el saldo de cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    /**
     * Actualiza el número de xtracciones posibles.
     * @param p_extracciones asigna número de extracciones posibles.
     */
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    /**
     * Actualiza el titular de cuenta.
     * @param p_titular asigna titular de cuenta.
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
     * Devuelve el saldo del usuario disponible.
     * @return saldo.
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * Devuelve el límite descubierto.
     * @return limiteDescubierto.
     */
    public double getLimiteDescubierto(){
        return limiteDescubierto;
    }
    /**
     * Devuelve la persona titular de la cuenta.
     * @return titular.
     */
    public Persona getTitular(){
        return titular;
    }
    /**
     * Permite hacer un deposito y hace el cálculo de la misma.
     * @param p_importe monto a depositar.
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Permite hacer una extracción y hace el cálculo de la misma.
     * @param p_importe monto a extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    public void extraer(double p_importe){
        if (this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        } else {
            System.out.println("El deposito de extraccion sobrepasa el limite de descubierto!");
        }
    }
     /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */   
    private boolean puedeExtraer(double p_importe){
        if ((this.getSaldo() >= p_importe) || (500 >= p_importe)){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Muestra en pantalla el número, titular, saldo y descubierto de la cuenta.
     */
    public void mostrar(){
        System.out.println("\n"+"-   Cuenta Corriente   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + titular.nomYApe());
        System.out.println("Descubierto: $" + this.getLimiteDescubierto());
    }
}