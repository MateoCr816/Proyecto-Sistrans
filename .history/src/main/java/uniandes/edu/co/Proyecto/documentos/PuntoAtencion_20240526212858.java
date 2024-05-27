package uniandes.edu.co.Proyecto.documentos;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class PuntoAtencion {

    @Id
    private Integer id;
    private String tipoPunto;
    private String operaciones;
    private Integer idPA;

    public PuntoAtencion(Integer id, String tipoPunto, Integer idPA, String operaciones) {
        this.id = id;
        this.tipoPunto = tipoPunto;
        this.operaciones = operaciones;
        this.idPA = idPA;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoPunto() {
        return tipoPunto;
    }

    public void setTipoPunto(String tipoPunto) {
        this.tipoPunto = tipoPunto;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(String operaciones) {
        this.operaciones = operaciones;
    }
}