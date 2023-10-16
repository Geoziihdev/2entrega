package modelos;

import java.util.Date;

public class Passagem {
    protected int id;
    private int numeroAssento;
    private String nomePassageiro;
    private Date dataHora;
    private String localOrigem;
    private String localDestino;
    private double preco;
    private Restricoes restricoes;

    public Passagem(int id, int numeroAssento, String nomePassageiro, Date dataHora, String localOrigem, String localDestino, double preco, Restricoes restricoes) {
        this.id = id;
        this.numeroAssento = numeroAssento;
        this.nomePassageiro = nomePassageiro;
        this.dataHora = dataHora;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.preco = preco;
        this.restricoes = restricoes;
    }

    // Getters e setters
 

    public int getId() {
        return id;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public double getPreco() {
        return preco;
    }

    public Restricoes getRestricoes() {
        return restricoes;
    }

    public double calcularPrecoTotal() {
        // Lógica para calcular o preço total aqui
        return preco;
    }
}

