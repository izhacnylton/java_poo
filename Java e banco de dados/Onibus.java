// Declaração da classe Onibus que herda diretamente de VeiculoTerrestre
public class Onibus extends VeiculoTerrestre {
    // Atributo privado para a capacidade total de passageiros
    private int capacidadePassageiros;
    // Atributo privado booleano para identificar se o ônibus é articulado (true/false)
    private boolean articulado;

    // Construtor completo para a classe Onibus
    public Onibus(String placa, String marca, String modelo, int ano, double valorComercial, int capacidadePassageiros, boolean articulado) {
        // Chama o construtor da classe base VeiculoTerrestre
        super(placa, marca, modelo, ano, valorComercial);
        // Define a capacidade de passageiros no atributo local
        this.capacidadePassageiros = capacidadePassageiros;
        // Define o status de ser ou não articulado
        this.articulado = articulado;
    }

    // Sobrescreve o método de vistoria de gases para transporte coletivo
    @Override
    public void realizarVistoriaGases() {
        // Imprime mensagem de teste de opacidade em motorização Diesel de transporte coletivo
        System.out.println("[Vistoria Coletiva] Teste de opacidade para Ônibus Diesel de alta capacidade...");
        // Confirma a aprovação dos filtros catalisadores
        System.out.println("Filtros de partículas catalisadoras validados.");
    }

    // Sobrescreve o método da interface para emitir o laudo de segurança
    @Override
    public boolean emitirLaudoSeguranca() {
        // Retorna verdadeiro aprovando o laudo ambiental do ônibus
        return true;
    }

    // Sobrescreve o método abstrato para exibir a ficha técnica do ônibus
    @Override
    public void exibirFichaTecnica() {
        // Exibe o título da ficha técnica
        System.out.println("\n--- Ficha Técnica: Ônibus de Passageiros ---");
        // Exibe a placa e a capacidade máxima de passageiros
        System.out.println("Placa: " + getPlaca() + " | Capacidade: " + capacidadePassageiros + " passageiros");
        // Exibe se é articulado usando operador ternário (Sim se true, Não se false) e o valor comercial
        System.out.println("Articulado: " + (articulado ? "Sim" : "Não") + " | Valor: R$" + getValorComercial());
    }
}