package Ventas.Productos;
import  Ventas.CrudAgregarProducto;

import java.util.ArrayList;
import java.util.List;

public class Limpieza extends  Producto implements CrudAgregarProducto<Limpieza,Integer> {

    private int idLimpieza;
    private static int ContadorLimpieza;
    private static List<Limpieza> limpiezas=new ArrayList<>();
    private double litros;
    private String componentes;

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.idLimpieza=++ContadorLimpieza;
        this.componentes = componentes;
        this.litros = litros;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public int getIdLimpieza(){
        return idLimpieza;
    }

    @Override
    public void agregar(Limpieza objeto) {
        limpiezas.add(objeto);
    }

    @Override
    public Limpieza obtener(Integer id) {
        for(Limpieza limpieza : limpiezas){
            if(limpieza.getIdLimpieza() == id){
                return limpieza;
            }

        }
        return null;
    }

    @Override
    public void actualizar(Limpieza objeto) {
        Limpieza lpz= obtener(objeto.getIdLimpieza());
        if(lpz != null){
            lpz.setComponentes(objeto.getComponentes());
            lpz.setLitros(objeto.getLitros());
        }

    }

    @Override
    public void eliminar(Integer id) {
        Limpieza lpz=obtener(id);
        if( lpz != null){
            limpiezas.remove(lpz);
        }

    }

}
