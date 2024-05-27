package uniandes.edu.co.Proyecto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;

import uniandes.edu.co.Proyecto.documentos.Cuenta;
import uniandes.edu.co.Proyecto.documentos.Oficina;
import uniandes.edu.co.Proyecto.documentos.Operacion;
import uniandes.edu.co.Proyecto.documentos.PuntoAtencion;
import uniandes.edu.co.Proyecto.documentos.Usuario;
import uniandes.edu.co.Proyecto.repositories.OficinaRepository;
import uniandes.edu.co.Proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsuarioRepository usuarioRepository, MongoTemplate mongoTemplate){
		return args -> {
			ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
			ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
			Usuario usuario = new Usuario(10, "Activa", "Gerente General", cuentas);

			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(usuario.getId()));

			Query query2 = new Query();
			query2.addCriteria(Criteria.where("tipo").is("Gerente General"));

			List<Usuario> usuarios = mongoTemplate.find(query, Usuario.class);

			if(usuarios.isEmpty()){
				System.out.println("Creando usuario "+usuario);
				usuarioRepository.insert(usuario);
			} else{
				System.out.println(usuario+" ya hay un usuario con el id "+usuario.getId());
			}
		};
	}

	@Bean
	CommandLineRunner runner(OficinaRepository oficinaRepository){
		return args -> {
			ArrayList<PuntoAtencion> puntos = new ArrayList<PuntoAtencion>();
			Oficina oficina = new Oficina(0, "Julian", "Carrera_1", 3,"luis");
			oficinaRepository.insert(oficina);
		};
	}

}
