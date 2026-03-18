/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 *
 * @author rober
 */
public class MovimientoEmpacado extends Movimiento {

    private ProductoEmpacado producto;

    public MovimientoEmpacado() {
        super();
    }

    public MovimientoEmpacado(ProductoEmpacado producto) {
        this.producto = producto;
    }

    public MovimientoEmpacado(String cveMovimiento, ProductoEmpacado producto) {
        super(cveMovimiento);

        this.producto = null;
    }

    public ProductoEmpacado getProductoEmpacado() {
        return this.producto;
    }

    public void setProductoEmpacado(ProductoEmpacado producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return getCveMovimiento() + "," + getFecha() + "," + getProcesado() + "," + producto;
    }

}
