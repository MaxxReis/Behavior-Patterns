package aluno;

import interfaces.IAgregavel;

public class Aluno implements IAgregavel{
    private String nome;
    private String sexo;
    private String turma;
    private double media;
    
    public Aluno(String nome, String sexo, String turma, double media){
        this.nome = nome;
        this.sexo = sexo;
        this.turma = turma;
        this.media = media;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getTurma() {
        return this.turma;
    }

    public double getMedia() {
        return this.media;
    }

    @Override
    public String nome() {
        return this.getNome();
    }
    
    public String sexo() {
        return this.getSexo();
    }
}
