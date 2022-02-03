package br.com.nutrido.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.nutrido.modelo.UnidadeMedida;

public class UnidadeMedidaDAO {
    private Connection connection;

    public UnidadeMedidaDAO(Connection connection) {
        this.connection = connection;
    }

    public void salvar(UnidadeMedida unidadeMedida) {
        try {
            String sqlQuery = "INSERT INTO unidade_medida (nome_unidade, nome_abreviado) VALUES (?, ?) ;";

            try (PreparedStatement pstm = connection
                    .prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, unidadeMedida.getNome());
                pstm.setString(2, unidadeMedida.getNomeAbreviado());
                pstm.execute();

                // Recuperando id_unidade auto_increment:
                try (ResultSet rst = pstm.getGeneratedKeys()) {
                    while (rst.next()) {
                        unidadeMedida.setId(rst.getInt(1));
                    }
                }
            }
        } catch (SQLException e) {
            // Excessao unchecked (tratamento na ConnectionFactory)
            throw new RuntimeException(e);
        }
    }

    public void deletar(Integer id) {
        try {
            String sqlQuery = "DELETE FROM unidade_medida WHERE id_unidade = ? ;";

            try (PreparedStatement pstm = connection
                    .prepareStatement(sqlQuery)) {
                pstm.setInt(1, id);
                pstm.execute();
            }
        } catch (SQLException e) {
            // Excessao unchecked (tratamento na ConnectionFactory)
            throw new RuntimeException(e);
        }
    }

    public void alterar(UnidadeMedida unidadeMedida) {
        try {
            String sqlQuery = "UPDATE unidade_medida SET nome_unidade = ? , nome_abreviado = ?"
                    + " WHERE id_unidade = ? ;";

            try (PreparedStatement pstm = connection
                    .prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS)) {
                pstm.setString(1, unidadeMedida.getNome());
                pstm.setString(2, unidadeMedida.getNomeAbreviado());
                pstm.setInt(3, unidadeMedida.getId());
                pstm.execute();
            }
        } catch (SQLException e) {
            // Excessao unchecked (tratamento na ConnectionFactory)
            throw new RuntimeException(e);
        }
    }

    public List<UnidadeMedida> listar() {
        try {
            List<UnidadeMedida> unidades = new ArrayList<UnidadeMedida>();
            String sqlQuery = "SELECT id_unidade, nome_unidade, nome_abreviado FROM unidade_medida ;";

            try (PreparedStatement pstm = connection
                    .prepareStatement(sqlQuery)) {
                pstm.execute();

                transformarResultSetEmUnidade(unidades, pstm);
            }
            return unidades;
        } catch (SQLException e) {
            // Excessao unchecked (tratamento na ConnectionFactory)
            throw new RuntimeException(e);
        }
    }

    private void transformarResultSetEmUnidade(List<UnidadeMedida> unidades, PreparedStatement pstm) {
        try {
            try (ResultSet rst = pstm.getResultSet()) {
                while (rst.next()) {
                    UnidadeMedida unidade = new UnidadeMedida(rst.getInt(1), rst.getString(2), rst.getString(3));
                    unidades.add(unidade);
                }
            }
        } catch (SQLException e) {
            // Excessao unchecked (tratamento na ConnectionFactory):
            throw new RuntimeException(e);
        }

    }

}
