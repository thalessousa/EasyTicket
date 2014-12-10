package Produto;


import javax.swing.JOptionPane;
public class Ingresso extends Produto {

	public String data;
	public final int IDVALIDACAO;

    public Ingresso() {
        this.data = "";
        this.IDVALIDACAO = 6829598;
    }

    public Ingresso(String data, int IDVALIDACAO) {
        this.data = data;
        this.IDVALIDACAO = IDVALIDACAO;
    }
    public Ingresso(Ingresso copia){
        this.data = copia.data;
        this.nome = copia.nome;
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