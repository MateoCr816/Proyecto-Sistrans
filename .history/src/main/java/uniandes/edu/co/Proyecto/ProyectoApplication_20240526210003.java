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
import uniandes.edu.co.Proyecto.repositories.CuentaRepository;
import uniandes.edu.co.Proyecto.repositories.OficinaRepository;
import uniandes.edu.co.Proyecto.repositories.OperacionRepository;
import uniandes.edu.co.Proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}
 
	@Bean
	CommandLineRunner runner(UsuarioRepository usuarioRepository, MongoTemplate mongoTemplate){
		return args -> {
			
			ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

			Usuario usuario = new Usuario(5, "Activa", "Gerente General", cuentas);

			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(usuario.getId()));

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
	CommandLineRunner runner2(UsuarioRepository usuarioRepository, CuentaRepository cuentaRepository, OperacionRepository operacionRepository, MongoTemplate mongoTemplate){
		return args -> {

			ArrayList<Operacion> operaciones = new ArrayList<Operacion>();

			Cuenta cuenta = new Cuenta(0, "Ahorros", "Activa", 0, 12341234, operaciones);

			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(0));

			List<Usuario> usuarios = mongoTemplate.find(query, Usuario.class);

			if(usuarios.isEmpty()){ 	
				System.out.println("Creando cuenta del usuario "+0);
			} else{
				System.out.println("No se ha encontrado el usuario, poner id distinto a "+0);
			}

			Query query2 = new Query();
			query2.addCriteria(Criteria.where("id").is(cuenta.getId()));

			List<Cuenta> cuentas = mongoTemplate.find(query2, Cuenta.class);

			if(cuentas.isEmpty()){ 	
				System.out.println("Creando cuenta del usuario "+cuenta.getId());
				usuarioRepository.aniadirCuentaAUsuario(0, cuenta.getTipo(), cuenta.getEstado(), 0, cuenta.getNumero());
			} else{
				System.out.println("No se ha encontrado el usuario, poner id distinto a "+cuenta.getId());
			}
		};
	}

	@Bean
	CommandLineRunner runner3(UsuarioRepository usuarioRepository, MongoTemplate mongoTemplate,OficinaRepository oficinaRepository){
		return args -> {
			ArrayList<Operacion> operaciones = new ArrayList<Operacion>();
			ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
			Usuario usuario = new Usuario(10, "Activa", "Gerente General", cuentas);

			Query query = new Query();
			query.addCriteria(Criteria.where("id").is(usuario.getId()));

			List<Usuario> usuarios = mongoTemplate.find(query, Usuario.class);
			
			if(usuarios.isEmpty()){
				System.out.println("Creando usuario "+usuario);
				usuarioRepository.insert(usuario);
			} else{
				System.out.println(usuario+" ya hay un usuario con el id "+usuario.getId());
			}
			ArrayList<PuntoAtencion> puntos = new ArrayList<PuntoAtencion>();
			Oficina oficina = new Oficina(0, "Julian", "Carrera_1", 3,puntos,"a");
			oficinaRepository.insert(oficina);
			
		};
	}

	@Override
	public void run(String... args) throws Exception {

		for(int i=0;i<=5;i++){
			LOG.info("Count =" +i)

		}


		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
