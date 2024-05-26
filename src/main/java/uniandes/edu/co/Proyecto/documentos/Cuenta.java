package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="cuentas")

public class Cuenta {
    public enum TipoCuenta{
    ahorro,corriente,afc
    }
    public enum Estado{
        activa,cerrada,desactivada
    }
    @Id
    private int id;
    private TipoCuenta tipo;
    private Estado estado;
    private ArrayList<Operacion> operaciones;
    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }
    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
    
    
    public Cuenta(int id, TipoCuenta tipo, Estado estado, ArrayList<Operacion> operaciones) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.operaciones = operaciones;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
  
}