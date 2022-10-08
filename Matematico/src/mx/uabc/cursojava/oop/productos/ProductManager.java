package mx.uabc.cursojava.oop.productos;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> inventario = new ArrayList<Product>();

    public void listarProductos() {
        for (Product producto:inventario){
            System.out.println(producto);
        }
    }

    public void agregarProducto(Product nuevo) {
        inventario.add(nuevo);
    }

    public void eliminarProducto(int id) {
        inventario.removeIf(p -> p.getId() == id);
    }

    public static final class Product implements IProducto {
        private final int id;

        private final String nombreProducto;

        private final double precio;

        private final Categoria categoria;

        public Product(int id, String nombreProducto, double precio, Categoria categoria) {
            this.id = id;
            this.nombreProducto = nombreProducto;
            this.precio = precio;
            this.categoria = categoria;
        }

        public int getId() {
            return id;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public double getPrecio() {
            return precio;
        }

        public Categoria getCategoria() {
            return categoria;
        }



        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", nombreProducto='" + nombreProducto + '\'' +
                    ", precio=" + precio +
                    ", categoria=" + categoria +
                    '}';
        }

        @Override
        public void review() {

        }
    }
}
