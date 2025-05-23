/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculadora.Visor;

import Calculadora.Calculo;

/**
 *
 * @author micael
 */
public class Visao extends javax.swing.JFrame {

    /**
     * Creates new form Visao
     */
    public Visao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tfValor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        ACButton = new javax.swing.JButton();
        NegativoPositivo = new javax.swing.JButton();
        Percent = new javax.swing.JButton();
        Divisao = new javax.swing.JButton();
        Cl = new javax.swing.JButton();
        Sete = new javax.swing.JButton();
        Oito = new javax.swing.JButton();
        Nove = new javax.swing.JButton();
        Multiplicacao = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        Quatro = new javax.swing.JButton();
        Cinco = new javax.swing.JButton();
        Seis = new javax.swing.JButton();
        adicao = new javax.swing.JButton();
        Virgula = new javax.swing.JButton();
        Um = new javax.swing.JButton();
        Dois = new javax.swing.JButton();
        Tres = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCSHOW");

        tfValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        panel1.setLayout(new java.awt.GridLayout(5, 4, 5, 10));

        ACButton.setText("AC");
        ACButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACButtonActionPerformed(evt);
            }
        });
        panel1.add(ACButton);

        NegativoPositivo.setText("+/-");
        NegativoPositivo.setToolTipText("");
        panel1.add(NegativoPositivo);

        Percent.setText("%");
        Percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentActionPerformed(evt);
            }
        });
        panel1.add(Percent);

        Divisao.setText("/");
        Divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisaoActionPerformed(evt);
            }
        });
        panel1.add(Divisao);

        Cl.setText("Cl");
        Cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClActionPerformed(evt);
            }
        });
        panel1.add(Cl);

        Sete.setText("7");
        Sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeteActionPerformed(evt);
            }
        });
        panel1.add(Sete);

        Oito.setText("8");
        Oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OitoActionPerformed(evt);
            }
        });
        panel1.add(Oito);

        Nove.setText("9");
        Nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoveActionPerformed(evt);
            }
        });
        panel1.add(Nove);

        Multiplicacao.setText("X");
        Multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacaoActionPerformed(evt);
            }
        });
        panel1.add(Multiplicacao);

        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });
        panel1.add(subtracao);

        Quatro.setText("4");
        Quatro.setToolTipText("");
        Quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuatroActionPerformed(evt);
            }
        });
        panel1.add(Quatro);

        Cinco.setText("5");
        Cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CincoActionPerformed(evt);
            }
        });
        panel1.add(Cinco);

        Seis.setText("6");
        Seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeisActionPerformed(evt);
            }
        });
        panel1.add(Seis);

        adicao.setText("+");
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });
        panel1.add(adicao);

        Virgula.setText(",");
        Virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VirgulaActionPerformed(evt);
            }
        });
        panel1.add(Virgula);

        Um.setText("1");
        Um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UmActionPerformed(evt);
            }
        });
        panel1.add(Um);

        Dois.setText("2");
        Dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoisActionPerformed(evt);
            }
        });
        panel1.add(Dois);

        Tres.setText("3");
        Tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TresActionPerformed(evt);
            }
        });
        panel1.add(Tres);

        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });
        panel1.add(Zero);

        Igual.setText("=");
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        panel1.add(Igual);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        panel1.add(Sair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfValor)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoveActionPerformed
        digita("9");
    }//GEN-LAST:event_NoveActionPerformed

    private void ACButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACButtonActionPerformed
        limpa();
    }//GEN-LAST:event_ACButtonActionPerformed

    private void TresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TresActionPerformed
        digita("3");
    }//GEN-LAST:event_TresActionPerformed

    private void VirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VirgulaActionPerformed
        digita(".");
    }//GEN-LAST:event_VirgulaActionPerformed

    private void CincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CincoActionPerformed
        digita("5");
    }//GEN-LAST:event_CincoActionPerformed

    private void UmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UmActionPerformed
        digita("1");
    }//GEN-LAST:event_UmActionPerformed

    private void DoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoisActionPerformed
        digita("2");
    }//GEN-LAST:event_DoisActionPerformed

    private void QuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuatroActionPerformed
        digita("4");
    }//GEN-LAST:event_QuatroActionPerformed

    private void SeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeisActionPerformed
        digita("6");
    }//GEN-LAST:event_SeisActionPerformed

    private void SeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeteActionPerformed
        digita("7");
    }//GEN-LAST:event_SeteActionPerformed

    private void OitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OitoActionPerformed
        digita("8");
    }//GEN-LAST:event_OitoActionPerformed

    private void ClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClActionPerformed
        limpaU();
    }//GEN-LAST:event_ClActionPerformed

    private void MultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacaoActionPerformed
        digita("*");
    }//GEN-LAST:event_MultiplicacaoActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        digita("-");
    }//GEN-LAST:event_subtracaoActionPerformed

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicaoActionPerformed
        digita("+");
    }//GEN-LAST:event_adicaoActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        String valor = tfValor.getText();
        System.out.println("" + valor);
        Calculo calculos = new Calculo();
        String resultado = calculos.calculadora(valor);
        tfValor.setText(resultado);

    }//GEN-LAST:event_IgualActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
        digita("0");
    }//GEN-LAST:event_ZeroActionPerformed

    private void PercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentActionPerformed
        digita("%");
    }//GEN-LAST:event_PercentActionPerformed

    private void DivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisaoActionPerformed
        digita("/");
    }//GEN-LAST:event_DivisaoActionPerformed

    private void digita(String caractere) {
        if (tfValor.getText().equals("")) {
            tfValor.setText(caractere);
        } else {
            if (caractere.equals(".") && tfValor.getText().contains(".")) {
                tfValor.setText(tfValor.getText().concat(caractere));
            } else {
                tfValor.setText(tfValor.getText().concat(caractere));
            }
        }
    }

    private void limpa() {

        tfValor.setText("");

    }

    
    private void limpaU(){
        StringBuffer erase = new StringBuffer(tfValor.getText());
        erase.reverse();
        erase.deleteCharAt(0);
        erase.reverse();
        String x = new String(erase);
        tfValor.setText(x);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACButton;
    private javax.swing.JButton Cinco;
    private javax.swing.JButton Cl;
    private javax.swing.JButton Divisao;
    private javax.swing.JButton Dois;
    private javax.swing.JButton Igual;
    private javax.swing.JButton Multiplicacao;
    private javax.swing.JButton NegativoPositivo;
    private javax.swing.JButton Nove;
    private javax.swing.JButton Oito;
    private javax.swing.JButton Percent;
    private javax.swing.JButton Quatro;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Seis;
    private javax.swing.JButton Sete;
    private javax.swing.JButton Tres;
    private javax.swing.JButton Um;
    private javax.swing.JButton Virgula;
    private javax.swing.JButton Zero;
    private javax.swing.JButton adicao;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Panel panel1;
    private javax.swing.JButton subtracao;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
