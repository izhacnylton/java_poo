//Herança
//package br.gov.cetam.modelo;

import br.gov.cetam.servico.ControlavelAmbiental;

//A palavra-chave 'extends' liga a classe Carro à classe mãe automovel
public class Carro extends Automovel implements ControlavelAmbiental {
    //Atributos especificos e exclusivos da classe Carro
    //Criar dois novos atributos para a classe Carro
    private int CO_2;
    private String teste;
    private int quantidadePortas;
    private String tipoCarroceria; //ex: Sedan, Hatch, SUV, Cupê

    //Construtor da subclasse Carro
    public Carro(String marca, String modelo, int ano, double preco, int quantidadePortas ,String tipoCarroceria){
        // Envia obrigatoriamente os dados genéricos para o construtor da superclasse (Automovel)
        super(marca, modelo, ano, preco);

        //Inicializa as propriedades que pertence apenas ao Carro
        this.quantidadePortas = quantidadePortas;
        this.tipoCarroceria = tipoCarroceria;

    }

    //Metodo de comportamento exclusivo do Carro de passeio
    public void abrirPortaMalas(){
        System.out.println("O porta malas do " + getModelo() + "(" + this.tipoCarroceria +") foi aberto pelo controle remoto.");
    }

    // Sobrescrita de metodo (polimorfismo): Adaptando a ficha tecnica para as caracteristicas de um carro
    @Override
    public void realizarVistoriaGases(){
        System.out.println("Realizar teste de emissões de CO2 para o carro de passeio ("+ getModelo() + ")...");
        System.out.println("Teste concluido! Baixa emissão de gases poluentes.");
    }

    @Override
    public boolean emitirLaudoSeguranca(){
        System.out.println("Laudo técnico emitido para carro de passeio. ");
        return true;
    }

    @Override
    public void exibirFichaTecnica(){
        //invoca o comportamento padrão escrito de automovel (Evita duplicação de código)
        super.exibirFichaTecnica();

        //adiciona informações específicas do veeiculo de passeio
        System.out.println("\n---Especificações de Veiculo de passeio ---");
        System.out.println("Quantidade de Portas: " + this.quantidadePortas);
        System.out.println("Tipo de Carroceiria: " + this.tipoCarroceria);
        System.out.println("Teste realizado Carro de Passeio: " + this.CO_2);
        System.out.println("teste concluído com sucesso! " + this.teste);
        System.out.println("====================================\n");
    }

    //getter e setter
    public int getQuantidadePortas() {return quantidadePortas;}
    public void setQuantidadePortas(int quantidadePortas) { this.quantidadePortas = quantidadePortas;}

    public String getTipoCarroceria() {return tipoCarroceria;}
    public void setTipoCarroceria(String tipoCarroceria) { this.tipoCarroceria = tipoCarroceria;}

}