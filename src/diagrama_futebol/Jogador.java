package diagrama_futebol;

public class Jogador extends Pessoa implements Equipamentos {
    private String posicao;
    private int numeroCamisa;
    private int energia;
    private int gols;
    
    public Jogador() {
        super();
    }
    
    public Jogador(String nome, int idade, String cpf, double salario, 
                   String posicao, int numeroCamisa, int energia, int gols) {
        super(nome, idade, cpf, salario);
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
        this.energia = energia;
        this.gols = gols;
    }
    
    public String getPosicao() {
        return posicao;
    }
    
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    public int getNumeroCamisa() {
        return numeroCamisa;
    }
    
    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    
    public int getEnergia() {
        return energia;
    }
    
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public int getGols() {
        return gols;
    }
    
    public void setGols(int gols) {
        this.gols = gols;
    }
    
    @Override
    public void trabalhar() {
        System.out.println("Jogador está treinando e jogando");
    }
    
    @Override
    public void verificarChuteiras() {
        System.out.println("Jogador verificando suas chuteiras");
    }
    
    @Override
    public void trocarUniforme() {
        System.out.println("Jogador trocando uniforme");
    }
    
    @Override
    public void usarCaneleiras() {
        System.out.println("Jogador usando caneleiras");
    }
}