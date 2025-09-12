package diagrama_futebol;

public class FutebolSociety extends Futebol {
    private String tipoQuadra;
    private boolean tempoExtra;
    
    public FutebolSociety() {
        super();
    }
    
    public FutebolSociety(String modalidade, int numeroJogadores, int duracaoPartida, 
                          String tipoQuadra, boolean tempoExtra) {
        super(modalidade, numeroJogadores, duracaoPartida);
        this.tipoQuadra = tipoQuadra;
        this.tempoExtra = tempoExtra;
    }
    
    // Getters e Setters
    public String getTipoQuadra() {
        return tipoQuadra;
    }
    
    public void setTipoQuadra(String tipoQuadra) {
        this.tipoQuadra = tipoQuadra;
    }
    
    public boolean isTempoExtra() {
        return tempoExtra;
    }
    
    public void setTempoExtra(boolean tempoExtra) {
        this.tempoExtra = tempoExtra;
    }
    
    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando jogo de futebol society");
    }
}