import java.util.ArrayList;
public class ListaLocacoes {
    private ArrayList<Locacao> locacoes;
    private int total = 0;
    private int qtdMax;

    public ListaLocacoes(int max) {
        this.qtdMax = max;
        locacoes = new ArrayList<Locacao>(qtdMax);
    }

    public void insere(Locacao novaLocacao) {
        locacoes.add(novaLocacao);
        total = total + 1;
    }

    public void mostraTotal(){
        System.out.print(total);
    }

    public void mostra() {
        if (total < 1) System.out.println("Não há locações ");
        if (total > 0) {
            String str = " ";
            str = "Lista de locações: + \n";
            for (int i = 0; i < locacoes.size(); i++) {
                str = str + locacoes.get(i).toString() + "\n" + "//////////////////////";
            }
            System.out.println(str);
        }
    }
}
