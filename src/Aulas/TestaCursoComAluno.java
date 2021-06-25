package Aulas;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {


    public static void main(String[] args) {


        Curso javaColecoes= new Curso("Dominando as coleções do Java ","Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adiciona(new Aula("Criando uma Aula",20));
        javaColecoes.adiciona(new Aula("Modelando com coleções",24));

        Aluno a1 = new Aluno("Rodrigo Turini",3472);
        Aluno a2 = new Aluno("Gulherme Silveira",5617);
        Aluno a3 = new Aluno("Mauricio Aniche",17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);


        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a->{
            System.out.println(a);
        });


        System.out.println("O aluno " + a1 + "esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));


        System.out.println("---------------------------");

        Aluno turini = new Aluno("Rodrigo Turini",3472);
        String nome = "Rodrigo Turini";
        System.out.println("E esse Turini esta Matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("---------------------------");

        System.out.println("O a1 é  == ao Turini? ");
        System.out.println(a1.equals(turini));

        //obrigatoriamente o seguinte é true:
        System.out.println(a1.hashCode()==turini.hashCode());

        System.out.println("------------------");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();

        while(iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }
        Aluno depoisDoUltimo = iterator.next();

//        for (Aluno a :javaColecoes.getAlunos()){
//            System.out.println(a);
//        }
    }
}
