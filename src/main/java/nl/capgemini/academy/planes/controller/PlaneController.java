package nl.capgemini.academy.planes.controller;

import nl.capgemini.academy.planes.models.Plane;
import nl.capgemini.academy.planes.repository.PlaneRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/plane/")
public class PlaneController {

    private PlaneRepository planeRepository;

    public PlaneController(PlaneRepository planeRepository){
        this.planeRepository = planeRepository;
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Iterable<Plane> getAll(){
        return this.planeRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Plane plane){
        this.planeRepository.save(plane);
    }

    @RequestMapping(value ="delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        this.planeRepository.deleteById(id);
    }

}


