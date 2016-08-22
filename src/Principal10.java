
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal10 extends javax.swing.JFrame {

    /**
     * Creates new form Principal10
     */
    public Principal10() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        txtMontoFinal = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        cmbCalcular = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("COSTO DE LLAMADA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel2.setText("Monto Inicial");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel3.setText("Monto Final");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("JasmineUPC", 2, 24)); // NOI18N
        jLabel4.setText("El costo total de la llamada");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        txtMontoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoInicialKeyTyped(evt);
            }
        });
        getContentPane().add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 80, -1));

        txtMontoFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoFinalKeyTyped(evt);
            }
        });
        getContentPane().add(txtMontoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 80, -1));

        txtResultado.setEditable(false);
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 130, -1));

        cmbCalcular.setText("jButton1");
        cmbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        cmbBorrar.setText("jButton2");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalcularActionPerformed
        // TODO add your handling code here:
           String  num1, num2, resu, reca,cob;
        double p = 0,s = 0,resultado = 0, re,co;
        
        
        
        if (txtMontoInicial.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el Monto inicil", "Error",JOptionPane.ERROR_MESSAGE);
        txtMontoInicial.requestFocusInWindow();
        } else if (txtMontoFinal.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Digite el Monto final", "Error",JOptionPane.ERROR_MESSAGE);
        txtMontoFinal.requestFocusInWindow();
        } else {
        
            
        
        p= Double.parseDouble(txtMontoInicial.getText());
        s =Double.parseDouble(txtMontoFinal.getText());
        
        
        }
        
        resultado = p - s;
        resu= String.valueOf(resultado);
        txtResultado.setText(resu);
         
        re = (resultado*20)/100;
        reca=String.valueOf(re);
        txtResultado.setText(reca); 
        
        co= resultado + re ; 
        cob=String.valueOf(co);
        txtResultado.setText(cob); 
    }//GEN-LAST:event_cmbCalcularActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
        // TODO add your handling code here:
        txtMontoInicial.setText("");
        txtMontoFinal.setText("");
        txtResultado.setText("");
        
        txtMontoInicial.requestFocusInWindow();
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void txtMontoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoInicialKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
          } 
    }//GEN-LAST:event_txtMontoInicialKeyTyped

    private void txtMontoFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoFinalKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
          } 
    }//GEN-LAST:event_txtMontoFinalKeyTyped

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
            java.util.logging.Logger.getLogger(Principal10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMontoFinal;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
