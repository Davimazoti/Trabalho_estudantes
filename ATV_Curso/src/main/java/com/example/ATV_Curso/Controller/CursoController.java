package com.example.ATV_Curso.Controller;

import com.example.ATV_Curso.Model.ProfessorMod;

import java.util.List;

public class CursoController {

    CursoBd repository = new CursoBd();

    //Buscar Todos
    public List<Curso> getAll(){
        return repository.findAll();
    }

    //Buscar por ID
    public Curso getById(Long id){
        return repository.getById(id);
    }

    //Enviar
    public boolean insert(Curso curso){
        return repository.insert(curso);
    }

    //Atualizar
    public Curso update(Long id, Curso curso){
        boolean result = repository.update(id, curso);

        if(result) {
            return curso;
        }
        return null;
    }

    //Delete
    public Curso delete(Long id, Curso curso){
        boolean result = repository.delete(id);

        if (result) {
            return curso;

        }
        return null;
    }

    //Buscar através Professor
    public List<Curso> getByProfessor(ProfessorMod professor){
        return repository.getByProfessor(professor);
    }

    //Buscar através da Sala de Aula
    public List<Curso> getBySalaAula(int numeroSala){
        return repository.getBySalaAula(numeroSala);
    }

    //Adicionar aluno num curso já existente

}
