package Pessoa;

import java.util.Scanner;

public class Banda {
        
	private int integrantes;
	private int quantidadedediscos;
        private String genero,gravadora,nome;
        static Scanner input = new Scanner(System.in);

    public Banda() {
        this.integrantes = 0;
        this.quantidadedediscos = 0;
        this.genero = "null";
        this.gravadora = "null";
        this.nome = "null";
    }

    public Banda(int integrantes, int quantidadedediscos, String genero, String gravadora, String nome) {
        this.integrantes = integrantes;
        this.quantidadedediscos = quantidadedediscos;
        this.genero = genero;
        this.gravadora = gravadora;
        this.nome = nome;
    }

    public void setAtributos() {
        
        System.out.println("Insira o nome da banda \n");
        this.nome = input.nextLine();
        while(this.nome.contains("[0123456789]")){System.out.println("Nome de gravadora invalido,insira novamente\n");
        this.nome = input.nextLine();}
               
        System.out.println("Insira a gravadora da banda \n");
        this.gravadora = input.nextLine();
        while(this.gravadora.contains("[0123456789]")){System.out.println("Nome de gravadora invalido,insira novamente\n");
        this.gravadora = input.nextLine();}
        
        System.out.println("Insira o genero da banda \n");
        this.genero = input.next();
        while(this.genero.contains("[0123456789]")){System.out.println("Genero invalido,insira novamente\n");
        this.genero = input.next();}
        
        System.out.println("Insira a quantidade de integrantes da banda \n");
        this.integrantes = input.nextInt();
        while(this.integrantes<=0){System.out.println("Numero invalido,insira novamente\n");
        this.integrantes = input.nextInt();}
        
        System.out.println("Insira a quantidade de discos lançados da banda \n");
        this.quantidadedediscos = input.nextInt();
        while(this.quantidadedediscos<=0){System.out.println("Numero invalido,insira novamente\n");
        this.quantidadedediscos = input.nextInt();}
        
        
    }
    public void imprimirdados(){
        System.out.println(this.toString());

    }
    @Override
    public String toString() {
        return "Banda{" + "integrantes=" + integrantes + ", quantidadedediscos=" + quantidadedediscos + ", genero=" + genero + ", gravadora=" + gravadora + ", nome=" + nome + '}';
    }
}