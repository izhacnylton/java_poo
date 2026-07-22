// Classe abstrata que estende VeiculoTerrestre e representa veículos voltados ao transporte de carga
public abstract class VeiculoCarga extends VeiculoTerrestre {
    // Atributo privado para armazenar a capacidade de carga em toneladas
    private double capacidadeCargaToneladas;

    // Construtor da classe VeiculoCarga recebendo dados do veículo e sua capacidade de carga
    public VeiculoCarga(String placa, String marca, String modelo, int ano, double valorComercial, double capacidadeCargaToneladas) {
        // Invoca o construtor da superclasse (VeiculoTerrestre) para inicializar os atributos herdados
        super(placa, marca, modelo, ano, valorComercial);
        // Atribui a capacidade de carga passada como parâmetro ao atributo local
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    // Método getter público que retorna a capacidade de carga em toneladas
    public double getCapacidadeCargaToneladas() { return capacidadeCargaToneladas; }
}