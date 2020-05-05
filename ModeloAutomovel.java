public abstract class ModeloAutomovel {
    private String nome;
    private CategoriaAutomovel categoria;
    private MarcaAutomovel marca;

    public ModeloAutomovel(String nome, MarcaAutomovel marca, CategoriaAutomovel categoria){
        this.nome = nome;
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getNome(){
        return nome;
    }

    public CategoriaAutomovel getCategoria(){
        return categoria;
    }

    public MarcaAutomovel getMarca(){
        return marca;
    }

    public abstract double getValorFixo();

    public abstract String toString();


}