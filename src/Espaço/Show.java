package Espaço;

import Produto.Ingresso;
import Pessoa.Banda;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Show {

    private static ArrayList<Banda> listabandas;
    private String endereco, nome, localparaestacionar;
    public double precoingresso, capacidade;
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
        this.endereco = "";
        this.nome = "";
        this.precoingresso = 0.00;
        this.localparaestacionar = "";
        this.tamanhoestacionamento = 0;
        this.capacidade = 0;
        this.venda = venda;
        this.pagamento = pagamento;
    }

    public Show(String endereco, String nome, String localparaestacionar, double precoingresso, double capacidade, int tamanhoestacionamento, locaisdevenda venda, formasdepagamento pagamento) {
        this.endereco = endereco;
        this.nome = nome;
        this.localparaestacionar = localparaestacionar;
        this.precoingresso = precoingresso;
        this.capacidade = capacidade;
        this.tamanhoestacionamento = tamanhoestacionamento;
        this.venda = venda;
        this.pagamento = pagamento;
    }

    public Show(Show copia) {
        this.endereco = copia.endereco;
        this.nome = copia.nome;
        this.precoingresso = copia.precoingresso;
        this.localparaestacionar = copia.localparaestacionar;
        this.tamanhoestacionamento = copia.tamanhoestacionamento;
        this.capacidade = copia.capacidade;
        this.venda = copia.venda;
        this.pagamento = copia.pagamento;
    }

    public void setAtributos(Ingresso ingresso) {

        double aux;

        this.nome = JOptionPane.showInputDialog("Insira o nome do local (Exemplo Nome1 Nome2)");
        while (validar_nome(nome) == false) {
            this.nome = JOptionPane.showInputDialog(null, "Nome do local invalido,insira novamente (Exemplo Nome1 Nome2)");
        }

        this.endereco = JOptionPane.showInputDialog("Insira o endereço do show ");
        while (validar_nome(endereco) == false) {
            this.endereco = JOptionPane.showInputDialog(null, "Nome da banda invalido,insira novamente ");
        }

        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira o preço do ingresso do show "));
        this.precoingresso = aux;

        this.localparaestacionar = JOptionPane.showInputDialog("Existe local para estacionar? ");
        if (this.localparaestacionar.equalsIgnoreCase("sim")) {
            aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de vagas no estacionamento "));
            this.tamanhoestacionamento = (int) aux;
            while (validar_int(tamanhoestacionamento) == false) {
                aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero invalido,insira novamente"));
                this.tamanhoestacionamento = (int) aux;
            }
        }

        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do local "));
        this.capacidade = aux;
        while (validar_int(capacidade) == false) {
            aux = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero invalido,insira novamente"));
            this.capacidade = (int) aux;
        }

        ingresso.data = JOptionPane.showInputDialog("Insira a data do show ");
        while (validar_data(ingresso.data) == false) {
            ingresso.data = JOptionPane.showInputDialog("Data incorreta, insira novamente");
        }

    }

    public boolean validar_nome(String arg3) {
        return arg3.matches("[a-zA-Z]{1,10}(\\s)[a-zA-Z]{1,10}");
    }

    public boolean validar_data(String arg3) {
        return arg3.matches("[0-9]{2}?(/)[0-9]{2}?(/)[0-9]{4}");

    }

    public boolean validar_int(double arg2) {
        return arg2 > 0;
    }

    public void imprimirdados() {
        JOptionPane.showMessageDialog(null, this.toString());
    }

    @Override
    public String toString() {
        return "Show\n " + "Endereco = " + endereco + "\n Local = " + nome + "\n Possui estacionamento? = " + localparaestacionar + "\n Preço do Ingresso = " + precoingresso + "\n Tamanho do Estacionamento = " + tamanhoestacionamento + "\n Capacidade = " + capacidade + "\n Venda = " + venda.ONLINE + " , " + venda.QUIOSQUE + " , " + venda.TICKETMASTER + "\n Formas de Pagamento = " + pagamento.AMEX + " , " + pagamento.DINHEIRO + " , " + pagamento.MASTERCARD + " , " + pagamento.PAYPAL + " , " + pagamento.VISA;
    }
}
