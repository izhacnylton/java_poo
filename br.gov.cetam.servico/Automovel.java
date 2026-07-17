package br.gov.cetam.modelo;

public abstract class Automovel{ //Nome da classe
    //Atributos recebem o tipo de dado e o nome do atributo
    //Programacao orientada a objetos, Encapsulamento, Abstarcao, herança, polimorfismo
    private String marca; // Visibiliadde encapsulamento publica e privativa
    private String modelo;
    private int ano;
    private double preco;
    boolean motorLigado;

        //2.construtor da classe Automovel
    public Automovel(String marca, String modelo, int ano, double preco){ //Construtor
        this.marca = "Fiat";
        this.modelo = "Mobi";
        this.ano = 2015;
        this.preco = 11000;
        this.motorLigado = false; //atributo booleano recebe false
    }

        //3. metodos de comportamento da classe Automovel
    public void ligarMotor(){
        if(!this.motorLigado){
            this.motorLigado = true;
            System.out.println("O motor do " + this.modelo + " foi ligado!");
        }
        else{
            System.out.println("O motor do " + this.modelo + " já está ligado!");
        }
    }

    public void desligarMotor(){
        if(!this.motorLigado){
            this.motorLigado = false;
            System.out.println("O motor do " + this.modelo + " já está ligado!");
        }
        else{
            System.out.println("O motor do " + this.modelo + " foi ligado!");
        }
    }

    public void atualizarPreco(double novoPreco){
        if(novoPreco > 0){
            this.preco = novoPreco;
            System.out.println("O preço do " + this.modelo + " foi atualizado para R$" + this.preco);
        }
        else{
            System.out.println("Preço inválido inserido. Digite um valor maior que zero.");
        }
    }

    public void exibirFichaTecnica(){
        System.out.println("\n======================");
        System.out.println("   Ficha Técnica - Veículo");
        System.out.println("\n======================");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estado do Motor: " + this.motorLigado);
    }

    //4. metodos Getters e Setters
    public String getMarca(){ return this.marca; }
    public void setMarca(String marca){ this.marca = marca; }

    public String getModelo(){ return this.modelo; }
    public void setModelo(String modelo){ this.modelo = modelo; }

    public int getAno(){ return this.ano; }
    public void setAno(int ano){ this.ano = ano; }

    public double getPreco(){ return this.preco; }
    public void setPreco(double preco){ this.preco = preco; }

}