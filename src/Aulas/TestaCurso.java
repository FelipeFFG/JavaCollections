package Aulas;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes= new Curso("Dominando as coleções do Java ","Paulo Silveira");

//        List<Aula> aulas = javaColecoes.getAulas();   //referenciamos a lista de aula do curso ,desta forma podemos adicionar valores dentro da lista
//        System.out.println(aulas);
//
//        aulas.add(new Aula("Trabalhando com ArrayList",21));
//
//        System.out.println(aulas);
//
//        System.out.println(javaColecoes.getAulas());
//        System.out.println(aulas == javaColecoes.getAulas());


//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
//        System.out.println(javaColecoes.getAulas());


        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma Aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",22));

        System.out.println(javaColecoes.getAulas());
    }
}
