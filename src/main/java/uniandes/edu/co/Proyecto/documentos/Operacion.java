package uniandes.edu.co.Proyecto.documentos;


import java.util.Date;

import org.springframework.data.annotation.Id;


public class Operacion {

    public enum TipoOperacion{
        ABRIR_CUENTA,
        CERRAR_CUENTA,
        CONSIGNAR,
        RETIRAR_DINERO,
        TRANSFERIR_DINERO
    }

    public enum PuestoAtencion{
        ATENCION_PERSONALIZADA,
        CAJERO_AUTOMATICO,
        DIGITAL
    }

    @Id
    private int id;
    private TipoOperacion tipo;
    private int valor;
    private PuestoAtencion puestoAtencion;
    private Integer hora;
    private Date fecha;

    public Operacion(int id, TipoOperacion tipo, int valor, PuestoAtencion puestoAtencion, Integer hora, Date fecha) {
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

    public TipoOperacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacion tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public PuestoAtencion getPuestoAtencion() {
        return puestoAtencion;
    }

    public void setPuestoAtencion(PuestoAtencion puestoAtencion) {
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