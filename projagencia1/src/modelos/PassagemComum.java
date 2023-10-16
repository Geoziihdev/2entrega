package modelos;

import java.util.Date;

public class PassagemComum extends Passagem {
    private String classePassagem;
    private boolean refeicoes;
    private String detalhes;
    private Destino destino; // Adicionando um relacionamento com a classe Destino

    // Construtor
    public PassagemComum(int id, int numeroAssento, String nomePassageiro, Date dataHora, String origem, Destino string, double preco, String classePassagem, boolean refeicoes, String detalhes, Restricoes restricoes) {
        super(id, numeroAssento, nomePassageiro, dataHora, origem, string.getNomeDestino(), preco, restricoes);
        this.classePassagem = classePassagem;
        this.refeicoes = refeicoes;
        this.detalhes = detalhes;
        this.destino = string; // Associe a passagem comum a um destino
    }

	// Getter e setter para o relacionamento com Destino
    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    // Getters e setters específicos da subclasse
    public String getClassePassagem() {
        return classePassagem;
    }

    public void setClassePassagem(String classePassagem) {
        this.classePassagem = classePassagem;
    }

    public boolean isRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes1(boolean refeicoes) {
        this.refeicoes = refeicoes;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    // Métodos adicionais para definir ID, refeições e classe
    public void setId(int id) {
        this.id = id;
    }

    public void setRefeicoes(boolean string) {
        this.refeicoes = string;
    }

    public void setClasse(String classe) {
        this.classePassagem = classe;
    }

	public void setNumeroAssento(int int1) {
			
	}

	public void setNomePassageiro(String string) {
		
	}

	public void setDataHora(java.sql.Date date) {
		
	}

	public void setLocalOrigem(String string) {
		
	}

	public void setPreco(double double1) {
		
	}
}




