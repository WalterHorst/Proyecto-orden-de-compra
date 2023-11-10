import java.util.Date;

public class OrdenCompra {
    private static int contadorIds = 0;
    private int indiceProductos;

    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.id = ++contadorIds;
        this.descripcion = descripcion;
        this.productos = new Producto[4];
    }

    public static int getContadorIds() {
        return contadorIds;
    }

    public static void setContadorIds(int contadorIds) {
        OrdenCompra.contadorIds = contadorIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for(Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }
}
