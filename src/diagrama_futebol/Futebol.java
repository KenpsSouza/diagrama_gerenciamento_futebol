package diagrama_futebol;

public abstract class Futebol {
    private String modalidade;
    private int numeroJogadores;
    private int duracaoPartida;
    
    public Futebol() {}
    
    public Futebol(String modalidade, int numeroJogadores, int duracaoPartida) {
        this.modalidade = modalidade;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
    }
    
    public String getModalidade() {
        return modalidade;
    }
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public int getNumeroJogadores() {
        return numeroJogadores;
    }
    
    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
    
    public int getDuracaoPartida() {
        return duracaoPartida;
    }
    
    public void setDuracaoPartida(int duracaoPartida) {
        this.duracaoPartida = duracaoPartida;
    }
    
    public abstract void iniciarJogo();
}