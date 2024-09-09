package www.unoplus.com.ao.gestaodedespesas.view;

import java.awt.Color;
import java.util.Random;

public class CadastroDeUsuarioView extends javax.swing.JFrame {

    public CadastroDeUsuarioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        emailTxt = new javax.swing.JTextField();
        nomeLbl = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        senhaLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        confsenhaLbl = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JPasswordField();
        confsenhaTxt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        erroLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TELA DE CADASTRO");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        emailTxt.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        nomeLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeLbl.setText("NOME");
        nomeLbl.setMaximumSize(new java.awt.Dimension(100, 20));
        nomeLbl.setMinimumSize(new java.awt.Dimension(100, 20));

        nomeTxt.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        senhaLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        senhaLbl.setText("SENHA");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLbl.setText("EMAIL");

        titulo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        titulo.setText("DADOS DO USUÁRIO");

        btnCadastrar.setBackground(new java.awt.Color(47, 129, 255));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        confsenhaLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confsenhaLbl.setText("CONFIRMAR SENHA");

        jSeparator1.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btnCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(confsenhaLbl)
                            .addComponent(emailTxt)
                            .addComponent(senhaLbl)
                            .addComponent(emailLbl)
                            .addComponent(nomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeTxt)
                            .addComponent(senhaTxt)
                            .addComponent(confsenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(nomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confsenhaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confsenhaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        erroLbl.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        erroLbl.setText("                 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(erroLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(erroLbl)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        
    }//GEN-LAST:event_emailTxtActionPerformed

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        nomeTxt.requestFocus();
    }//GEN-LAST:event_nomeTxtActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Random id = new Random();
        String nome = nomeTxt.getText().trim();
        String email = emailTxt.getText().trim();
        String senha = String.valueOf(senhaTxt.getPassword()).trim();
        String confsenha = String.valueOf(confsenhaTxt.getPassword()).trim();
        
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(hotmail\\.com|gmail\\.com)$";
        String regexPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d{2,5})(?=.*[_\\-!,;.@#$%^&*()+\\[\\]\\/\"'`~])[a-zA-Z\\d_\\-!,;.@#$%^&*()+\\[\\]\\/\"'`~]{8,12}$";
        
        boolean isValidEmail = email.matches(regexEmail);
        boolean isValidPassword = senha.matches(regexPassword);
        
        if(!isValidEmail){
            erroLbl.setText("Por favor, insira um email válido.");
            erroLbl.setForeground(Color.red);
        } else {
            erroLbl.setText("");
        }
        
        if(!isValidPassword){
            erroLbl.setText("Por favor, insira uma senha válido.");
            erroLbl.setForeground(Color.red);
        } else {
            erroLbl.setText("");
        }
        
        if(nome.isEmpty()){
            erroLbl.setText("Por favor, insira o seu nome.");
            erroLbl.setForeground(Color.red);
        } else if(email.isEmpty()){
            erroLbl.setText("Por favor, insira o seu email.");
            erroLbl.setForeground(Color.red);
        } else if(senha.isEmpty()){
            erroLbl.setText("Por favor, insira a sua senha.");
            erroLbl.setForeground(Color.red);
        } else if(confsenha.isEmpty()){
            erroLbl.setText("Por favor, insira novamente a sua senha.");
            erroLbl.setForeground(Color.red);
        } else {
            nomeTxt.setText("");
            emailTxt.setText("");
            senhaTxt.setText("");
            confsenhaTxt.setText("");
            
            System.out.println("Usuasrio cadastrado com sucesso!");
        } 
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDeUsuarioView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel confsenhaLbl;
    private javax.swing.JPasswordField confsenhaTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel erroLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nomeLbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel senhaLbl;
    private javax.swing.JPasswordField senhaTxt;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
