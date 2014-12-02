package Produto;

public class DiscoCompacto extends Disco {

	private double capacidade;

    public DiscoCompacto() {
    }

    public DiscoCompacto(double capacidade, int numeromusicas, String estilo, String nome) {
        super(numeromusicas, estilo, nome);
        this.capacidade = capacidade;
    }
        
}
