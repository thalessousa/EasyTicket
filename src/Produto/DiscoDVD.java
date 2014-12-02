package Produto;

public class DiscoDVD extends Disco {

	private final double CAPACIDADE;

    public DiscoDVD(int CAPACIDADE) {
        this.CAPACIDADE = CAPACIDADE;
    }

    public DiscoDVD(double CAPACIDADE, int numeromusicas, String estilo, String nome) {
        super(numeromusicas, estilo, nome);
        this.CAPACIDADE = 4.7;
    }

}