package com.example.ATV_Curso.Banco;

import com.example.ATV_Curso.Model.Curso;

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



}
