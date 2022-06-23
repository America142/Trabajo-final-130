/*
Autor: América Yaridsaida Villalobos Rodríguez 
Fecha de Creación:21/junio/2022
Fecha de Actualización:23/junio/2022
descripción: En la clase utilidades se creó para carga la lista de productos 

 */
package utilidades;

import pojo.Producto;
import java.util.List;

public class UtilidadesProducto {
  
    public static List<Producto> cargarProductos(List<Producto> listaProducto){
        
        listaProducto.add(new Producto("1", "jabon", "10.5", "10"));
        listaProducto.add(new Producto("2", "Aceite", "20.5", "10"));
        listaProducto.add(new Producto("3", "Frijol", "28.5", "10"));        
        return listaProducto;
        
    }
    
}
