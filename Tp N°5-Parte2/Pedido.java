import java.util.*;
/**
 * Clase Pedido.
 * Representa una colección de renglones (items) solicitados,
 * permitiendo agregar, quitar y mostrar el detalle y el total del pedido.
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class Pedido {
    private ArrayList<Renglon> renglones; 
    
    /**
     * Constructor de la clase Pedido.
     * @param p_renglones La lista inicial de renglones del pedido.
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }
    
    /**
     * Establece la lista de renglones del pedido.
     * @param p_renglones La nueva lista de renglones.
     */
    private void setRenglones(ArrayList<Renglon> p_renglones){
        this.renglones = p_renglones;
    }
    
    /**
     * Obtiene la lista de renglones del pedido.
     * @return La lista de renglones (ArrayList<Renglon>).
     */
    public ArrayList<Renglon> getRenglones(){
        return this.renglones;
    }
    
    /**
     * Agrega un renglón a la lista de renglones del pedido.
     * @param p_renglon El renglón a agregar.
     * @return true si el renglón fue agregado con éxito, false en caso contrario.
     */
    public boolean agregarRenglon(Renglon p_renglon) {
        return this.getRenglones().add(p_renglon);
    }
    
    /**
     * Quita un renglón de la lista de renglones del pedido.
     * @param p_renglon El renglón a quitar.
     * @return true si el renglón fue quitado con éxito, false si no se pudo quitar o la lista está vacía.
     */
    public boolean quitarRenglon(Renglon p_renglon) {
        if (this.getRenglones().size() > 0) {
            return this.getRenglones().remove(p_renglon);
        } else {
            return false;
        }
    }
    
    /**
     * Muestra por consola el detalle completo del pedido, 
     * incluyendo el total de etiquetas y el importe total.
     */
    public void mostrar() {
        System.out.println("Pedido:");
        System.out.println("Cantidad de items: " + this.getRenglones().size());
        
        int itemNum = 1;
        int totalEtiquetas = 0;
        double importeTotal = 0;
        
        for (Renglon renglon : this.getRenglones()) {
            System.out.print("Item " + itemNum + ": " + renglon.getCantidad() + " Etiquetas de " + renglon.getItem().toString());
            
            double precio = renglon.getPrecio(); 
            
            System.out.println();
            System.out.println("Precio: $ " + precio);
            
            totalEtiquetas += renglon.getCantidad();
            importeTotal += precio;
            itemNum++;
        }
        
        System.out.println("--- Total pedido: " + totalEtiquetas + " Etiquetas por un importe total de: $ " + importeTotal);
    }
}
