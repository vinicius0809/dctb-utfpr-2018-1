/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Massallys
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

        pPrinc = new javax.swing.JPanel();
        pCad = new javax.swing.JButton();
        pConsul = new javax.swing.JButton();
        pAt = new javax.swing.JButton();
        pDel = new javax.swing.JButton();
        pUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCad.setText("CADASTRAR EVENTOS");

        pConsul.setText("CONSULTAR EVENTOS");

        pAt.setText("ATUALIZAR EVENTOS");
        pAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAtActionPerformed(evt);
            }
        });

        pDel.setText("DELETAR EVENTOS");

        pUser.setText("@USUARIO");

        javax.swing.GroupLayout pPrincLayout = new javax.swing.GroupLayout(pPrinc);
        pPrinc.setLayout(pPrincLayout);
        pPrincLayout.setHorizontalGroup(
            pPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPrincLayout.createSequentialGroup()
                .addGroup(pPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pPrincLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pUser))
                    .addGroup(pPrincLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(pPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pConsul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pDel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        pPrincLayout.setVerticalGroup(
            pPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPrincLayout.createSequentialGroup()
                .addComponent(pUser)
                .addGap(29, 29, 29)
                .addComponent(pCad)
                .addGap(18, 18, 18)
                .addComponent(pConsul)
                .addGap(18, 18, 18)
                .addComponent(pAt)
                .addGap(18, 18, 18)
                .addComponent(pDel)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pAtActionPerformed

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
    private javax.swing.JButton pAt;
    private javax.swing.JButton pCad;
    private javax.swing.JButton pConsul;
    private javax.swing.JButton pDel;
    private javax.swing.JPanel pPrinc;
    private javax.swing.JLabel pUser;
    // End of variables declaration//GEN-END:variables
}
