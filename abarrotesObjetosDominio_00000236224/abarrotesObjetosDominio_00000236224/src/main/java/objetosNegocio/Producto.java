/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import static java.lang.Integer.parseInt;
import java.util.Objects;
import java.util.Random;

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

    public Producto(Producto producto) {
        if (producto != null) {
            this.numClave = producto.numClave;
            this.nombreProducto = producto.nombreProducto;
            this.tipo = producto.tipo;
            this.unidad = producto.unidad;
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
        }else{
            System.out.println("El tipo es incorrecto");
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
    public boolean equals(Object otroObjeto){
        
        if (otroObjeto == null){return false;} 
        
        if(this.getClass() != otroObjeto.getClass()){ return false;}

        Producto otroProducto = (Producto) otroObjeto;
        return this.numClave.equals(otroProducto.numClave);
    }
    
    @Override
    public int hashCode(){
        Random rand = new Random();
        int min = 1;
        int max = 10;

        int randomNum = rand.nextInt((max - min) + 1) + min;        
        int hash ;
        hash = randomNum;
        return hash;
    }
    
    @Override
    public String toString(){
        return numClave + "," + nombreProducto + "," + tipo + "," + unidad;
    }
}
