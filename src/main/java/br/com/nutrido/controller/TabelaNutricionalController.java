package br.com.nutrido.controller;

import java.sql.Connection;

import br.com.nutrido.dao.TabelaNutricionalDAO;
import br.com.nutrido.factory.ConnectionFactory;

public class TabelaNutricionalController {
    // Estabelecendo a conexao para acionar a DAO:
    private TabelaNutricionalDAO tabelaNutricionalDao;

    public TabelaNutricionalController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.tabelaNutricionalDao = new TabelaNutricionalDAO(connection);
    }

    // public List<TabelaNutricional> listar() {        
    //     return TabelaNutricionalDao.listar();
    // }
}
