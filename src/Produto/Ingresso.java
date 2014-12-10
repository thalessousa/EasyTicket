package Produto;

import Espaço.Show;
import javax.swing.JOptionPane;
public class Ingresso extends Produto {

	public String data;
	public final int IDVALIDACAO;

    public Ingresso() {
        this.data = "";
        this.IDVALIDACAO = 6829598;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public int getIDVALIDACAO() {
        return IDVALIDACAO;
    }
    
    public void imprimirdados(){
        JOptionPane.showMessageDialog(null, " " + this.toString());
    }
    @Override
    public String toString() {
        return "Ingresso\n Data = " + data +"\n ID VALIDAÇÃO=" + IDVALIDACAO;
    }
}