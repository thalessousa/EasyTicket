package Main;
import Usuario.*;
import Pessoa.Banda;
import java.util.Scanner;

public class Main {
      
	private static int opcao=1;
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args){
        System.out.println("Bem vindo\n");
        Banda nova = new Banda();
        Banda nova2 = new Banda();
        Banda nova3 = new Banda();
        Administrador adm = new Administrador();
        Administrador.adicionarbanda(nova);
        Administrador.adicionarbanda(nova2);
        Administrador.adicionarbanda(nova3);
         adm.imprimirlista();

        }
}