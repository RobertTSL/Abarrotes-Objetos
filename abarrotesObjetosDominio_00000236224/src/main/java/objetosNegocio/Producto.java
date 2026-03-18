/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Objects;

/**
 *
 * @author rober
 */
public class Producto {

    protected String numClave;
    protected String nombreProducto;
    protected char tipo;
    protected String unidad;

    public Producto() {
    }

    public Producto(String numClave, String nombreProducto, char tipo, String unidad) {
        this.numClave = numClave;
        this.nombreProducto = nombreProducto;
        this.tipo = tipo;  
        this.unidad = unidad;
    }

    public Producto(String numClave) {
        this.numClave = numClave;
        this.nombreProducto = null;
        this.tipo = ' ';
        this.unidad = null;
    }

    public Producto(Producto otro) {
        if (otro != null) {
            this.numClave = otro.numClave;
            this.nombreProducto = otro.nombreProducto;
            this.tipo = otro.tipo;
            this.unidad = otro.unidad;
        }
    }
    public String getClave(){ return this.numClave;}
    public void setClave(String numClave){
        if (numClave != null && numClave.matches("[A-Z]{2}[0-9]{3}")) {
            this.numClave = numClave;
        }
    }
    public String getNombreProducto(){return this.nombreProducto;}
    public void setNombreProducto (String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public char getTipo(){return this.tipo;}
    public void setTipo(char tipo){
        if (tipo == 'E' || tipo == 'G') {
            this.tipo = tipo;
        }
    }
    public String getUnidad(){return this.unidad;}
    public void setUnidad(String unidad){
        if (unidad != null && 
           (unidad.equals("KG") || unidad.equals("g") || unidad.equals("L") || unidad.equals("PZ"))) {
            this.unidad = unidad;
        }
    }
    
    @Override
    public boolean equals(Object objeto){
        if (this == objeto) return true;
        if (objeto == null || !(objeto instanceof Producto)) return false;

        Producto otro = (Producto) objeto;
        return Objects.equals(this.numClave, otro.numClave);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(numClave);
    }
    
    @Override
    public String toString(){
        return numClave + "," + nombreProducto + "," + tipo + "," + unidad;
    }
}
