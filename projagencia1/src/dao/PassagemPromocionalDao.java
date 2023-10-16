package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelos.Destino;
import modelos.PassagemPromocional;

public class PassagemPromocionalDao {
    private List<PassagemPromocional> promocoes; // Simulando uma lista de promoções em memória

    public PassagemPromocionalDao() {
        promocoes = new ArrayList<>();
        // Preencher a lista com alguns exemplos
        promocoes.add(new PassagemPromocional(1, 123, "João da Silva", new Date(), "Salvador", new Destino(1, "Origem1", "Destino1", "Voo1", true), 500.0, new Date(), "DESC1", 50.0, null));
        promocoes.add(new PassagemPromocional(2, 124, "Maria Oliveira", new Date(), "Rio de Janeiro", new Destino(2, "Origem2", "Destino2", "Voo2", true), 400.0, new Date(), "DESC2", 40.0, null));
    }

    public void create(PassagemPromocional passagem) {
        // Simular a inserção de uma passagem promocional na lista (você substituirá por operações no banco de dados real)
        promocoes.add(passagem);
    }

    public List<PassagemPromocional> readPromocoes() {
        // Simular a leitura de todas as promoções
        return promocoes;
    }

    public List<Destino> readDestinosDisponiveis() {
        List<Destino> destinos = new ArrayList<>();
        // Obter destinos disponíveis com base nas promoções (simulação)
        for (PassagemPromocional promocao : promocoes) {
            destinos.add(promocao.getDestino());
        }
        return destinos;
    }

    public void update(PassagemPromocional passagem) {
        // Simular a atualização de uma passagem promocional (você substituirá por operações no banco de dados real)
        for (PassagemPromocional p : promocoes) {
            if (p.getId() == passagem.getId()) {
                p.setCodigoDesconto(passagem.getCodigoDesconto());
                p.setValorDesconto(passagem.getValorDesconto());
                p.setValidadeDesconto(passagem.getValidadeDesconto());
            }
        }
    }

    public void delete(int id) {
        // Simular a exclusão de uma passagem promocional da lista (você substituirá por operações no banco de dados real)
        promocoes.removeIf(p -> p.getId() == id);
    }

    public PassagemPromocional readById(int id) {
        // Simular a leitura de uma passagem promocional por ID
        for (PassagemPromocional promocao : promocoes) {
            if (promocao.getId() == id) {
                return promocao;
            }
        }
        return null;
    }

	public List<PassagemPromocional> readAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
