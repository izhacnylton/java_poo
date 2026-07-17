package br.gov.cetam.modelo.app;
import br.gov.cetam.servico.ControlavelAmbiental;

public class MainHeranca{
    public static void main(String[] args) {
        System.out.println("Sistema integrado da concessionária - Teste de Herança de Veiculos\n");

        //1. Instanciando um caminhao (Subclasse 1)
        Caminhao caminhao1 = new Caminhao("Scania", "R 540", 2024, 720000.00, 80.0, 6);

        //2. Instanciando diferentes Carros de passeio (Subclasse 2)
        //Aqui demonstramos os exemplos de carroceria: SUV, Sedam, Hatch e Cupê
        Carro carro1 = new Carro("Honda", "HR-V", 2024, 160000.00, 4, "SUV");
        Carro carro2 = new Carro("Toyota", "Corolla", 2024, 150000.00, 4, "Sedan");
        Carro carro3 = new Carro("Chevrolet", "Onix", 2023, 85000.00, 4, "Hatch");
        Carro carro4 = new Carro("Porsche", "911 Carrera", 2026, 900000.00, 4, "Cupê");

        //3. Testando interaçoes com os carros (Metodos herdados e exclusivos)
        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro1.realizarVistoriaGases(); //Metodo herdado de automovel
        System.out.println("Laudo aprovado? " + carro1.emitirLaudoSegurança());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro2.realizarVistoriaGases();
        System.out.println("Laudo aprovado? " + carro2.emitirLaudoSegurança());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro3.realizarVistoriaGases();
        System.out.println("Laudo aprovado> " + carro1.emitirLaudoSegurança());

        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS DE PASSEIO ===");
        carro4.realizarVistoriaGases();
        System.out.println("Laudo aprovado> " + carro1.emitirLaudoSegurança());

        //Simulação teste caminhão
        System.out.println("=== VISTORIA AMBIENTAL: VEICULOS PESADOS ===");
        caminhao1.realizarVistoriaGases();
        System.out.println("Laudo aprovado> " + caminhao1.emitirLaudoSegurança());

        carro1.ligarMotor();
        carro1.abrirPortaMalas();

        System.out.println();
        carro3.ligarMotor();
        carro3.atualizarPreco(87000.00); //Metodo herdado de Automovel

        System.out.println();
        carro4.abrirPortaMalas();

        //4. Testando o Caminhao para contrapor com as regras do Carro
        System.out.println("\n=== Interagindo com o Caminhao ===");
        caminhao1.ligarMotor();
        caminhao1.carregarCarga(45.0); //Metodo exclusivo de caminhao

        //5. Exibindo as fichas tecnicas personalizadas (polimorfismo em ação)
        System.out.println("\n=== FICHAS TÉCNICAS DOS CARROS DE PASSEIO ===");
        carro1.exibirFichaTecnica();
        carro2.exibirFichaTecnica();
        carro3.exibirFichaTecnica();
        carro4.exibirFichaTecnica();

        System.out.println("=== FICHA TÉCNICA DO TRANSPORTE PESADO ===");
        caminhao1.exibirFichaTecnica();
    }

    /*5. Arquivo: MainHeranca.java
    No arquivo principal, demonstra como instanciar objetos distintos e enviar mensagens (chamar métodos)
    que modificam o estado de apenas uma instância, provando o conceito de Identidade e independência dos objetos. */
}