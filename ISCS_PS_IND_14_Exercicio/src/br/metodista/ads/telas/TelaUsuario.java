package br.metodista.ads.telas;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import br.metodista.ads.dao.UsuarioDao;
import br.metodista.ads.modelos.Usuario;
import javax.swing.JOptionPane;

public class TelaUsuario extends javax.swing.JFrame {

    private List<Usuario> usuarios = null;
    private int linhaSelecionada = -1;

    /**
     * Creates new form TelaUsuario
     */
    public TelaUsuario() {
        initComponents();
        carregarUsuarios();
        this.remover.setEnabled(false);
        this.ID.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        ID = new javax.swing.JLabel();
        novo = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setText("Nome:");

        jLabel3.setText("Login:");

        jLabel4.setText("Senha:");

        ID.setText("ID");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jLabel4))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nome)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(login, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .add(senha))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(ID)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(login, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(senha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ID)))
        );

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(novo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(salvar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(remover)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(novo)
                    .add(salvar)
                    .add(remover))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
      limparDados();
  }//GEN-LAST:event_novoActionPerformed

    private void limparDados() {
        this.nome.setText("");
        this.login.setText("");
        this.senha.setText("");

        this.linhaSelecionada = -1;
        this.login.setEnabled(true);
        this.remover.setEnabled(false);
    }

  private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

      try {
          if (this.validarDados()) {
              UsuarioDao _dao = new UsuarioDao();

              Usuario u = obterUsuario(usuarios, login.getText());

              //Se o usuário for novo adiciona ele na lista.
              if (u == null) {
                  u = new Usuario();
                  u.setNome(nome.getText());
                  u.setLogin(login.getText());
                  u.setSenha(new String(senha.getPassword()));

                  _dao.inserir(u);
                  
              } else {
                  //Se o usuário já existir apenas atualiza o nome e senha.
                  u.setID(Integer.valueOf(ID.getText()));
                  u.setNome(nome.getText());
                  u.setSenha(new String(senha.getPassword()));

                  _dao.atualizar(u);
              }

              carregarUsuarios();

              limparDados();

              JOptionPane.showMessageDialog(this, "Cadastrado efetuado com sucesso!!!", "Usuários", JOptionPane.INFORMATION_MESSAGE);
          }
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "Erro ao salvar as informações: " + e.toString(), "Usuários", JOptionPane.ERROR_MESSAGE);
      }
  }//GEN-LAST:event_salvarActionPerformed

    private Usuario obterUsuario(List<Usuario> usuarios, String login) {
        Usuario usuario = null;
        //Percorre todos os usuário para verificar se existe um usuário com o login informado.
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login)) {
                usuario = u;
                //Se encontrar o usuário, para de procurar.
                break;
            }
        }

        return usuario;
    }

  private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
      //Linha da tabela que foi clicada.
      linhaSelecionada = tabela.getSelectedRow();

      //Obtém o usuário da linha selecionada e preenche o formulário.
      Usuario u = usuarios.get(linhaSelecionada);
      preencherDadosUsuario(u);

      //Arruma os controles.
      this.login.setEnabled(false);
      this.remover.setEnabled(true);
  }//GEN-LAST:event_tabelaMouseClicked

  private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed

      try {

          if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o usuário?", "Usuários", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
              
              UsuarioDao _dao = new UsuarioDao();
              _dao.excluir(Integer.valueOf(this.ID.getText()));
              
              //Remove o usuário da lista.
              usuarios.remove(linhaSelecionada);

              //Remove o usuário da tabela.
              ((DefaultTableModel) tabela.getModel()).removeRow(linhaSelecionada);

              carregarUsuarios();
              
              limparDados();
              
              JOptionPane.showMessageDialog(this, "Cadastrado excluído com sucesso!!!", "Usuários", JOptionPane.INFORMATION_MESSAGE);
          }          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "Erro ao salvar as informações: " + e.toString(), "Usuários", JOptionPane.ERROR_MESSAGE);
      }
  }//GEN-LAST:event_removerActionPerformed

    private void preencherDadosUsuario(Usuario u) {
        this.ID.setText(String.valueOf(u.getID()));
        this.nome.setText(u.getNome());
        this.login.setText(u.getLogin());
        this.senha.setText(u.getSenha());
    }

    private void carregarUsuarios() {
        
        try {
            //Remove todos os usuários da tabela.
            for (int cont = tabela.getRowCount() - 1; cont >= 0; cont--) {
                ((DefaultTableModel) tabela.getModel()).removeRow(cont);
            }

            usuarios = (new UsuarioDao()).listar();

            //Adiciona todos os usuários na tabela.
            for (Usuario u : usuarios) {
                ((DefaultTableModel) tabela.getModel()).addRow(u.getDados());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar as informações: " + e.toString(), "Usuários", JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean validarDados() {
        boolean _validado = true;

        if (nome.getText().equals("")) {
            _validado = false;
            JOptionPane.showMessageDialog(this, "Digite o Login do Usuário.");
        }

        if (login.getText().equals("")) {
            _validado = false;
            JOptionPane.showMessageDialog(this, "Digite o Login do Usuário.");
        }

        if ((new String(senha.getPassword()).equals(""))) {
            _validado = false;
            JOptionPane.showMessageDialog(this, "Insira a Senha do Usuário.");
        }

        return _validado;
    }

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
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField login;
    private javax.swing.JTextField nome;
    private javax.swing.JButton novo;
    private javax.swing.JButton remover;
    private javax.swing.JButton salvar;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
