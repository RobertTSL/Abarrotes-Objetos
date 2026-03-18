/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 *
 * @author rober
 */
public class MovimientoGranel extends Movimiento {
    
    private ProductoGranel producto;

    public MovimientoGranel() {
        super();
    }

    public MovimientoGranel(ProductoGranel producto) {
        this.producto = producto;
    }

    public MovimientoGranel(String cveMovimiento, ProductoGranel producto) {
        super(cveMovimiento);

        this.producto = null;
    }

    public ProductoGranel getProductoEmpacado() {
        return this.producto;
    }

    public void setProductoEmpacado(ProductoGranel producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return getCveMovimiento() + "," + getFecha() + "," + getProcesado() + "," + producto;
    }

}
