package Main;

import Usuario.*;
import Pessoa.Banda;
import Espaço.Show;
import Produto.Ingresso;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int opcao = 0;
        Cliente cliente = new Cliente();
        Administrador adm = new Administrador();
        Moderador moderador = new Moderador();
        Show show = new Show();
        Banda banda = new Banda();
        Ingresso ingresso = new Ingresso();
        JOptionPane.showMessageDialog(null, "Bem vindo ao Easy Ticket!");
        do {
            opcao = Integer.valueOf(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Area de administracao\n2 - Moderação\n3 - Login cliente"));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    adm.menu(adm,banda,show,ingresso);
                    break;
                case 2:
                    moderador.menu(moderador,cliente);
                    break;
                case 3:
                    cliente.menu(cliente,show,adm,banda);
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
    }
}