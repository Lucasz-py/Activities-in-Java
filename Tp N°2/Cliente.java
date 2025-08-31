/**
 * Class Cliente
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (13/08/2025)
 */

public class Cliente
{
    private int nroDni;
    private String apellido;
    private String nombre;
    private double saldo;
    /**
     * Constructor de Persona
     * @param p_dni asigna el DNI de la persona.
     * @param p_nombre asigna el nombre de la persona.
     * @param p_apellido asigna el apellido de la persona.
     * @param p_importe asigna el saldo de la persona.
     */
    public Cliente(int p_dni, String p_apellido, String p_nombre ,double p_importe){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSaldo(p_importe);
    }
    /**
      * Método Setter
      * @param p_dni
     * actualiza dni en el parametro p_dni
     */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    /**
    * Método Setter
    * @param p_apellido
    * actualiza apellido en el parametro p_apellido
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
    * Método Setter
    * @param p_nombre
    * actualiza nombre en el parametro p_nombre
    */
        private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
        /**
    * Método Setter
    * @param p_saldo
    * actualiza saldo en el parametro p_importe
    */
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    /**
    * Método Getter
    * retorna nroDni
    */
    public int getDNI(){
        return this.nroDni;
    }
        /**
    * Método Getter
    * retorna nombre
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
    * Método Getter
    * retorna apellido
    */
    public String getApellido(){
        return this.apellido;
    }
    /**
    * Método Getter
    * retorna saldo
    */
    public double getSaldo(){
        return this.saldo;
    }
    /**
    * Método agregaSaldo
    * actualiza el saldo con el importe y retorna el saldo
    */
    public double agregaSaldo(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    /**
    * Método agregaSaldo
    * actualiza el saldo.
    */
    public double nuevoSaldo(double p_importe ){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    /**
    * Método nomYApe
    * retorna una cadena nombre y apellido.
    */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
    * Método apeYNom
    * retorna una cadena apellido y nombre.
    */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
        /**
    * Método mostrar
    * muestra en pantalla el cliente, nombre y apellido, saldo.
    */
    public void mostrar(){
        System.out.println("- Cliente -");
        System.out.println("Nombre y Apellido: " + nomYApe() + " (" + getDNI() + ")" + " ");
        System.out.println("Saldo: $" + getSaldo());
    }
}