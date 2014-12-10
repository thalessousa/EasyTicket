package Usuario;

import Espaço.Show;
import Pessoa.Banda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cliente extends Usuario implements Menu, Comprar, Autenticavel {

    public Cliente() {
        this.senha = 0;
    }

    public Cliente(locaisdevenda venda, int senha) {
        super(senha);
        this.venda = venda;
    }

    private static String nome, email, login;

    private enum locaisdevenda {

        TICKETMASTER, QUIOSQUE, ONLINE
    }
    private locaisdevenda venda;

    private enum formasdepagamento {

        MASTERCARD, AMEX, VISA, DINHEIRO, PAYPAL
    }

    public Cliente(String nome, int senha, int login, String email) {
        Cliente.login = "";
        Cliente.nome = "";
        Cliente.email = "";
    }

    public static String getLogin() {
        return login;
    }

    public boolean procurarbanda(ArrayList<Banda> listabandas) {
        String aux;
        aux = JOptionPane.showInputDialog(null, "Insira a banda que deseja procurar ");
        for (Banda banda : listabandas) {
            if (Banda.getNome().equalsIgnoreCase(aux)) {
                return true;
            }
        }
        return false;
    }

    public void compraringresso(Show show, Administrador adm) {
        String aux;
        Object[] options = {"Comprar", "Cancelar"};
        JOptionPane.showOptionDialog(null, "Deseja comprar ingresso para este show?Custa " + show.precoingresso + " reais", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        adm.imprimirlistashows();
        Object[] possibleValues = {"VISA", "AMEX", "PAYPAL", "DINHEIRO", "MASTERCARD"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma forma de pagamento", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        JOptionPane.showMessageDialog(null, "Obrigado pela sua compra!");
    }

    public void comprardiscovinil(Banda banda) {
        String aux;
        Object[] options = {"Comprar", "Cancelar"};
        JOptionPane.showOptionDialog(null, "Deseja comprar um disco de vinil da banda?A banda possui " + banda.quantidadedediscos + " disco", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        Object[] possibleValues = {"VISA", "AMEX", "PAYPAL", "DINHEIRO", "MASTERCARD"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma forma de pagamento", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        JOptionPane.showMessageDialog(null, "Obrigado pela sua compra!");

    }

    public void comprardiscocompacto(Banda banda) {
        String aux;
        Object[] options = {"Comprar", "Cancelar"};
        JOptionPane.showOptionDialog(null, "Deseja comprar um disco compacto da banda?A banda possui " + banda.quantidadedediscos + " disco", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        Object[] possibleValues = {"VISA", "AMEX", "PAYPAL", "DINHEIRO", "MASTERCARD"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma forma de pagamento", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        JOptionPane.showMessageDialog(null, "Obrigado pela sua compra!");

    }

    public void comprardiscodvd(Banda banda) {
        String aux;
        Object[] options = {"Comprar", "Cancelar"};
        JOptionPane.showOptionDialog(null, "Deseja comprar um disco DVD da banda?A banda possui " + banda.quantidadedediscos + " disco", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        Object[] possibleValues = {"VISA", "AMEX", "PAYPAL", "DINHEIRO", "MASTERCARD"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma forma de pagamento", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        JOptionPane.showMessageDialog(null, "Obrigado pela sua compra!");
    }

    public boolean checarautorizacao(ArrayList<Cliente> listacliente) {
        for (Cliente cliente : listacliente) {
            if (Cliente.getLogin().equals(login)) {
                return true;
            }
        }
        return false;

    }

    public int menu(Cliente cliente, Show show, Administrador adm, Banda banda) {
        int aux, opcao = 0;

        do {
            login = JOptionPane.showInputDialog(null, "Insira o seu login ");
        } while (checarautorizacao(listacliente) == false);
        JOptionPane.showMessageDialog(null, "Login efetuado!");
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "0 - Sair\n1 - Comprar disco Compacto\n2 - Comprar disco DVD\n3 - Comprar disco Vinil\n4 - Comprar Ingresso\n "));
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    if (cliente.procurarbanda(listabandas) == true) {
                        JOptionPane.showMessageDialog(null, "Banda encontrada!");
                        cliente.comprardiscocompacto(banda);
                    } else if (cliente.procurarbanda(listabandas) == false) {
                        JOptionPane.showMessageDialog(null, "Banda não encontrada!");
                    }
                    break;
                case 2:
                    if (cliente.procurarbanda(listabandas) == true) {
                        JOptionPane.showMessageDialog(null, "Banda encontrada!");
                        cliente.comprardiscodvd(banda);
                    } else if (cliente.procurarbanda(listabandas) == false) {
                        JOptionPane.showMessageDialog(null, "Banda não encontrada!");
                    }
                    break;
                case 3:
                    if (cliente.procurarbanda(listabandas) == true) {
                        JOptionPane.showMessageDialog(null, "Banda encontrada!");
                        cliente.comprardiscovinil(banda);
                    } else if (cliente.procurarbanda(listabandas) == false) {
                        JOptionPane.showMessageDialog(null, "Banda não encontrada!");
                    }
                    break;
                case 4:
                    if (cliente.procurarbanda(listabandas) == true) {
                        JOptionPane.showMessageDialog(null, "Banda encontrada!");
                        cliente.compraringresso(show, adm);
                    } else if (cliente.procurarbanda(listabandas) == false) {
                        JOptionPane.showMessageDialog(null, "Banda não encontrada!");
                    }

            }
        } while (opcao != 0);
        JOptionPane.showMessageDialog(null, "Volte sempre!");
        return 0;
    }

    public static void setCliente() {

        int aux;

        Cliente.nome = JOptionPane.showInputDialog(null, "Insira o seu nome");
        Cliente.email = JOptionPane.showInputDialog(null, "Insira o seu e-mail");
        Cliente.login = JOptionPane.showInputDialog(null, "Insira o seu login");
    }

}
