
package CasoPractico.CasoPractico.service;

import CasoPractico.CasoPractico.entity.Sala;
import CasoPractico.CasoPractico.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService implements ISalaService{
    
    @Autowired
    private SalaRepository salaRepository;
    
    @Override
    public List<Sala> listSala(){
        return (List<Sala>) salaRepository.findAll();
    }
    
}
