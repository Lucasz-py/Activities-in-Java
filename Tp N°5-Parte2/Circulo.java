/**
 * Class Circulo.
 * Representa una figura geométrica de tipo círculo. Hereda de la clase Elipse,
 * estableciendo el radio como el valor de ambos semiejes (mayor y menor).
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Circulo extends Elipse{
    
    /**
     * Constructor de objeto de clase Circulo.
     * Inicializa el círculo llamando al constructor de la superclase (Elipse)
     * y usando el radio para ambos semiejes.
     * @param p_radio asigna el valor del radio.
     * @param p_centro asigna el objeto de clase Punto que representa el centro del círculo.
     */
    public Circulo(double p_radio, Punto p_centro){
        super(p_radio, p_radio, p_centro);
    }
    
    /**
     * Retorna el nombre específico de esta figura.
     * @return El nombre "****Circulo****".
     */
    public String nombreFigura(){
        return "****Circulo****";
    }
}
