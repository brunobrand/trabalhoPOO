
import java.util.Scanner;

public class App {
   public static void main(String args[]){

      ListaClientes listaClientes = new ListaClientes(100); 
      ListaLocacoes listaLocacao = new ListaLocacoes(100); 
      ListaAutomoveis listaAutomoveis = new ListaAutomoveis(100);
      ListaCategoria listaCategoria = new ListaCategoria(100);
      ListaMarca listaMarca = new ListaMarca(100);
      ListaModelo listaModelo = new ListaModelo(100);
      
      Scanner in = new Scanner(System.in);
      int numero;
      do{
      System.out.println("Digite 0 para sair do programa: ");
      System.out.println("Digite 1 para o menu de funcionarios: ");
      System.out.println("Digite 2 para o menu do gerente: ");
      
      numero = in.nextInt();

      switch(numero){
         
         case 1: selecionaFuncionarios(listaAutomoveis, listaClientes, listaLocacao, listaCategoria); break;

         case 2: selecionaGerente(listaAutomoveis, listaClientes, listaCategoria, listaMarca, listaModelo, listaLocacao); break;
      }
      }while(numero!=0);
   }

   public static void selecionaFuncionarios(ListaAutomoveis listaAutomoveis, ListaClientes listaClientes, ListaLocacoes listaLocacao, ListaCategoria listaCategoria){
      
      
      
      

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

               case 2: consultaPorCategoria(listaCategoria, listaAutomoveis); break;
               case 3: consultaValorLocacao(listaLocacao); break; 
               case 4: realizaLocacao(listaLocacao); break;
               case 5: finalizaLocacao(listaLocacao); break;

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
      System.out.println("//////////////////////////////////////");


      
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
      System.out.println("//////////////////////////////////////");
      
   }

   private static void consultaPorCategoria(ListaCategoria listaCategoria, ListaAutomoveis listaAutomoveis){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o nome da categoria: ");
      String categoria = in.nextLine();
      CategoriaAutomovel umaCategoria = listaCategoria.pesquisaCategoria(categoria);
      
      
   }
   
   private static void consultaValorLocacao(ListaLocacoes listaLocacao){
      Scanner in = new Scanner(System.in);
      System.out.println("A");
   }

   private static void realizaLocacao(ListaLocacoes listaLocacao){
      Scanner in = new Scanner(System.in);
      System.out.println("a");
   
   }

   private static void finalizaLocacao(ListaLocacoes listaLocacoes){
      System.out.println("b");

   }

   

