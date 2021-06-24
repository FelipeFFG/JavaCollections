package Aulas;

public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }



    @Override
    public String toString() {
        return "{" +
                "Aula='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }


    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);  //delega a comparação para o toString ,desta forma podemos chamar usar o sort em um obejto do tipo aulas
                                                         //que ira comprar os titulos entre os objetos. e retornar os objetos ordenados.
    }
}
