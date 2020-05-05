import java.util.ArrayList;

public class ListaClientes {
    private ArrayList<Cliente> clientes;
    private int total = 0;
    private int qtdMax;

    public ListaClientes(int max) {
        this.qtdMax = max;
        clientes = new ArrayList<Cliente>(qtdMax);
    }

    public void insere(Cliente novoCliente) {
        clientes.add(novoCliente);
        total = total + 1;
    }

    public boolean remove(String nome) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente umCliente = clientes.get(i);
            String umNome = clientes.get(i).getNome();
            if (nome.equals(umNome)){
                clientes.remove(umCliente);
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
        if (total < 1) System.out.print("Não há automóveis cadastrados");
        if (total > 0) {
            String str = " ";
            str = "Lista de Automóveis:" + "\n";
            for (int i = 0; i < clientes.size(); i++) {
                str = str + clientes.get(i).toString() + "\n" + "//////////////////////";
            }
            System.out.println(str);
        }
    }


}
