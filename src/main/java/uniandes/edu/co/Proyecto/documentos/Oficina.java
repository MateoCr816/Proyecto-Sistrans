package uniandes.edu.co.Proyecto.documentos;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="oficinas")
public class Oficina {

    @Id
    private Integer id;
    private String nombre;
    private String direccion;
    private Integer numeroPtosAtencion;
    private ArrayList<PuntoAtencion> puntosAtencion;
    private String gerente;

    public Oficina(Integer id, String nombre, String direccion, Integer numeroPtosAtencion, String gerente) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroPtosAtencion = numeroPtosAtencion;
        this.gerente = gerente;
        }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Integer getNumeroPtosAtencion() {
        return numeroPtosAtencion;
    }
    public void setNumeroPtosAtencion(Integer numeroPtosAtencion) {
        this.numeroPtosAtencion = numeroPtosAtencion;
    }
    public ArrayList<PuntoAtencion> getPuntos() {
        return puntosAtencion;
    }
    public void setPuntos(ArrayList<PuntoAtencion> puntos) {
        this.puntosAtencion = puntos;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
   
}

