public class Locacao {
    private Cliente cliente;
    private Automovel automovel;
    private double valor = 0;
    private int periodo;

    public Locacao(Cliente cliente, Automovel automovel, int periodo){
        this.cliente = cliente;
        this.automovel = automovel;
    }

    public double getValorLocacao(){
        valor = (automovel.getModelo().getValorFixo()/1000) + (automovel.getValorDiaria() * periodo);
        return valor;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Automovel getAutomovel(){
        return automovel;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String toString(){
        return "Cliente: " + cliente.getNome() + "\n" +
                "Automóvel: " + automovel.toString() + "\n" +
                "Valor: " + valor;
    }


}