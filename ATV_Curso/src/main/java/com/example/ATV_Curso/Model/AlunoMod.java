package com.example.ATV_Curso.Model;

import java.util.ArrayList;

public class AlunoMod {

    private Long id;
    private String nome;
    private ArrayList<Aluno> aluno;

    public AlunoMod(Long id, String nome, ArrayList<Aluno> aluno){
        this.id = id;
        this.nome = nome;
        this.aluno = aluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }
}