   private static void selecionaGerente(ListaAutomoveis listaAutomoveis, ListaClientes listaClientes, ListaCategoria listaCategoria, ListaMarca listaMarca, ListaModelo listaModelo, ListaLocacoes listaLocacao){
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
      System.out.println("//////////////////////////////////////");
      numero = in.nextInt();
      switch(numero){
         case 1: cadastraCategoria(listaCategoria); break;
         case 2: cadastraMarca(listaMarca); break;
         case 3: cadastraModelo(listaModelo, listaCategoria, listaMarca); break;
         case 4: cadastraAutomovel(listaModelo, listaAutomoveis); break;
         case 5: removeAutomovel(listaAutomoveis) ;break;
         case 6: consultaLocacoes(listaLocacao); break;
         case 7: consultaClientes(listaClientes); break;
         case 8: consultaAutomoveis(listaAutomoveis); break;
      }
      }while(numero!=0);
   }

   private static void cadastraCategoria(ListaCategoria listaCategoria){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o nome da categoria: ");
      String nomeC = in.nextLine();
      CategoriaAutomovel umaCategoria = new CategoriaAutomovel(nomeC);
      if(listaCategoria.pesquisaCategoriaBoolean(nomeC)){
         System.out.println("Categoria já existente. ");
      }
      else if(listaCategoria.insere(umaCategoria))System.out.println("Categoria cadastrada com sucesso. ");
      
      else System.out.println("Erro ao cadastrar categoria. ");
      
   }

   private static void cadastraMarca(ListaMarca listaMarca){
      Scanner in = new Scanner(System.in);
      System.out.println("Insira o nome da marca: ");
      String nomeM = in.nextLine();
      MarcaAutomovel umaMarca = new MarcaAutomovel(nomeM);
      listaMarca.insere(umaMarca);
      System.out.println("Marca cadastrada com sucesso. ");
      System.out.println("//////////////////////////////////////");

   }

   private static void cadastraModelo(ListaModelo listaModelo, ListaCategoria listaCategoria, ListaMarca listaMarca){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o nome do modelo: ");
      String nomeModelo = in.nextLine();
      System.out.println("Digite a categoria do automóvel: ");
      String nomeCategoria = in.nextLine();
      CategoriaAutomovel umaCategoria;
      umaCategoria = listaCategoria.pesquisaCategoria(nomeCategoria);
      System.out.println("Digite a marca do automóvel: ");
      String nomeMarca = in.nextLine();
      MarcaAutomovel umaMarca;
      umaMarca = listaMarca.pesquisaMarca(nomeMarca);
      System.out.println("Digite o valor do automóvel: ");
      double valor = in.nextDouble();

      System.out.println("Digite 1 se o modelo do carro for nacional; ");
      System.out.println("Digite 2 se o modelo do carro for importado; ");
      int modelo = in.nextInt();
      switch(modelo){
         case 1:
            System.out.println("Digite o IPI do automóvel: ");
            double ipi = in.nextDouble();
            ModeloNacional umModelo = new ModeloNacional(nomeModelo, umaMarca, umaCategoria, valor, ipi);
            listaModelo.insere(umModelo);
            System.out.println("Modelo cadastrado com sucesso! ");
            break;
         case 2: 
            System.out.println("Digite a taxa do automóvel: "); 
            double taxa = in.nextDouble();
            ModeloImportado outroModelo = new ModeloImportado(nomeModelo, umaMarca, umaCategoria, valor, taxa);
            listaModelo.insere(outroModelo);
            System.out.println("Modelo cadastrado com sucesso! ");
            break;
         default: System.out.println("Valor inválido. "); break;
      }
      System.out.println("//////////////////////////////////////");
   }

   private static void cadastraAutomovel(ListaModelo listaModelo, ListaAutomoveis listaAutomoveis){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite o nome do modelo: ");
      String nomeModelo = in.nextLine();
      ModeloAutomovel umModelo;
      umModelo = listaModelo.pesquisaModelo(nomeModelo);
      System.out.println("Digite a placa do automóvel: ");
      String placa = in.nextLine();
      System.out.println("Digite o ano do automóvel: ");
      int ano = in.nextInt();
      System.out.println("Digite o valor da diária do automóvel: ");
      double valorDiaria = in.nextDouble();
      Automovel umAutomovel = new Automovel(placa, ano, valorDiaria, umModelo);
      if(listaAutomoveis.insere(umAutomovel)){
      System.out.println("Automóvel cadastrado com sucesso! ");
      }
      else System.out.println("Erro ao cadastrar o automóvel, favor tentar novamente. ");
      System.out.println("//////////////////////////////////////");
   }

   private static void removeAutomovel(ListaAutomoveis listaAutomoveis){
      Scanner in = new Scanner(System.in);
      System.out.println("Digite a placa do automóvel que deseja remover: ");
      String placa = in.nextLine();
      if(listaAutomoveis.remove(placa)){
         System.out.println("Automóvel removido com sucesso! ");
      }
      else System.out.println("Automóvel não encontrado, verifique a placa e tente novamente. ");

      System.out.println("//////////////////////////////////////");
   }

   private static void consultaLocacoes(ListaLocacoes lista){
      lista.mostra();
   }

   private static void consultaClientes(ListaClientes lista){
      lista.mostra();
   }

   private static void consultaAutomoveis(ListaAutomoveis lista){
      lista.mostra();
   }
}
   

 

   
   

