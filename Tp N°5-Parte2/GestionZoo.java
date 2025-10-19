import java.util.*;
/**
 * Clase ejecutable GestionZoo.
 * 
 * @authors (Escobar Lucas & Fernandez Gabriel) 
 * @version (19/10/25)
 */
public class GestionZoo{
    public static void main(String[] args) {
        // a) Instanciar un zoológico con el nombre "El Caribú"
        Zoologico zoo = new Zoologico("El Caribú", new ArrayList());
        
        // Crear fechas
        Calendar fechaVisita = new GregorianCalendar(2024, Calendar.SEPTEMBER, 22);
        Calendar fechaMesPasado = new GregorianCalendar(2024, Calendar.AUGUST, 1);
        Calendar fechaHoy = new GregorianCalendar(2024, Calendar.SEPTEMBER, 30);
        
        // b) Instanciar tres individuos
        Persona persona1 = new Persona(12345678, "Juan", "Perez", 1980);
        Persona persona2 = new Persona(23456789, "Maria", "Lopez", 1975);
        Persona persona3 = new Persona(34567890, "Carlos", "Gomez", 1968);
        
        Individuo individuo1 = new Individuo("Juan Perez", fechaVisita, persona1);
        Individuo individuo2 = new Individuo("Maria Lopez", fechaVisita, persona2);
        Individuo individuo3 = new Individuo("Carlos Gomez", fechaVisita, persona3);
        
        // c) Crear la delegación "PAMI" e inscribir a dos individuos
        ArrayList<Individuo> integrantesPAMI = new ArrayList<Individuo>();
        Delegacion delegacionPAMI = new Delegacion("PAMI", fechaVisita, integrantesPAMI);
        
        delegacionPAMI.inscribirIndividuo(individuo2);
        delegacionPAMI.inscribirIndividuo(individuo3);
        
        // Agregar visitantes al zoológico
        zoo.nuevoVisitante(individuo1);
        zoo.nuevoVisitante(delegacionPAMI);
        
        // d) Listar todos los visitantes que acudieron el día 22/09/2024
        System.out.println("=== VISITANTES DEL 22/09/2024 ===");
        zoo.listarVisitantePorFecha(fechaVisita);
        
        // e) Listar la recaudación del último mes
        System.out.println("\n=== RECAUDACIÓN ÚLTIMO MES ===");
        double recaudacion = zoo.recaudacion(fechaMesPasado, fechaHoy);
        System.out.println("Recaudación: $" + recaudacion);
        
        // f) Listar las delegaciones que acudieron el día 22/09/2024
        System.out.println("\n=== DELEGACIONES DEL 22/09/2024 ===");
        zoo.listarTipoVisitantePorFecha(fechaVisita, "Delegación");
    }
}