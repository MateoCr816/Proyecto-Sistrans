package uniandes.edu.co.Proyecto.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import uniandes.edu.co.Proyecto.documentos.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{

    public class RespuestaGrupo{
            String ciudad;
            int cantidad;
            public RespuestaGrupo(String ciudad, int cantidad) {
                this.ciudad = ciudad;
                this.cantidad = cantidad;
            }
            public void setCiudad(String ciudad) {
                this.ciudad = ciudad;
            }
            public void setCantidad(int cantidad) {
                this.cantidad = cantidad;
            }
            public String getCiudad() {
                return ciudad;
            }
            public int getCantidad() {
                return cantidad;
            }
        }

    @Query("{_id: ?0}")
        List<Usuario> buscarPorId(int id); 

    @Query("{_id: ?0}")
    @Update("{$push:{cuentas:{tipoCuenta:?1, estado:?2, saldo:?3, numero:?4}}}")
    void aniadirCuentaAUsuario(int id_cuenta, String tipoCuenta, String estado, int saldo, int numero);

    @Query("{ '_id': ?0, 'cuentas.numero': ?1 }")
    @Update("{ '$set': { 'cuentas.$.estado': ?2 } }")
    void updateCuentaEstado(int usuarioId,int cuentaid, String estadoActual, String nuevoEstado);

}