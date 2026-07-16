//A palavra-chave 'extends' indica que Camionhao Herda tudo da classe automovel
public class Caminhao extends Automovel{

    //Atributos especificos da subclasse (O automovel comum não possui)
    private double capacidadeCargaDiretriz; //em toneladas
    private int quantidadeEixos;

    //Construtor da subclasse
    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCargaDiretriz , int quantidadeEixos){
        // A palavra 'Super' invoca obrigatoriamente o construtor da classe mãe (Automovel)]
        //para inicializar os atributos herdados
        super(marca, modelo, ano, preco);

        //Inicializa os atributos exclusivos da classe caminhao
        this.capacidadeCargaDiretriz = capacidadeCargaDiretriz;
        this.quantidadeEixos = quantidadeEixos;
    }
    //Metodo exclusivo da subclasse
    public void carregarCarga(double peso){
        if(peso <= this.capacidadeCargaDiretriz){
            System.out.println("O caminhão " + getModelo() + " foi carregado com " + peso + " toneladas.");
        }
        else{
            System.out.println("Alerta de Segurança: Peso de "+ peso + "t excede o limite máximo de " + this.capacidadeCargaDiretriz + "t!");
        }
    }

    //Sobrescrita de Metodo (polimorfirsmo): Vamos adaptar a Ficha Tecnica para o caminhao
    @Override //Esta anotação evisa o compilador que estamos modificando um método que veio da classe mãe
    public void exibirFichaTecnica(){
        //Podemos chamar o comportamento do método original usando codigo abaixo
        super.exibirFichaTecnica();
        //E agora adicionamos as informações especificas cdo caminhao no final
        System.out.println("--- Dados do Transporte Pesado ---");
        System.out.println("Capacidade Maxima: " + this.capacidadeCargaDiretriz + " Toneladas");
        System.out.println("Número de Eixos "+ this.quantidadeEixos);
        System.out.println("====================================\n");
    }

    // Getters e Setters específicos
    public double getCapacidadeCargaDiretriz(){return capacidadeCargaDiretriz; }
    public void setCapacidadeCargaDiretriz(double capacidadeCarga) {this.capacidadeCargaDiretriz = capacidadeCarga;}

    public double getQuantidadeEixos(){return quantidadeEixos; }
    public void setQuantidadeEixos(int eixos) {this.quantidadeEixos = eixos;}

}