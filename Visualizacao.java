public class Visualizacao {
    private Aluno espectador;
    private Video filme;

    this.espectador;
    this.filme;


    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String  toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
    public void avaliar(){
        this.filme.setAvaliacao(5);

    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);

    }
    public void avaliar(float porc){
        int tot=0;
        if (porc <= 20){
            tot=3;
        } else if (porc <= 50) {
        }else if (porc <= 90) {
        }else {
            tot=10;
            
        }
        this.filme.setAvaliacao(tot);
    }
}
