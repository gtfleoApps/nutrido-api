package br.com.nutrido.controller;

import java.sql.Connection;

import br.com.nutrido.dao.AlimentoDAO;
import br.com.nutrido.factory.ConnectionFactory;

public class AlimentoController {
    // Estabelecendo a conexao para acionar a DAO:
    private AlimentoDAO alimentoDao;

    public AlimentoController() {
        Connection connection = new ConnectionFactory().recuperarConexao();
        this.alimentoDao = new AlimentoDAO(connection);
    }

    // public void deletar(Integer id) {
    //     this.produtoDao.deletar(id);
    // }

    // public void salvar(Produto produto) {
    //     this.produtoDao.salvar(produto);
    // }

    // public List<Produto> listar() {        
    //     return this.produtoDao.listar();
    // }

    // public void alterar(String nome, String descricao, Integer id) {
    //     this.produtoDao.alterar(nome, descricao, id);
    // }
}
