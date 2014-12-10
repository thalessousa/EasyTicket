package Usuario;

import Espaço.Show;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Usuario implements Menu, Comprar, Autenticavel {

    private static String nome, email, login;

    public Cliente() {
    }

    public Cliente(String nome, int senha, int login, String email) {
        Cliente.login = "";
        Cliente.nome = "";
        Cliente.email = "";
    }

    public static String getLogin() {
        return login;
    }
    
    
    @Override
    public void compraringresso() {
        String aux;
        
        aux = JOptionPane.showInputDialog(null, "Deseja comprar ingresso para este show? ");
        if(aux.equalsIgnoreCase("sim")){
        JOptionPane.showMessageDialog(null, "O ingresso custa");
        }
    }

    @Override
    public void comprardiscovinil() {
    }

    @Override
    public void comprardiscocompacto() {
    }

    @Override
    public void comprardiscodvd() {
    }

    public boolean checarautorizacao(ArrayList<Cliente> listacliente) {
        for (Cliente cliente : listacliente) {
            if(Cliente.getLogin().equals(login))return true;
        }
        return false;

    }

    public int menu(Cliente cliente,Show show) {
        int aux, opcao = 0;

        do {
            login = JOptionPane.showInputDialog(null, "Insira o seu login ");
        } while (checarautorizacao(listacliente) == false);

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Comprar disco Compacto\n2 - Comprar disco DVD\n3 - Comprar disco Vinil\n4 - Comprar Ingresso\n "));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    cliente.comprardiscocompacto();
                    break;
                case 2:
                    cliente.comprardiscodvd();
                    break;
                case 3:
                    cliente.comprardiscovinil();
                    break;
                case 4:
                    cliente.compraringresso(show);
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saiu da administração");
        return 0;
    }

    public static void setCliente() {

        int aux;

        Cliente.nome = JOptionPane.showInputDialog(null, "Insira o seu nome");
        Cliente.email = JOptionPane.showInputDialog(null, "Insira o seu e-mail");
        Cliente.login = JOptionPane.showInputDialog(null, "Insira o seu login");
    }

}