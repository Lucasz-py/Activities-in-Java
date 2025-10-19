
/**
 * Class CajaDeAhorro.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public  class CajaDeAhorro extends CuentaBancaria{
    private int extraccionesPosibles;
    
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     */
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular){
        super(p_nroCuenta, p_titular);
        this.setExtraccionesPosibles(10);
    }
    /**
     * ★ Constructor de objeto de clase CajaDeAhorro.
     * @param p_nroCuenta asigna número de cuenta.
     * @param p_titular asigna titular de la cuenta.
     * @param p_saldo asigna saldo a la cuenta.
     */
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        super(p_nroCuenta, p_titular, p_saldo);
        this.setExtraccionesPosibles(10);
    }
    /**
     * Actualiza el número de xtracciones posibles.
     * @param p_extracciones asigna número de extracciones posibles.
     */
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }
    /**
     * Devuelve las cantidades de extracciones posibles.
     * @return extraccionesPosibles.
     */
    public int getExtraccionesPosibles(){
        return extraccionesPosibles;
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    @Override
    public double extraer(double p_importe){
        if (this.puedeExtraer(p_importe)){
            double nuevoSaldo = super.extraer(p_importe);
            this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
            return nuevoSaldo;
        } else{
            System.out.println("No se pudo extraer. Motivo: " + this.xQNoPuedeExtraer(p_importe));
            return this.getSaldo();
        }
    }
    /**
     * Evalúa si es posible una extracción sin sobrepasar la cantidad de extracciones posibles.
     * @param p_importe monto a extraer.
     */
    private boolean puedeExtraer(double p_importe){
        return (this.getSaldo() >= p_importe) && (this.getExtraccionesPosibles() > 0);
    }
    /**
     * Devuelve motivo de por qué no puede extraer
     * @param p_importe asigna importe
     */
    public String xQNoPuedeExtraer(double p_importe){
        if(this.getSaldo() < p_importe){
            return "No hay saldo en esta cuenta.";
        } else if(this.getExtraccionesPosibles() <= 0){
            return "No se pueden hacer más extracciones. Ha llegado al límite.";
        } else {
            return "Error desconocido en la extracción.";
        }
    }
    /**
     * Muestra en pantalla número de cuenta, saldo, titular y cantidades de extracciones posibles de la cuenta.
     */
    @Override
    public void mostrar(){
        System.out.println("\n"+"-   Caja de Ahorro   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + this.titular.nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
    
    
    
}