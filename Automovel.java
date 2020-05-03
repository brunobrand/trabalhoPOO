public class Automovel {
    private String placa;
    private int ano;
    private double valorDiaria;
    private boolean disponivel = true;

    public Automovel(String placa, int ano, double valorDiaria){
        this.placa = placa;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
    }

    public void setDisponivel(int d){
        if (d==1) disponivel = true;
        else disponivel = false;
    }

    public double getValorDiaria(){
        return valorDiaria;
    }

    public String toString(){
        return "Placa: " + placa + "\n" + "Ano: " + ano + "\n" + "Valor Diária: " + valorDiaria
                + "\n" + "Disponibilidade: " + disponivel;
    }

}