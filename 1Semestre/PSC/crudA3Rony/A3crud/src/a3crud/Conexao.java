package a3crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Conexao {

    private static String url = "jdbc:mysql://localhost:3306/crudea3";
    private static String user = "root";
    private static String key = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, key);
    }

    public static void execute(String comando) throws SQLException {
        try {
            PreparedStatement declaracao = getConnection().prepareStatement(comando);
            declaracao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static ResultSet query(String comando) throws SQLException {
        try {
            PreparedStatement declaracao = getConnection().prepareStatement(comando);
            return declaracao.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showInternalInputDialog(null, e);
        }
        return null;
    }

    public static void cadastarBD(String nome, String marca, double custo, double venda, int quantidade) throws SQLException {
        try {
            execute("insert into produtos(nome, marca, custo, venda, quantidade) values('" + nome + "', '" + marca + "', '" + custo + "', '" + venda + "', '" + quantidade + "') ");
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao cadastradao!");
        }
    }

    public static void pesquisarBd(String nome, DefaultTableModel model) throws SQLException {
        String query = "SELECT * FROM produtos WHERE nome LIKE ?";
        try (PreparedStatement declaracao = getConnection().prepareStatement(query)) {
            declaracao.setString(1, "%" + nome + "%");

            ResultSet retorno = declaracao.executeQuery();
            model.setNumRows(0);
            while (retorno.next()) {
                String[] linha = {retorno.getString("id_prod"),
                    retorno.getString("nome"),
                    retorno.getString("marca"),
                    retorno.getString("custo"),
                    retorno.getString("venda"),
                    retorno.getString("quantidade")
                };
                model.addRow(linha);
            }

            if (!model.getDataVector().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Produtos encontrados!");
            } else {
                JOptionPane.showMessageDialog(null, "Produtos n?o encontrados!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar produtos: " + e.getMessage());
        }
    }

    public static void deletarBd(int id) {
        try {
            execute("DELETE FROM produtos WHERE  id_prod=" + id);
            JOptionPane.showMessageDialog(null, "Produto(s) excluidos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Produto(s) excluidos" + e.getMessage());
        }
    }

    public static void excluirProduto(int id) throws SQLException {
        try {
            execute("DELETE FROM produtos WHERE  id_prod=" + id);
            JOptionPane.showMessageDialog(null, "Produto(s) excluidos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Produto(s) excluidos" + e.getMessage());
        }
    }

    public static void updateProduto(int id, String nome, String marca, double custo, double venda, int quantidade) {
        try {
            execute("update produtos SET nome = \"" + nome + "\", marca= \"" + marca + "\", custo = " + custo + ", venda=" + venda
                    + ",quantidade = " + quantidade + " WHERE id_prod = " + id);

            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao atualizado!");
        }

    }

}
