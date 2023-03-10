/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jose Sandoval
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTCALCULAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Lresultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TVALOR1 = new javax.swing.JTextField();
        TVALOR2 = new javax.swing.JTextField();
        Rsuma = new javax.swing.JRadioButton();
        Rresta = new javax.swing.JRadioButton();
        Rmultiplicacion = new javax.swing.JRadioButton();
        Rdivision = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Valor 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 90, 120, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Valor 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 90, 120, 30);

        BTCALCULAR.setBackground(new java.awt.Color(51, 255, 51));
        BTCALCULAR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BTCALCULAR.setForeground(new java.awt.Color(255, 51, 51));
        BTCALCULAR.setText("CALCULAR");
        BTCALCULAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTCALCULARMouseClicked(evt);
            }
        });
        BTCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCALCULARActionPerformed(evt);
            }
        });
        getContentPane().add(BTCALCULAR);
        BTCALCULAR.setBounds(160, 190, 130, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Lresultado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Lresultado.setForeground(new java.awt.Color(255, 0, 0));
        Lresultado.setToolTipText("");
        Lresultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Lresultado.getAccessibleContext().setAccessibleName("Lresultado");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 10, 360, 70);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        TVALOR1.setBackground(new java.awt.Color(255, 255, 0));
        TVALOR1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TVALOR1.setForeground(new java.awt.Color(255, 0, 51));
        TVALOR1.setName(""); // NOI18N

        TVALOR2.setBackground(new java.awt.Color(255, 255, 0));
        TVALOR2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TVALOR2.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TVALOR1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(TVALOR2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TVALOR1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TVALOR2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 90, 400, 180);

        buttonGroup1.add(Rsuma);
        Rsuma.setSelected(true);
        Rsuma.setText("Suma");
        Rsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsumaActionPerformed(evt);
            }
        });
        getContentPane().add(Rsuma);
        Rsuma.setBounds(430, 60, 160, 23);
        Rsuma.getAccessibleContext().setAccessibleName("Rsuma");

        buttonGroup1.add(Rresta);
        Rresta.setText("Resta");
        Rresta.setToolTipText("");
        getContentPane().add(Rresta);
        Rresta.setBounds(430, 90, 120, 23);
        Rresta.getAccessibleContext().setAccessibleName("Rresta");

        buttonGroup1.add(Rmultiplicacion);
        Rmultiplicacion.setText("Multiplicacion");
        getContentPane().add(Rmultiplicacion);
        Rmultiplicacion.setBounds(430, 120, 150, 23);

        buttonGroup1.add(Rdivision);
        Rdivision.setText("Division");
        Rdivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdivisionActionPerformed(evt);
            }
        });
        getContentPane().add(Rdivision);
        Rdivision.setBounds(430, 150, 160, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCALCULARActionPerformed

        //GET PARA IMPRIMIR UNA VARIABLE
        //SET ES PARA ASIGNAR VALOR 
        float num1 = 0, num2 = 0, total =0;
        num1 = Float.parseFloat(TVALOR1.getText());
        num2 = Float.parseFloat(TVALOR2.getText());
        
        
        
        if (Rsuma.isSelected()) {
            total = num1 +num2;
        } else if (Rresta.isSelected()){
            total = num1 - num2;
        } else if (Rmultiplicacion.isSelected()){
            total = num1 * num2;
        } else if (Rdivision.isSelected()){
            total = num1 / num2;
        }
        Lresultado.setText(String.valueOf(total));//FALTA RESTA
      
        
    }//GEN-LAST:event_BTCALCULARActionPerformed

    private void BTCALCULARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTCALCULARMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BTCALCULARMouseClicked

    private void RsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RsumaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Rsuma.setSelected(true);//FALTA
        
    }//GEN-LAST:event_formWindowActivated

    private void RdivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdivisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdivisionActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCALCULAR;
    private javax.swing.JLabel Lresultado;
    private javax.swing.JRadioButton Rdivision;
    private javax.swing.JRadioButton Rmultiplicacion;
    private javax.swing.JRadioButton Rresta;
    private javax.swing.JRadioButton Rsuma;
    private javax.swing.JTextField TVALOR1;
    private javax.swing.JTextField TVALOR2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
