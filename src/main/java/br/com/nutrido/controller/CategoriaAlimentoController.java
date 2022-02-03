package br.com.nutrido.controller;

import java.sql.Connection;

import br.com.nutrido.dao.CategoriaAlimentoDAO;
import br.com.nutrido.factory.ConnectionFactory;

public class CategoriaAlimentoController {
    // Estabelecendo a conexao para acionar a DAO:
    private CategoriaAlimentoDAO categoriaAlimentoDao;

    public CategoriaAlimentoController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.categoriaAlimentoDao = new CategoriaAlimentoDAO(connection);
    }

    // public List<Alimento> listar() {        
    //     return alimentoDao.listar();
    // }
}
