package Ventas.Productos;
import  Ventas.CrudAgregarProducto;

import java.util.ArrayList;
import java.util.List;

public class NoPerecible extends Producto implements CrudAgregarProducto<NoPerecible,Integer>{

    private int idNoPerecible;
    private static int ContadorNoPerecible;
    private static List<NoPerecible> NoPerecibles=new ArrayList<>();
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.idNoPerecible=++ContadorNoPerecible;
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }


    public int getIdNoPerecible(){
        return idNoPerecible;
    }

    @Override
    public void agregar(NoPerecible objeto) {
        NoPerecibles.add(objeto);
    }

    @Override
    public NoPerecible obtener(Integer id) {
        for(NoPerecible Noperecible : NoPerecibles){
            if(Noperecible.getIdNoPerecible() == id){
                return Noperecible;
            }

        }
        return null;
    }

    @Override
    public void actualizar(NoPerecible objeto) {
        NoPerecible nps= obtener(objeto.getIdNoPerecible());
        if(nps != null){
            nps.setCalorias(objeto.getCalorias());
            nps.setContenido(objeto.getContenido());
        }

    }

    @Override
    public void eliminar(Integer id) {
        NoPerecible npz=obtener(id);
        if( npz != null){
            NoPerecibles.remove(npz);
        }

    }

}
