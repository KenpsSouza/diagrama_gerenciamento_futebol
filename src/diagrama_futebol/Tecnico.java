package diagrama_futebol;

public class Tecnico extends Pessoa {
    private int experiencia;
    private String formacao;
    private int titulos;
    
    public Tecnico() {
        super();
    }
    
    public Tecnico(String nome, int idade, String cpf, double salario, 
                   int experiencia, String formacao, int titulos) {
        super(nome, idade, cpf, salario);
        this.experiencia = experiencia;
        this.formacao = formacao;
        this.titulos = titulos;
    }
    
    // Getters e Setters
    public int getExperiencia() {
        return experiencia;
    }
    
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    public String getFormacao() {
        return formacao;
    }
    
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public int getTitulos() {
        return titulos;
    }
    
    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
    @Override
    public void trabalhar() {
        System.out.println("Técnico está treinando o time");
    }
}