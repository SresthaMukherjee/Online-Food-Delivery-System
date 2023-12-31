/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minorpack;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author Manager
 */
public class ShowUserDetails extends javax.swing.JFrame {

    /**
     * Creates new form ShowUserDetails
     */
    public ShowUserDetails() {
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

        bDeails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRecord = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bDeails.setBackground(new java.awt.Color(255, 102, 51));
        bDeails.setForeground(new java.awt.Color(255, 255, 255));
        bDeails.setText("Show Details");
        bDeails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bDeails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeailsActionPerformed(evt);
            }
        });
        getContentPane().add(bDeails, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 120, 40));

        tRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Gender", "Contact", "Mail ID", "Password"
            }
        ));
        jScrollPane2.setViewportView(tRecord);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 580, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\OneDrive\\Desktop\\minor project materials\\condiments-prepare-italian-pasta.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bDeailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeailsActionPerformed
        // TODO add your handling code here:
        try{
            DriverManager.registerDriver(new OracleDriver());
            OracleConnection oconn =(OracleConnection)DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-EE2LFR6:1522:ORCL","spandan","das");
            String sql = "select * from Register";
            OraclePreparedStatement ostmt = (OraclePreparedStatement)oconn.prepareStatement(sql);      
            OracleResultSet ors = (OracleResultSet)ostmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tRecord.getModel();
            model.setRowCount(0);
            while(ors.next()){
                model.addRow(new String[]{ors.getString(1),ors.getString(2),ors.getString(3),ors.getString(4),ors.getString(5)});
            }
                    }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bDeailsActionPerformed

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
            java.util.logging.Logger.getLogger(ShowUserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowUserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowUserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowUserDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowUserDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDeails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tRecord;
    // End of variables declaration//GEN-END:variables
}
