
public class Main {
    public static void main(String[] args) {
            Video v[] = new Video[3];
            v[0]= new Video("Aula Báscia de Java para Iniciantes");
            v[1] = new Video("Aula de SQL");
            v[2]= new Video("Aula Java POO");

        Aluno a[]= new Aluno[2];
        a[0]= new Aluno("Roberto","Masculino",28,13f,"robertosimojr23");
        a[1] = new Aluno("Mirella","Feminino",20,15f,"mirellaarce");

        Visualizacao  vis = new Visualizacao(a[0],v[2]);
            System.out.println( vis.toString() );

        /*
        System.out.println(v[0].toString());
        System.out.println(a[0].toString());
        */

    }
}