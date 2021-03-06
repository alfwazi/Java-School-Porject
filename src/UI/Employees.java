/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import dataBase.dataQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.classes.Employee;

/**
 *
 * @author Badr-Alfwazi
 */
public class Employees extends javax.swing.JFrame {
    private String userId;
    private int tableClicked =0;
    /**
     * Creates new form Employees
     * @throws java.lang.Exception
     */
    public Employees() throws Exception {
        initComponents();
        getUsers();
    }
    public void refresh() {
        tableClicked =0;
        DefaultTableModel model = (DefaultTableModel) employeesTable.getModel();
        model.setRowCount(0);
        try {
            getUsers();
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
        public ArrayList<Employee> userList() throws Exception {
        ArrayList<Employee> userList = new ArrayList<>();
        dataQuery query = new dataQuery();
        ResultSet rs =query.runQuery("SELECT * from employees");
        Employee employee;
        try {
            while(rs.next()) {
                employee = new Employee(rs.getString("eid"),rs.getString("Efname"),rs.getString("Efaname"),rs.getString("Elname"),rs.getString("Stateemployee"),rs.getString("certfction"),rs.getDate("Ebirthdte"),rs.getString("Ecountry"),rs.getString("Enantionaly"),rs.getString("Eaddress"),rs.getString("Ecity"),rs.getString("Mobile"),rs.getString("Tel"),rs.getString("Egender"));
                userList.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }
        public void getUsers() throws Exception {
        ArrayList<Employee> list = userList();
        DefaultTableModel model = (DefaultTableModel) employeesTable.getModel();
        Object [] row = new Object[10];
        for (int i=0;i<list.size();i++) {
            row[8]  = list.get(i).getEid();
            row[7]  = list.get(i).getEfname();
            row[6]  = list.get(i).getEfaname();
            row[5]  = list.get(i).getElname();
            row[4]  = list.get(i).getStateemployee();
            row[3]  = list.get(i).getCertfction();
            row[2]  = list.get(i).getEnantionaly();
            row[1]  = list.get(i).getEgender();
            row[0]  = list.get(i).getEaddress();
            model.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeesTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("?????????? ????????????????");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(310, 10, 150, 29);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 50);

        studentsTable.setAutoCreateRowSorter(true);
        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????????", "??????????", "?????? ????????", "??????????????", "??????????????", "?????? ????????", "?????????? ??????????", "?????? ??????????"
            }
        ));
        studentsTable.setColumnSelectionAllowed(true);
        studentsTable.setDragEnabled(true);
        jScrollPane1.setViewportView(studentsTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 120, 800, 260);

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("??????????");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jButton6);
        jButton6.setBounds(660, 60, 120, 40);

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("??????????");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setMaximumSize(new java.awt.Dimension(71, 31));
        jButton4.setMinimumSize(new java.awt.Dimension(71, 31));
        jButton4.setPreferredSize(new java.awt.Dimension(71, 31));
        jPanel1.add(jButton4);
        jButton4.setBounds(370, 390, 100, 40);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("????????");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setMaximumSize(new java.awt.Dimension(71, 31));
        jButton3.setMinimumSize(new java.awt.Dimension(71, 31));
        jButton3.setPreferredSize(new java.awt.Dimension(71, 31));
        jPanel1.add(jButton3);
        jButton3.setBounds(680, 420, 100, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(404, 229, 0, 0);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?????????? ????????????????");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(310, 10, 190, 29);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(5, 5, 810, 50);

        employeesTable.setAutoCreateRowSorter(true);
        employeesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????????????", "??????????", "??????????????", "??????????????", "??????????????", "??????????????", "?????? ????????", "?????????? ??????????", "?????? ????????????"
            }
        ));
        employeesTable.setToolTipText("????????????????");
        employeesTable.setFocusable(false);
        employeesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(employeesTable);
        employeesTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(15, 125, 800, 260);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("??????????");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);
        jButton7.setBounds(680, 70, 120, 40);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("????????");
        jButton8.setBorder(null);
        jButton8.setMaximumSize(new java.awt.Dimension(71, 31));
        jButton8.setMinimumSize(new java.awt.Dimension(71, 31));
        jButton8.setPreferredSize(new java.awt.Dimension(71, 31));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);
        jButton8.setBounds(710, 400, 90, 40);

        jButton10.setBackground(new java.awt.Color(0, 102, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("????????");
        jButton10.setBorder(null);
        jButton10.setMaximumSize(new java.awt.Dimension(71, 31));
        jButton10.setMinimumSize(new java.awt.Dimension(71, 31));
        jButton10.setPreferredSize(new java.awt.Dimension(71, 31));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(310, 400, 100, 40);

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("??????");
        jButton11.setBorder(null);
        jButton11.setMaximumSize(new java.awt.Dimension(71, 31));
        jButton11.setMinimumSize(new java.awt.Dimension(71, 31));
        jButton11.setPreferredSize(new java.awt.Dimension(71, 31));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(460, 400, 100, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-5, -3, 820, 470);

        setSize(new java.awt.Dimension(826, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesTableMouseClicked
        this.tableClicked = 1;
    }//GEN-LAST:event_employeesTableMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        refresh();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Home home = new Home ();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if (this.tableClicked ==0) {
            JOptionPane.showMessageDialog(this,"???? ?????????????? ???????? ???????? ","??????",
            JOptionPane.ERROR_MESSAGE);
        }
        else {
            userId = employeesTable.getValueAt(employeesTable.getSelectedRow(), 8).toString();
            CrudEm c = new CrudEm();
            c.setId(Integer.parseInt(userId));
            c.setVisible(true);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Employees().setVisible(true);
            } catch (Exception ex) {
                Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable employeesTable;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable studentsTable;
    // End of variables declaration//GEN-END:variables
}
