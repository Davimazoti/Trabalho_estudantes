package com.example.ATV_Curso.Model;

import java.util.ArrayList;

public class Curso {
  private Long id;
  private String nome;
  private int numeroSala;
  private ArrayList<AlunoMod> alunos;
  private ProfessorMod professor;

    public Curso(Long id, String nome, int numeroSala, ArrayList<AlunoMod> alunos, ProfessorMod professor) {
        this.id = id;
        this.nome = nome;
        this.numeroSala = numeroSala;
        this.alunos = alunos;
        this.professor = professor;
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

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public ArrayList<AlunoMod> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<AlunoMod> alunos) {
        this.alunos = alunos;
    }

    public ProfessorMod getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorMod professor) {
        this.professor = professor;
    }
}
