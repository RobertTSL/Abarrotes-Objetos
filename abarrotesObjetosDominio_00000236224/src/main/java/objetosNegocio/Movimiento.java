/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author rober
 */
public class Movimiento {

    private String cveMovimiento;
    private Date Fecha;
    private boolean procesado;

    public Movimiento() {
    }

    public Movimiento(String cveMovimiento, Date Fecha, boolean procesado) {
        if (cveMovimiento != null && cveMovimiento.matches("MV[0-9]{3}")) {
            this.cveMovimiento = cveMovimiento;
        }
        if (Fecha != null && !Fecha.after(new Date())) {
            this.Fecha = Fecha;

        }
        this.procesado = procesado;
    }

    public Movimiento(String cveMovimiento) {

        if (cveMovimiento != null && cveMovimiento.matches("MV[0-9]{3}")) {
            this.cveMovimiento = cveMovimiento;
        }
        this.Fecha = null;
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
        return this.Fecha;
    }

    public void setFecha(Date Fecha) {
        if (Fecha != null && !Fecha.after(new Date())) {
            this.Fecha = Fecha;
        }
    }

    public boolean getProcesado() {
        return this.procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Movimiento)) {
            return false;
        }

        Movimiento otro = (Movimiento) object;
        return Objects.equals(this.cveMovimiento, otro.cveMovimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cveMovimiento);
    }

    @Override
    public String toString() {
        return cveMovimiento + "," + Fecha + "," + procesado;
    }

}
