package Produto;

public class Ingresso extends Produto {

	private int data;
	private String banda;
	private String local;
	private double preco;
	private final int IDVALIDACAO;

    public Ingresso(int IDVALIDACAO) {
        this.IDVALIDACAO = 6829598;
    }

    public Ingresso(int data, String banda, String local, double preco, int IDVALIDACAO, String nome) {
        super(nome);
        this.data = data;
        this.banda = banda;
        this.local = local;
        this.preco = preco;
        this.IDVALIDACAO = 6829598;
    }
}
