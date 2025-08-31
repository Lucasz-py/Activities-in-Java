
/**
 * Write a description of class GestionStock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionStock{
        public static void main(String[] args){
        Laboratorio lab1 = new Laboratorio("Colgate SA", "Junin 1300", "54-3757-453145");
        Producto pro1 = new Producto(887, "Perfumeria", "Jabon Deluxe", 5.25, 0, 0, lab1);
        pro1.ajuste(500);
        pro1.mostrar();
        System.out.println(pro1.mostrarLinea());
        pro1.ajuste(-200);
        pro1.mostrar();
        System.out.println(pro1.mostrarLinea());
    }
}