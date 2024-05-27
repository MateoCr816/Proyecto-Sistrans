package uniandes.edu.co.Proyecto.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;


import uniandes.edu.co.Proyecto.documentos.Oficina;

public interface UsuarioRepository extends MongoRepository<Oficina, Integer>{

}