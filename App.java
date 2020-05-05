import java.util.Scanner;
public class App {
   public static void main(String args[]){
      
      Scanner in = new Scanner(System.in);
      
      System.out.println("Digite 1 para o menu de funcionarios: ");
      System.out.println("Digite 2 para o menu do gerente: ");
      
      int numero = in.nextInt();

      switch(numero){
         case 1:
            System.out.println("Bem vindo ao menu de funcionários; ");
            System.out.println("Digite 1 para cadastrar novo cliente; ");
            System.out.println("Digite 2 para consultar a disponibilidade de atuomóvel por categoria; ");
            System.out.println("Digite 3 para consultar o valor de uma locação; ");
            System.out.println("Digite 4 para realizar uma locação; ");
            System.out.println("Digite 5 para finalizar uma locação; ");
            int a = in.nextInt();
            switch(a){
               case 1: break;
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