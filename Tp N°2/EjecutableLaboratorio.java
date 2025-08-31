
/**
 * Ejecutable de Laboratorio
 * 
 * @authors (Gabriel F. - Lucas E.) 
 * @version (13/08/2025)
 */
/**
 * 
 */
public class EjecutableLaboratorio
{ 
    public static void main(String [] args){
    Laboratorio laboratorio_01  = new Laboratorio("Colgate S.A","Junín 5204", "54-11-4239-8447", 40, 30);
    Laboratorio laboratorio_02  = new Laboratorio("Bagó", "Chubut 1200", "54-11-4239-8447");
    System.out.println(laboratorio_01.mostrar());
    System.out.println(laboratorio_02.mostrar());
    
    Laboratorio laboratorio_03  = new Laboratorio("Roemmers","Julio 5204", "54-11-6239-8997", 60, 20);
    Laboratorio laboratorio_04  = new Laboratorio("Phoenix", "Libertador 786", "54-11-3757-66531");
    System.out.println(laboratorio_03.mostrar());
    System.out.println(laboratorio_04.mostrar());
    }
}