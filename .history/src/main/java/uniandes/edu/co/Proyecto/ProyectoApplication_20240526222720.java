package uniandes.edu.co.Proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	CuentaRepository cuentaRepository;

	@Autowired
	OperacionRepository operacionRepository;

	@Autowired
	OficinaRepository oficinaRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}
 /* 
	@Bean
	CommandLineRunner runner(MongoTemplate mongoTemplate){
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
	CommandLineRunner runner2(MongoTemplate mongoTemplate){
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
	CommandLineRunner runner3(MongoTemplate mongoTemplate){
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
*/
	@Override
	public void run(String... args) throws Exception {
/* 
		//crear usuario
			
		ArrayList<Cuenta> cuentas2 = new ArrayList<Cuenta>();
			
		Usuario usuario = new Usuario(11, "Activa", "Gerente General", cuentas2);
			
		Query queryCrearUsuario = new Query();
		queryCrearUsuario.addCriteria(Criteria.where("id").is(usuario.getId()));
			
		List<Usuario> usuarios = mongoTemplate.find(queryCrearUsuario, Usuario.class);
			
		if(usuarios.isEmpty()){
			System.out.println("Creando usuario "+usuario);
			usuarioRepository.insert(usuario);
		} else{
			System.out.println(usuario+" ya hay un usuario con el id "+usuario.getId());
		}

		//crear oficina

		ArrayList<Operacion> operaciones = new ArrayList<Operacion>();

		Query queryCrearUsuario = new Query();
		queryCrearUsuario.addCriteria(Criteria.where("id").is(11));

		List<Usuario> usuarios = mongoTemplate.find(queryCrearUsuario, Usuario.class);

		Cuenta cuenta = new Cuenta(0, "Ahorros", "Activa", 0, 12341234, operaciones);

		if(usuarios.isEmpty()){ 	
			System.out.println("Creando cuenta del usuario "+5);
		} else{
			System.out.println("No se ha encontrado el usuario, poner id distinto a "+5);
		}

		Query query2 = new Query();
		query2.addCriteria(Criteria.where("id").is(cuenta.getId()));

		List<Cuenta> cuentas = mongoTemplate.find(query2, Cuenta.class);

		if(cuentas.isEmpty()){ 	
			System.out.println("Creando cuenta del usuario "+cuenta.getId());
			usuarioRepository.aniadirCuentaAUsuario(11, cuenta.getTipo(), cuenta.getEstado(), 0, cuenta.getNumero());
		} else{
			System.out.println("No se ha encontrado el usuario, poner id distinto a "+cuenta.getId());
		}	

		//crear oficina

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
		Oficina oficina = new Oficina(2, "Julian", "Carrera_1", 3,puntos,"a");
		oficinaRepository.insert(oficina);	

		//Crear punto de atencion
*/
		//oficinaRepository.anadirPuntoAtencion(1, "Digital", "operaciones", 1);

		//Borrar punto de atencion

		//oficinaRepository.borrarPunto(1, 1);

		//cambiar estado

		//usuarioRepository.updateCuentaEstado(11, 12341234, "Cerrada");
		//obtenerTodasLasCuentas();

		//añadir operacion

		Operacion operacion = new Operacion(0, null, 0, null, null, null);
		usuarioRepository.aniadirOperacion(11, 12341234, "Retirar", 0, "0", 0, "01/01/20001");

		//Consultar cuentas

		//List<Cuenta> cuentas = obtenerTodasLasCuentas();
        //cuentas.forEach(cuenta -> System.out.println("Numero: " + cuenta.getNumero()));
		
	};

	public List<Cuenta> obtenerTodasLasCuentas() {
        return usuarioRepository.findAll()
                .stream()
                .flatMap(usuario -> usuario.getCuentas().stream())
                .collect(Collectors.toList());
    }

	
}