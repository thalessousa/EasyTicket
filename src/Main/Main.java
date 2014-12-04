package Main;

import Pessoa.Banda;

public class Main {

	private static int opcao;
        public static void main(String[] args){
        System.out.println("Bem vindo");
        Banda nova = new Banda();
        nova.setAtributos();
        nova.imprimirdados();
        nova.toString();
	}

}
