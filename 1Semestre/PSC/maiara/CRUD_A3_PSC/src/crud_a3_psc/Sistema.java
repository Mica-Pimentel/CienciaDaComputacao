package crud_a3_psc;

import com.mysql.cj.jdbc.ConnectionImpl;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sistema {

    public static void execute(String comando) throws SQLException {
        Connection conexao = Conexao.getConnection();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(comando);
            declaracao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            if (conexao != null) {
                conexao.close();
            }
        }
    }

    public static ResultSet executeQuery(String comando) throws SQLException {
        Connection conexao = Conexao.getConnection();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(comando);
            return declaracao.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showInternalInputDialog(null, e);
        }
        return null;

    }

    public static void cadastrarProdutos(String nome, String marca, double custo, double venda, int quantidade) {
        try {
            execute("INSERT INTO produtos  (nome, marca, custo, venda, quantidade) values("
                    + "'" + nome + "'" + "," + "'" + marca + "'" + "," + custo + "," + venda + "," + quantidade + ") "
            );
            JOptionPane.showMessageDialog(null, "Produto cadastradao com sucesso!");

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao cadastradao!");
        }

    }

    public static void pesquisarProdutos(String nome, DefaultTableModel model) throws SQLException {
        String query = "SELECT * FROM produtos WHERE nome LIKE ?";
        try (Connection conexao = Conexao.getConnection(); PreparedStatement declaracao = conexao.prepareStatement(query)) {

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
            //execute("update produtos set nome = '" + nome + "', marca = '" + marca + "' ,custo = " + custo
            //                 + ",venda= " + venda + ",quantidade = " + quantidade + "WHERE  id_prod = " + id);
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!");

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao atualizado!");
        }

    }
}
