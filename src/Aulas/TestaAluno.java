package Aulas;

import java.util.*;

public class TestaAluno {


    public static void main(String[] args) {


        Collection<String> alunos = new HashSet<>();       //velocidade de busca de HashSet é muito mais rapida

        //Set - nao temos garantia em qual ordem que os itens estao.
        //Set nao aceita elementos repetidos

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");

        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");  //Nao adiciona um elemento igual
       //System.out.println(alunos);
        alunos.add("Paulo Silveira");



        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");  //todas as classes filha de Collections possuem o metodo cotains, onde retorna um boolean se o valor procurado esta condido ou nao dentro do set
        alunos.remove("Sergio Lopes");

        System.out.println("o aluno esta matriculado: "+pauloEstaMatriculado);

        //Nao existem os metodos get quando usamos o SET
        //Para acessar esses elementos temos que usar o foreach

        for (String aluno: alunos){
            System.out.println(aluno);
        }
        System.out.println("-------------");
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });


        List<String> alunosEmList = new ArrayList<>(alunos);  //no arraylist podemos passar uma collection, desta forma indexamos os valores, sendo possivel realizar mecanimos de get e de sort.

        System.out.println("---------------");
        System.out.println(alunosEmList.get(0));


    }
}
