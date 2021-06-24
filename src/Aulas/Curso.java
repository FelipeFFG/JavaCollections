package Aulas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {


    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();   //Usamos a LIST para melhorar a implemetacao do codigo, de forma que quando quisermos trocar o tipo da lista
                                                        //Possamos fazer isso sem precisar trocar o codigo inteiro, ja que List abrange todos os tipos de lista.


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
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
}
