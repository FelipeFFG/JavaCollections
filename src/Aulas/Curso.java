package Aulas;
import java.util.*;

public class Curso {


    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();   //Usamos a LIST para melhorar a implemetacao do codigo, de forma que quando quisermos trocar o tipo da lista
                                                        //Possamos fazer isso sem precisar trocar o codigo inteiro, ja que List abrange todos os tipos de lista.
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    private Set<Aluno> alunos = new LinkedHashSet<>();

    private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public String getNome() {
        return nome;
    }


    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);   //passadno essa collectios  nao é mais possivel modificar a lista, achamando .getAulas.add(), pois get aulas agora retorna uma lista imutavel
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);

    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(),aluno);   //linkamos a matricula com o objeto aluno adicionamos detro do hashmap
    }




    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
        //return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: "+ nome+", tempo total: " + this.getTempoTotal()+ ", aulas: "+this.aulas+"]";   //aulas chama o toString das aulas e printa as informcoes das aulas.
    }


    public boolean estaMatriculado(Aluno a1) {
       return this.alunos.contains(a1);
    }

    public Aluno buscaMatriculado(int numero) {
        if (!matriculaParaAluno.containsKey(numero)){
            throw new NoSuchElementException();
        }
        return matriculaParaAluno.get(numero);   //utiliza tabela de espalhamento.Desta forma ele consegue realizar a busca muito rapida.
    }
}
