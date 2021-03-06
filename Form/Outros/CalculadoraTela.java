/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dinamis.Form.Outros;

import Dinamis.Classes.Calculadora;

/**
 *
 * @author Juliano P
 */
public class CalculadoraTela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public CalculadoraTela() {
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

        BotaoLimpar = new javax.swing.JButton();
        BotaoMult = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        BotaoDiv = new javax.swing.JButton();
        BotaoMenos = new javax.swing.JButton();
        BotaoSoma = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Visor = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora Portátil 1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(217, 223));
        setResizable(false);
        setSize(new java.awt.Dimension(217, 223));

        BotaoLimpar.setText("CE");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        BotaoMult.setText("*");
        BotaoMult.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultActionPerformed(evt);
            }
        });

        Botao7.setText("7");
        Botao7.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao8.setText("8");
        Botao8.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao4.setText("4");
        Botao4.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setText("5");
        Botao5.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao1.setText("1");
        Botao1.setMaximumSize(new java.awt.Dimension(45, 23));
        Botao1.setMinimumSize(new java.awt.Dimension(45, 23));
        Botao1.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao2.setText("2");
        Botao2.setMaximumSize(new java.awt.Dimension(45, 23));
        Botao2.setMinimumSize(new java.awt.Dimension(45, 23));
        Botao2.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao9.setText("9");
        Botao9.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        Botao6.setText("6");
        Botao6.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao3.setText("3");
        Botao3.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao0.setText("0");
        Botao0.setToolTipText("");
        Botao0.setMaximumSize(new java.awt.Dimension(45, 23));
        Botao0.setMinimumSize(new java.awt.Dimension(45, 23));
        Botao0.setPreferredSize(new java.awt.Dimension(45, 23));
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });

        BotaoIgual.setText("=");
        BotaoIgual.setMaximumSize(new java.awt.Dimension(45, 23));
        BotaoIgual.setMinimumSize(new java.awt.Dimension(45, 23));
        BotaoIgual.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        BotaoDiv.setText("/");
        BotaoDiv.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivActionPerformed(evt);
            }
        });

        BotaoMenos.setText("-");
        BotaoMenos.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenosActionPerformed(evt);
            }
        });

        BotaoSoma.setText("+");
        BotaoSoma.setPreferredSize(new java.awt.Dimension(45, 23));
        BotaoSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomaActionPerformed(evt);
            }
        });

        Visor.setEditable(false);
        Visor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(Visor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoMult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Botao0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoLimpar)
                            .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        //Limpar o visor
        Visor.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "0"); 
    }//GEN-LAST:event_Botao0ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "1"); 
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "2"); 
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "3"); 
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "4"); 
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "5"); 
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "6"); 
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "7"); 
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "8"); 
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "9"); 
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
               //Mostrar resultado
        String valor = Visor.getText();
        System.out.println(">>>"+valor);
               
        Calculadora calculos = new Calculadora(); //chama a classe calculos
        String resultado = calculos.calculadora(valor);
        
        Visor.setText(resultado);
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomaActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "+"); 
    }//GEN-LAST:event_BotaoSomaActionPerformed

    private void BotaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenosActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "-"); 
    }//GEN-LAST:event_BotaoMenosActionPerformed

    private void BotaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "/"); 
    }//GEN-LAST:event_BotaoDivActionPerformed

    private void BotaoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultActionPerformed
               //Mostrar valor 
        String valor = Visor.getText();
        Visor.setText(valor + "*"); 
    }//GEN-LAST:event_BotaoMultActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoDiv;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMenos;
    private javax.swing.JButton BotaoMult;
    private javax.swing.JButton BotaoSoma;
    private javax.swing.JTextPane Visor;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
