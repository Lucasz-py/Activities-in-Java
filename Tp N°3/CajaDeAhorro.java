
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
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
    }
    
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
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
    public int getExtraccionesPosibles(){
        return extraccionesPosibles;
    }
    public Persona getTitular(){
        return titular;
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    public void extraer(double p_importe){
        if (this.puedeExtraer(p_importe) == true){
            this.extraccion(p_importe);
        } else if(this.getExtraccionesPosibles() == 0){
            System.out.println("No tiene habilitadas mas extracciones!");
            } else {
                System.out.println("No puede extraer mas que el saldo!");
            }
    }
    
    public void depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    private boolean puedeExtraer(double p_importe){
        if ((this.getSaldo() >= p_importe) && (this.getExtraccionesPosibles() <= 0)){
            return true;
        } else {
            return false;
        }
    }
    
    public void mostrar(){
        System.out.println("\n"+"-   Caja de Ahorro   -");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + " - " + "Saldo: $" + this.getSaldo());
        System.out.println("Titular: " + titular.nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
    
    
    
}