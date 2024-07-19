import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends JFrame {

    private ProdutoDAO produtoDAO;
    private JTextField nomeField, marcaField, custoField, vendaField, quantidadeField;
    private JTable produtoTable;
    private DefaultTableModel tableModel;

    public MainFrame() {
        produtoDAO = new ProdutoDAO();
        setTitle("Cadastro de Produtos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel(new GridLayout(8, 2));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Marca:"));
        marcaField = new JTextField();
        panel.add(marcaField);

        panel.add(new JLabel("Custo:"));
        custoField = new JTextField();
        panel.add(custoField);

        panel.add(new JLabel("Venda:"));
        vendaField = new JTextField();
        panel.add(vendaField);

        panel.add(new JLabel("Quantidade:"));
        quantidadeField = new JTextField();
        panel.add(quantidadeField);

        JButton inserirButton = new JButton("Inserir");
        inserirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produto produto = new Produto();
                produto.setNome(nomeField.getText());
                produto.setMarca(marcaField.getText());
                produto.setCusto(Double.parseDouble(custoField.getText()));
                produto.setVenda(Double.parseDouble(vendaField.getText()));
                produto.setQuantidade(Integer.parseInt(quantidadeField.getText()));
                produtoDAO.inserirProduto(produto);
                listarProdutos();
                limparCampos();
            }
        });
        panel.add(inserirButton);

        JButton listarButton = new JButton("Listar");
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarProdutos();
            }
        });
        panel.add(listarButton);

        JButton editarButton = new JButton("Editar");
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarProduto();
            }
        });
        panel.add(editarButton);

        JButton excluirButton = new JButton("Excluir");
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                excluirProduto();
            }
        });
        panel.add(excluirButton);

        tableModel = new DefaultTableModel(new Object[]{"ID", "Nome", "Marca", "Custo", "Venda", "Quantidade"}, 0);
        produtoTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(produtoTable);

        produtoTable.getSelectionModel().addListSelectionListener(event -> {
            int selectedRow = produtoTable.getSelectedRow();
            if (selectedRow >= 0) {
                nomeField.setText(tableModel.getValueAt(selectedRow, 1).toString());
                marcaField.setText(tableModel.getValueAt(selectedRow, 2).toString());
                custoField.setText(tableModel.getValueAt(selectedRow, 3).toString());
                vendaField.setText(tableModel.getValueAt(selectedRow, 4).toString());
                quantidadeField.setText(tableModel.getValueAt(selectedRow, 5).toString());
            }
        });

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void listarProdutos() {
        List<Produto> produtos = produtoDAO.listarProdutos();
        tableModel.setRowCount(0); // Limpa a tabela antes de adicionar os novos dados
        for (Produto produto : produtos) {
            tableModel.addRow(new Object[]{produto.getId(), produto.getNome(), produto.getMarca(), produto.getCusto(), produto.getVenda(), produto.getQuantidade()});
        }
    }

    private void editarProduto() {
        int selectedRow = produtoTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            String nome = nomeField.getText();
            String marca = marcaField.getText();
            double custo = Double.parseDouble(custoField.getText());
            double venda = Double.parseDouble(vendaField.getText());
            int quantidade = Integer.parseInt(quantidadeField.getText());

            Produto produto = new Produto(id, nome, marca, custo, venda, quantidade);

            int result = JOptionPane.showConfirmDialog(this, "Deseja salvar as altera??es?", "Editar Produto", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                produtoDAO.atualizarProduto(produto);
                listarProdutos();
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para editar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void excluirProduto() {
        int selectedRow = produtoTable.getSelectedRow();
        if (selectedRow >= 0) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            int result = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este produto?", "Excluir Produto", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                produtoDAO.deletarProduto(id);
                listarProdutos();
                limparCampos();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um produto para excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        nomeField.setText("");
        marcaField.setText("");
        custoField.setText("");
        vendaField.setText("");
        quantidadeField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}