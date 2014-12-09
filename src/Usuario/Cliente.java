package Usuario;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Usuario implements Menu, Comprar, Autenticavel {

    private static String nome, email, login;
    private static int cpf;

    public Cliente() {
    }

    public Cliente(String nome, int cpf, int senha, int login, String email) {
        Cliente.login = null;
        Cliente.nome = nome;
        Cliente.cpf = cpf;
        Cliente.email = email;
    }

    public static String getLogin() {
        return login;
    }
    
    @Override
    public void compraringresso() {
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
            if(cliente.getLogin().equals(login))return true;
        }
        return false;

    }

    public int menu(Cliente cliente) {
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
                    cliente.compraringresso();
                    break;
            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Saiu da administração");
        return 0;
    }

    public static void setCliente() {

        int aux;

        Cliente.nome = JOptionPane.showInputDialog(null, "Insira o seu nome");
        //aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o seu CPF(Sem pontos ou hífens) "));
        //while (aux <= 0) {
        //  aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor incorreto, insira novamente"));
        // Cliente.cpf = aux;
        //}
        Cliente.email = JOptionPane.showInputDialog(null, "Insira o seu e-mail");
        Cliente.login = JOptionPane.showInputDialog(null, "Insira o seu login");
    }
}