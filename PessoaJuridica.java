<<<<<<< HEAD
public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String telefone, String cnpj){
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    public String getCpf(){
        return cnpj;
    }

    @Override
    public String toString(){
        String str = super.toString();
        str = str + "CNPJ: " + cnpj;
        return str;
    }
}
=======

public class PessoaJuridica extends Cliente {
   
    private String cnpj = "";
    
    public PessoaJuridica(String nome, String telefone, String cnpj){
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
     }
}
>>>>>>> 20a6a6114d518f0e7bca0dd96ebd31dea0785862
