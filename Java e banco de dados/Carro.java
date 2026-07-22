// Declaração da classe Carro, que herda diretamente da classe abstrata VeiculoTerrestre
public class Carro extends VeiculoTerrestre {
    // Atributo privado para armazenar a quantidade de portas do carro
    private int qtdPortas;
    // Atributo privado para armazenar o porte do veículo (ex: Pequeno, Grande)
    private String porte;
    // Atributo privado para armazenar o tipo de carroceria (ex: Hatch, SUV, Sedan)
    private String tipoCarroceria;

    // Construtor completo da classe Carro
    public Carro(String placa, String marca, String modelo, int ano, double valorComercial, int qtdPortas, String porte, String tipoCarroceria) {
        // Invoca o construtor da superclasse VeiculoTerrestre para configurar atributos herdados
        super(placa, marca, modelo, ano, valorComercial);
        // Define a quantidade de portas do carro
        this.qtdPortas = qtdPortas;
        // Define o porte do carro
        this.porte = porte;
        // Define o tipo de carroceria do carro
        this.tipoCarroceria = tipoCarroceria;
    }

    // Sobrescreve o método de vistoria de gases exigido pela interface ControlavelAmbiental
    @Override
    public void realizarVistoriaGases() {
        // Imprime mensagem simulando a análise de emissões de CO2 considerando o modelo e porte do veículo
        System.out.println("[Vistoria] Analisando emissão de CO2 do Carro " + getModelo() + " (Porte: " + porte + ")...");
        // Imprime o resultado positivo do teste de emissões
        System.out.println("Emissões dentro dos padrões urbanos.");
    }

    // Sobrescreve o método da interface para emitir o laudo de segurança ambiental
    @Override
    public boolean emitirLaudoSeguranca() {
        // Retorna true indicando aprovação no laudo
        return true;
    }

    // Sobrescreve o método abstrato para exibir os dados técnicos do carro
    @Override
    public void exibirFichaTecnica() {
        // Exibe o cabeçalho da ficha técnica do carro
        System.out.println("\n--- Ficha Técnica: Carro de Passeio ---");
        // Exibe a placa e o modelo obtidos via getters herdados, além do porte do veículo
        System.out.println("Placa: " + getPlaca() + " | Modelo: " + getModelo() + " | Porte: " + porte);
        // Exibe a quantidade de portas, tipo de carroceria e o valor comercial
        System.out.println("Portas: " + qtdPortas + " | Carroceria: " + tipoCarroceria + " | Preço: R$" + getValorComercial());
    }
}