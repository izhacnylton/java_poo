public class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.ano = ano;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("O veiculo com placa " + getPlaca() + " e ano " + getAno());
    } 
    
}
