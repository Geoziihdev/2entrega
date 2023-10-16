package modelos;

import java.util.Date;

public class PassagemPromocional extends Passagem {
    private Date validadeDesconto;
    private String codigoDesconto;
    private double valorDesconto;
    private Destino destino; // Adicionando um relacionamento com a classe Destino
    private String classePassagem;
    private boolean refeicoes;
    private String detalhes;
    
    // Construtor
    
    public PassagemPromocional(int id, int numeroAssento, String nomePassageiro, 
    		Date dataHora, String origem, Destino destino, double preco, Date 
    		validadeDesconto, String codigoDesconto, double valorDesconto, Restricoes 
    		restricoes) {
    		super(id, numeroAssento, nomePassageiro, dataHora, origem, 
    		destino.getNomeDestino(), preco, restricoes);
    		this.validadeDesconto = validadeDesconto;
    }
    
     public PassagemPromocional(int id, int numeroAssento, String nomePassageiro, Date dataHora, String origem, String destino, double preco, String classePassagem, boolean refeicoes, String detalhes, Restricoes restricoes) {
            super(id, numeroAssento, nomePassageiro, dataHora, origem, destino, preco, restricoes);
            this.classePassagem = classePassagem;
            this.refeicoes = refeicoes;
            this.detalhes = detalhes;
        }
    

	public void PassagemComum(int id, int numeroAssento, String nomePassageiro, Date dataHora, String origem, Destino destino, double preco, String classePassagem, boolean refeicoes, String detalhes) {
    	    // Inicialize os atributos com os valores passados nos parâmetros
    	    // ...
    	}


    // Getter e setter para o relacionamento com Destino
    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Date getValidadeDesconto() {
        return validadeDesconto;
    }

    public void setValidadeDesconto(Date validadeDesconto) {
        this.validadeDesconto = validadeDesconto;
    }

    public String getCodigoDesconto() {
        return codigoDesconto;
    }

    public void setCodigoDesconto(String codigoDesconto) {
        this.codigoDesconto = codigoDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

	public void setNumeroAssento(int novoNumeroAssento) {
		
	}
	
	public void setNomePassageiro(String novoNomePassageiro) {
		
	}
	
	public void setLocalOrigem(String novaOrigem) {
		
	}

	public String getClassePassagem() {

		return null;
	}

	public String isRefeicoes() {

		return null;
	}

	public String getDetalhes() {
	
		return null;
	}
}


