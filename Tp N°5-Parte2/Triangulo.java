/**
 * Class Triangulo.
 * Representa una figura geométrica de tipo triángulo, definida por su base y altura.
 * Hereda de la clase abstracta FiguraGeometrica.
 *
 * @author (Escobar Luacas & Fernandez Gabriel)
 * @version (19/10/2025)
 */
public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    /**
     * Constructor de la clase Triangulo.
     * Inicializa el triángulo, llamando al constructor de la superclase para el origen
     * y estableciendo la base y la altura.
     * @param p_origen El punto de origen de la figura.
     * @param p_base El valor de la base del triángulo.
     * @param p_altura El valor de la altura del triángulo.
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    /**
     * Setter ★ Establece la base del triángulo.
     * @param p_base El nuevo valor para la base.
     */
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    /**
     * Setter ★ Establece la altura del triángulo.
     * @param p_altura El nuevo valor para la altura.
     */
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    /**
     * Getter ★ Retorna la altura del triángulo.
     * @return La altura actual (double).
     */
    public double getAltura(){
        return this.altura;
    }
    
    /**
     * Getter ★ Retorna la base del triángulo.
     * @return La base actual (double).
     */
    public double getBase(){
        return this.base; 
    }
    
    /**
     * Retorna el nombre específico de esta figura.
     * @return El nombre "Triangulo".
     */
    public String nombreFigura(){
        return "***Triangulo***";
    }
    
    /**
     * Calcula la superficie del triángulo usando la fórmula (base * altura) / 2.
     * @return La superficie calculada (double).
     */
    public double superficie(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}
