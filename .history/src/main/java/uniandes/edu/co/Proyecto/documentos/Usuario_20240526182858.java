package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="usuarios")

public class Usuario {
    /*public enum TipoPersona{
        natural,juridica
    }
    public enum TipoEmp{
        gerentegeneral,gerenteoficina,cajero,atencionalcliente,noempleado
    }*/
    @Id
    private int id;
    private String tipo;
    private String tipoEmp;
    private ArrayList<Cuenta> cuentas;
 
    public int getId() {
        return id;
    }
    public Usuario(int id, String tipo, String tipoEmp, ArrayList<Cuenta> cuentas) {
        this.id = id;
        this.tipo = tipo;
        this.tipoEmp = tipoEmp;
        this.cuentas = cuentas;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    /*public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }
    public TipoEmp getTipoEmp() {
        return tipoEmp;
    }
    public void setTipoEmp(TipoEmp tipoEmp) {
        this.tipoEmp = tipoEmp;
    }
    public TipoPersona getTipo() {
        return tipo;
    }
    */
  
}
