import java.util.ArrayList;
public class ListaCategoria {
    public ArrayList<CategoriaAutomovel> categorias;
    private int total = 0;
    private int qtdMax;

    public ListaCategoria(int max) {
        this.qtdMax = max;
        categorias = new ArrayList<CategoriaAutomovel>(qtdMax);
    }

    public CategoriaAutomovel pesquisaCategoria(String nome){
        for(int i = 0; i<categorias.size(); i++){
            String umNome = categorias.get(i).getNome();
            if(umNome==nome){
               return categorias.get(i);
            }
        }
        return null;
    }

    public void insere(CategoriaAutomovel novaCategoria) {
        categorias.add(novaCategoria);
        total = total + 1;
    }

    public boolean remove(String nome) {
        for (int i = 0; i < categorias.size(); i++) {
            CategoriaAutomovel umaCategoria = categorias.get(i);
            String umNome = categorias.get(i).getNome();
            if (nome.equals(umNome)){
                categorias.remove(umaCategoria);
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
        if (total < 1) System.out.println("Não há categorias cadastradas");
        if (total > 0) {
            String str = " ";
            str = "Lista de categorias:" + "\n";
            for (int i = 0; i < categorias.size(); i++) {
                str = str + categorias.get(i).toString() + "\n" + "//////////////////////";
            }
            System.out.println(str);
        }
    }



}