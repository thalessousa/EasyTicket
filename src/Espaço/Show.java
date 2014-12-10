package Espaço;

import Produto.Ingresso;
import Pessoa.Banda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Show {

    private static ArrayList<Banda> listabandas;
    private String endereco, nome, localparaestacionar;
    private double precoingresso, capacidade;
    private int tamanhoestacionamento;

    private enum locaisdevenda {

        TICKETMASTER, QUIOSQUE, ONLINE
    }
    private locaisdevenda venda;

    private enum formasdepagamento {

        MASTERCARD, AMEX, VISA, DINHEIRO, PAYPAL
    }
    private formasdepagamento pagamento;

    public Show() {
    }

    public Show(String endereco, String nome, double precoingresso, String localparaestacionar, int tamanhoestacionamento, int capacidade, locaisdevenda venda, formasdepagamento pagamento) {
        this.endereco = "";
        this.nome = "";
        this.precoingresso = 0.00;
        this.localparaestacionar = "";
        this.tamanhoestacionamento = 0;
        this.capacidade = 0;
        this.venda = venda;
        this.pagamento = pagamento;
    }

    public void setAtributos(Ingresso ingresso) {

        int aux;

        this.nome = JOptionPane.showInputDialog("Insira o nome do local ");

        this.endereco = JOptionPane.showInputDialog("Insira o endereço do show ");
        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira o preço do ingresso do show "));
        while (aux < 0) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
        }
        this.precoingresso = aux;

        this.localparaestacionar = JOptionPane.showInputDialog("Existe local para estacionar? ");
        if (this.localparaestacionar.equalsIgnoreCase("sim")) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de vagas no estacionamento "));
            while (aux < 0) {
                aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
            }
            this.tamanhoestacionamento = aux;
        }
        while (this.tamanhoestacionamento <= 0) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Numero invalido,insira novamente"));
            this.tamanhoestacionamento = aux;
        }

        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do local "));
        while (aux < 0) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
        }
        this.capacidade = aux;
        
        ingresso.data = JOptionPane.showInputDialog("Insira a data do show ");

    }

    public void imprimirdados() {
        JOptionPane.showMessageDialog(null, this.toString());
    }


    public String toString(Ingresso ingresso) {
        return "Show\n " + "Endereco = " + endereco + "\n Local = "  + nome + "\n Data do show = "+ingresso.data+"\n Possui estacionamento? = " + localparaestacionar + "\n Preço do Ingresso = " + precoingresso + "\n Tamanho do Estacionamento = " + tamanhoestacionamento + "\n Capacidade = " + capacidade + "\n Venda = " + venda.ONLINE + " , " + venda.QUIOSQUE + " , " + venda.TICKETMASTER + "\n Formas de Pagamento = " + pagamento.AMEX + " , " + pagamento.DINHEIRO + " , " + pagamento.MASTERCARD + " , " + pagamento.PAYPAL + " , " + pagamento.VISA;
    }
}
