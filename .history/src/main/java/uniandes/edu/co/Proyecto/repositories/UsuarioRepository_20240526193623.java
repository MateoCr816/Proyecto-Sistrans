package uniandes.edu.co.Proyecto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import uniandes.edu.co.Proyecto.documentos.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{
    Optional<Usuario> findUsuarioByIdContains();

}