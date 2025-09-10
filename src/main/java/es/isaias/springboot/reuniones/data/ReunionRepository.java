package es.isaias.springboot.reuniones.data;

import es.isaias.springboot.reuniones.models.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="reuniones")
public interface ReunionRepository extends JpaRepository<Reunion, Long> {
}
