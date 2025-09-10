package es.isaias.springboot.reuniones.data;

import es.isaias.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="personas")
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
