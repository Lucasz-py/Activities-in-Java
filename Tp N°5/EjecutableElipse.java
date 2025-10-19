
/**
 * Clase ejecutable para Elipse
 * 
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class EjecutableElipse{
    public static void main(String[] args) {
        Punto p1 = new Punto(5.0, 3.0);
        Elipse e = new Elipse(20, 8, p1);
        Circulo c = new Circulo(10, p1);
        
        e.caracteristicas();
        c.caracteristicas();
        c.desplazar(20.0, 20.0);
        c.caracteristicas();
    }
}