package CasoPractico.CasoPractico.controller;

import CasoPractico.CasoPractico.entity.Sala;
import CasoPractico.CasoPractico.entity.Pelicula;
import CasoPractico.CasoPractico.service.ISalaService;
import CasoPractico.CasoPractico.service.IPeliculaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;    
    
    @GetMapping("/peliculas")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Conciertos");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }
    
    @GetMapping("/peliculasN")
    public String crearPelicula(Model model) {
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("sala", listaSalas);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/peliculas";
    }

    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listSalas = salaService.listSala();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("sala", listSalas);
        return "crear";
    }
    
}
