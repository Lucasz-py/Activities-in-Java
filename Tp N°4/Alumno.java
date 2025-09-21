
/**
 * Class Alumno
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (13/08/2025)
 */
public class Alumno{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    /**
      * Constructor persona
     * @param p_lu asigna una libreta univesitaria.
     * @param p_nombre asigna nombre del alumno.
     * @param p_apellido asigna apellido del alumno.
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido){
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
    }
    /**
     * Método setter
     * @param p_lu
     * actualiza lu en el parametro p_lu
     */
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    /**
     * Método setter
     * @param p_nombre
     * actualiza nombre en el parametro p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    /**
     * Método setter
     * @param p_apellido
     * actualiza apellido en el parametro p_apellido
     */
    public void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
     * método
     * @param p_x
     * actualiza nota1 en el parametro p_nota1
     */
    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    /**
     * Método 
     * @param p_nota2
     * actualiza nota2 en el parametro p_nota2
     */
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    /**
      * Método Getter
     * retorna la variable de instancia lu.
     */
    public int getLU(){
        return this.lu;
    }
    /**
      * Método Getter
     * retorna la variable de instancia nombre.
     */
    public String getNombre(){
        return this.nombre;
    } 
    /**
      * Método Getter
     * retorna la variable de instancia apellido.
     */
    public String getApellido(){
        return this.apellido;
    }
        /**
      * Método Getter
     * retorna la variable de instancia nota1.
     */
    public double getNota1(){
        return this.nota1;
    }
    /**
     * Método Getter
     * retorna la variable de instancia nota2.
     */
    public double getNota2(){
        return this.nota2;
    }
        /**
      * Método promedio
     * retorna el cálculo del promedio de las notas del alumno.
     */
    public double promedio(){
        double sumaNotas = this.nota1 + this.nota2;
        double promedio = sumaNotas / 2;
        return promedio;
    }
    /**
      * Método aprueba
     * retorna un valor true si las notas son >= 6 y el promedio es >= 7.
     */
    private boolean aprueba(){
    double promedio = promedio();
    
    if((promedio >= 7) && (nota1 >= 6.0 && nota2 >= 6.0)){
        return true;
    } else {
        return false;
        }
    }

    /**
      * Método String para mostrar
     * devuelve aprobado o desaprobado si se cumplen las condiciones
     */
    private String leyendaAprueba(){
        if(aprueba() == true){
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }
    /**
      * Método Getter
     * retorna una cadena de string con el nombre y el apellido.
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    /**
     * Método Getter
     * retorna una cadena de string con el apellido y el nombre.
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    /**
    * Método mostrar
    * muestra en pantalla el nombre y apellido del alumno, lu del alumno, promedio y si logró aprobar.
    */
    public void mostrar(){
    System.out.println("Nombre y Apellido: " + nomYApe());
    System.out.println("LU: " + getLU() + " " + "Notas: " + getNota1() + " - " + getNota2());
    System.out.println("Promedio: " + promedio() + " - " + leyendaAprueba());
    }
}