package uniandes.edu.co.Proyecto;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import uniandes.edu.co.Proyecto.documentos.Cuenta;
import uniandes.edu.co.Proyecto.documentos.Usuario;
import uniandes.edu.co.Proyecto.repositories.UsuarioRepository;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(UsuarioRepository usuarioRepository){
		return args -> {
			ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
			Cuenta cuenta = new Cuenta(null, null, null, null, null);
			cuentas.add(cuenta);
			Usuario usuario = new Usuario(0, null, null, cuentas);
			usuarioRepository.insert(usuario);
		};
	}

}
