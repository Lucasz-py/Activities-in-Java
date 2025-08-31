
/**
 * Write a description of class Hombre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hombre{
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    public Hombre(String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(null);
        this.setEstadoCivil("Soltero");
    }
    
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
        this.setEstadoCivil("Soltero");
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
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
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
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    public void casarseCon(Mujer p_mujer){
        if (this.getEsposa() == null && p_mujer.getEsposo() == null){
            this.setEsposa(p_mujer);
            this.setEstadoCivil("Casado");
        } else {
            this.setEstadoCivil("Soltero");
        }
    }
    
    public void divorcio(){
        this.setEsposa(null);
        this.setEstadoCivil("Divorciada");
    }
    
    public void casadoCon(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años esta casado con "+this.getEsposa().getNombre()+" "+this.getEsposa().getApellido()+" de "+this.getEsposa().getEdad()+" años");
    }
    
    public void mostrarEstadoCivil(){
        System.out.println(this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años - "+this.getEstadoCivil());
    }
    
    public String datos(){
        return this.getNombre()+" "+this.getApellido()+" de "+this.getEdad()+" años";
    }
}