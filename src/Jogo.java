public class Jogo {
    String nome;
    String plataforma;
    boolean zerado;
    int nota;

    public Jogo(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.zerado = false;
        this.nota = -1;
    }

    public void zerar(){
        this.zerado = true;
    }

    public void avaliar(int nota){
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
        }
    }

    public String toString(){
        String status = zerado ? "Zerado" : "Em progresso";
        String avaliacao = (nota == -1) ? "Sem nota" : nota + "/10";

        return nome + " | " + plataforma + " | " + status + " | " + avaliacao;
     }
}
