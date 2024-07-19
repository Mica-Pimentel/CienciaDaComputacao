
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudea3", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void inserirProduto(Produto produto) {
        String sql = "INSERT INTO Produto (nome, marca, custo, venda, quantidade) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getMarca());
            stmt.setDouble(3, produto.getCusto());
            stmt.setDouble(4, produto.getVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> listarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM Produto";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setMarca(rs.getString("marca"));
                produto.setCusto(rs.getDouble("custo"));
                produto.setVenda(rs.getDouble("venda"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void atualizarProduto(Produto produto) {
        String sql = "UPDATE Produto SET nome = ?, marca = ?, custo = ?, venda = ?, quantidade = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getMarca());
            stmt.setDouble(3, produto.getCusto());
            stmt.setDouble(4, produto.getVenda());
            stmt.setInt(5, produto.getQuantidade());
            stmt.setInt(6, produto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletarProduto(int id) {
        String sql = "DELETE FROM Produto WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
