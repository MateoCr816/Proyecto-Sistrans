package uniandes.edu.co.Proyecto.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniandes.edu.co.Proyecto.documentos.Oficina;
import uniandes.edu.co.Proyecto.repositories.OficinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/Oficinas")
public class OficinaController {

    @Autowired
    private OficinaRepository oficinaRepository;

    @PostMapping
    public ResponseEntity<?> insertOficina(@RequestBody Oficina oficina) {
        try{
            Oficina oficinainsert = oficinaRepository.save(oficina);
            return new ResponseEntity<Oficina>(oficinainsert, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getCause().toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
