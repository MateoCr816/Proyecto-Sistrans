package uniandes.edu.co.Proyecto.documentos;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class PuntoAtencion {

    private enum TipoPunto {
        ATENCION_PERSONALIZADA,
        CAJERO_AUTOMATICO,
        DIGITAL
    }

    @Id
    private Integer id;
    private TipoPunto tipoPunto;
    private ArrayList<String> operaciones;

    public PuntoAtencion(Integer id, TipoPunto tipoPunto, ArrayList<String> operaciones) {
        this.id = id;
        this.tipoPunto = tipoPunto;
        this.operaciones = operaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
