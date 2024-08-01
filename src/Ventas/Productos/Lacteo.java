package Ventas.Productos;
import  Ventas.CrudAgregarProducto;

import java.util.ArrayList;
import java.util.List;

public class Lacteo extends Producto implements CrudAgregarProducto<Lacteo,Integer>{

    private int idLacteo;
    private static int ContadorLacteo;
    private static List<Lacteo> lacteos=new ArrayList<>();
    private int cantidad;
    private double proteinas;

    public Lacteo(String nombre, double precio, int cantidad, double proteinas) {
        super(nombre, precio);
        this.idLacteo=++ContadorLacteo;
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public int getIdLacteo(){
        return idLacteo;
    }
    @Override
    public void agregar(Lacteo objeto) {
        lacteos.add(objeto);
    }

    @Override
    public Lacteo obtener(Integer id) {
        for(Lacteo lacteo : lacteos){
            if(lacteo.getIdLacteo() == id){
                return lacteo;
            }

        }
        return null;
    }

    @Override
    public void actualizar(Lacteo objeto) {
        Lacteo lct= obtener(objeto.getIdLacteo());
        if(lct != null){
            lct.setCantidad(objeto.getCantidad());
            lct.setProteinas(objeto.getProteinas());
        }

    }

    @Override
    public void eliminar(Integer id) {
        Lacteo lct=obtener(id);
        if( lct != null){
            lacteos.remove(lct);
        }

    }


}
