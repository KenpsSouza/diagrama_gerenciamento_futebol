package diagrama_futebol;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private int titulos;
    private List<Jogador> jogadores;
    private Tecnico tecnico;
    
    public Time() {
        this.jogadores = new ArrayList<>();
    }
    
    public Time(String nome, String cidade, int anoFundacao, int titulos) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.titulos = titulos;
        this.jogadores = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public int getAnoFundacao() {
        return anoFundacao;
    }
    
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }
    
    public int getTitulos() {
        return titulos;
    }
    
    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
    public List<Jogador> getJogadores() {
        return jogadores;
    }
    
    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
    
    public Tecnico getTecnico() {
        return tecnico;
    }
    
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }
    
    public void removerJogador(Jogador jogador) {
        this.jogadores.remove(jogador);
    }
    
    public void escalarTime() {
        System.out.println("Escalando time " + this.nome);
    }
    
    public void treinar() {
        System.out.println("Time " + this.nome + " está treinando");
    }
}