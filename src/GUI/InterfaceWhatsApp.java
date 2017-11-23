package GUI;


import Classes.Conversa;
import Classes.Mensagem;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class InterfaceWhatsApp extends javax.swing.JFrame {

    private String nome;
    private String telUsuario;



    public InterfaceWhatsApp() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl_telefoneContato = new javax.swing.JLabel();
        lbl_vistoPorUltimo = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        radio_eu = new javax.swing.JRadioButton();
        txt_mensagem = new javax.swing.JTextField();
        radio_contato = new javax.swing.JRadioButton();
        btn_enviar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jConversa = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_Contatos = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        txt_pesquisarContatos1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 5, true));
        jPanel5.setForeground(new java.awt.Color(0, 51, 0));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("status: ");

        lbl_nome.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nome.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nome)
                    .addComponent(jLabel7))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(7, 7, 7))
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 5, true));
        jPanel7.setToolTipText("");

        lbl_telefoneContato.setBackground(new java.awt.Color(0, 204, 102));
        lbl_telefoneContato.setForeground(new java.awt.Color(204, 204, 204));
        lbl_telefoneContato.setText("Telefone contato");

        lbl_vistoPorUltimo.setForeground(new java.awt.Color(204, 204, 204));
        lbl_vistoPorUltimo.setText("visto por último: ");

        lbl_hora.setForeground(new java.awt.Color(204, 204, 204));
        lbl_hora.setText("20:02");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_telefoneContato)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbl_vistoPorUltimo)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_telefoneContato, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_vistoPorUltimo)
                    .addComponent(lbl_hora))
                .addGap(5, 5, 5))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 185, 84)));
        jPanel3.setEnabled(false);

        radio_eu.setBackground(new java.awt.Color(29, 185, 84));
        buttonGroup1.add(radio_eu);
        radio_eu.setText("eu");
        radio_eu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_euActionPerformed(evt);
            }
        });

        txt_mensagem.setBackground(new java.awt.Color(204, 204, 204));
        txt_mensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_mensagemKeyPressed(evt);
            }
        });

        radio_contato.setBackground(new java.awt.Color(29, 185, 84));
        buttonGroup1.add(radio_contato);
        radio_contato.setText("contato");
        radio_contato.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_contatoItemStateChanged(evt);
            }
        });

        btn_enviar.setBackground(new java.awt.Color(29, 185, 84));
        btn_enviar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        btn_enviar.setForeground(new java.awt.Color(102, 102, 102));
        btn_enviar.setText("Enviar");
        btn_enviar.setToolTipText("");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_mensagem)
                        .addGap(8, 8, 8)
                        .addComponent(btn_enviar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(radio_eu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_contato)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enviar)
                    .addComponent(txt_mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_contato)
                    .addComponent(radio_eu))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jConversa.setEditable(false);
        jConversa.setBackground(new java.awt.Color(204, 204, 204));
        jConversa.setColumns(1);
        jConversa.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jConversa.setLineWrap(true);
        jConversa.setRows(5);
        jConversa.setTabSize(1);
        jConversa.setAutoscrolls(false);
        jConversa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jConversa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setToolTipText("");

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 1, true));

        jList_Contatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jList_Contatos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "912345678", "987654321", "914725836", "936258147", "998745632", "915462382", "964527351", "905420367", "975361509", "974106546", "913512061", "198190916", "981541984", "111111111" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList_Contatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Contatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ContatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_Contatos);

        jScrollPane4.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel6);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 185, 84)));
        jPanel4.setForeground(new java.awt.Color(0, 153, 102));

        txt_pesquisarContatos1.setBackground(new java.awt.Color(204, 204, 204));
        txt_pesquisarContatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisarContatos1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Pesquisar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_pesquisarContatos1)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_pesquisarContatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        EnviarMensagem(lbl_telefoneContato.getText());
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        GravarUsuario();
    }//GEN-LAST:event_formWindowOpened

    private void radio_euActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_euActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_radio_euActionPerformed

    private void txt_pesquisarContatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisarContatos1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_pesquisarContatos1ActionPerformed

    private void jList_ContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ContatosMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        String telContato = jList_Contatos.getSelectedValue();
        lbl_telefoneContato.setText(telContato);
        Conversa conv = new Conversa(lbl_telefoneContato.getText(), "");
        try {
            conv.ConversaCompleta();
            /*
            System.out.println(mensagem.get(0).getTexto());
            for (Mensagem msg : mensagem) {
            
            }
            
            /*
            String telContato = jList_Contatos.getSelectedValue();
            lbl_telefoneContato.setText(telContato);
            Conversa conv = new Conversa(telContato, "");
            try {
            jConversa.setText(conv.LerConversa());
            } catch (IOException ex) {
            jConversa.setText("Erro ao retornar conversa");
            }
            */
        } catch (IOException ex) {
            Logger.getLogger(InterfaceWhatsApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfaceWhatsApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList_ContatosMouseClicked

    private void txt_mensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mensagemKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if(!("".equals(txt_mensagem.getText()))){
            EnviarMensagem(lbl_telefoneContato.getText());
        }
    }
    }//GEN-LAST:event_txt_mensagemKeyPressed

    private void radio_contatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_contatoItemStateChanged
        // TODO add your handling code here:
        if(!radio_contato.isSelected()){
            lbl_hora.setText(new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()));
            
        }
    }//GEN-LAST:event_radio_contatoItemStateChanged

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
            java.util.logging.Logger.getLogger(InterfaceWhatsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceWhatsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceWhatsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceWhatsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceWhatsApp().setVisible(true);
            }
        });
    }

    public void GravarUsuario(){
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        radio_eu.setSelected(true);
        nome = "Renan";
        telUsuario = "940028922";
        lbl_nome.setText(nome);
    }

    public void EnviarMensagem(String telContato){
        String texto="";
        String hora = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());

        if(radio_eu.isSelected()){
            texto = "Você: "+txt_mensagem.getText();
            jConversa.setText(jConversa.getText()+texto+"\n");
            /*
                jTextPane1.setText("<div style=\"background-color: #90EE90\">"+texto+"</div>");
                JOptionPane.showMessageDialog(null, jTextPane1.getText());
'           */
            Mensagem msg = new Mensagem(telUsuario, "Você: "+texto, hora, lbl_telefoneContato.getText());
            Conversa conv = new Conversa(lbl_telefoneContato.getText(), hora);
            try {
                conv.SalvarConversa(msg);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }else if(radio_contato.isSelected()){
            texto = "Contato: "+txt_mensagem.getText();
            jConversa.setText(jConversa.getText()+texto+"\n");
            Mensagem msg = new Mensagem(telContato, "Contato: "+texto, hora, telUsuario);
            Conversa conv = new Conversa(lbl_telefoneContato.getText(), hora);
            try {
                conv.SalvarConversa(msg);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        //jConversa.setText(jConversa.getText()+"\n"+texto+hora);

        txt_mensagem.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea jConversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList_Contatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_telefoneContato;
    private javax.swing.JLabel lbl_vistoPorUltimo;
    private javax.swing.JRadioButton radio_contato;
    private javax.swing.JRadioButton radio_eu;
    private javax.swing.JTextField txt_mensagem;
    private javax.swing.JTextField txt_pesquisarContatos1;
    // End of variables declaration//GEN-END:variables
}
