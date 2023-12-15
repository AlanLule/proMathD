
package gui;

import java.awt.Color;
import app.Main;
/**
 *
 * @author xeon
 */
public class Planeacion extends javax.swing.JFrame {
    Main main;
    /**
     * Creates new form ComplexNumberASYS
     */
    public Planeacion(Main main) {
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
        lblComplexNumbers = new javax.swing.JLabel();
        lblLogoComplexNumbers = new javax.swing.JLabel();
        lblTema1 = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        lblHOME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlComplexNumbers.setBackground(new java.awt.Color(0, 0, 51));
        pnlComplexNumbers.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlComplexNumbers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblComplexNumbers.setFont(new java.awt.Font("Roboto Black", 0, 36)); // NOI18N
        lblComplexNumbers.setForeground(new java.awt.Color(255, 78, 0));
        lblComplexNumbers.setText("Planeación");
        pnlComplexNumbers.add(lblComplexNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 430, 50));

        lblLogoComplexNumbers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/planeacion.png"))); // NOI18N
        lblLogoComplexNumbers.setText("jLabel1");
        pnlComplexNumbers.add(lblLogoComplexNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 120));

        lblTema1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTema1.setForeground(new java.awt.Color(255, 255, 255));
        lblTema1.setText("Tema 3: Planeación");
        pnlComplexNumbers.add(lblTema1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 560, 30));

        lblFoot.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot.setText("Alan Rigel Álvarez Lule & Andres Rosas Ptiño");
        pnlComplexNumbers.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 320, -1));

        lblFoot1.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        pnlComplexNumbers.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, -1, -1));

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
        pnlComplexNumbers.add(lblHOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 70, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pla2.png"))); // NOI18N
        pnlComplexNumbers.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pla1.png"))); // NOI18N
        pnlComplexNumbers.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComplexNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHOMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseClicked
        // TODO add your handling code here:
        main.planteacion.setVisible(false);
        main.planteacion = null;

        main.mainASYS.setVisible(true);
    }//GEN-LAST:event_lblHOMEMouseClicked

    private void lblHOMEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseEntered
        // TODO add your handling code here:
        lblHOME.setBackground(Color.yellow);
    }//GEN-LAST:event_lblHOMEMouseEntered

    private void lblHOMEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHOMEMouseExited
        // TODO add your handling code here:
        lblHOME.setBackground(Color.black);
    }//GEN-LAST:event_lblHOMEMouseExited

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
            java.util.logging.Logger.getLogger(Planeacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planeacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planeacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planeacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ComplexNumbersASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblComplexNumbers;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblHOME;
    private javax.swing.JLabel lblLogoComplexNumbers;
    private javax.swing.JLabel lblTema1;
    private javax.swing.JPanel pnlComplexNumbers;
    // End of variables declaration//GEN-END:variables
}
