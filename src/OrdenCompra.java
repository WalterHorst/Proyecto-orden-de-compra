import java.util.Date;

public class OrdenCompra {
    private static int contadorIds = 0;

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

}
