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
    private Integer numero;
    private ArrayList<Cuenta> cuentas;
 

    public Usuario(int id, String tipo, String rol, Integer numero, ArrayList<Cuenta> cuentas) {
        this.id = id;
        this.tipo = tipo;
        this.rol = rol;
        this.cuentas = cuentas;
        this.numero = numero;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }


    
}