public class Aluno  extends Pessoa{
    private String login;
    public int totAssistido;


    public Aluno(String nome, String sexo, int idade, float experiencia,String login) {
        super(nome, sexo, idade, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString()+
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", experiencia=" + + experiencia +
                '}';
    }
}
