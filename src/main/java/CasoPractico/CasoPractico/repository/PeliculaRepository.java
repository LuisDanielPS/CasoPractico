
package CasoPractico.CasoPractico.repository;

import CasoPractico.CasoPractico.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula,Long> {
    
}
