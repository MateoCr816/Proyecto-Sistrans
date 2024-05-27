package uniandes.edu.co.Proyecto.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.Proyecto.documentos.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{

    @Query("{_id: ?0}")
        List<Usuario> buscarPorId(int id);
        
}