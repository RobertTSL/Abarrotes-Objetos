/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetosNegocio;


import java.util.Date;

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
}
