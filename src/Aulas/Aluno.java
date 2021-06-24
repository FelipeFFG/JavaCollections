package Aulas;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String noem, int numeroMatricula) {
        this.nome = noem;
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
}
