package uniandes.edu.co.Proyecto.documentos;


import java.util.Date;

import org.springframework.data.annotation.Id;


public class Operacion {

    @Id
    private int id;
    private String tipo;
    private int valor;
    private String puestoAtencion;
    private Integer hora;
    private Date fecha;

    public Operacion(int id, String tipo, int valor, String puestoAtencion, Integer hora, Date fecha) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.puestoAtencion = puestoAtencion;
        this.hora = hora;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPuestoAtencion() {
        return puestoAtencion;
    }

    public void setPuestoAtencion(String puestoAtencion) {
        this.puestoAtencion = puestoAtencion;
    }


    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

}