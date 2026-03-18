/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

/**
 *
 * @author rober
 */
public class ProductoEmpacado extends Producto{
    private int cantidad;
    
    public ProductoEmpacado(){
        super();
        this.cantidad = 0;
    }
    
    public ProductoEmpacado(Producto producto, int cantidad){
        super(producto);
        this.cantidad = cantidad;
        
        if (producto != null && producto.getClave().startsWith("EM")) {
            this.cantidad = (cantidad >= 1) ? cantidad : 1;
        }
    }
    public ProductoEmpacado(Producto producto) {
        super(producto);
        this.cantidad = 0;  
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 1) {
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," + cantidad;
    }
}
    

