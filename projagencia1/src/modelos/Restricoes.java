package modelos;

public class Restricoes {
    private String restricaoAlimentar;
    private String restricaoEspecial;
    private String observacoes;
    private String descricao;

    public Restricoes(String restricaoAlimentar, String restricaoEspecial, String observacoes) {
        this.restricaoAlimentar = restricaoAlimentar;
        this.restricaoEspecial = restricaoEspecial;
        this.observacoes = observacoes;
    }

    public String getRestricaoAlimentar() {
        return restricaoAlimentar;
    }

    public void setRestricaoAlimentar(String restricaoAlimentar) {
        this.restricaoAlimentar = restricaoAlimentar;
    }

    public String getRestricaoEspecial() {
        return restricaoEspecial;
    }

    public void setRestricaoEspecial(String restricaoEspecial) {
        this.restricaoEspecial = restricaoEspecial;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Restricoes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return "Restricoes{" +
                "restricaoAlimentar='" + restricaoAlimentar + '\'' +
                ", restricaoEspecial='" + restricaoEspecial + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
