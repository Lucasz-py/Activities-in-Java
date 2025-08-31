
/**
 * Ejecutable de la clase Persona.
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (13/08/2025)
 */
public class EjecutablePersona
{   
    /**
     * Se crea el ejecutable persona, donde "nuevaPersona" es el objeto.
     */
    public static void main(String []args){
        Persona persona01 = new Persona(35123456 , "Juan", "Perez", 2003);
        Persona persona02 = new Persona(34678210 , "Martina", "Hernandez", 2009);
        Persona persona03 = new Persona(45367886 , "Jose", "Rodriguez", 2000);
        persona01.mostrar();
        persona02.mostrar();
        persona03.mostrar();
    }
}