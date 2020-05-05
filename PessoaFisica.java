<<<<<<< HEAD
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String telefone, String cpf){
        super(nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    @Override
    public String toString(){
        String str = super.toString();
        str = str + "CPF: " + cpf;
        return str;
=======

public class PessoaFisica extends Cliente{
   
    private String cpf = "";
    
    public PessoaFisica(String nome, String telefone, String cpf){
       this.nome = nome;
       this.telefone = telefone;
       this.cpf = cpf;
>>>>>>> 20a6a6114d518f0e7bca0dd96ebd31dea0785862
    }
}