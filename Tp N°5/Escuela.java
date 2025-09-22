
/**
 * Write a description of class Escuela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escuela{
    public static void main(String[] args){
        Persona per1 = new Persona(22333444, "Jose", "Perez", 2000);
        per1.mostrar();
        
        Alumno alu1 = new Alumno(46234289, 1234, "Lucas", "Escobar", 2004);
        alu1.setNota1(10);
        alu1.setNota2(8);
        alu1.mostrar();
    }
}