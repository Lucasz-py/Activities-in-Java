
/**
 * clase ejecutable Empresa
 * 
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Empresa{
    public static void main(String[] args){
        Persona per1 = new Persona(22333444, "Jose", "Perez", 2000);
        per1.mostrar();
        System.out.println("\n");
        
        Empleado empleado = new Empleado(46240424, 100, "Escobar", "Lucas", 120000 ,2005, 2010);
        empleado.mostrar();
    }
}