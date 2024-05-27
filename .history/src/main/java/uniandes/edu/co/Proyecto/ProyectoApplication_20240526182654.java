package uniandes.edu.co.Proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import uniandes.edu.co.Proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Bean
	commandLineRunner runner(UsuarioRepository usuarioRepository){
		return args -> {
			Usuario usuario = new Usuario();

		}
	}

}
