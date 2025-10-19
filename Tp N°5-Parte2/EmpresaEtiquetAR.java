import java.util.*;
/**
 * Clase ejecutable para simular el pedido
 * @authors (Lucas E. Gabriel F.) 
 * @version (18/10/2025)
 */
public class EmpresaEtiquetAR {
    public static void main(String[] args) {
        // Crear etiquetas
        Etiqueta premium1 = new Premium(200.0, 10);
        Etiqueta comm1 = new Comun(100.0, 100.0);
        Etiqueta premium2 = new Premium(200.0, 7);
        
        // Crear renglones (ahora debemos calcular el precio manualmente)
        Renglon renglon1 = new Renglon(7, 1820.0, premium1); // Precio deseado: $ 1820.0
        Renglon renglon2 = new Renglon(57, 5510.0, comm1);  // Precio deseado: $ 5510.0
        Renglon renglon3 = new Renglon(94, 22748.0, premium2);   
        // Crear ArrayList de renglones
        ArrayList<Renglon> listaRenglones = new ArrayList<Renglon>();
        listaRenglones.add(renglon1);
        listaRenglones.add(renglon2);
        listaRenglones.add(renglon3);
        
        // Crear el pedido
        Pedido pedido = new Pedido(listaRenglones);
        
        // Mostrar el pedido completo
        System.out.println("=== PEDIDO COMPLETO ===");
        pedido.mostrar();
        
        // Mostrar cada renglón individualmente
        System.out.println("\n=== DETALLE POR RENGLÓN ===");
        for (Renglon renglon : pedido.getRenglones()) {
            renglon.mostrar();
        }
    }
}