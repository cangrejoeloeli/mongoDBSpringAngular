package com.db.msApp.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.msApp.models.Autor;
import com.db.msApp.models.Libro;
import com.db.msApp.models.ModuloNombre;
import com.db.msApp.models.ModulosAsignados;
import com.db.msApp.models.PermisoNombre;
import com.db.msApp.models.Role;
import com.db.msApp.repositories.AutoresRepository;
import com.db.msApp.repositories.LibrosRepository;
import com.db.msApp.repositories.ModulosRepository;
import com.db.msApp.repositories.PermisosRespository;
import com.db.msApp.repositories.RoleRepository;

import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/first")
public class firstController {

    @Autowired
    private AutoresRepository autoresRepository;

    @Autowired
    private LibrosRepository librosRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermisosRespository permisosRespository;

    @Autowired
    private ModulosRepository modulosRepository;

    @GetMapping("/autores")
    public List<Autor> getAutores() {
        return autoresRepository.findAll();
    }

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return librosRepository.findAll();
    }

    @GetMapping("/rol")
    public Role addRole(@RequestParam String nombre) {
        // Creo el rol
        Role role = new Role();
        role.setName(nombre);

        // Obtengo la lista de permisos, convierto la List en un Set
        Set<PermisoNombre> permisoNombres = new HashSet<PermisoNombre>(permisosRespository.findAll());

        // Obtenga la lista de modulos
        Set<ModuloNombre> moduloNombres = new HashSet<ModuloNombre>(modulosRepository.findAll());

        // Creo el set de modulos asignados
        Set<ModulosAsignados> modulosAsignados = new HashSet<>();

        // Para cada modulo, asigno todos los permisos y lo subo al rol
        for (ModuloNombre m : moduloNombres) {
            ModulosAsignados mod = new ModulosAsignados();
            mod.setModulo(m);
            mod.setPermisos(permisoNombres);
            modulosAsignados.add(mod);
        }

        role.setModulosAsignados(modulosAsignados);

        roleRepository.save(role);
        return role;
    }

    @GetMapping("/add_autor")
    public Autor addAutores(@RequestParam String nombre, @RequestParam String dni) {
        Autor autor = new Autor();
        autor.setName(nombre);
        autor.setDni(dni);
        autoresRepository.save(autor);
        return autor;
    }

    @GetMapping("/add_libro")
    public Libro addLibro(@RequestParam String nombre) {
        Set<Autor> autores = new HashSet<>();
        Autor autor = autoresRepository.findOneByName("Marcelo José Santinelli").orElse(null);
        autores.add(autor);
        autor = autoresRepository.findOneByName("Natalia José Santinelli").orElse(null);
        autores.add(autor);

        Libro libro = new Libro();
        libro.setTitle(nombre);
        libro.setAuthor(autores);
        librosRepository.save(libro);
        return libro;
    }
}
