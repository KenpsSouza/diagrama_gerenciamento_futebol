package diagrama_futebol;

public class FutebolCampo extends Futebol implements Gramado {
    private String tipoCampo;
    private double tamanhoGol;
    
    public FutebolCampo() {
        super();
    }
    
    public FutebolCampo(String modalidade, int numeroJogadores, int duracaoPartida, 
                        String tipoCampo, double tamanhoGol) {
        super(modalidade, numeroJogadores, duracaoPartida);
        this.tipoCampo = tipoCampo;
        this.tamanhoGol = tamanhoGol;
    }
    
    public String getTipoCampo() {
        return tipoCampo;
    }
    
    public void setTipoCampo(String tipoCampo) {
        this.tipoCampo = tipoCampo;
    }
    
    public double getTamanhoGol() {
        return tamanhoGol;
    }
    
    public void setTamanhoGol(double tamanhoGol) {
        this.tamanhoGol = tamanhoGol;
    }
    
    @Override
    public void iniciarJogo() {
        System.out.println("Iniciando jogo de futebol de campo");
    }
    
    @Override
    public void cortarGrama() {
        System.out.println("Cortando a grama do campo");
    }
    
    @Override
    public String verificarCondicao() {
        return "Campo em boas condições";
    }
    
    @Override
    public void adubarGramado() {
        System.out.println("Adubando o gramado do campo");
    }
}