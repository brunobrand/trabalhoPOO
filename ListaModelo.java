
import java.util.ArrayList;

public class ListaModelo{
    private ArrayList<ModeloAutomovel> modelos;
    private int total = 0;
    private int qtdMax;

    public ListaModelo(int max) {
        this.qtdMax = max;
        modelos = new ArrayList<ModeloAutomovel>(qtdMax);
    }

    public boolean insere(ModeloAutomovel umModelo) {
        modelos.add(umModelo);
        total = total + 1;
        return true;
    }
   
    public boolean remove(String nome) {
        for (int i = 0; i < modelos.size(); i++) {
            ModeloAutomovel umModelo = modelos.get(i);
            String umNome = modelos.get(i).getNome();
            if (nome.equals(umNome)){
                modelos.remove(umModelo);
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
        if (total < 1) System.out.println("Não há modelos cadastrados");
        if (total > 0) {
            String str = " ";
            str = "Lista de modelos:" + "\n";
            for (int i = 0; i < modelos.size(); i++) {
                str = str + modelos.get(i).toString() + "\n" + "//////////////////////";
            }
            System.out.println(str);
        }
    }


}