/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import app.Main;
/**
 *
 * @author xeon
 */
public class TInventarios extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form ComplexNumberASYS
     */
    public TInventarios(Main main) {
        initComponents();
        this.main = main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlComplexNumbers = new javax.swing.JPanel();
        lblHOME = new javax.swing.JLabel();
        lblComplexNumbers = new javax.swing.JLabel();
        SeriesFourier = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlComplexNumbers.setBackground(new java.awt.Color(0, 0, 51));
        pnlComplexNumbers.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlComplexNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHOME.setBackground(new java.awt.Color(0, 0, 51));
        lblHOME.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lblHOME.setForeground(new java.awt.Color(255, 78, 0));
        lblHOME.setText("Inicio");
        lblHOME.setOpaque(true);
        lblHOME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHOMEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHOMEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHOMEMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(lblHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 70, 50));

        lblComplexNumbers.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblComplexNumbers.setForeground(new java.awt.Color(205, 0, 255));
        lblComplexNumbers.setText("Teoria de inventarios");
        pnlComplexNumbers.add(lblComplexNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 500, 50));

        SeriesFourier.setBackground(new java.awt.Color(0, 0, 0));
        SeriesFourier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeriesFourier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventarios.png"))); // NOI18N
        SeriesFourier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeriesFourier.setOpaque(true);
        SeriesFourier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseExited(evt);
            }
        });
        pnlComplexNumbers.add(SeriesFourier, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 90));

        lblTema1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTema1.setForeground(new java.awt.Color(255, 255, 255));
        lblTema1.setText("Tema 4. Teoria de inventarios");
        pnlComplexNumbers.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 570, 30));

        lblFoot.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot.setText("Alan Rigel Álvarez Lule");
        pnlComplexNumbers.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        lblFoot1.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        pnlComplexNumbers.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseEntered
        // TODO add your handling code here:
        lblHOME.setBackground(Color.yellow);
    }//GEN-LAST:event_lblHOMEMouseEntered

    private void lblHOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseExited
        // TODO add your handling code here:
        lblHOME.setBackground(Color.black);
    }//GEN-LAST:event_lblHOMEMouseExited

    private void lblHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseClicked
       // TODO add your handling code here:
       main.fourierTransform.setVisible(false);
       main.fourierTransform = null;
       
       main.mainASYS.setVisible(true);
    }//GEN-LAST:event_lblHOMEMouseClicked

    private void SeriesFourierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseEntered
        SeriesFourier.setBackground(Color.yellow);
    }//GEN-LAST:event_SeriesFourierMouseEntered

    private void SeriesFourierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseExited
        SeriesFourier.setBackground(Color.black);
    }//GEN-LAST:event_SeriesFourierMouseExited

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
            java.util.logging.Logger.getLogger(TInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComplexNumbersASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SeriesFourier;
    private javax.swing.JLabel lblComplexNumbers;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblHOME;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JPanel pnlComplexNumbers;
    // End of variables declaration//GEN-END:variables
}
