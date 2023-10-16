package modelos;

public class Destino {
    private int id;
    private String nomeOrigem; // Adicione o atributo nomeOrigem
    private String nomeDestino;
    private String voo;
    private boolean emPromocao;

    public Destino(int id, String nomeOrigem, String nomeDestino, String voo, boolean emPromocao) {
        // Inicialize os atributos com os valores passados nos parâmetros
        this.id = id;
        this.nomeOrigem = nomeOrigem;
        this.nomeDestino = nomeDestino;
        this.voo = voo;
        this.emPromocao = emPromocao;
    }
    
 // getters e setters

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getNomeOrigem() {
    return nomeOrigem;
}

public void setNomeOrigem(String nomeOrigem) {
    this.nomeOrigem = nomeOrigem;
}

public String getNomeDestino() {
    return nomeDestino;
}

public void setNomeDestino(String nomeDestino) {
    this.nomeDestino = nomeDestino;
}

public String getVoo() {
    return voo;
}

public void setVoo(String voo) {
    this.voo = voo;
}

public boolean isEmPromocao() {
    return emPromocao;
}

public void setEmPromocao(boolean emPromocao) {
    this.emPromocao = emPromocao;
}
}