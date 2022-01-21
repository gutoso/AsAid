/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.asaid.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import br.com.asaid.ctr.ProdutoCTR;
import br.com.asaid.dto.ClienteDTO;
import br.com.asaid.dto.ProdutoDTO;
import br.com.asaid.dto.AdminDTO;
import java.awt.Dimension;

/**
 *
 * @author holly
 */
public class ProdutoVIEW extends javax.swing.JInternalFrame {

    ProdutoDTO produtoDTO = new ProdutoDTO();
    ProdutoCTR produtoCTR = new ProdutoCTR(); 
    ClienteDTO clienteDTO = new ClienteDTO();
    AdminDTO adminDTO = new AdminDTO();
    
    
    /**
     * Creates new form ProdutoVIEW
     */
    
    ResultSet rs; //Variavel usada para preenchimeto da tabela e dos campos
    int gravar_alterar; //Variavel usada para saber se esta alterando o incluindo
    DefaultTableModel modelo_jtlCli; //Variavel para guardar o modelo da tabela
 
    public ProdutoVIEW(AdminDTO adminDTO) {
        initComponents();
        this.setSize(768, 465);
        //Chama todos os métodos liberaCampos
        liberaCampos(false);
        this.adminDTO = adminDTO;
        //Chama o método liberaBotoes
        liberaBotoes(true, false, false, false, true);
        //Atribui um modelo para manipular a tabela 
        modelo_jtlCli = (DefaultTableModel) jtlCli.getModel();
    }

    
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }//Fecha método setPosicao()

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtChave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtlCli = new javax.swing.JTable();
        pesquisa_cod = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar produto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Código de acesso:");

        txtCod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Chave de acesso: ");

        txtChave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChaveKeyPressed(evt);
            }
        });

        txtObs.setColumns(20);
        txtObs.setRows(5);
        txtObs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtObsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtObs);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Descriçao:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtChave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setAlignmentY(0.0F);
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.setMaximumSize(new java.awt.Dimension(113, 35));
        btnNovo.setMinimumSize(new java.awt.Dimension(113, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setAlignmentY(0.0F);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar.setMaximumSize(new java.awt.Dimension(113, 35));
        btnSalvar.setMinimumSize(new java.awt.Dimension(113, 35));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setAlignmentY(0.0F);
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.setMaximumSize(new java.awt.Dimension(113, 35));
        btnExcluir.setMinimumSize(new java.awt.Dimension(113, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair.setMaximumSize(new java.awt.Dimension(113, 35));
        btnSair.setMinimumSize(new java.awt.Dimension(113, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jtlCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código de acesso", "Chave de acesso"
            }
        ));
        jtlCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtlCliMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtlCli);

        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/asaid/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setAlignmentY(0.0F);
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnPesquisar.setMaximumSize(new java.awt.Dimension(113, 35));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(113, 35));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel8.setText("Código do produto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addComponent(pesquisa_cod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtlCli.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(verificaPreenchimentoGeral()){
            if(gravar_alterar==1){
                gravar();
                gravar_alterar=0;
            }
            else{
                if(gravar_alterar==2){
                    alterar();
                    preencheTabela(Integer.parseInt(pesquisa_cod.getText()));
                    gravar_alterar=0;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
                }
            }
            limpaCampos();
            liberaCampos(false);
            liberaBotoes(true, false, false, false, true);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        preencheTabela(Integer.parseInt(pesquisa_cod.getText()));
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(Integer.parseInt(pesquisa_cod.getText()));
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void jtlCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtlCliMouseClicked
        //Pega a Pessoa selecionada e chama preencheCampos
        preencheCampos(Integer.parseInt(String.valueOf(jtlCli.getValueAt(jtlCli.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtlCliMouseClicked

    private void txtCodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodKeyPressed
       verificaTamanho(txtCod, 15);
    }//GEN-LAST:event_txtCodKeyPressed

    private void txtChaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChaveKeyPressed
       verificaTamanho(txtChave, 15);
    }//GEN-LAST:event_txtChaveKeyPressed

    private void txtObsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtObsKeyPressed
        verificaTamanho(txtObs, 300);
    }//GEN-LAST:event_txtObsKeyPressed

    /**
     * Método utilizado para gravar os dados do carro.
     */
    private void gravar(){
        try{
            produtoDTO.setCod_produto(Integer.parseInt(txtCod.getText()));
            produtoDTO.setSenha_produto(txtChave.getText());
            produtoDTO.setDesc_produto(txtObs.getText());
            
            JOptionPane.showMessageDialog(null,
                    produtoCTR.inserirProduto(produtoDTO, adminDTO)
            );
        }
        catch(Exception e){
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }//Fecha método gravar()
    
    
    /**
     * Método utilizado para excluir os dados do carro.
     */
    private void excluir(){
       if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Produto?","Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    produtoCTR.excluirProduto(produtoDTO)
            );
       }
    }//Fecha método excluir()
    
    
    /**
     * Método utilizado para alterar os dados do carro.
     */
    private void alterar(){
        try{
            produtoDTO.setCod_produto(Integer.parseInt(txtCod.getText()));
            produtoDTO.setSenha_produto(txtChave.getText());
            produtoDTO.setDesc_produto(txtObs.getText());
     
            JOptionPane.showMessageDialog(null,
                    produtoCTR.alterarProduto(produtoDTO)
            );
        }
        catch(Exception e){}
    }//Fecha método alterar()
    
    
    /**
     * Método utilizado para preencher/contruir a Jtable.
     * @param mar_car, String com a marca do carro
     */
    private void preencheTabela(int Cod_produto ){
        try{
            //Limpa todas as linhas
            modelo_jtlCli.setNumRows(0);

            //Enquanto tiver linhas - faça
            produtoDTO.setCod_produto(Cod_produto);
            rs = produtoCTR.consultarProduto(produtoDTO, adminDTO, 2); //2 = é o código
            while(rs.next()){
                modelo_jtlCli.addRow(new Object[]{
                    rs.getString("id_produto"),
                    rs.getString("cod_produto"),
                    rs.getString("sen_produto"),
                });
            }        
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheTabela(String mar_car)
    
    
    /**
     * Método utilizado para preencher os campos da tela com 
     * valores do carro.
     * @param id_car, int com o id do carro.
     */
    private void preencheCampos(int id_produto){
        try{
            produtoDTO.setId_produto(id_produto);
            rs = produtoCTR.consultarProduto(produtoDTO, adminDTO, 2); //2 = é a pesquisa no id na classe DAO
            if(rs.next()){
                limpaCampos();
                txtCod.setText(rs.getString("Cod_produto"));
                txtChave.setText(rs.getString("Sen_produto"));
                txtObs.setText(rs.getString("Desc_produto"));
                
                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheCampos(int id_car)
     
    
    /**
     * Método utilizado para liberar/bloquear os campos da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCampos(boolean a){
        txtCod.setEnabled(a);
        txtChave.setEnabled(a);
        txtObs.setEnabled(a);
    }//Fecha método liberaCampos(boolean a)
       
    
    /**
     * Método utilizado para limpar os campos da tela.
     */
    private void limpaCampos(){
        txtCod.setText("");
        txtChave.setText("");
        txtObs.setText("");
    }//Fecha método limpaCampos()
    
    
    /**
     * Método utilizado para liberar os botões da tela.
     * @param a, boolean com true(libera) false(bloqueia) para o btnNovo.
     * @param b, boolean com true(libera) false(bloqueia) para o btnSalvar.
     * @param c, boolean com true(libera) false(bloqueia) para o btnCancelar.
     * @param d, boolean com true(libera) false(bloqueia) para o btnExcluir.
     * @param e, boolean com true(libera) false(bloqueia) para o btnSair.
     */
    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnSair.setEnabled(e);
    }//Fecha método liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e)
    
    
    /**
     * Método utilizado para limitar o maximo de caracteres nos campos.
     * @param jtextfield, JTextField que recebe o campo.
     * @param maximo, int com o tamanho maximo do campo.
     */
    private void verificaTamanho(JTextField jtextfield, int maximo) {                            
        String tamanho = jtextfield.getText();
        if(tamanho.length() >= maximo){
              jtextfield.setText(jtextfield.getText().substring(0, maximo-1));
        }
    }//Fecha método verificaTamanho(JTextField jtextfield, int maximo)  
    
    
    /**
     * Método utilizado para limitar o maximo de caracteres nos campos.
     * @param jtextfield, JTextField que recebe o campo.
     * @param maximo, int com o tamanho maximo do campo.
     */
    private void verificaTamanho(JTextArea jtextarea, int maximo) {                            
        String tamanho = jtextarea.getText();
        if(tamanho.length() >= maximo){
              jtextarea.setText(jtextarea.getText().substring(0, maximo-1));
        }
    }//Fecha método verificaTamanho(JTextArea jtextarea, int maximo)  
    
    
    /**
     * Método utilizado para verificar se os campos estão preenchidos.
     * @return boolean false(campo não preenchido) true(campo preenchido).
     */
    private boolean verificaPreenchimentoGeral() {                            
        if(txtCod.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo Código de acesso deve ser preenchido");
            txtCod.requestFocus();
            return false;
        }
        else{
            if(txtChave.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "O campo Chave do produto deve ser preenchido");
                txtChave.requestFocus();
                return false;
            }
            else{
                if(txtObs.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "O campo Observaçoes deve ser preenchido");
                    txtObs.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtlCli;
    private javax.swing.JTextField pesquisa_cod;
    private javax.swing.JTextField txtChave;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
}
