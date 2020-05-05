
import java.util.Scanner;

public class App {
   public static void main(String args[]){
      
      ListaClientes lista = new ListaClientes(100);
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite 1 para o menu de funcionarios: ");
      System.out.println("Digite 2 para o menu do gerente: ");
      
      int numero = in.nextInt();

      switch(numero){
         case 1:
            System.out.println("Bem vindo ao menu de funcionários; ");
            System.out.println("Digite 1 para cadastrar novo cliente; ");
            System.out.println("Digite 2 para consultar a disponibilidade de automóvel por categoria; ");
            System.out.println("Digite 3 para consultar o valor de uma locação; ");
            System.out.println("Digite 4 para realizar uma locação; ");
            System.out.println("Digite 5 para finalizar uma locação; ");
            int a = in.nextInt();
            switch(a){
               case 1: 
                  
                  System.out.println("Digite o nome do(a) cliente: ");
                  String nome = null;
                  nome = in.nextLine();
                  
                  if(nome!=null){

                     System.out.println("Digite o telefone do(a) cliente: ");
                     String telefone = null;
                     telefone = in.nextLine();
                  
                     if(telefone!=null){
                  
                        System.out.println("Digite 1 para cliente pessoa-física; "); 
                        System.out.println("Digite 2 para cliente pessoa-júridica; ");
                        int pessoa = in.nextInt();
                  
                        switch(pessoa){
                           case 1: 
                           System.out.println("Insira o CPF do(a) cliente: ");
                           String cpf = in.nextLine();   
                           if(cpf!=null){
                           PessoaFisica umCliente = new PessoaFisica(nome, telefone, cpf);
                           lista.insere(umCliente);
                           System.out.println("Cliente adicionado com sucesso. ");
                           }
                           break;
                  
                           case 2: 
                           System.out.println("Insira o CNPJ da empresa: ");
                           String cnpj = in.nextLine();
                           if(cnpj!=null){
                           PessoaJuridica umClienteJ = new PessoaJuridica(nome, telefone, cnpj);
                           lista.insere(umClienteJ);
                           System.out.println("Cliente adicionado com sucesso. ");
                           }
                           break;
                  }
                  }
               }
               case 2: break;
               case 3: break;
               case 4: break;
               case 5: break;
            }
            break;
         case 2:
            System.out.println("Bem vindo ao menu do gerente; ");
            break;
      }


   }

}