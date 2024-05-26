package uniandes.edu.co.Proyecto.documentos;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Operacion {
    public enum TipoOperacion{
        abrir,cerrar,consignar,retirar,transferir
    }
    @Id
    private int id;
    private int valor;
    private TipoOperacion tipo;
    private Cuenta cuenta;
    private String hora;
    private String fecha;
    public Operacion(int id, int valor,TipoOperacion tipo, Cuenta cuenta,String hora,String fecha ) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.cuenta = cuenta;
        this.hora = hora;
        this.fecha = fecha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public TipoOperacion getTipo() {
        return tipo;
    }
    public void setTipo(TipoOperacion tipo) {
        this.tipo = tipo;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
  
}
