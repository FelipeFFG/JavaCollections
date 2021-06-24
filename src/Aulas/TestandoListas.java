package Aulas;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com Cursos e Sets";


        ArrayList<String> aulas = new ArrayList();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);                 // ele ja chama a toString.

        aulas.remove(0);


        System.out.println(aulas);

        for(String aula : aulas){           //para cada String aula dentro de aulas.
            System.out.println("Aula: " + aula);
        }

        String priemiraAula = aulas.get(0);
        System.out.println("Aprimeira aula é: " + priemiraAula);



        for (int i=0;i<aulas.size(); i++){
            System.out.println("Aula: "+ aulas.get(i));
        }


        System.out.println("Tamanho da lista: "+aulas.size());

        //forma de percorrer uma lista mais adequada de fazer um for
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aulas: " + aula);
        });

        //Ordenação
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);  //ordena pelas strings, desta forma ele ordena em ordem aufabetica automaticamento.
        Collections.sort(aulas);

        System.out.println("Depois de ordenado");
        System.out.println(aulas);
    }
}
