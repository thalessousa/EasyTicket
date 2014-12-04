package Espaço;

import Pessoa.Banda;
import java.util.ArrayList;

public class Show  {
        
        private static ArrayList<Banda> listabandas;
	private String endereco,nome;
	private double precoingresso;
	private boolean localparaestacionar;
	private int tamanhoestacionamento,capacidade;
	private enum locaisdevenda{TICKETMASTER,QUIOSQUE,ONLINE}
        private locaisdevenda venda;
	private enum formasdepagamento{MASTERCARD,AMEX,VISA,DINHEIRO,PAYPAL}
        private formasdepagamento pagamento;

    public Show() {
    }

    public Show(String endereco, String nome, double precoingresso, boolean localparaestacionar, int tamanhoestacionamento, int capacidade, locaisdevenda venda, formasdepagamento pagamento) {
        this.endereco = endereco;
        this.nome = nome;
        this.precoingresso = precoingresso;
        this.localparaestacionar = localparaestacionar;
        this.tamanhoestacionamento = tamanhoestacionamento;
        this.capacidade = capacidade;
        this.venda = venda;
        this.pagamento = pagamento;
    }
    
}
