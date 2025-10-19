
/**
 * Class CuentaCorriente.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class CuentaCorriente extends CuentaBancaria{
    private double limiteDescubierto;
    
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setLimiteDescubierto(500);
    }
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setLimiteDescubierto(500);
    }
    /**
     * Actualiza el número de xtracciones posibles.
     * @param p_extracciones asigna número de extracciones posibles.
     */
    private void setLimiteDescubierto(double p_limite){
        this.limiteDescubierto = p_limite;
    }
    /**
     * Devuelve el límite descubierto.
     * @return limiteDescubierto.
     */
    public double getLimiteDescubierto(){
        return limiteDescubierto;
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    @Override
    public double extraer(double p_importe){
        if (this.puedeExtraer(p_importe) == true){
            return super.extraer(p_importe);
        } else {
            System.out.println("El depósito de extracción sobrepasa el límite de descubierto!");
            return this.getSaldo();
        }
    }
     /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */   
    private boolean puedeExtraer(double p_importe){
        return (this.getSaldo() + this.getLimiteDescubierto()) >= p_importe;
    }
    /**
     * Muesta en pantalla motivo por el que no puede extraer
     * @param p_importe asigna importe
     */
    public String xQNoPuedeExtraer(double p_importe){
        if(this.getSaldo() + this.getLimiteDescubierto() < p_importe){
             return "El importe excede el saldo más el límite de descubierto (" + this.getLimiteDescubierto() + ").";
        } else {
             return "Si puede extraer."; // Nunca se ejecuta si se llama desde extraer()
        }
    }
    /**
     * Muestra en pantalla el número, titular, saldo y descubierto de la cuenta.
     */
    @Override
    public void mostrar(){
        System.out.println("\n"+"-   Cuenta Corriente   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: $" + this.getLimiteDescubierto());
    }
}