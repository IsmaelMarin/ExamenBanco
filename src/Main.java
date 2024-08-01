import Ventas.Bolsa.*;
import Ventas.*;
import Ventas.Productos.*;


public class Main {
    public static void main(String[] args) {

        Orden orden = new Orden();

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana", 0.99, 0.5, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Banana", 1.10, 0.3, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 1.25, 0.4, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Uva", 2.99, 0.2, "Morado"));
        bolsaFrutas.addProducto(new Fruta("Pera", 1.50, 0.35, "Verde"));


        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 2.50, "Químicos", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 3.00, "Alcohol", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Jabón", 1.25, "Glicerina", 0.5));
        bolsaLimpieza.addProducto(new Limpieza("Cloro", 1.75, "Sodio", 2.0));
        bolsaLimpieza.addProducto(new Limpieza("Limpiador", 2.99, "Enzimas", 1.2));
        orden.addBolsa(bolsaLimpieza);

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche", 1.50, 1, 3.5));
        bolsaLacteos.addProducto(new Lacteo("Yogurt", 0.99, 1, 4.0));
        bolsaLacteos.addProducto(new Lacteo("Queso", 2.75, 1, 25.0));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla", 1.99, 1, 0.5));
        bolsaLacteos.addProducto(new Lacteo("Crema", 2.50, 1, 2.0));
        orden.addBolsa(bolsaLacteos);

        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 0.85, 1, 200));
        bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 1.20, 1, 350));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos", 1.00, 1, 300));
        bolsaNoPerecibles.addProducto(new NoPerecible("Conserva de atún", 2.50, 2, 150));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina", 1.10, 1, 400));


    }


}