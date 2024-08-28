/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Java_Mysqlconn;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

   


public class Java_Mysqlconn extends javax.swing.JFrame {

   private static final String username = "root";
   private static final String password = "flavia25";
   private static final String dataConn = "jdbc:mysql://localhost:3306:connector";
   
   Connection sqlConn =null;
   PreparedStatement pst=null;
   ResultSet rs =null;
   int q,i,id,deleteItem;
   
   
    public Java_Mysqlconn() {
        initComponents();
    }

   
    
    public void upDateDB(){
try{
    Class.forName("com.mysql.jdbc.Driver");
    sqlConn = DriverManager.getConnection(dataConn,username,password);
    pst = sqlConn.prepareStatement("select * from connector");
    
    rs=pst.executeQuery();
    ResultSetMetaData stData = rs.getMetaData();
    q=stData.getColumnCount();
    DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
    RecordTable.setRowCount (0);
            
            while(rs.next()) {
            Vector columnData =new Vector();
            
           for (i =1;i <=q;i++)
           {
           columnData.add(rs.getShort("id"));
            columnData.add(rs.getShort("StudentID"));
             columnData.add(rs.getShort("Firstname"));
              columnData.add(rs.getShort("Surname"));
               columnData.add(rs.getShort("Telephone"));
                columnData.add(rs.getShort("Adress"));
                columnData.add(rs.getShort("PostCode"));
                
           }
           RecordTable.addRow(columnData);
            }
}
    catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
                    }
    

}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtTelephone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jtxtSurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtAdress = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Telephone");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 20));

        jtxtTelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jtxtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Student ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Firstname");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Surname");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        jtxtStudentID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 280, -1));

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFirstnameActionPerformed(evt);
            }
        });
        jPanel2.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 280, -1));

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Adress");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Post Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        jtxtAdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jtxtAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 280, -1));

        jtxtPostCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jtxtPostCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 280, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student ID", "Firstname", "Surname", "Adress", "PostCode", "Telephone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 470, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 510, 340));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 110, 30));

        jbtnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnAdd.setText("Add New Data");
        jbtnAdd.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 110, 30));

        jbtnPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 30));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel3.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 210, 340));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Students Details ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 330, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
       try{
    Class.forName("com.mysql.jdbc.Driver");
    sqlConn = DriverManager.getConnection(dataConn,username,password);
    pst = sqlConn.prepareStatement("insert into connector(StudentID,Firstname,Surname,Adress" 
            + "Postcode,Telephone)value(?,?,?,?,?,?)");
    
    pst.setString(1,jtxtStudentID.getText());
    pst.setString(2,jtxtFirstname.getText());
    pst.setString(3,jtxtSurname.getText());
    pst.setString(4,jtxtAdress.getText());
    pst.setString(5,jtxtPostCode.getText());
    pst.setString(6,jtxtTelephone.getText());
    
    pst.executeUpdate();
    JOptionPane.showMessageDialog(this, "Record Added");
    upDateDB();
    }//GEN-LAST:event_jbtnAddActionPerformed
    catch (ClassNotFoundException ex){
        java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
    }
    catch (SQLException ex){
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            }
    
       
    }
    
    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
      MessageFormat header = new MessageFormat("Printing in Progress");
      MessageFormat footer = new MessageFormat("Page{0,number,integer}");
      try{
      jTable1.print(JTable.PrintMode.NORMAL,header,footer);
      }
      catch (java.awt.print.PrinterException e)
      {
          System.err.format("No printer found", e.getMessage());
      }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jtxtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFirstnameActionPerformed
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","MySQLConnector",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
        {
        System.exit(0);
        }
            
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       jtxtStudentID.setText("");
        jtxtFirstname.setText("");
         jtxtSurname.setText("");
          jtxtAdress.setText("");
          jtxtPostCode.setText("");
           jtxtTelephone.setText("");
          
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_Mysqlconn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JTextField jtxtAdress;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTelephone;
    // End of variables declaration//GEN-END:variables
}
