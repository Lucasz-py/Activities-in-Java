
/**
 * Class CajaDeAhorro.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class CajaDeAhorro{
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
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
     * Devuelve las cantidades de extracciones posibles.
     * @return extraccionesPosibles.
     */
    public int getExtraccionesPosibles(){
        return extraccionesPosibles;
    }
    /**
     * Devuelve la persona titular de la cuenta.
     * @return titular.
     */
    public Persona getTitular(){
        return titular;
    }
    /**
     * Permite hacer una extracción y hace el cálculo de la misma.
     * @param p_importe monto a extraer.
     */
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    public void extraer(double p_importe){
        if (this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        } else if(this.getExtraccionesPosibles() == 0){
            System.out.println("No tiene habilitadas mas extracciones!");
            } else {
                System.out.println("No puede extraer mas que el saldo!");
            }
    }
    /**
     * Deposita un importe pasado por parametro.
     * @param p_importe monto a depositar.
     */
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    private boolean puedeExtraer(double p_importe){
        if ((this.getSaldo() >= p_importe) && (this.getExtraccionesPosibles() <= 0)){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Muestra en pantalla número de cuenta, saldo, titular y cantidades de extracciones posibles de la cuenta.
     */
    public void mostrar(){
        System.out.println("\n"+"-   Caja de Ahorro   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + titular.nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
    
    
    
}