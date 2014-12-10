package Main;

import Usuario.*;
import Pessoa.Banda;
import Espaço.Show;
import Produto.Ingresso;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        int versao = 0;
        Cliente cliente = new Cliente();
        Administrador adm = new Administrador();
        Moderador moderador = new Moderador();
        Show show = new Show();
        Banda banda = new Banda();
        Ingresso ingresso = new Ingresso();
        Random gerador = new Random();
        versao = gerador.nextInt(10);
        JOptionPane.showMessageDialog(null, "Bem vindo ao Easy Ticket! (Versão " + versao + " )");
        do {
            opcao = Integer.valueOf(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Area de administracao\n2 - Moderação\n3 - Login cliente"));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    if (adm instanceof Administrador) {
                        adm.menu(adm, banda, show, ingresso);
                    }
                    break;
                case 2:
                    if (moderador instanceof Moderador) {
                        moderador.menu(moderador, cliente);
                    }
                    break;
                case 3:
                    if (cliente instanceof Cliente) {
                        cliente.menu(cliente, show, adm, banda);
                    }
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
    }
}
