import java.util.ArrayList;
public class ListaAutomoveis {
    public ArrayList<Automovel> automoveis;
    private int total = 0;
    private int qtdMax;

    public ListaAutomoveis(int max) {
        this.qtdMax = max;
        automoveis = new ArrayList<Automovel>(qtdMax);
    }

    public void insere(Automovel novoAutomovel) {
        automoveis.add(novoAutomovel);
        total = total + 1;
    }

    public boolean remove(String placa) {
        for (int i = 0; i < automoveis.size(); i++) {
            Automovel umAutomovel = automoveis.get(i);
            String umaPlaca = automoveis.get(i).getPlaca();
            if (placa.equals(umaPlaca)){
                automoveis.remove(umAutomovel);
                total = total - 1;
                return true;
            }
        }
        return false;
    }

    public void mostraTotal(){
        System.out.print(total);
    }

    public void mostra() {
        if (total < 1) System.out.println("Não há automóveis cadastrados");
        if (total > 0) {
            String str = " ";
            str = "Lista de Automóveis:" + "\n";
            for (int i = 0; i < automoveis.size(); i++) {
                str = str + automoveis.get(i).toString() + "\n" + "//////////////////////";
            }
            System.out.println(str);
        }
    }



}