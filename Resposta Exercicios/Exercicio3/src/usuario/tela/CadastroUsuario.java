/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.tela;

import usuario.modelo.Endereco;
import usuario.modelo.Pessoa;

/**
 *
 * @author sakurai
 */
public class CadastroUsuario extends javax.swing.JFrame {

  /**
   * Creates new form CadastroUsuario
   */
  public CadastroUsuario() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    grupoSexo = new javax.swing.ButtonGroup();
    panelDadosPessoais = new javax.swing.JPanel();
    nomeLabel = new javax.swing.JLabel();
    nome = new javax.swing.JTextField();
    cpfLabel = new javax.swing.JLabel();
    cpf = new javax.swing.JFormattedTextField();
    dataNascimentoLabel = new javax.swing.JLabel();
    dataNascimento = new javax.swing.JFormattedTextField();
    estadoCivilLabel = new javax.swing.JLabel();
    estadoCivil = new javax.swing.JComboBox();
    sexoLabel = new javax.swing.JLabel();
    feminino = new javax.swing.JRadioButton();
    masculino = new javax.swing.JRadioButton();
    panelEndereco = new javax.swing.JPanel();
    enderecoLabel = new javax.swing.JLabel();
    endereco = new javax.swing.JTextField();
    numeroLabel = new javax.swing.JLabel();
    numero = new javax.swing.JTextField();
    cepLabel = new javax.swing.JLabel();
    cep = new javax.swing.JFormattedTextField();
    bairroLabel = new javax.swing.JLabel();
    bairro = new javax.swing.JTextField();
    cidadeLabel = new javax.swing.JLabel();
    cidade = new javax.swing.JTextField();
    gerarRelatorio = new javax.swing.JButton();
    novo = new javax.swing.JButton();
    panelRelatorio = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    relatorio = new javax.swing.JTextArea();
    panelInteresse = new javax.swing.JPanel();
    esportes = new javax.swing.JCheckBox();
    games = new javax.swing.JCheckBox();
    viagens = new javax.swing.JCheckBox();
    cinema = new javax.swing.JCheckBox();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Cadastro");

    panelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

    nomeLabel.setText("Nome:");

    cpfLabel.setText("CPF:");

