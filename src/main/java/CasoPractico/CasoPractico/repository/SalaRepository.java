
package CasoPractico.CasoPractico.repository;

import CasoPractico.CasoPractico.entity.Sala;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {
    
}
