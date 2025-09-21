import java.util.*;

/**
 * Representa un pedido de productos realizado por un cliente en una fecha específica.
 * Incluye la gestión de los productos, el cálculo de precios y la impresión del detalle del pedido.
 *
 * @authors (Gabriel F. - Lucas E.)
 * @version (08/09/2025)
 */

public class Pedido {

    private Calendar fecha;
    private Cliente cliente;
    // Se elimina el generic para usar un tipo crudo (raw type)
    private ArrayList productos;
    private Laboratorio laboratorio;

    /**
     * Crea un pedido con una lista de productos.
     *
     * @param p_fecha fecha del pedido.
     * @param p_cliente cliente que realiza el pedido.
     * @param p_productos lista de productos del pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(p_productos);
    }

    /**
     * Crea un pedido con un único producto inicial.
     *
     * @param p_fecha fecha del pedido.
     * @param p_cliente cliente que realiza el pedido.
     * @param p_productos producto inicial del pedido.
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProducto(new ArrayList());
    }

    /**
     * Establece la fecha del pedido.
     *
     * @param p_fecha fecha del pedido.
     */
    private void setFecha(Calendar p_fecha) {
        this.fecha = p_fecha;
    }

    /**
     * Establece el cliente del pedido.
     *
     * @param p_cliente cliente que realiza el pedido.
     */
    private void setCliente(Cliente p_cliente) {
        this.cliente = p_cliente;
    }

    /**
     * Establece la lista de productos del pedido.
     *
     * @param p_productos lista de productos.
     */
    private void setProducto(ArrayList p_productos) {
        this.productos = p_productos;
    }

    /**
     * Establece el laboratorio del pedido.
     *
     * @param p_lab laboratorio asociado al pedido.
     */
    private void setLaboratorio(Laboratorio p_lab) {
        this.laboratorio = p_lab;
    }

    /**
     * Obtiene la fecha del pedido.
     *
     * @return fecha del pedido.
     */
    public Calendar getFecha() {
        return this.fecha;
    }

    /**
     * Obtiene el cliente que realizó el pedido.
     *
     * @return cliente del pedido.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Obtiene la lista de productos del pedido.
     *
     * @return ArrayList de productos.
     */
    public ArrayList getProducto() {
        return this.productos;
    }

    /**
     * Obtiene el laboratorio del pedido.
     *
     * @return laboratorio asociado.
     */
    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    /**
     * Agrega un producto a la lista del pedido.
     *
     * @param p_productos producto a agregar.
     * @return {@code true} si se agregó exitosamente.
     */
    public boolean agregarProducto(Producto p_productos) {
        return this.productos.add(p_productos);
    }

    /**
     * Quita un producto de la lista del pedido.
     *
     * @param p_productos producto a quitar.
     * @return {@code true} si se quitó exitosamente.
     */
    public boolean quitarProducto(Producto p_productos) {
        return this.productos.remove(p_productos);
    }

    /**
     * Calcula el precio total de los productos del pedido al contado.
     *
     * @return total al contado.
     */
    public double totalAlContado() {
        double total = 0;
        // Se itera sobre Object y se realiza el cast
        for (Object obj : this.productos) {
            Producto p = (Producto) obj;
            total += p.precioContado();
        }
        return total;
    }

    /**
     * Calcula el precio total de los productos del pedido financiado (a precio de lista).
     *
     * @return total financiado.
     */
    public double totalFinanciado() {
        double total = 0;
        // Se itera sobre Object y se realiza el cast
        for (Object obj : this.productos) {
            Producto p = (Producto) obj;
            total += p.precioLista();
        }
        return total;
    }

    /**
     * Muestra en pantalla el detalle completo del pedido, incluyendo precios y totales.
     */
    public void mostrarPedido() {
        System.out.println("****** Detalle del pedido ******" + " Fecha:" + this.fecha.getTime());
        System.out.println("Poducto \t\t Precio Lista \t\t Precio Contado");
        System.out.println("--------------------------------------------------------");
        // Se itera sobre Object y se realiza el cast
        for (Object obj : this.productos) {
            Producto producto = (Producto) obj;
            System.out.print(producto.mostrarLinea());
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("***" + "Total-----" + this.totalFinanciado() + "\t" + this.totalAlContado());
    }
}