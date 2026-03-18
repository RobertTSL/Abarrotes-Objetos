/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 *
 * @author rober
 */
public class ProductoGranel extends Producto {

    private float cantidad;

    public ProductoGranel() {
        super();
        this.cantidad = 0.0f;
    }

    public ProductoGranel(Producto producto, float cantidad) {
        super(producto);

        if (producto != null && producto.getClave().startsWith("GR")) {
            this.cantidad = ((cantidad >= 0.01f) ? cantidad : 0.01f);
        }
    }

    public ProductoGranel(Producto producto) {
        super(producto);
        this.cantidad = 0.0f;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        if (cantidad >= 0.01f) {
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}
