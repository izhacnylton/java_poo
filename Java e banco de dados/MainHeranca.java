// Declaração da classe principal que executa o sistema
public class MainHeranca {
    // Método principal (main) onde o programa Java inicia sua execução
    public static void main(String[] args) {
        // Imprime no console o cabeçalho informando o início do sistema
        System.out.println("INICIANDO O SISTEMA INTEGRADO DE CONCESSIONÁRIA E VISTORIA");

        // Instancia um Carro pequeno e armazena numa referência polimórfica do tipo VeiculoTerrestre
        VeiculoTerrestre carroPequeno = new Carro("PHA-1E24", "Chevrolet", "Onix", 2023, 85000.00, 4, "Pequeno", "Hatch");
        // Instancia um Carro grande/SUV armazenado em uma referência do tipo VeiculoTerrestre
        VeiculoTerrestre carroGrande = new Carro("PHB-5F45", "Toyota", "SW4", 2025, 380000.00, 4, "Grande", "SUV");
        // Instancia um Ônibus metropolitano em uma referência do tipo VeiculoTerrestre
        VeiculoTerrestre onibusMetropolitano = new Onibus("PHC-9C81", "Mercedes-Benz", "Torino", 2024, 620000.00, 48, false);
        // Instancia uma Motocicleta em uma referência do tipo VeiculoTerrestre
        VeiculoTerrestre motoUrbana = new Motocicleta("PHD-4G12", "Honda", "CG 160", 2024, 18000.00, 160, "Elétrica");
        // Instancia um Caminhão pesado em uma referência do tipo VeiculoTerrestre
        VeiculoTerrestre caminhaoCacamba = new Caminhao("PHE-7H89", "Scania", "R 540", 2025, 750000.00, 80.0, 6);

        // Agrupa todas as instâncias de veículos em um vetor (array) polimórfico de tipo VeiculoTerrestre
        VeiculoTerrestre[] frota = {carroPequeno, carroGrande, onibusMetropolitano, motoUrbana, caminhaoCacamba};

        // Imprime o cabeçalho do primeiro bloco de testes
        System.out.println("\n=== ETAPA 1: TESTE DOS MOTORES ===");
        // Percorre cada elemento do array 'frota' usando um laço for-each
        for (VeiculoTerrestre v : frota) {
            // Executa o método ligarMotor() no veículo atual da iteração
            v.ligarMotor();
        }

        // Imprime o cabeçalho do segundo bloco de testes
        System.out.println("\n=== ETAPA 2: INSPEÇÃO AMBIENTAL ===");
        // Percorre cada elemento do array 'frota' novamente
        for (VeiculoTerrestre v : frota) {
            // Executa polimorficamente o método realizarVistoriaGases() específico de cada tipo de veículo
            v.realizarVistoriaGases();
        }

        // Imprime o cabeçalho do terceiro bloco de testes
        System.out.println("\n=== ETAPA 3: EMISSÃO DE FICHAS TÉCNICAS ===");
        // Percorre cada elemento do array 'frota'
        for (VeiculoTerrestre v : frota) {
            // Executa polimorficamente o método exibirFichaTecnica() específico de cada classe filha
            v.exibirFichaTecnica();
        }
    }
}