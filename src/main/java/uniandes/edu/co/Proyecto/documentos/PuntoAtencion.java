package uniandes.edu.co.Proyecto.documentos;

import java.util.ArrayList;


public class PuntoAtencion {

    private enum TipoPunto {
        ATENCION_PERSONALIZADA,
        CAJERO_AUTOMATICO,
        DIGITAL
    }

    private TipoPunto tipoPunto;
    private ArrayList<String> operaciones;

    public PuntoAtencion(TipoPunto tipoPunto, ArrayList<String> operaciones) {
        this.tipoPunto = tipoPunto;
        this.operaciones = operaciones;
    }

    public TipoPunto getTipoPunto() {
        return tipoPunto;
    }

    public void setTipoPunto(TipoPunto tipoPunto) {
        this.tipoPunto = tipoPunto;
    }

    public ArrayList<String> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<String> operaciones) {
        this.operaciones = operaciones;
    }
}
