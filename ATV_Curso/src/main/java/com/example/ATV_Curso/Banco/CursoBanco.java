package com.example.ATV_Curso.Banco;

import com.example.ATV_Curso.Model.Curso;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

public class CursoBanco {
    private List<Curso> cursos;

    public CursoBanco() {

        this.cursos = new ArrayList<>();
    }

    public List<Curso> findAll() {
        return new ArrayList<>(cursos);
    }

    public Curso getByINome(String nome){
        return cursos.stream()
                .filter(curso -> curso.getProfessor().getNome().equals(nome))
                .findFirst()
                .orElse(null);
    }

    public List<Curso> getByNumeroSala(int numeroSala) {
        return cursos.stream()
                .filter(cur -> cur.getNumeroSala() == numeroSala)
                .toList();
    }

    public Curso getById(Long id){
        return cursos.stream()
                .filter( curso -> curso.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Curso curso){
        cursos.add(curso);
        return true;
    }


    public Curso update(Long id, Curso curso){
        boolean result = cursos.update(id);

        if(result) {
            return curso;
        }
        return null;
    }

    public Curso delete(Long id, Curso curso){
        boolean result = cursos.delete(id);

        if(result) {
            return curso;
        }
        return null;
    }











}
