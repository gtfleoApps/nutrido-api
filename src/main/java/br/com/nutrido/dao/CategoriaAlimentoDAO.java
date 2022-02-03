package br.com.nutrido.dao;

import java.sql.Connection;

public class CategoriaAlimentoDAO {
    private Connection connection;

    public CategoriaAlimentoDAO(Connection connection) {
        this.connection = connection;
    }
}
