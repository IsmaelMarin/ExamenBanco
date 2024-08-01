package Ventas;

public interface CrudAgregarProducto<T,ID> {
    void agregar(T objeto);
    T obtener(ID id);
    void actualizar(T objeto);
    void eliminar(ID id);
}
