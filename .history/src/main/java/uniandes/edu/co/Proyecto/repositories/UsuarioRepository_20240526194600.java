package uniandes.edu.co.Proyecto.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

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
        
    @Aggregation(pipeline={"{$group:{_id:'$ciudad', cantidad:{$sum:1}}}","{$project:{'ciudad':'$_id',cantidad:1}}"})
    List<RespuestaGrupo> darBaresPorCiudad();    

    @Query("{_id: ?0}")
    @Update("{$push:{oferta_bebidas:{nombre:?1, tipo:?2, grado_alcohol:?3, horario:?4, precio:?5}}}")
    void aniadirBebidaABar(int id_bar, String nombre, String tipo, int grado_alcohol, String horario, int precio);
    
}