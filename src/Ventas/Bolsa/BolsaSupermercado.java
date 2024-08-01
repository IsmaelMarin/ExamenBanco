package Ventas.Bolsa;

import Ventas.Productos.Producto;
import java.util.List;
import java.util.ArrayList;

public class BolsaSupermercado<T extends Producto>{
    private List<T> productos;
    private static final int MAX_PRODUCTOS=5;

    public BolsaSupermercado(){
        this.productos=new ArrayList<>();
    }

    public void addProducto(T producto){
        if(productos.size() < MAX_PRODUCTOS){
            productos.add(producto);
        }
        else{
            System.out.println("La bolsa esta llena, ya no puede agregar mas productos");
        }

    }

    public List<T> getProductos(){
        return productos;
    }
}
