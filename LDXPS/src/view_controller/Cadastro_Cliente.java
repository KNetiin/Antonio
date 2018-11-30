/*     NOME:        ANTONIO CARLOS NETO 
 *     EMPRESA:     LANDIX                              
 *     DESCRICAO:
 *                  A VIEW E CONTROLLER DA CLASSE CLIENTES. 
 */
package view_controller;

import java.util.UUID;
import javax.swing.table.DefaultTableModel;
import model.dao.ClientesDAO;
import model.dao.VendedoresDAO;
import model.ldxps.Clientes;
import model.ldxps.Vendedores;


public class Cadastro_Cliente extends javax.swing.JFrame {
    private String cod = null;
    private String cd = null;
    private int index = -1;

    public Cadastro_Cliente() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Cadastro Cliente");
        
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
        
    }
    
    public Cadastro_Cliente(String CDCL, String DSNOME, String IDTIPO, String CDVEND, Double DSLIM) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Cadastro Cliente");
        
        this.cod = CDCL;
        
        VendedoresDAO dao = new VendedoresDAO();
        int i = 0;
        for(Vendedores v: dao.findAll()){
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[]{"CDVEND", "DSNOME", "CDTAB", "DTNASC"});
            
            if(cd == v.getCdvend())
                index = i;
            table.getModel().setValueAt(v.getCdvend(), i, 0);
            table.getModel().setValueAt(v.getDsnome(), i, 1);
            table.getModel().setValueAt(v.getCdtab(), i, 2);
            table.getModel().setValueAt(v.getDtnasc(), i, 3);
            i++;
        }
        
        this.texto_nome.setText(DSNOME);
        this.texto_credito.setText(DSLIM+ "");
        if( "PF".equals(IDTIPO)) this.texto_pessoa.setSelectedIndex(1);
        this.cd = CDVEND;
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        texto_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        texto_credito = new javax.swing.JTextField();
        texto_pessoa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b_criar = new javax.swing.JButton();
        b_excluir = new javax.swing.JButton();
        b_Confirmar = new javax.swing.JButton();
        mensagem = new javax.swing.JLabel();
        lista = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel1.setText("Nome:  ");

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("DADOS DO CLIENTE");

        texto_nome.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        texto_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_nomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel3.setText("Limite de Crédito: ");

        texto_credito.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        texto_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_creditoActionPerformed(evt);
            }
        });

        texto_pessoa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        texto_pessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PF", "PJ" }));

        jLabel4.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel4.setText("Tipo de Pessoa: ");

        jLabel5.setFont(new java.awt.Font("Roboto", 2, 18)); // NOI18N
        jLabel5.setText("Vendedor: ");

        b_criar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_criar.setText("Criar Vendedor");
        b_criar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_criarActionPerformed(evt);
            }
        });

        b_excluir.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_excluir.setText("Excluir");
        b_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_excluirActionPerformed(evt);
            }
        });

        b_Confirmar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        b_Confirmar.setText("Confirmar");
        b_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ConfirmarActionPerformed(evt);
            }
        });

        mensagem.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        table.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CDVEND", "DSNOME", "CDTAB", "DTNASC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        lista.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_Confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(texto_credito, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(texto_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lista)
                        .addGap(18, 18, 18)
                        .addComponent(b_criar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(texto_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(texto_credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 150, Short.MAX_VALUE)
                        .addComponent(b_criar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(texto_pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texto_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_nomeActionPerformed

    private void texto_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texto_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texto_creditoActionPerformed

    private void b_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_excluirActionPerformed
        if(this.cod == null){
            System.out.println("Não é possível excluir!");
            this.setVisible(false);
            new Home();
            return;
        }
        ClientesDAO dao = new ClientesDAO();
        if(dao.delete(this.cod)){
            System.out.println("Deletado com sucesso!");
            this.setVisible(false);
            new Home();
        }else{
            System.out.println("Erro ao deletar vendedores");
        }
    }//GEN-LAST:event_b_excluirActionPerformed

    private void b_criarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_criarActionPerformed
        this.setVisible(false);
        new Cadastro_Vendedor();
    }//GEN-LAST:event_b_criarActionPerformed

    private void b_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ConfirmarActionPerformed
        String nome = texto_nome.getText();
        if(nome.length() <= 0 || nome.length() > 50){
            mensagem.setText("Nome incorreto, tamanho máximo 50!");
            return;
        }
        
        double limite;
        try{
            limite = Double.parseDouble(texto_credito.getText());
        } catch (NumberFormatException e){
            mensagem.setText("Limite de Crédito deve ser um valor numérico!");
            return;
        }
        
        if(limite > 999999999999999.99){
            mensagem.setText("Limite de Crédito deve ser menor que 999999999999999.99!");
            return;
        }
        
        int linha = table.getSelectedRow();
        if(linha < 0 && this.cod == null){
            mensagem.setText("Selecionar um vendedor!");
            return;
        }
        String cd = (String) table.getValueAt(linha, 0);
        
        String tipo = (String) texto_pessoa.getSelectedItem();
        
        UUID uuid = UUID.randomUUID();
        String guid = uuid.toString();
        if(guid.length() > 36 || guid.length() < 1){
            mensagem.setText("Erro Inesperado");
            return;
        }
        
        if(index != -1)
            linha = index;
        
        Vendedores v = new Vendedores((String) table.getValueAt(linha, 0),(String) table.getValueAt(linha, 1),(int) table.getValueAt(linha, 2),(String) table.getValueAt(linha, 3));
        
        Clientes c;
        
        if(this.cod == null){
            c = new Clientes(guid, nome, tipo, limite,v);
            ClientesDAO dao = new ClientesDAO();
            if(!dao.insert(c)){
                mensagem.setText("Erro ao salvar!");
                return;
            }
            this.setVisible(false);
            new Home();
        }
        
        c = new Clientes(cod, nome, tipo, limite,v);
        ClientesDAO dao = new ClientesDAO();
            
        if(dao.update(c)){
            System.out.println("Salvo com sucesso!");
        }else{
            System.out.println("Erro ao atualizar vendedores");
            return;
        }
        this.setVisible(false);
        new Home();
        
    }//GEN-LAST:event_b_ConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Confirmar;
    private javax.swing.JButton b_criar;
    private javax.swing.JButton b_excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane lista;
    private javax.swing.JLabel mensagem;
    private javax.swing.JTable table;
    private javax.swing.JTextField texto_credito;
    private javax.swing.JTextField texto_nome;
    private javax.swing.JComboBox<String> texto_pessoa;
    // End of variables declaration//GEN-END:variables
}
