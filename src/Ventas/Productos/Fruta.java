package Ventas.Productos;

import  Ventas.CrudAgregarProducto;
import java.util.ArrayList;
import java.util.List;


public class Fruta extends  Producto implements CrudAgregarProducto<Fruta,Integer> {
    private int idFruta;
    private static int ContadorFruta;
    private static List<Fruta> frutas=new ArrayList<>();
    private double peso;
    private String color;

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.idFruta=++ContadorFruta;
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdFruta(){
        return idFruta;
    }

    @Override
    public void agregar(Fruta objeto) {
        frutas.add(objeto);
    }

    @Override
    public Fruta obtener(Integer id) {
        for(Fruta fruta : frutas){
            if(fruta.getIdFruta() == id){
                return fruta;
            }

        }
        return null;
    }

    @Override
    public void actualizar(Fruta objeto) {
        Fruta frt= obtener(objeto.getIdFruta());
        if(frt != null){
            frt.setColor(objeto.getColor());
            frt.setPeso(objeto.getPeso());
        }

    }

    @Override
    public void eliminar(Integer id) {
        Fruta frt=obtener(id);
        if( frt != null){
            frutas.remove(frt);
        }

    }
}
