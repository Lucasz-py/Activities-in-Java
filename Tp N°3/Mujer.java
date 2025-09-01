
/**
 * Class Mujer.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (01/09/2025)
 */
public class Mujer{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    public Mujer(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(null);
        this.setEstadoCivil("Soltera");
    }
    
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        this.setEstadoCivil("Soltera");
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo(Hombre p_esposo){
        this.esposo = p_esposo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    public Hombre getEsposo(){
        return this.esposo;
    }
    
    public void casarseCon(Hombre p_hombre){
        if (this.getEsposo() == null && p_hombre.getEsposa() == null){
            this.setEsposo(p_hombre);
            this.setEstadoCivil("Casada");
        } else {
            this.setEstadoCivil("Soltera");
        }
    }
    
    public void divorcio(){
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }
    
    public void casadaCon(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años esta casada con "+this.getEsposo().getNombre()+" "+this.getEsposo().getApellido()+" de "+this.getEsposo().getEdad()+" años");
    }
    
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años - "+this.getEstadoCivil());
    }
    
    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
}