
package diagrama_futebol;

public class Atacante extends Jogador implements Habilidades {
    private int finalizacoes;
    private int assistencias;
    
    public Atacante() {
        super();
    }
    
    public Atacante(String nome, int idade, String cpf, double salario, 
                    String posicao, int numeroCamisa, int energia, int gols,
                    int finalizacoes, int assistencias) {
        super(nome, idade, cpf, salario, posicao, numeroCamisa, energia, gols);
        this.finalizacoes = finalizacoes;
        this.assistencias = assistencias;
    }
    
    
    public int getFinalizacoes() {
        return finalizacoes;
    }
    
    public void setFinalizacoes(int finalizacoes) {
        this.finalizacoes = finalizacoes;
    }
    
    public int getAssistencias() {
        return assistencias;
    }
    
    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }
    
    public void finalizar() {
        System.out.println("Atacante finalizando ao gol");
        this.finalizacoes++;
    }
    
    public void darAssistencia() {
        System.out.println("Atacante dando assistência");
        this.assistencias++;
    }
    
    @Override
    public void driblar() {
        System.out.println("Atacante está driblando");
    }
    
    @Override
    public void passar() {
        System.out.println("Atacante está passando a bola");
    }
    
    @Override
    public void cabecear() {
        System.out.println("Atacante está cabeceando");
    }
}