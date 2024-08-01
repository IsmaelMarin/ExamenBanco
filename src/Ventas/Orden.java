package Ventas;

import Ventas.Productos.*;
import Ventas.Bolsa.BolsaSupermercado;
import java.util.ArrayList;
import java.util.List;

public class Orden {

    private List<BolsaSupermercado<? extends Producto>> bolsas;

    public Orden() {
        this.bolsas = new ArrayList<>();
    }

    public void addBolsa(BolsaSupermercado<? extends Producto> bolsa) {
        bolsas.add(bolsa);
    }


}
