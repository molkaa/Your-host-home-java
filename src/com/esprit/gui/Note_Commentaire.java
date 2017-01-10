/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.gui;

import com.esprit.dao.NoteDAO;
import com.esprit.entities.Note;
import com.esprit.gui.AfficherTousLesCommentaires;
import com.esprit.gui.détails_offre;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author wezza
 */
public class Note_Commentaire extends javax.swing.JFrame {
    static String note1;
    /**
     * Creates new form Note_Commentaire
     */
    public Note_Commentaire() {
        initComponents();
        jCommentaire.setText("Entrez votre commentaire...");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Note = new javax.swing.JLabel();
        commentaire = new javax.swing.JLabel();
        comm = new javax.swing.JScrollPane();
        jCommentaire = new javax.swing.JTextArea();
        Publier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        annuler = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Note.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Note.setText("Attribuez une note SVP:");

        commentaire.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        commentaire.setText("Ecrivez un commentaire SVP:");

        comm.setBackground(new java.awt.Color(153, 153, 153));
        comm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comm.setToolTipText("Ecrire un commentaire...");
        comm.setViewportBorder(javax.swing.BorderFactory.createEtchedBorder());
        comm.setAutoscrolls(true);
        comm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comm.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        jCommentaire.setColumns(20);
        jCommentaire.setForeground(new java.awt.Color(204, 204, 204));
        jCommentaire.setRows(5);
        jCommentaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCommentaireMouseClicked(evt);
            }
        });
        jCommentaire.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCommentaireKeyPressed(evt);
            }
        });
        comm.setViewportView(jCommentaire);

        Publier.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        Publier.setText("Publier");
        Publier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PublierMouseReleased(evt);
            }
        });
        Publier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublierActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Noter & Commenter");

        annuler.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        jComboBox1.setToolTipText("Note sur 5");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/esprit/gui/arriere plan.jpg"))); // NOI18N
        jLabel3.setText("Titre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comm, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(Publier, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(473, 473, 473))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(commentaire, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(comm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Publier, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(annuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(342, 342, 342))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1180, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PublierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublierActionPerformed
        // TODO add your handling code here:
        int confirm=JOptionPane.showConfirmDialog(this, "Etes vous sur de publier ce commentaire !!!", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        if(confirm == JOptionPane.YES_OPTION){
            NoteDAO nt = new NoteDAO();
            Note n= new Note();
           // détails_offre
            note1=(String) jComboBox1.getSelectedItem() ;
          //  System.out.println("aaaaaaaaaaaaaaaaaaa"+note1);
                    n.setNote(jComboBox1.getSelectedIndex());
                    n.setCommentaire(jCommentaire.getText());
                    n.setIdoffre(menuClient.id_loc);
                    nt.ajouterNote(n);
        AfficherTousLesCommentaires coms = new AfficherTousLesCommentaires();
        coms.setVisible(true);
        this.setVisible(false);
                } else {
                    Note_Commentaire n=new Note_Commentaire();
                    n.setVisible(true);
                    this.setVisible(false);
                }
    }//GEN-LAST:event_PublierActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // TODO add your handling code here:
        détails_offre o = new détails_offre();
        o.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_annulerActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCommentaireKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCommentaireKeyPressed
        // TODO add your handling code here:
        //jTextArea1.setText("");
        jCommentaire.setForeground(Color.BLACK);
        jCommentaire.setFont(new Font("Arial",18,18));
    }//GEN-LAST:event_jCommentaireKeyPressed

    private void jCommentaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCommentaireMouseClicked
        // TODO add your handling code here:
        jCommentaire.setText("");
        jCommentaire.setForeground(Color.BLACK);
        jCommentaire.setFont(new Font("Arial",18,18));
    }//GEN-LAST:event_jCommentaireMouseClicked

    private void PublierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PublierMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_PublierMouseReleased

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
     note1 = (String) jComboBox1.getSelectedItem();
        System.out.println(note1);
     
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(Note_Commentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Note_Commentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Note_Commentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Note_Commentaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Note_Commentaire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Note;
    private javax.swing.JButton Publier;
    private javax.swing.JButton annuler;
    private javax.swing.JScrollPane comm;
    private javax.swing.JLabel commentaire;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextArea jCommentaire;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
