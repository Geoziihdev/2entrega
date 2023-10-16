package modelos;

import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private Date nascimento;
    private String cpf;

    // Construtor
    public Cliente(int id, String nome, Date nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
    }

    public Cliente(int id2, Object nome2, Object nascimento2, Object cpf2) {
		
	}

	// Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

	public void setEmail(String nextLine) {
		
	}

	public void setTelefone(String nextLine) {
		
	}

	public String getEmail() {
		
		return null;
	}

	public String getTelefone() {
	
		return null;
	}
}
