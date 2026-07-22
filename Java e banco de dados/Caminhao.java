// Declaração opcional do pacote de arquivos
//package br.gov.cetam.modelo;

// Declaração da classe Caminhao, que estende a classe abstrata VeiculoCarga
public class Caminhao extends VeiculoCarga {
    // Atributo privado para armazenar a quantidade de eixos do caminhão
    private int qtdEixos;

    // Construtor completo da classe Caminhao
    public Caminhao(String placa, String marca, String modelo, int ano, double valorComercial, double capacidadeCargaToneladas, int qtdEixos) {
        // Invoca o construtor da superclasse VeiculoCarga para inicializar atributos herdados
        super(placa, marca, modelo, ano, valorComercial, capacidadeCargaToneladas);
        // Atribui a quantidade de eixos fornecida ao atributo da classe
        this.qtdEixos = qtdEixos;
    }

    // Sobrescreve o método da interface ControlavelAmbiental para vistoria de gases pesados
    @Override
    public void realizarVistoriaGases() {
        // Exibe mensagem sobre o teste de opacidade da fumaça preta no escapamento
        System.out.println("[Vistoria] Teste de opacidade de fumaça preta no escapamento do Caminhão pesado...");
        // Exibe confirmação de que os níveis de particulados estão dentro do aceitável
        System.out.println("Níveis de particulados aceitáveis.");
    }

    // Sobrescreve o método da interface para emitir o laudo de segurança
    @Override
    public boolean emitirLaudoSeguranca() {
        // Retorna verdadeiro aprovando a emissão do laudo
        return true;
    }

    // Sobrescreve o método abstrato para exibir a ficha técnica específica do caminhão
    @Override
    public void exibirFichaTecnica() {
        // Exibe o título do bloco da ficha técnica
        System.out.println("\n--- Ficha Técnica: Caminhão ---");
        // Imprime a placa e o modelo do caminhão
        System.out.println("Placa: " + getPlaca() + " | Modelo: " + getModelo());
        // Imprime a capacidade de carga em toneladas, quantidade de eixos e o valor comercial
        System.out.println("Capacidade: " + getCapacidadeCargaToneladas() + "t | Eixos: " + qtdEixos + " | Valor: R$" + getValorComercial());
    }
}