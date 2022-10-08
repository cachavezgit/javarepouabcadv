package mx.uabc.cursojava.oop.productos.pruebas;

import mx.uabc.cursojava.oop.productos.Categoria;
import mx.uabc.cursojava.oop.productos.ProductManager;

public class PruebasProductManager {
    public static void main (String args[]){
        ProductManager productManager = new ProductManager();

        productManager.agregarProducto(new ProductManager.Product(1, "Ropero", 3454.56, Categoria.MUEBLES));
        productManager.agregarProducto(new ProductManager.Product(2, "Pollo", 54.56, Categoria.ALIMENTOS));
        productManager.agregarProducto(new ProductManager.Product(3, "Calcetas", 120, Categoria.ROPA));

        productManager.listarProductos();

        productManager.eliminarProducto(3);

        productManager.listarProductos();

        int y = dobleDelNumero(456);
    }

    public static int dobleDelNumero(int dato){
        return dato*2;
    }
}
