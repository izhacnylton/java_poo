public class MainHeranca{
    public static void main(String[] args) {
        System.out.println("Sistema integrado da concessionária - Teste de Herança de Veiculos\n");

        //1. Instanciando um caminhao (Subclasse 1)
        Caminhao caminhaoGrande = new Caminhao("Scania", "R 540", 2024, 720000.00, 80.0, 6);

        //2. Instanciando diferentes Carros de passeio (Subclasse 2)
        //Aqui demonstramos os exemplos de carroceria: SUV, Sedam, Hatch e Cupê
        Carro carroSUV = new Carro("Honda", "HR-V", 2024, 160000.00, 4, "SUV");
        Carro carroSedan = new Carro("Toyota", "Corolla", 2024, 150000.00, 4, "Sedan");
        Carro carroHatch = new Carro("Chevrolet", "Onix", 2023, 85000.00, 4, "Hatch");
        Carro carroCupe = new Carro("Porsche", "911 Carrera", 2026, 900000.00, 4, "Cupê");

        //3. Testando interaçoes com os carros (Metodos herdados e exclusivos)
        System.out.println("=== Interagindo com os Carros ===");

        carroSUV.ligarMotor(); //Metodo herdado de automovel
        carroSUV.abrirPortaMalas(); //Metodo exclusivo de Carro

        System.out.println();
        carroHatch.ligarMotor();
        carroHatch.atualizarPreco(87000.00); //Metodo herdado de Automovel

        System.out.println();
        carroCupe.abrirPortaMalas();

        //4. Testando o Caminhao para contrapor com as regras do Carro
        System.out.println("\n=== Interagindo com o Caminhao ===");
        caminhaoGrande.ligarMotor();
        caminhaoGrande.carregarCarga(45.0); //Metodo exclusivo de caminhao

        //5. Exibindo as fichas tecnicas personalizadas (polimorfismo em ação)
        System.out.println("\n=== FICHAS TÉCNICAS DOS CARROS DE PASSEIO ===");
        carroSUV.exibirFichaTecnica();
        carroSedan.exibirFichaTecnica();
        carroHatch.exibirFichaTecnica();
        carroCupe.exibirFichaTecnica();

        System.out.println("=== FICHA TÉCNICA DO TRANSPORTE PESADO ===");
        caminhaoGrande.exibirFichaTecnica();
    }

    /*5. Arquivo: MainHeranca.java
    No arquivo principal, demonstra como instanciar objetos distintos e enviar mensagens (chamar métodos)
    que modificam o estado de apenas uma instância, provando o conceito de Identidade e independência dos objetos. */
}