// Declaração da classe Motocicleta que herda diretamente de VeiculoTerrestre
public class Motocicleta extends VeiculoTerrestre {
    // Atributo privado para armazenar as cilindradas da motocicleta
    private int cilindradas;
    // Atributo privado para armazenar o tipo de partida (ex: Elétrica, Pedal)
    private String tipoPartida;

    // Construtor completo da classe Motocicleta
    public Motocicleta(String placa, String marca, String modelo, int ano, double valorComercial, int cilindradas, String tipoPartida) {
        // Invoca o construtor da superclasse VeiculoTerrestre
        super(placa, marca, modelo, ano, valorComercial);
        // Atribui o valor de cilindradas ao atributo local
        this.cilindradas = cilindradas;
        // Atribui o tipo de partida ao atributo local
        this.tipoPartida = tipoPartida;
    }

    // Sobrescreve o método de vistoria ambiental adaptado para motocicletas
    @Override
    public void realizarVistoriaGases() {
        // Exibe mensagem de teste de ruído e emissão com base na cilindrada da moto
        System.out.println("[Vistoria] Teste de ruído e gases para motocicleta de " + cilindradas + " cilindradas...");
        // Exibe resultado atestando a conformidade do escapamento
        System.out.println("Escape esportivo/original em conformidade com as normas.");
    }

    // Sobrescreve o método da interface para emitir o laudo ambiental
    @Override
    public boolean emitirLaudoSeguranca() {
        // Retorna true indicando aprovação da moto
        return true;
    }

    // Sobrescreve o método para exibir os dados técnicos da motocicleta
    @Override
    public void exibirFichaTecnica() {
        // Exibe cabeçalho da ficha técnica
        System.out.println("\n--- Ficha Técnica: Motocicleta ---");
        // Exibe placa, modelo e cilindradas da moto
        System.out.println("Placa: " + getPlaca() + " | Modelo: " + getModelo() + " (" + cilindradas + "cc)");
        // Exibe o tipo de partida e valor comercial da moto
        System.out.println("Partida: " + tipoPartida + " | Valor: R$" + getValorComercial());
    }
}