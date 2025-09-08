package es.isaias.springboot.reuniones.data;

import es.isaias.springboot.reuniones.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
