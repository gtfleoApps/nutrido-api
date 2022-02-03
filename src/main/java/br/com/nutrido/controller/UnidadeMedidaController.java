package br.com.nutrido.controller;

import java.sql.Connection;
import java.util.List;

import br.com.nutrido.dao.UnidadeMedidaDAO;
import br.com.nutrido.factory.ConnectionFactory;
import br.com.nutrido.modelo.UnidadeMedida;

public class UnidadeMedidaController {
    // Estabelecendo a conexao para acionar a DAO:
    private UnidadeMedidaDAO unidadeMedidaDao;

    public UnidadeMedidaController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.unidadeMedidaDao = new UnidadeMedidaDAO(connection);
    }

    public void salvar(UnidadeMedida unidadeMedida) {
        this.unidadeMedidaDao.salvar(unidadeMedida);
    }
    
    public void deletar(Integer id) {
        this.unidadeMedidaDao.deletar(id);
    }

    public void alterar(UnidadeMedida unidadeMedida) {
        this.unidadeMedidaDao.alterar(unidadeMedida);
    }

    public List<UnidadeMedida> listar() {
        return this.unidadeMedidaDao.listar();
    }
}
