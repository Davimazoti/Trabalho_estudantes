package com.example.ATV_Curso.Banco;

import com.example.ATV_Curso.Model.Curso;
import com.example.ATV_Curso.Model.ProfessorMod;
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


    public boolean update(Long id, Curso curso){
        Curso cursoBanco = cursos.stream()
                .filter(f -> f.getId() == id)
                .findFirst()
                .orElse(null);

        if (cursoBanco == null){
            return false;

        }
        cursoBanco.setNome(curso.getNome());
        cursoBanco.setProfessor(curso.getProfessor());
        cursoBanco.setId(curso.getId());
        cursoBanco.setAlunos(curso.getAlunos());
        cursoBanco.setNumeroSala(curso.getNumeroSala());
        return true;
    }

        public boolean delete(Long id){
            Curso cursoBanco = cursos.stream()
                    .filter(f -> f.getId() == id)
                    .findFirst()
                    .orElse(null);

            cursos.remove(cursoBanco);

            return true;
        }











}
