/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manager;

import app.log_in_window;
import employee.customer_function_window;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Administrator
 */
public class manager extends javax.swing.JFrame {

    private String acc;
    private String pass;

    /**
     * Creates new form main_window
     */
    public manager(String acc, String pass) {
        initComponents();
        this.acc = acc;
        this.pass = pass;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManager = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbTable = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JToggleButton();
        cmbElement = new javax.swing.JComboBox<>();
        tftSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblManager1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManagerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManager);

        jLabel1.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel1.setText("Manager");

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbTable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUS", "ROUTE", " " }));
        cmbTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbTableMouseEntered(evt);
            }
        });

        jLabel2.setText("Choose table");

        btnSelect.setText("Show table");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tftSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tftSearchKeyPressed(evt);
            }
        });

        jLabel3.setText("Search");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        tblManager1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblManager1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManager1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblManager1);

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel5.setText("Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnReturn, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tftSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbElement, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTable, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReturn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tftSearch)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cmbTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(cmbElement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(btnSelect)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (cmbTable.getSelectedIndex() == 0) {
            insert_branch_window newAddWindow = new insert_branch_window(acc,pass);
            newAddWindow.setVisible(true);
        } else if (cmbTable.getSelectedIndex() == 1) {
            employee_function_window newAddWindow = new employee_function_window(1,acc,pass);
            newAddWindow.setVisible(true);
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = tblManager.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) tblManager.getModel();
        String string = "";
        for (int i = 0; i < tblManager.getColumnCount(); i++) {
            string += tableModel.getColumnName(i) + "='" + tableModel.getValueAt(row, i).toString() + "' and ";
        }
        string = (String) string.subSequence(0, string.length() - 4) + ";";
        updateOrDisplayTable("delete from bank_system." + cmbTable.getSelectedItem().toString() + " where " + string, btnDelete.getText());
        btnSelectActionPerformed(evt);
        JOptionPane.showConfirmDialog(rootPane, "Are you sure about that ?");
        //System.out.println("delete from "+cbxOfTuples.getSelectedItem().toString()+" where "+ string);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here
        String query = "select " + cmbElement.getSelectedItem().toString().trim() + " from " + cmbTable.getSelectedItem().toString().trim();
        updateOrDisplayTable(query, "Select");
    }//GEN-LAST:event_btnSelectActionPerformed

    private void cmbTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTableMouseEntered
        // TODO add your handling code here:
        try {
            String query = "SELECT * from " + cmbTable.getSelectedItem().toString().trim() + "";
            // loading mysql driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection with database
            String url = "jdbc:mysql://localhost:3306/bank_system";
            //create a connection object to register the driver
            java.sql.Connection con = DriverManager.getConnection(url, acc,pass);
            //create a statement object
            Statement st = con.createStatement();
            //Create a ResultSet object and store the return object of query execution
            ResultSet rs;
            rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int n = rsmd.getColumnCount();
            String[] list = new String[n + 1];
            list[0] = "*";
            for (int i = 1; i < list.length; i++) {
                list[i] = rsmd.getColumnName(i);
            }
            con.close();
            cmbElement.setModel(new javax.swing.DefaultComboBoxModel<>(list));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbTableMouseEntered

    private void tftSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tftSearchKeyPressed
        // TODO add your handling code here:
        String stringSearch = tftSearch.getText();
        search(stringSearch);
    }//GEN-LAST:event_tftSearchKeyPressed

    private void tblManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManagerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblManagerMouseClicked

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        log_in_window returnWin = new log_in_window();
        this.dispose();
        returnWin.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int row = tblManager.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) tblManager.getModel();
        String[] string = new String[tableModel.getColumnCount()];
        for (int i = 0; i < tblManager.getColumnCount(); i++) {
            string[i] = tableModel.getValueAt(row, i).toString();
        }
        System.out.println(cmbTable.getSelectedIndex());
        switch (cmbTable.getSelectedIndex()) {
            case 0:
                employee_function_window ud = new employee_function_window(0,acc,pass);
                ud.readData(string);
                ud.setVisible(true);
            case 1:

        }

        btnSelectActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblManager1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManager1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblManager1MouseClicked

    private void updateOrDisplayTable(String query, String action) {
        try {
            // loading mysql driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection with database
            String url = "jdbc:mysql://localhost:3306/bank_system";
            String username = "root";
            String password = "Halazara979489";
            //create a connection object to register the driver
            java.sql.Connection con = DriverManager.getConnection(url, username, password);
            //create a statement object
            Statement st = con.createStatement();
            //Create a ResultSet object and store the return object of query execution
            ResultSet rs;
            if (action.compareTo("Select") == 0) {
                rs = st.executeQuery(query);
            } else {
                st.executeUpdate(query);
                return;
            }

            //Retrieving the result object
            ResultSetMetaData rsmd = rs.getMetaData();
            //get number of column
            int nColumn = rsmd.getColumnCount();
            // Creating a default table object and typecast out JTable into it
            DefaultTableModel tblModel = (DefaultTableModel) tblManager.getModel();
            tblModel.setColumnCount(0);
            tblModel.setRowCount(0);
            for (int j = 0; j < nColumn;) {
                // Adding colum name according to metadata information
                tblModel.addColumn(rsmd.getColumnName(++j));
            }
            while (rs.next()) {
                String Row[] = new String[nColumn + 1];
                for (int i = 0; i < nColumn; i++) {
                    Row[i] = rs.getString(i + 1);
                }
                tblModel.addRow(Row);
            }
            con.close();
        } catch (Exception e) {
            String error = e.toString();
            JOptionPane.showMessageDialog(tblManager, error);

        }
    }

    public void search(String str) {
        DefaultTableModel model = (DefaultTableModel) tblManager.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tblManager.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InstantiationException
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReturn;
    private javax.swing.JToggleButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbElement;
    private javax.swing.JComboBox<String> cmbTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblManager;
    private javax.swing.JTable tblManager1;
    private javax.swing.JTextField tftSearch;
    // End of variables declaration//GEN-END:variables
}