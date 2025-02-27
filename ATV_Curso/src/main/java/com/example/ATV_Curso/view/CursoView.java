package com.example.ATV_Curso.view;

import com.example.ATV_Curso.Controller.CursoController;
import com.example.ATV_Curso.Model.Curso;
import com.example.ATV_Curso.Model.ProfessorMod;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/curso")
public class CursoView {

    CursoController cursoController = new CursoController();

    @GetMapping
    public List<Curso> getAll(@RequestParam(required = false) ProfessorMod professorMod,
                              @RequestParam(required = false) Integer numeroSala) {
        return cursoController.getAll();

//        if (professorMod != null) {
//            return cursoController.getByProfessor(professorMod);
//        } else if (numeroSala != null) {
//            return cursoController.getBySalaAula(numeroSala);
//        } else {
//            return cursoController.getAll();
//        }
    }

    @GetMapping("/{id}")
    public Curso getById(@PathVariable Long id){
        return cursoController.getById(id);
    }

    @PutMapping("/{id}")
    public Curso update(@RequestBody Curso curso, @PathVariable Long id){
        return cursoController.update(id, curso);
    }

    @PostMapping
    public boolean insert (@RequestBody Curso curso){
        return cursoController.insert(curso);
    }

    @DeleteMapping("/{id}")
    public Curso delete(@RequestBody Curso curso, @PathVariable Long id){
        return cursoController.delete(id, curso);
    }
}
