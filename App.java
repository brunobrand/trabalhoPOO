
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
            System.out.println("Digite 0 para voltar ao menu principal. ");
            System.out.println("Digite 1 para cadastrar novo cliente; ");
            System.out.println("Digite 2 para consultar a disponibilidade de automóvel por categoria; ");
            System.out.println("Digite 3 para consultar o valor de uma locação; ");
            System.out.println("Digite 4 para realizar uma locação; ");
            System.out.println("Digite 5 para finalizar uma locação; ");
            
            int a = in.nextInt();

            switch(a){

               case 1: 

               System.out.println("Digite 1 para cliente pessoa-física; "); 
               System.out.println("Digite 2 para cliente pessoa-júridica; ");
               int pessoa = in.nextInt();
               
               switch(pessoa){
                  
                  case 1: adicionaClientePessoaFisica(lista); break;
         
                  case 2: adicionaClientePessoaJuridica(lista); break;
                  
               }
               break;            

               case 2: consultaPorCategoria(); break; 

               case 3: consultaValorLocacao(); break;
                 
               case 4: realizaLocacao(); break;

               case 5: finalizaLocacao(); break;

               default: System.out.println("Opção inválida. "); break;
            }
            break;
            
         case 2: System.out.println("Bem vindo ao menu do gerente; "); break;          
      }
   }

   private static void adicionaClientePessoaFisica(ListaClientes lista){
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite o nome do(a) cliente: ");
      String nome = in.nextLine(); 
      
      System.out.println("Digite o telefone do(a) cliente: ");
      String telefone = in.nextLine();
                  
      System.out.println("Digite o CPF do(a) cliente: "); 
      String cpf = in.nextLine();
      
      PessoaFisica umaPessoa = new PessoaFisica(nome, telefone, cpf);
      boolean result = lista.insere(umaPessoa);
      if(result){System.out.println("Cliente cadastrado com sucesso ");}
      else System.out.println("Erro ao cadastrar o cliente ");
      
   }

   private static void adicionaClientePessoaJuridica(ListaClientes lista){
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite o nome da empresa: ");
      String nome = in.nextLine(); 
      
      System.out.println("Digite o telefone da empresa: ");
      String telefone = in.nextLine();

      System.out.println("Digite o CNPJ da empresa: ");
      String cnpj = in.nextLine();

      PessoaJuridica umaPessoa = new PessoaJuridica(nome, telefone, cnpj);
      boolean result = lista.insere(umaPessoa);
      if(result){System.out.println("Cliente cadastrado com sucesso ");}
      else System.out.println("Erro ao cadastrar o cliente ");
   }

   private static void consultaPorCategoria(){
      System.out.println("Escolha uma categoria: ");
      
   }

   private static void consultaValorLocacao(){
      System.out.println("teste");

   }

   private static void realizaLocacao(){
      System.out.println("a");
   
   }

   private static void finalizaLocacao(){
      System.out.println("b");

   }
}