/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:3/junio/2022
Fecha de Actualización:23/junio/2022
descripción:
 */
package controller;

import pojo.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ProductoModel;

public class ProductoController {
    // se instancia al Producto model

    ProductoModel model = new ProductoModel();

    public void crearProducto(List<Producto> lista, Producto producto) {
        model.crearProducto(lista, producto);
    }

    public void eliminarProducto(List<Producto> lista, String nombre) {
        model.eliminarProducto(lista, nombre);
    }

    public void actualizarProductos(List<Producto> lista, Producto producto) {
        model.actualizarProductos(lista, producto);
    }

    public void mostrarProductos(List<Producto> lista, DefaultTableModel modelo) {
        model.mostrarProductos(lista, modelo);
    }

}
