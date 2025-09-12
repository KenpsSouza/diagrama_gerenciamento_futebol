package diagrama_futebol;

public class Main {
    public static void main(String[] args) {
        Time time = new Time("Flamengo", "Rio de Janeiro", 1895, 10);
        
        Tecnico tecnico = new Tecnico("Jorge Jesus", 65, "123.456.789-00", 50000.0, 
                                     20, "Educação Física", 5);
        
        Goleiro goleiro = new Goleiro("Diego Alves", 35, "111.111.111-11", 25000.0, 
                                     "Goleiro", 1, 100, 0, 150, 20);
        
        Atacante atacante = new Atacante("Gabriel Barbosa", 25, "222.222.222-22", 30000.0, 
                                        "Atacante", 9, 95, 25, 80, 15);
        
        time.setTecnico(tecnico);
        time.adicionarJogador(goleiro);
        time.adicionarJogador(atacante);
        
        System.out.println("=== TESTE DO SISTEMA DE FUTEBOL ===");
        System.out.println("Time: " + time.getNome());
        System.out.println("Técnico: " + tecnico.getNome());
        
        System.out.println("\n--- Ações do Técnico ---");
        tecnico.trabalhar();
        
        System.out.println("\n--- Ações do Goleiro ---");
        goleiro.defender();
        goleiro.cobrarTiroDeGol();
        goleiro.verificarChuteiras(); 
        
        System.out.println("\n--- Ações do Atacante ---");
        atacante.finalizar();
        atacante.darAssistencia();
        atacante.driblar(); 
        atacante.verificarChuteiras(); 
        
        System.out.println("\n--- Ações do Time ---");
        time.treinar();
        time.escalarTime();
        
        System.out.println("\n--- Modalidades de Futebol ---");
        FutebolCampo futebolCampo = new FutebolCampo("Campo", 11, 90, "Grama", 7.32);
        futebolCampo.iniciarJogo();
        futebolCampo.cortarGrama(); 
        FutebolSociety society = new FutebolSociety("Society", 7, 50, "Sintética", true);
        society.iniciarJogo();
        
        FutebolAreia areia = new FutebolAreia("Areia", 5, 36, "Praia de Copacabana", "Ensolarado");
        areia.iniciarJogo();
    }
}