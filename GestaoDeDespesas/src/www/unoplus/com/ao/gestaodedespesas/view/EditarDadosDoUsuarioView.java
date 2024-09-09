package www.unoplus.com.ao.gestaodedespesas.view;

import java.awt.Color;

public class EditarDadosDoUsuarioView extends javax.swing.JFrame {

    
    public EditarDadosDoUsuarioView() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nomeLbl = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        senhaLbl = new javax.swing.JLabel();
        btnEditarEmail = new javax.swing.JButton();
        senhaTxt = new javax.swing.JPasswordField();
        btnEditarNome = new javax.swing.JButton();
        btnEditarSenha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 220, 220));

        nomeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeLbl.setText("Nome");

        nomeTxt.setText("Gilson Leonel Virgílio Loureiro");
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setText("Email");

        emailTxt.setText("gilson.leonel05@gmail.com");

        senhaLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        senhaLbl.setText("Senha");

        btnEditarEmail.setBackground(new java.awt.Color(47, 129, 255));
        btnEditarEmail.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditarEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEmail.setText("EDITAR");
        btnEditarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmailActionPerformed(evt);
            }
        });

        senhaTxt.setText("          ");

        btnEditarNome.setBackground(new java.awt.Color(47, 129, 255));
        btnEditarNome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditarNome.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarNome.setText("EDITAR");
        btnEditarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarNomeActionPerformed(evt);
            }
        });

        btnEditarSenha.setBackground(new java.awt.Color(47, 129, 255));
        btnEditarSenha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEditarSenha.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarSenha.setText("EDITAR");
        btnEditarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(senhaTxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditarSenha))
                            .addComponent(senhaLbl))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(emailLbl)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditarEmail)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeLbl)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditarNome))))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nomeLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(emailLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(senhaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel1.setText("EDITAR USUÁRIO");

        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        info.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(162, 162, 162))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(info))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        nomeTxt.requestFocus();
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void btnEditarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarNomeActionPerformed
        String novoNome = nomeTxt.getText().trim();
    }//GEN-LAST:event_btnEditarNomeActionPerformed

    private void btnEditarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmailActionPerformed
        String novoEmail = emailTxt.getText().trim();
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(hotmail\\.com|gmail\\.com)$";
        boolean isValidEmail = novoEmail.matches(regexEmail);
        
        if(!isValidEmail){
            info.setText("Por favor, insira um email válido.");
            info.setForeground(Color.red);
        } else {
            info.setText("");
        }
    }//GEN-LAST:event_btnEditarEmailActionPerformed

    private void btnEditarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSenhaActionPerformed
        String novaSenha = String.valueOf(senhaTxt.getPassword()).trim();
        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d{2,5})(?=.*[_\\-!,;.@#$%^&*()+\\[\\]\\/\"'`~])[a-zA-Z\\d_\\-!,;.@#$%^&*()+\\[\\]\\/\"'`~]{8,12}$";
        boolean isValidPassword = novaSenha.matches(regexPassword);
        
        if(!isValidPassword){
            info.setText("Por favor, insira uma senha válida.");
            info.setForeground(Color.red);
        } else {
            info.setText("");
        }
    }//GEN-LAST:event_btnEditarSenhaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditarDadosDoUsuarioView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarEmail;
    private javax.swing.JButton btnEditarNome;
    private javax.swing.JButton btnEditarSenha;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomeLbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel senhaLbl;
    private javax.swing.JPasswordField senhaTxt;
    // End of variables declaration//GEN-END:variables
}
