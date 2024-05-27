package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="usuarios")

public class Usuario {

    @Id
    private Integer id;
    private String tipo;
    private String rol;
    private ArrayList<Cuenta> cuentas;
 

    public Usuario(int id, TipoPersona tipo, Rol rol, ArrayList<Cuenta> cuentas) {
        this.id = id;
        this.tipo = tipo;
        this.rol = rol;
        this.cuentas = cuentas;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoPersona getTipo() {
        return tipo;
    }

    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


    
}