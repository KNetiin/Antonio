/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view_controller;

import javax.swing.table.DefaultTableModel;
import model.dao.ClientesDAO;
import model.dao.VendedoresDAO;
import model.ldxps.Clientes;
import model.ldxps.Vendedores;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Home");        
        
        VendedoresDAO dao = new VendedoresDAO();
        int i = 0;
        for(Vendedores v: dao.findAll()){
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{"CDVEND", "DSNOME", "CDTAB", "DTNASC"});
            
            table.getModel().setValueAt(v.getCdvend(), i, 0);
            table.getModel().setValueAt(v.getDsnome(), i, 1);
            table.getModel().setValueAt(v.getCdtab(), i, 2);
            table.getModel().setValueAt(v.getDtnasc(), i, 3);
            i++;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"CDVEND", "DSNOME", "CDTAB", "DTNASC"});
            
        table.getModel().setValueAt("TODOS", i, 0);
        table.getModel().setValueAt("TODOS", i, 1);
        table.getModel().setValueAt("TODOS", i, 2);
        table.getModel().setValueAt("TODOS", i, 3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b_editarV = new javax.swing.JButton();
        b_criarC = new javax.swing.JButton();
        b_criarV = new javax.swing.JButton();
        b_editarC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CDCL", "DSNOME", "IDTIPO", "DSLIM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table2);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CDVEND", "DSNOME", "CDTAB", "DTNASC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("Vendedores");

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("Clientes");

        b_editarV.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_editarV.setText("Editar Vendedor");
        b_editarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarVActionPerformed(evt);
            }
        });

        b_criarC.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_criarC.setText("Criar Cliente");
        b_criarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_criarCActionPerformed(evt);
            }
        });

        b_criarV.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_criarV.setText("Criar Vendedor");
        b_criarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_criarVActionPerformed(evt);
            }
        });

        b_editarC.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_editarC.setText("Editar Cliente");
        b_editarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_editarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(b_criarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_editarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_editarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addComponent(b_criarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2)
                        .addGap(264, 264, 264)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_criarV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(b_editarV, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(b_criarC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(b_editarC, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_editarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarVActionPerformed
        int linha = table.getSelectedRow();
        if(linha < 0){
            System.out.println("Selecionar um vendedor!");//arrumar isso dps
            return;
        }
        this.setVisible(false);
        new Cadastro_Vendedor((String) table.getValueAt(linha, 0), (String) table.getValueAt(linha, 1), table.getValueAt(linha, 2).toString(), (String) table.getValueAt(linha, 3));
    }//GEN-LAST:event_b_editarVActionPerformed

    private void b_criarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_criarCActionPerformed
        this.setVisible(false);
        new Cadastro_Cliente();
    }//GEN-LAST:event_b_criarCActionPerformed

    private void b_criarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_criarVActionPerformed
        this.setVisible(false);
        new Cadastro_Vendedor();
    }//GEN-LAST:event_b_criarVActionPerformed

    private void b_editarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_editarCActionPerformed
        int linha = table2.getSelectedRow();
        int linha2 = table.getSelectedRow();
        if(linha < 0){
            System.out.println("Selecionar um cliente!");//arrumar isso dps
            return;
        }
        this.setVisible(false);
        new Cadastro_Cliente((String) table2.getValueAt(linha, 0), (String) table2.getValueAt(linha, 1), (String) table2.getValueAt(linha, 2), (String) table.getValueAt(linha2,0), (Double) table2.getValueAt(linha, 3));
    }//GEN-LAST:event_b_editarCActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int linha = table.getSelectedRow();
        String cd = (String) table.getValueAt(linha, 0);
        
        
        DefaultTableModel model1 = (DefaultTableModel) table2.getModel();
        model1.getDataVector().removeAllElements();
        model1.fireTableDataChanged();
                
        ClientesDAO dao = new ClientesDAO();
        int i = 0;
        
        if(cd.equals("TODOS")){
            for(Clientes c: dao.findAll()){
            
            DefaultTableModel model = (DefaultTableModel) table2.getModel();
            model.addRow(new Object[]{"CDCL", "DSNOME", "IDTIPO", "DSLIM"});
            
            table2.getModel().setValueAt(c.getCdcl(), i, 0);
            table2.getModel().setValueAt(c.getDsnome(), i, 1);
            table2.getModel().setValueAt(c.getIdtipo(), i, 2);
            table2.getModel().setValueAt(c.getDslim(), i, 3);
            i++;
            }
            return;
        }
        for(Clientes c: dao.findClients(cd)){
            
            DefaultTableModel model = (DefaultTableModel) table2.getModel();
            model.addRow(new Object[]{"CDCL", "DSNOME", "IDTIPO", "DSLIM"});
            
            table2.getModel().setValueAt(c.getCdcl(), i, 0);
            table2.getModel().setValueAt(c.getDsnome(), i, 1);
            table2.getModel().setValueAt(c.getIdtipo(), i, 2);
            table2.getModel().setValueAt(c.getDslim(), i, 3);
            i++;
        }
        
        
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_criarC;
    private javax.swing.JButton b_criarV;
    private javax.swing.JButton b_editarC;
    private javax.swing.JButton b_editarV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
