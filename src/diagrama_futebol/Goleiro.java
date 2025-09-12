package diagrama_futebol;

public class Goleiro extends Jogador {
    private int defesas;
    private int golsSofridos;
    
    public Goleiro() {
        super();
    }
    
    public Goleiro(String nome, int idade, String cpf, double salario, 
                   String posicao, int numeroCamisa, int energia, int gols,
                   int defesas, int golsSofridos) {
        super(nome, idade, cpf, salario, posicao, numeroCamisa, energia, gols);
        this.defesas = defesas;
        this.golsSofridos = golsSofridos;
    }
    
    public int getDefesas() {
        return defesas;
    }
    
    public void setDefesas(int defesas) {
        this.defesas = defesas;
    }
    
    public int getGolsSofridos() {
        return golsSofridos;
    }
    
    public void setGolsSofridos(int golsSofridos) {
        this.golsSofridos = golsSofridos;
    }
    
    public void defender() {
        System.out.println("Goleiro defendendo o gol");
        this.defesas++;
    }
    
    public void cobrarTiroDeGol() {
        System.out.println("Goleiro cobrando tiro de gol");
    }
}