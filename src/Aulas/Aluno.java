package Aulas;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null){
            throw new NullPointerException("Nome nao pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        Aluno outro =(Aluno) o ;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNumeroMatricula());
    }



}
