/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Color;
import app.Main;


public class MainProMathD extends javax.swing.JFrame {
    Main main;
    public MainProMathD(Main main) {
        initComponents();
        this.main = main;
    }

    MainProMathD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logproglineal = new javax.swing.JLabel();
        SeriesFourier = new javax.swing.JLabel();
        lbASYSC = new javax.swing.JLabel();
        bgLogo = new javax.swing.JLabel();
        lblmTransporte = new javax.swing.JLabel();
        lblprogramacionLineal = new javax.swing.JLabel();
        lblinventarios = new javax.swing.JLabel();
        TransformFourier = new javax.swing.JLabel();
        lblFoot1 = new javax.swing.JLabel();
        lblFoot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblplaneacion = new javax.swing.JLabel();
        TransformFourier1 = new javax.swing.JLabel();
        TransformFourier2 = new javax.swing.JLabel();
        lblLineas = new javax.swing.JLabel();
        TransformFourier3 = new javax.swing.JLabel();
        lblLineas1 = new javax.swing.JLabel();
        TransformFourier4 = new javax.swing.JLabel();
        lblLineas2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(0, 0, 51));
        bg.setForeground(new java.awt.Color(204, 204, 204));
        bg.setPreferredSize(new java.awt.Dimension(800, 500));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logproglineal.setBackground(new java.awt.Color(255, 255, 255));
        logproglineal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logproglineal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lilineal_1.png"))); // NOI18N
        logproglineal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logproglineal.setOpaque(true);
        logproglineal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logproglinealMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logproglinealMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logproglinealMouseExited(evt);
            }
        });
        bg.add(logproglineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 130, 90));

        SeriesFourier.setBackground(new java.awt.Color(255, 255, 255));
        SeriesFourier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SeriesFourier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mTransport.png"))); // NOI18N
        SeriesFourier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SeriesFourier.setOpaque(true);
        SeriesFourier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SeriesFourierMouseExited(evt);
            }
        });
        bg.add(SeriesFourier, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 120, 90));

        lbASYSC.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        lbASYSC.setForeground(new java.awt.Color(255, 71, 0));
        lbASYSC.setText("Portafolio Digital 2023 ITESS-TICS MPTD GoNorth");
        lbASYSC.setToolTipText("");
        bg.add(lbASYSC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 570, 40));

        bgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cappnice.png"))); // NOI18N
        bg.add(bgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 364, 500));

        lblmTransporte.setForeground(new java.awt.Color(255, 255, 255));
        lblmTransporte.setText("Tema2. MTransporte");
        bg.add(lblmTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        lblprogramacionLineal.setForeground(new java.awt.Color(255, 255, 255));
        lblprogramacionLineal.setText("Tema1. ProgLineal");
        bg.add(lblprogramacionLineal, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 120, -1));

        lblinventarios.setForeground(new java.awt.Color(255, 255, 255));
        lblinventarios.setText("Tema4. Inventarios");
        bg.add(lblinventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        TransformFourier.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransformFourier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventarios.png"))); // NOI18N
        TransformFourier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier.setOpaque(true);
        TransformFourier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourierMouseExited(evt);
            }
        });
        bg.add(TransformFourier, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 110, 90));

        lblFoot1.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot1.setText("ITESS-TICS-2023 Ago-Dic");
        bg.add(lblFoot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        lblFoot.setForeground(new java.awt.Color(255, 51, 0));
        lblFoot.setText("Alan Rigel Álvarez Lule & Andres Rosas Patiño");
        bg.add(lblFoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 250, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Programador: Alan Rigel Alvarez Lule");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 240, 20));

        lblplaneacion.setForeground(new java.awt.Color(255, 255, 255));
        lblplaneacion.setText("Tema3. planeacion");
        bg.add(lblplaneacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        TransformFourier1.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransformFourier1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/planeacion.png"))); // NOI18N
        TransformFourier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier1.setOpaque(true);
        TransformFourier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourier1MouseExited(evt);
            }
        });
        bg.add(TransformFourier1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 110, 90));

        TransformFourier2.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransformFourier2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/competencias.png"))); // NOI18N
        TransformFourier2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier2.setOpaque(true);
        TransformFourier2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourier2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourier2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourier2MouseExited(evt);
            }
        });
        bg.add(TransformFourier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 110, 90));

        lblLineas.setForeground(new java.awt.Color(255, 255, 255));
        lblLineas.setText("Competencias");
        bg.add(lblLineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        TransformFourier3.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransformFourier3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lespera.png"))); // NOI18N
        TransformFourier3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier3.setOpaque(true);
        TransformFourier3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourier3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourier3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourier3MouseExited(evt);
            }
        });
        bg.add(TransformFourier3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 110, 90));

        lblLineas1.setForeground(new java.awt.Color(255, 255, 255));
        lblLineas1.setText("Tema5. LineasEspera");
        bg.add(lblLineas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        TransformFourier4.setBackground(new java.awt.Color(255, 255, 255));
        TransformFourier4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransformFourier4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teoriaDesicion.png"))); // NOI18N
        TransformFourier4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TransformFourier4.setOpaque(true);
        TransformFourier4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TransformFourier4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TransformFourier4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TransformFourier4MouseExited(evt);
            }
        });
        bg.add(TransformFourier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 110, 90));

        lblLineas2.setForeground(new java.awt.Color(255, 255, 255));
        lblLineas2.setText("Tema6. Teoria de Decisión");
        bg.add(lblLineas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 820, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void logproglinealMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logproglinealMouseEntered
        logproglineal.setBackground(Color.yellow);
    }//GEN-LAST:event_logproglinealMouseEntered

    private void logproglinealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logproglinealMouseExited
        logproglineal.setBackground(Color.white);
    }//GEN-LAST:event_logproglinealMouseExited

    private void SeriesFourierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseEntered
        SeriesFourier.setBackground(Color.yellow);
    }//GEN-LAST:event_SeriesFourierMouseEntered

    private void SeriesFourierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseExited
        SeriesFourier.setBackground(Color.white);
    }//GEN-LAST:event_SeriesFourierMouseExited

    private void logproglinealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logproglinealMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.proLineal = new proLineal(this.main);
        main.proLineal.setVisible(true);        
    }//GEN-LAST:event_logproglinealMouseClicked

    private void TransformFourierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourierMouseEntered
        // TODO add your handling code here:
        TransformFourier.setBackground(Color.yellow);
    }//GEN-LAST:event_TransformFourierMouseEntered

    private void TransformFourierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourierMouseExited
        // TODO add your handling code here:
        TransformFourier.setBackground(Color.white);
        
    }//GEN-LAST:event_TransformFourierMouseExited

    private void SeriesFourierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeriesFourierMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.mTransporte = new mTransporte(this.main);
        main.mTransporte.setVisible(true); 
    }//GEN-LAST:event_SeriesFourierMouseClicked

    private void TransformFourierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourierMouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.tInventarios = new TInventarios(this.main);
        main.tInventarios.setVisible(true);
    }//GEN-LAST:event_TransformFourierMouseClicked

    private void TransformFourier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.planteacion = new Planeacion(this.main);
        main.planteacion.setVisible(true);
    }//GEN-LAST:event_TransformFourier1MouseClicked

    private void TransformFourier1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier1MouseEntered

    private void TransformFourier1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier1MouseExited

    private void TransformFourier2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier2MouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.competencias = new Competencias(this.main);
        main.competencias.setVisible(true);
    }//GEN-LAST:event_TransformFourier2MouseClicked

    private void TransformFourier2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier2MouseEntered

    private void TransformFourier2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier2MouseExited

    private void TransformFourier3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier3MouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.lineasDeEspera = new LineasDeEspera(this.main);
        main.lineasDeEspera.setVisible(true);
    }//GEN-LAST:event_TransformFourier3MouseClicked

    private void TransformFourier3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier3MouseEntered

    private void TransformFourier3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier3MouseExited

    private void TransformFourier4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier4MouseClicked
        // TODO add your handling code here:
        main.mainASYS.setVisible(false);
        
        main.desicion = new Desicion(this.main);
        main.desicion.setVisible(true);
    }//GEN-LAST:event_TransformFourier4MouseClicked

    private void TransformFourier4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier4MouseEntered

    private void TransformFourier4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TransformFourier4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TransformFourier4MouseExited

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
            java.util.logging.Logger.getLogger(MainProMathD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProMathD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProMathD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProMathD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainASYS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SeriesFourier;
    private javax.swing.JLabel TransformFourier;
    private javax.swing.JLabel TransformFourier1;
    private javax.swing.JLabel TransformFourier2;
    private javax.swing.JLabel TransformFourier3;
    private javax.swing.JLabel TransformFourier4;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bgLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbASYSC;
    private javax.swing.JLabel lblFoot;
    private javax.swing.JLabel lblFoot1;
    private javax.swing.JLabel lblLineas;
    private javax.swing.JLabel lblLineas1;
    private javax.swing.JLabel lblLineas2;
    private javax.swing.JLabel lblinventarios;
    private javax.swing.JLabel lblmTransporte;
    private javax.swing.JLabel lblplaneacion;
    private javax.swing.JLabel lblprogramacionLineal;
    private javax.swing.JLabel logproglineal;
    // End of variables declaration//GEN-END:variables
}
