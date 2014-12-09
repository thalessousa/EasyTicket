package Espaço;

import Pessoa.Banda;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Show  {
        
        private static ArrayList<Banda> listabandas;
	private String endereco,nome,localparaestacionar;
	private double precoingresso;
	private int tamanhoestacionamento,capacidade;
	private enum locaisdevenda{TICKETMASTER,QUIOSQUE,ONLINE}
        private locaisdevenda venda;
	private enum formasdepagamento{MASTERCARD,AMEX,VISA,DINHEIRO,PAYPAL}
        private formasdepagamento pagamento;

    public Show() {
    }

    public Show(String endereco, String nome, double precoingresso, String localparaestacionar, int tamanhoestacionamento, int capacidade, locaisdevenda venda, formasdepagamento pagamento) {
        this.endereco = endereco;
        this.nome = nome;
        this.precoingresso = precoingresso;
        this.localparaestacionar = localparaestacionar;
        this.tamanhoestacionamento = tamanhoestacionamento;
        this.capacidade = capacidade;
        this.venda = venda;
        this.pagamento = pagamento;
    }
    
        public void setAtributos() {
            
         int aux;

         this.endereco = JOptionPane.showInputDialog("Insira o endereço do show ");      
         aux = Integer.parseInt(JOptionPane.showInputDialog("Insira o preço do ingresso do show "));
            while(aux<0)
                aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
            this.precoingresso= aux;
            
        this.localparaestacionar = JOptionPane.showInputDialog("Existe local para estacionar? ");
        if(this.localparaestacionar == "Sim" && this.localparaestacionar == "sim")
        {
        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de vagas no estacionamento "));
           while(aux<0)     
            aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
                this.tamanhoestacionamento = aux;
        while(this.tamanhoestacionamento<=0){aux = Integer.parseInt(JOptionPane.showInputDialog("Numero invalido,insira novamente"));
        this.tamanhoestacionamento = aux;
        }

        aux = Integer.parseInt(JOptionPane.showInputDialog("Insira a capacidade do local "));
          while(aux<0)     
            aux = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto, insira novamente"));
            this.capacidade = aux;
        
     }
  }
       public void imprimirdados(){
        JOptionPane.showMessageDialog(null," " +this.toString());
    }

    @Override
    public String toString() {
        return  "Show{" + "Endereco = " + endereco + ",\n Nome = " + nome + ",\n Possui estacionamento? = " + localparaestacionar + ",\n Preço do Ingresso = " + precoingresso + ",\n Tamanho do Estacionamento = " + tamanhoestacionamento + ",\n Capacidade = " + capacidade + ",\n Venda = " + venda.ONLINE + " , " + venda.QUIOSQUE + " , " + venda.TICKETMASTER + ",\n Formas de Pagamento = " + pagamento.AMEX + " , " + pagamento.DINHEIRO + " , " + pagamento.MASTERCARD + " , " + pagamento.PAYPAL + " , " + pagamento.VISA + '}';
    }      
}
