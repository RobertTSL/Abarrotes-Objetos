/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import static java.lang.Integer.parseInt;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author rober
 */
public class Movimiento {

    private String cveMovimiento;
    private Date fecha;
    private boolean procesado;

    public Movimiento() {
    }

    public Movimiento(String cveMovimiento, Date fecha, boolean procesado) {
        if (cveMovimiento != null && cveMovimiento.matches("MV[0-9]{3}")) {
            this.cveMovimiento = cveMovimiento;
        }
        if (fecha != null && !fecha.after(new Date())) {
            this.fecha = fecha;
        }
        this.procesado = procesado;
    }

    public Movimiento(String cveMovimiento) {

        if (cveMovimiento != null && cveMovimiento.matches("MV[0-9]{3}")) {
            this.cveMovimiento = cveMovimiento;
        }
        this.fecha = null;
        this.procesado = false;
    }

    public String getCveMovimiento() {
        return this.cveMovimiento;
    }

    public void setCveMovimiento(String cveMovimiento) {
        if (cveMovimiento != null && cveMovimiento.matches("MV[0-9]{3}")) {
            this.cveMovimiento = cveMovimiento;
        }
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        if (fecha != null && !fecha.after(new Date())) {
            this.fecha = fecha;
        }
    }

    public boolean getProcesado() {
        return this.procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    @Override
    public boolean equals(Object otroObjeto){
        
        if (otroObjeto == null){return false;} 
        
        if(this.getClass() != otroObjeto.getClass()){ return false;}

        Movimiento otroProducto = (Movimiento) otroObjeto;
        return this.cveMovimiento.equals(otroProducto.cveMovimiento);
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
    public String toString() {
        return cveMovimiento + "," + fecha + "," + procesado;
    }

}

/*
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Movimiento)) {
            return false;
        }

        Movimiento otro = (Movimiento) object;
        return Objects.equals(this.cveMovimiento, otro.cveMovimiento);
*/