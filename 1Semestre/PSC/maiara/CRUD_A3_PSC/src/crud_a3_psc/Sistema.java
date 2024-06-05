package crud_a3_psc;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;

public class Sistema {

    public static void execute(String comando) throws SQLException {
        Connection conexao = Conexao.getConnection();
        try {
            PreparedStatement declaracao = conexao.prepareStatement(comando);
            declaracao.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void cadastrarProdutos(String nome, String marca, double custo, double venda, int quantidade) {
        try {
            execute("INSERT INTO produtos  (nome, marca, custo, venda, quantidade) values("
                    +"'"+ nome+"'" + "," +"'"+ marca +"'"+ "," + custo + "," + venda + "," + quantidade + ") "
            );
            JOptionPane.showMessageDialog(null, "Produto cadastradao com sucesso!");

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao cadastradao!");
        }

    }

    public static void pesquisarProdutos(String nome) throws SQLException {
            if (!nome.equals("")) {
                execute("select * from produtos where" + nome + "LIKE?");
            }
           
    }
     public static void excluirProdutos(int id_prod)) {
        try {
            execute("delete INTO produtos where
            );
            JOptionPane.showMessageDialog(null, "Produto cadastradao com sucesso!");

        } catch (SQLException x) {
            JOptionPane.showMessageDialog(null, "Produto nao cadastradao!");
        }

    }

}
