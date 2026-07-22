// Classe abstrata base que representa um veículo terrestre genérico e implementa a interface de controle ambiental
public abstract class VeiculoTerrestre implements ControlavelAmbiental {
    // Atributo privado para armazenar a placa do veículo
    private String placa;
    // Atributo privado para armazenar a marca do fabricante
    private String marca;
    // Atributo privado para armazenar o modelo do veículo
    private String modelo;
    // Atributo privado para armazenar o ano de fabricação
    private int ano;
    // Atributo privado para armazenar o valor comercial do veículo
    private double valorComercial;
    // Atributo privado indicando o estado do motor (ligado = true / desligado = false)
    private boolean motorLigado;

    // Construtor da classe VeiculoTerrestre para inicializar os atributos principais
    public VeiculoTerrestre(String placa, String marca, String modelo, int ano, double valorComercial) {
        // Atribui a placa passada como parâmetro ao atributo da classe
        this.placa = placa;
        // Atribui a marca passada como parâmetro ao atributo da classe
        this.marca = marca;
        // Atribui o modelo passado como parâmetro ao atributo da classe
        this.modelo = modelo;
        // Atribui o ano passado como parâmetro ao atributo da classe
        this.ano = ano;
        // Atribui o valor comercial passado como parâmetro ao atributo da classe
        this.valorComercial = valorComercial;
        // Define o estado inicial do motor como desligado (false)
        this.motorLigado = false;
    }

    // Método público responsável por ligar o motor do veículo
    public void ligarMotor() {
        // Verifica se o motor NÃO está ligado
        if (!this.motorLigado) {
            // Altera o estado do motor para ligado (true)
            this.motorLigado = true;
            // Exibe mensagem informando que o motor foi acionado
            System.out.println(" [" + this.modelo + "] Motor acionado.");
        } else {
            // Exibe mensagem informando que o motor já se encontrava ligado
            System.out.println(" [" + this.modelo + "] O motor já está funcionando.");
        }
    }

    // Método público responsável por desligar o motor do veículo
    public void desligarMotor() {
        // Verifica se o motor está ligado
        if (this.motorLigado) {
            // Altera o estado do motor para desligado (false)
            this.motorLigado = false;
            // Exibe mensagem informando que o motor foi desligado
            System.out.println(" [" + this.modelo + "] Motor desligado.");
        } else {
            // Exibe mensagem informando que o motor já se encontrava desligado
            System.out.println(" [" + this.modelo + "] O motor já está desligado.");
        }
    }

    // Declaração de método abstrato que obriga todas as subclasses a implementarem a exibição da ficha técnica
    public abstract void exibirFichaTecnica();

    // Getters e Setters (Métodos de acesso e modificação dos atributos encapsulados)
    // Método getter para obter a placa do veículo
    public String getPlaca() { return placa; }
    // Método getter para obter a marca do veículo
    public String getMarca() { return marca; }
    // Método getter para obter o modelo do veículo
    public String getModelo() { return modelo; }
    // Método getter para obter o ano de fabricação
    public int getAno() { return ano; }
    // Método getter para obter o valor comercial do veículo
    public double getValorComercial() { return valorComercial; }
    // Método setter para atualizar o valor comercial do veículo
    public void setValorComercial(double valorComercial) { this.valorComercial = valorComercial; }
    // Método getter para verificar o estado atual do motor (ligado/desligado)
    public boolean isMotorLigado() { return motorLigado; }
}