package br.gov.cetam.modelo;
import br.gov.cetam.servico.ControlavelAmbiental;

//A palavra-chave 'extends' indica que Camionhao Herda tudo da classe automovel
public class Caminhao extends Automovel implements ControlavelAmbiental {

    //Atributos especificos da subclasse (O automovel comum não possui)
    private double capacidadeCarga; //em toneladas
    private int quantidadeEixos;

    //Construtor da subclasse
    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga , int quantidadeEixos){
        // A palavra 'Super' invoca obrigatoriamente o construtor da classe mãe (Automovel)]
        //para inicializar os atributos herdados
        super(marca, modelo, ano, preco);

        //Inicializa os atributos exclusivos da classe caminhao
        this.capacidadeCarga = capacidadeCarga;
        this.quantidadeEixos = quantidadeEixos;
    }
    //Metodo exclusivo da subclasse
    public void carregarCarga(double peso){
        if(peso <= this.capacidadeCarga){
            System.out.println("O caminhão " + getModelo() + " foi carregado com " + peso + " toneladas.");
        }
        else{
            System.out.println("Alerta de Segurança: Peso de "+ peso + "t excede o limite máximo de " + this.capacidadeCarga + "t!");
        }
    }

    //Sobrescrita de Metodo (polimorfirsmo): Vamos adaptar a Ficha Tecnica para o caminhao
    @Override //Esta anotação evisa o compilador que estamos modificando um método que veio da classe mãe
    public void exibirFichaTecnica(){
        //Podemos chamar o comportamento do método original usando codigo abaixo
        super.exibirFichaTecnica();
        //E agora adicionamos as informações especificas cdo caminhao no final
        System.out.println("--- Dados do Transporte Pesado ---");
        System.out.println("Capacidade Maxima: " + this.capacidadeCarga + " Toneladas");
        System.out.println("Número de Eixos "+ this.quantidadeEixos);
        System.out.println("====================================\n");
    }

    // Getters e Setters específicos
    public double getCapacidadeCarga(){return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) {this.capacidadeCarga = capacidadeCarga;}

    public double getQuantidadeEixos(){return quantidadeEixos; }
    public void setQuantidadeEixos(int eixos) {this.quantidadeEixos = eixos;}

}