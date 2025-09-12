package diagrama_futebol;

public class FutebolAreia extends Futebol {
    private String tipoPraia;
    private String condicaoTempo;
    
    public FutebolAreia() {
        super();
    }
    
    public FutebolAreia(String modalidade, int numeroJogadores, int duracaoPartida, 
                        String tipoPraia, String condicaoTempo) {
        super(modalidade, numeroJogadores, duracaoPartida);
        this.tipoPraia = tipoPraia;
        this.condicaoTempo = condicaoTempo;
    }
    
    // Getters e Setters
    public String getTipoPraia() {
        return tipoPraia;
    }
    
    public void setTipoPraia(String tipoPraia) {
        this.tipoPraia = tipoPraia;
    }
    
    public String getCondicaoTempo() {
        return condicaoTempo;
    }
    
    public void setCondicaoTempo(String condicaoTempo) {
        this.condicaoTempo = condicaoTempo;
    }
    
    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando jogo de futebol de areia");
    }
}