
public class PessoaJuridica extends Cliente {
   
    private String cnpj = "";
    
    public PessoaJuridica(String nome, String telefone, String cnpj){
        this.nome = nome;
        this.telefone = telefone;
        this.cnpj = cnpj;
     }
}