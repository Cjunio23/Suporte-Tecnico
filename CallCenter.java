import java.util.HashSet;
import java.util.Scanner;
public class CallCenter {
    public static void main(String[] args) {
        String res;
      do{
        String RespostSolucao;  
        Scanner input = new Scanner(System.in);
        SuporteTecnico Sup = new SuporteTecnico();
        Interpretadora in = new Interpretadora();
        HashSet<String> x;
        Sup.Iniciar();
        System.out.println(" Bem-vindo ao sistema de Suporte Tecnico");
        System.out.println("Descreva seu problema de maneira sucinta:");
            RespostSolucao = input.nextLine();
        x = in.Dividir(RespostSolucao);
        RespostSolucao = Sup.BuscarSolucao(x);
        if(RespostSolucao == null){
            RespostSolucao = Sup.BuscaSolucaoPadrao(x);
            System.out.println(RespostSolucao);
        }else{
            System.out.println(RespostSolucao);
        }
        System.out.println("Escreva 'Continuar' para continuar,digite 'sair' para sair do sistema.");  
        res = input.next();
      }while(!"Sair".equals(res));
         System.out.println("Obrigado!!!");
    }
}
