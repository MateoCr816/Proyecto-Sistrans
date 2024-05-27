package uniandes.edu.co.Proyecto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import uniandes.edu.co.Proyecto.documentos.Oficina;

public interface OficinaRepository extends MongoRepository<Oficina, Integer>{

    @Query("{_id: ?0}")
    @Update("{$push:{puntosAtencion:{tipoPunto:?1, operaciones:?2}}}")
    void anadirPuntoAtencion(int id_oficina, String tipoPunto, String operaciones, Integer idPA);

}