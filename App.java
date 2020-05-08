
import java.util.Scanner;

public class App {
   public static void main(String args[]){

      ListaClientes listaClientes = new ListaClientes(100); 
      ListaLocacoes listaL = new ListaLocacoes(100); 
      ListaAutomoveis listaAuto = new ListaAutomoveis(100);

      Scanner in = new Scanner(System.in);
      int numero;
      do{
      System.out.println("Digite 0 para sair do programa: ");
      System.out.println("Digite 1 para o menu de funcionarios: ");
      System.out.println("Digite 2 para o menu do gerente: ");
      
      numero = in.nextInt();

      switch(numero){
         
         case 1: selecionaFuncionarios(listaAuto, listaClientes); break;

         case 2: selecionaGerente(listaAuto, listaClientes); break;
      }
      }while(numero!=0);
   }

   public static void selecionaFuncionarios(ListaAutomoveis listaAuto, ListaClientes listaClientes){
      
      
      
      

      Scanner in = new Scanner(System.in);
      
      int opcao;
            do{ 
            System.out.println("Bem vindo ao menu de funcionários; ");
            System.out.println("Digite 0 para voltar ao menu principal. ");
            System.out.println("Digite 1 para cadastrar novo cliente; ");
            System.out.println("Digite 2 para consultar a disponibilidade de automóvel por categoria; ");
            System.out.println("Digite 3 para consultar o valor de uma locação; ");
            System.out.println("Digite 4 para realizar uma locação; ");
            System.out.println("Digite 5 para finalizar uma locação; ");
            
            opcao = in.nextInt();
            
            switch(opcao){

               case 1: 

               System.out.println("Digite 1 para cliente pessoa-física; "); 
               System.out.println("Digite 2 para cliente pessoa-júridica; ");
               int pessoa = in.nextInt();
               
               switch(pessoa){
                  
                  case 1: adicionaClientePessoaFisica(listaClientes); break;
         
                  case 2: adicionaClientePessoaJuridica(listaClientes); break;
                  
               }
               break;            

               case 2: consultaPorCategoria(); break; 

               case 3: 
               System.out.println("Digite a placa do automovel sem o traço: ");
               String placa = in.nextLine();
               break;
                 
               case 4: realizaLocacao(); break;

               case 5: finalizaLocacao(); break;

            }
            break;

            }while(opcao != 0);        
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

   private static void realizaLocacao(){
      System.out.println("a");
   
   }

   private static void finalizaLocacao(){
      System.out.println("b");

   }

   

   private static void selecionaGerente(ListaAutomoveis listaAuto, ListaClientes listaClientes){
      Scanner in = new Scanner(System.in);
      int numero;
      do{
      System.out.println("Digite 0 para retornar à tela anterior: ");
      System.out.println("Digite 1 para cadastrar nova categoria de automóvel: ");
      System.out.println("Digite 2 para cadastrar nova marca de automóvel: ");
      System.out.println("Digite 3 para cadastrar novo modelo de automóvel: ");
      System.out.println("Digite 4 para cadastrar um novo automóvel; ");
      System.out.println("Digite 5 para remover automóvel; ");
      System.out.println("Digite 6 para consultar todas as locações cadastradas: ");
      System.out.println("Digite 7 para consultar todos os clientes cadastrados: ");
      System.out.println("Digite 8 para consultar todos os automóveis cadastrados: ");
      numero = in.nextInt();
      switch(numero){
         case 1: cadastraCategoria(); break;
         case 2:break;
         case 3:break;
         case 4: cadastraAutomovel(listaAuto); break;
         case 5:break;
         case 6:break;
         case 7: consultaClientes(listaClientes); break;
         case 8: consultaAutomoveis(listaAuto); break;
      }
      }while(numero!=0);
   }

   private static void cadastraCategoria(){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o nome da categoria: ");
      String nomeC = in.nextLine();
      CategoriaAutomovel umaCategoria;
      System.out.println("Categoria cadastrada com sucesso. ");
   }

   private static void cadastraAutomovel(ListaAutomoveis lista){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite a placa do automóvel: ");
      String umaPlaca = in.nextLine();
      System.out.println("Digite o ano do automóvel: ");
      int umAno = in.nextInt();
      System.out.println("Digite o valor da diária do automóvel: ");
      double umaDiaria = in.nextDouble(); 
      System.out.println("Digite 1 se o modelo do carro for nacional; ");
      System.out.println("Digite 2 se o modelo do carro for importado; ");
      int modelo = in.nextInt();
      switch(modelo){
         case 1:break;
         case 2:break;
      }
   }

   private static void consultaClientes(ListaClientes lista){
      lista.mostra();
   }

   private static void consultaAutomoveis(ListaAutomoveis lista){
      lista.mostra();
   }
}
   

 

   
   

