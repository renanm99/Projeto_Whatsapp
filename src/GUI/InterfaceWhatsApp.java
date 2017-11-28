package GUI;

import Classes.Conversa;
import Classes.Whatsapp;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
public class InterfaceWhatsApp extends javax.swing.JFrame implements Serializable {

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
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl_telefoneContato = new javax.swing.JLabel();
        Label1 = new javax.swing.JLabel();
        lbl_hora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jConversa = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lbl_status = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_Contatos = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        txt_pesquisarContatos1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        radio_eu = new javax.swing.JRadioButton();
        txt_mensagem = new javax.swing.JTextField();
        radio_contato = new javax.swing.JRadioButton();
        btn_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 5, true));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_telefoneContato.setBackground(new java.awt.Color(0, 204, 102));
        lbl_telefoneContato.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_telefoneContato.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.add(lbl_telefoneContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 45));

        Label1.setForeground(new java.awt.Color(204, 204, 204));
        Label1.setText("visto por último:");
        jPanel7.add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_hora.setForeground(new java.awt.Color(204, 204, 204));
        jPanel7.add(lbl_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 62, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 5, true));
        jPanel5.setForeground(new java.awt.Color(0, 51, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nome.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nome.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, 29));

        jButton3.setText("Mudar Nome");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 16, -1, -1));

        jButton4.setText("Mudar Status");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 16, -1, 58));

        jButton5.setText("Mudar Número");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 50, -1, -1));

        lbl_status.setBackground(new java.awt.Color(204, 204, 204));
        lbl_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, -1, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 1, true));

        jList_Contatos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jList_Contatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList_Contatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_ContatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList_Contatos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 185, 84), 1, true));

        txt_pesquisarContatos1.setBackground(new java.awt.Color(204, 204, 204));
        txt_pesquisarContatos1.setText("Pesquisar");
        txt_pesquisarContatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pesquisarContatos1ActionPerformed(evt);
            }
        });

        jButton1.setText("Nova Conversa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Apagar Conversa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_pesquisarContatos1)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_pesquisarContatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 185, 84)));
        jPanel3.setEnabled(false);

        radio_eu.setBackground(new java.awt.Color(29, 185, 84));
        buttonGroup1.add(radio_eu);
        radio_eu.setText("eu");

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        try {
            EnviarMensagem(lbl_telefoneContato.getText());
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_btn_enviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Inicio();
    }//GEN-LAST:event_formWindowOpened

    private void txt_pesquisarContatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pesquisarContatos1ActionPerformed
        // TODO add your handling code here:
        txt_pesquisarContatos1.setText("");

    }//GEN-LAST:event_txt_pesquisarContatos1ActionPerformed

    private void txt_mensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mensagemKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!("".equals(txt_mensagem.getText()))) {
                try {
                    EnviarMensagem(lbl_telefoneContato.getText());
                } catch (IOException ex) {
                } catch (ClassNotFoundException ex) {
                }
            }
        }
    }//GEN-LAST:event_txt_mensagemKeyPressed

    private void jList_ContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_ContatosMouseClicked
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        String telContato = jList_Contatos.getSelectedValue();
        lbl_telefoneContato.setText(telContato);
        Conversa conv = new Conversa(telContato);
        try {
            jConversa.setText(conv.ConversaCompleta() + "\n");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        lbl_hora.setText(new Whatsapp().VistoPorUltimo(telContato));
    }//GEN-LAST:event_jList_ContatosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jList_Contatos.setModel(new Whatsapp().Novaconversa());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jList_Contatos.setModel(new Whatsapp().ApagarConversa(jList_Contatos.getSelectedValue()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void radio_contatoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_contatoItemStateChanged
        // TODO add your handling code here:
        if (radio_contato.isSelected()) {
            lbl_hora.setText("");
            Label1.setText("Online");
        } else {
            Label1.setText("visto por último: ");
            lbl_hora.setText(new Whatsapp().VistoPorUltimo(lbl_telefoneContato.getText()));
        }
    }//GEN-LAST:event_radio_contatoItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String nome = JOptionPane.showInputDialog("Digite um nome");
        if (nome.length() < 1) {
            nome = "user";
        }
        new Whatsapp().GravarUsuario(nome, telUsuario, lbl_status.getText());
        lbl_nome.setText(nome);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String status = JOptionPane.showInputDialog("Digite um status");
        if (status.length() < 1) {
            status = "Hey there! I'm using WhatsApp";
        }
        new Whatsapp().GravarUsuario(lbl_nome.getText(), telUsuario, status);
        lbl_status.setText(status);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        while (true) {
            try {
                int tel = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
                String stel = String.valueOf(tel);
                if (stel.length() == 9) {
                    new Whatsapp().GravarUsuario(lbl_nome.getText(), stel, lbl_status.getText());
                    telUsuario = stel;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VÁLIDO");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "DIGITE UM VALOR VÁLIDO");
            }
        }

    }//GEN-LAST:event_jButton5ActionPerformed

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

    public void Inicio() {
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        radio_eu.setSelected(true);
        Whatsapp user = new Whatsapp();
        jList_Contatos.setModel(user.GetContatos());
        String usertxt = user.RetornarUsuario();
        lbl_nome.setText(usertxt.substring(0, (usertxt.indexOf("||"))));
        user.setUsuario(lbl_nome.getText());
        lbl_status.setText(usertxt.substring((usertxt.lastIndexOf("||") + 2), usertxt.length()));
        user.setStatusUsuario(lbl_status.getText());
        telUsuario = (usertxt.substring((usertxt.indexOf("||")) + 2, (usertxt.lastIndexOf("||"))));
        user.setTelUsuario(telUsuario);
    }

    public void EnviarMensagem(String telContato) throws IOException, FileNotFoundException, ClassNotFoundException {
        String texto = "";
        String hora = new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime());

        if (radio_eu.isSelected()) {
            texto = hora + " -  Voc�: " + txt_mensagem.getText();
            jConversa.setText(jConversa.getText() + texto + "\n");
            new Whatsapp().EnviarMensagem("user", texto, hora, lbl_telefoneContato.getText());
        } else if (radio_contato.isSelected()) {
            texto = hora + " -  Contato: " + txt_mensagem.getText();
            jConversa.setText(jConversa.getText() + texto + "\n");
            new Whatsapp().EnviarMensagem(telContato, texto, hora, lbl_telefoneContato.getText());
        }
        //jConversa.setText(jConversa.getText()+"\n"+texto+hora);

        txt_mensagem.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JButton btn_enviar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JTextArea jConversa;
    private javax.swing.JList<String> jList_Contatos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_hora;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_telefoneContato;
    private javax.swing.JRadioButton radio_contato;
    private javax.swing.JRadioButton radio_eu;
    private javax.swing.JTextField txt_mensagem;
    private javax.swing.JTextField txt_pesquisarContatos1;
    // End of variables declaration//GEN-END:variables
}
