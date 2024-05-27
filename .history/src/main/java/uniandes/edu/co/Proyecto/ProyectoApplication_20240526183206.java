package uniandes.edu.co.Proyecto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import uniandes.edu.co.Proyecto.documentos.Cuenta;
import uniandes.edu.co.Proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsuarioRepository usuarioRepository){
		return args -> {
			Cuenta cuenta = new Cuenta(0, null, null, null)
			Usuario usuario = new Usuario(0,"a","a","a","a");
		}
	}

}
