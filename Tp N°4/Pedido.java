import java.util.*;
/**
 * Class Pedido.
 * 
 * @authors (Gabriel F. - Lucas E.)
 * @version (08/09/2025)
 */
public class Pedido{
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Laboratorio laboratorio;
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Producto> p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(p_productos);
    }
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(new ArrayList());
    }
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    
    private void setProducto(ArrayList<Producto> p_productos){
        this.productos = p_productos;
    }
    
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    public Calendar getFecha(){
        return this.fecha;
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public ArrayList<Producto> getProducto(){
        return this.productos;
    }
    
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    public boolean agregarProducto(Producto p_productos) {
        return this.productos.add(p_productos);
    }

    public boolean quitarProducto(Producto p_productos) {
        return this.productos.remove(p_productos);
    }
    
    public double totalAlContado(){
        double total = 0;
        for (Producto p : productos) {
            total += p.precioContado();
        }
        return total;
    }

    public double totalFinanciado() {
        double total = 0;
        for(Producto p : productos) {
            total += p.precioLista();
        }
        return total;
    }
    
    public void mostrarPedido(){
        System.out.println("****** Detalle del pedido ******"+" Fecha:"+this.fecha.getTime());
        System.out.println("Poducto"+"\t"+"Precio Lista"+"\t"+"Precio Contable");
        System.out.println("--------------------------------------------------------");
        for (Producto p : productos) {
            System.out.print(p.mostrarLinea());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("***"+"Total-----"+this.totalFinanciado()+"\t"+this.totalAlContado());
    }
    
}