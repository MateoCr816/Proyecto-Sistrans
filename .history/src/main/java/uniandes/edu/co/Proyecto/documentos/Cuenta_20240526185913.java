package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class Cuenta {

    @Id
    private Integer id;
    private String tipo;
    private String estado;
    private Integer saldo;
    private ArrayList<Operacion> operaciones;


    public Cuenta(Integer id, String tipo, String estado, Integer saldo, ArrayList<Operacion> operaciones) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.saldo = saldo;
        this.operaciones = operaciones;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
}