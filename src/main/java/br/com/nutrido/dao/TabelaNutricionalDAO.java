package br.com.nutrido.dao;

import java.sql.Connection;

public class TabelaNutricionalDAO {
    private Connection connection;

    public TabelaNutricionalDAO(Connection connection) {
        this.connection = connection;
    }
}