    try {
      cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    dataNascimentoLabel.setText("Dt Nasc:");

    try {
      dataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    estadoCivilLabel.setText("Estado Civil:");

    estadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Separado(a)", "Viúvo(a)" }));

    sexoLabel.setText("Sexo:");

    grupoSexo.add(feminino);
    feminino.setSelected(true);
    feminino.setText("F");

    grupoSexo.add(masculino);
    masculino.setText("M");

    org.jdesktop.layout.GroupLayout panelDadosPessoaisLayout = new org.jdesktop.layout.GroupLayout(panelDadosPessoais);
    panelDadosPessoais.setLayout(panelDadosPessoaisLayout);
    panelDadosPessoaisLayout.setHorizontalGroup(
      panelDadosPessoaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelDadosPessoaisLayout.createSequentialGroup()
        .addContainerGap()
        .add(panelDadosPessoaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(panelDadosPessoaisLayout.createSequentialGroup()
            .add(nomeLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 262, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
            .add(cpfLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(cpf)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(dataNascimentoLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(dataNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .add(panelDadosPessoaisLayout.createSequentialGroup()
            .add(estadoCivilLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(estadoCivil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(56, 56, 56)
            .add(sexoLabel)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(feminino)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(masculino)
            .add(0, 0, Short.MAX_VALUE))))
    );
    panelDadosPessoaisLayout.setVerticalGroup(
      panelDadosPessoaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelDadosPessoaisLayout.createSequentialGroup()
        .add(panelDadosPessoaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(nomeLabel)
          .add(nome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(cpfLabel)
          .add(cpf, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(dataNascimentoLabel)
          .add(dataNascimento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(panelDadosPessoaisLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(estadoCivilLabel)
          .add(estadoCivil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(sexoLabel)
          .add(feminino)
          .add(masculino))
        .addContainerGap())
    );

    panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

    enderecoLabel.setText("Endereço:");

    numeroLabel.setText("Nº:");

    cepLabel.setText("CEP:");

    try {
      cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }

    bairroLabel.setText("Bairro:");

    cidadeLabel.setText("Cidade:");

    org.jdesktop.layout.GroupLayout panelEnderecoLayout = new org.jdesktop.layout.GroupLayout(panelEndereco);
    panelEndereco.setLayout(panelEnderecoLayout);
    panelEnderecoLayout.setHorizontalGroup(
      panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelEnderecoLayout.createSequentialGroup()
        .addContainerGap()
        .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(panelEnderecoLayout.createSequentialGroup()
            .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(enderecoLabel)
              .add(cepLabel))
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(panelEnderecoLayout.createSequentialGroup()
                .add(endereco)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(numeroLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(numero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
              .add(panelEnderecoLayout.createSequentialGroup()
                .add(cep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 96, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(bairroLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(bairro, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))))
          .add(panelEnderecoLayout.createSequentialGroup()
            .add(cidadeLabel)
            .add(18, 18, 18)
            .add(cidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 429, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    panelEnderecoLayout.setVerticalGroup(
      panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelEnderecoLayout.createSequentialGroup()
        .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(enderecoLabel)
          .add(endereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(numeroLabel)
          .add(numero, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(cepLabel)
          .add(cep, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(bairroLabel)
          .add(bairro, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(panelEnderecoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(cidadeLabel)
          .add(cidade, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
    );

    gerarRelatorio.setText("Gerar Relatório");
    gerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        gerarRelatorioActionPerformed(evt);
      }
    });

    novo.setText("Novo");
    novo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        novoActionPerformed(evt);
      }
    });

    panelRelatorio.setBorder(javax.swing.BorderFactory.createTitledBorder("Relatório"));

    relatorio.setColumns(20);
    relatorio.setRows(5);
    jScrollPane1.setViewportView(relatorio);

    org.jdesktop.layout.GroupLayout panelRelatorioLayout = new org.jdesktop.layout.GroupLayout(panelRelatorio);
    panelRelatorio.setLayout(panelRelatorioLayout);
    panelRelatorioLayout.setHorizontalGroup(
      panelRelatorioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelRelatorioLayout.createSequentialGroup()
        .addContainerGap()
        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelRelatorioLayout.setVerticalGroup(
      panelRelatorioLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelRelatorioLayout.createSequentialGroup()
        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        .addContainerGap())
    );

    panelInteresse.setBorder(javax.swing.BorderFactory.createTitledBorder("Interesse"));

    esportes.setText("Esportes");

    games.setText("Games");

    viagens.setText("Viagens");

    cinema.setText("Cinema");

    org.jdesktop.layout.GroupLayout panelInteresseLayout = new org.jdesktop.layout.GroupLayout(panelInteresse);
    panelInteresse.setLayout(panelInteresseLayout);
    panelInteresseLayout.setHorizontalGroup(
      panelInteresseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelInteresseLayout.createSequentialGroup()
        .add(145, 145, 145)
        .add(esportes)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(games)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(viagens)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(cinema)
        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    panelInteresseLayout.setVerticalGroup(
      panelInteresseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(panelInteresseLayout.createSequentialGroup()
        .add(panelInteresseLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(esportes)
          .add(games)
          .add(viagens)
          .add(cinema))
        .add(0, 10, Short.MAX_VALUE))
    );

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
          .add(layout.createSequentialGroup()
            .add(186, 186, 186)
            .add(gerarRelatorio)
            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
            .add(novo)
            .add(0, 0, Short.MAX_VALUE))
          .add(layout.createSequentialGroup()
            .addContainerGap()
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
              .add(org.jdesktop.layout.GroupLayout.TRAILING, panelInteresse, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(panelDadosPessoais, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(panelEndereco, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(panelRelatorio, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addContainerGap())
    );

    layout.linkSize(new java.awt.Component[] {gerarRelatorio, novo}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .addContainerGap()
        .add(panelDadosPessoais, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(panelEndereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(panelInteresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(gerarRelatorio)
          .add(novo))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(panelRelatorio, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void gerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioActionPerformed
    Pessoa novaPessoa = new Pessoa();
    novaPessoa.setNome(nome.getText());
    novaPessoa.setCpf(cpf.getText());
    novaPessoa.setDataNascimento(dataNascimento.getText());
    novaPessoa.setEstadoCivil((String) estadoCivil.getSelectedItem());
    if(feminino.isSelected()) {
      novaPessoa.setSexo("Feminino");
    } else {
      novaPessoa.setSexo("Masculino");
    }
    String interesses = "";
    if(esportes.isSelected()) {
      interesses += "Esportes ";
    }
    if(games.isSelected()) {
      interesses += "Games ";
    }
    if(viagens.isSelected()) {
      interesses += "Viagens ";
    }
    if(cinema.isSelected()) {
      interesses += "Cinema ";
    }
    
    novaPessoa.setInteresse(interesses);
    
    Endereco novoEndereco = new Endereco();
    novoEndereco.setEndereco(endereco.getText());
    if(numero.getText() != null && numero.getText().trim().length() > 0) {
      try {
        novoEndereco.setNumero(Integer.valueOf(numero.getText()));
      } catch (NumberFormatException e) {
        novoEndereco.setNumero(0);
      }
    } else {
      novoEndereco.setNumero(0);
    }
    novoEndereco.setCep(cep.getText());
    novoEndereco.setBairro(bairro.getText());
    novoEndereco.setCidade(cidade.getText());
    novaPessoa.setEndereco(novoEndereco);
    
    gerarRelatorio(novaPessoa);
  }//GEN-LAST:event_gerarRelatorioActionPerformed

  private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
    nome.setText("");
    cpf.setText("");
    dataNascimento.setText("");
    endereco.setText("");
    numero.setText("");
    cep.setText("");
    bairro.setText("");
    cidade.setText("");
    estadoCivil.setSelectedIndex(0);
    feminino.setSelected(true);
    masculino.setSelected(false);
    esportes.setSelected(false);
    games.setSelected(false);
    viagens.setSelected(false);
    cinema.setSelected(false);
  }//GEN-LAST:event_novoActionPerformed

  private void gerarRelatorio(Pessoa pessoa) {
    String texto = "==== Dados Pessoais ===="
            + "\nNome: " + pessoa.getNome()
            + "\nCPF: " + pessoa.getCpf()
            + "\nDt Nascimento: " + pessoa.getDataNascimento()
            + "\nEstado Civil: " + pessoa.getEstadoCivil()
            + "\nSexo: " + pessoa.getSexo()
            + "\n\n==== Endereço ===="
            + "\nEndereço: " + pessoa.getEndereco().getEndereco()
            + "\nNº: " + pessoa.getEndereco().getNumero()
            + "\nCEP: " + pessoa.getEndereco().getCep()
            + "\nBairro: " + pessoa.getEndereco().getBairro()
            + "\nCidade: " + pessoa.getEndereco().getCidade()
            + "\n\n==== Interesse ===="
            + "\n" + pessoa.getInteresse();
    
    relatorio.setText(texto);
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
      java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CadastroUsuario().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField bairro;
  private javax.swing.JLabel bairroLabel;
  private javax.swing.JFormattedTextField cep;
  private javax.swing.JLabel cepLabel;
  private javax.swing.JTextField cidade;
  private javax.swing.JLabel cidadeLabel;
  private javax.swing.JCheckBox cinema;
  private javax.swing.JFormattedTextField cpf;
  private javax.swing.JLabel cpfLabel;
  private javax.swing.JFormattedTextField dataNascimento;
  private javax.swing.JLabel dataNascimentoLabel;
  private javax.swing.JTextField endereco;
  private javax.swing.JLabel enderecoLabel;
  private javax.swing.JCheckBox esportes;
  private javax.swing.JComboBox estadoCivil;
  private javax.swing.JLabel estadoCivilLabel;
  private javax.swing.JRadioButton feminino;
  private javax.swing.JCheckBox games;
  private javax.swing.JButton gerarRelatorio;
  private javax.swing.ButtonGroup grupoSexo;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JRadioButton masculino;
  private javax.swing.JTextField nome;
  private javax.swing.JLabel nomeLabel;
  private javax.swing.JButton novo;
  private javax.swing.JTextField numero;
  private javax.swing.JLabel numeroLabel;
  private javax.swing.JPanel panelDadosPessoais;
  private javax.swing.JPanel panelEndereco;
  private javax.swing.JPanel panelInteresse;
  private javax.swing.JPanel panelRelatorio;
  private javax.swing.JTextArea relatorio;
  private javax.swing.JLabel sexoLabel;
  private javax.swing.JCheckBox viagens;
  // End of variables declaration//GEN-END:variables
}
