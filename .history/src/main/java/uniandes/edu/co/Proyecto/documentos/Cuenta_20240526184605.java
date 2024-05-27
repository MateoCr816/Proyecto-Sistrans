package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;


public class Cuenta {
    public enum TipoCuenta{
        AHORRRO,
        CORRIENTE,
        AFC
    }
    public enum Estado{
        ACTIVA,
        CERRADA,
        DESACTIVADA
    }

    @Id
    private Integer id;
    private TipoCuenta tipo;
    private Estado estado;
    private Integer saldo;
    private ArrayList<Operacion> operaciones;


    public Cuenta(Integer id, TipoCuenta tipo, Estado estado, Integer saldo, ArrayList<Operacion> operaciones) {
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

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
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