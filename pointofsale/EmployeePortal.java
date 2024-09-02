/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pointofsale;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aila Arshad
 */
public class EmployeePortal extends javax.swing.JPanel {

    public EmployeePortal() {
        initComponents();
        allEmployee();
    }

    void allEmployee() {
        ArrayList<Employee> emp = EmployeeManager.getEmployees();
        if (emp != null) {
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < emp.size(); i++) {
                Object[] col = new Object[5];
                col[0] = emp.get(i).getUserId();
                col[1] = emp.get(i).getName();
                col[2] = emp.get(i).getCnic();
                col[3] = emp.get(i).getPh_no();
                col[4] = emp.get(i).getPassword();
                model.addRow(col);
            }
        }
    }

    void singleEmployees(ArrayList<Employee> emp) {
        if (emp != null) {
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < emp.size(); i++) {
                Object[] col = new Object[5];
                col[0] = emp.get(i).getUserId();
                col[1] = emp.get(i).getName();
                col[2] = emp.get(i).getCnic();
                col[3] = emp.get(i).getPh_no();
                col[4] = emp.get(i).getPassword();
                model.addRow(col);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        empID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phNo = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        addEmp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        deleteEmp = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        updateEmp = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(42, 130, 199));
        setForeground(new java.awt.Color(42, 130, 199));
        setPreferredSize(new java.awt.Dimension(1156, 622));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(42, 130, 199));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        empID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID:");

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone No:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNIC:");

        phNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addEmp.setBackground(new java.awt.Color(255, 255, 255));
        addEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addEmpMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 130, 199));
        jLabel8.setText("Add Employee");

        javax.swing.GroupLayout addEmpLayout = new javax.swing.GroupLayout(addEmp);
        addEmp.setLayout(addEmpLayout);
        addEmpLayout.setHorizontalGroup(
            addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmpLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        addEmpLayout.setVerticalGroup(
            addEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        deleteEmp.setBackground(new java.awt.Color(255, 255, 255,200));
        deleteEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteEmpMouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 130, 199));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Delete Employee");

        javax.swing.GroupLayout deleteEmpLayout = new javax.swing.GroupLayout(deleteEmp);
        deleteEmp.setLayout(deleteEmpLayout);
        deleteEmpLayout.setHorizontalGroup(
            deleteEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        deleteEmpLayout.setVerticalGroup(
            deleteEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        updateEmp.setBackground(new java.awt.Color(255, 255, 255));
        updateEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateEmpMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 130, 199));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Update Employee");

        javax.swing.GroupLayout updateEmpLayout = new javax.swing.GroupLayout(updateEmp);
        updateEmp.setLayout(updateEmpLayout);
        updateEmpLayout.setHorizontalGroup(
            updateEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        updateEmpLayout.setVerticalGroup(
            updateEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateEmpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        cnic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cnic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(updateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phNo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 510, -1));

        jPanel2.setBackground(new java.awt.Color(42, 130, 199));

        jLabel1.setBackground(new java.awt.Color(42, 130, 199));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Information:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Name:");

        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 520, -1));

        empTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmployeeID", "Name", "CNIC", "Phone No", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTable.setFocusable(false);
        empTable.setOpaque(false);
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 590, 510));

        jLabel11.setForeground(new java.awt.Color(42, 130, 199));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        ArrayList<Employee> obj = EmployeeManager.search(search.getText());
        if (obj != null) {
            singleEmployees(obj);
        } else {
            allEmployee();
        }
    }//GEN-LAST:event_searchKeyReleased

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        int index = empTable.getSelectedRow();
        empID.setText(model.getValueAt(index, 0).toString());
        name.setText(model.getValueAt(index, 1).toString());
        cnic.setText(model.getValueAt(index, 2).toString());
        phNo.setText(model.getValueAt(index, 3).toString());
        password.setText(model.getValueAt(index, 4).toString());

    }//GEN-LAST:event_empTableMouseClicked

    private void addEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmpMouseClicked
        // TODO add your handling code here:
        Employee emp = new Employee();

        try {
            emp.setUserId(empID.getText());
            emp.setName(name.getText());
            emp.setCnic(cnic.getText());
            emp.setPh_no(phNo.getText());
            emp.setPassword(password.getText());
            if (emp.isValid()) {
                EmployeeManager.addEmployee(emp);
                allEmployee();
                empID.setText("");
                name.setText("");
                cnic.setText("");
                phNo.setText("");
                password.setText("");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_addEmpMouseClicked

    private void updateEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateEmpMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        try {
            if (empTable.getSelectedRowCount() == 1) {
                Employee emp = new Employee();
                if (!empID.getText().isEmpty() && !name.getText().isEmpty() && !cnic.getText().isEmpty()
                        && !phNo.getText().isEmpty() && !password.getText().isEmpty()) {
                    emp.setUserId(empID.getText());
                    emp.setName(name.getText());
                    emp.setCnic(cnic.getText());
                    emp.setPh_no(phNo.getText());
                    emp.setPassword(password.getText());
                    if (emp.isValid()) {
                        EmployeeManager.updateEmployee(name.getText(), emp);
                        model.setValueAt(empID.getText(), empTable.getSelectedRow(), 0);
                        model.setValueAt(name.getText(), empTable.getSelectedRow(), 1);
                        model.setValueAt(cnic.getText(), empTable.getSelectedRow(), 2);
                        model.setValueAt(phNo.getText(), empTable.getSelectedRow(), 3);
                        model.setValueAt(password.getText(), empTable.getSelectedRow(), 4);
                        empID.setText("");
                        name.setText("");
                        cnic.setText("");
                        phNo.setText("");
                        password.setText("");
                    }
                }
            } else if (empTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Row not Selected");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_updateEmpMouseClicked

    private void deleteEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteEmpMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        if (empTable.getSelectedRowCount() == 1) {
            model.removeRow(empTable.getSelectedRow());
            Employee emp = new Employee();
            if (!empID.getText().isEmpty() && !name.getText().isEmpty() && !cnic.getText().isEmpty()
                    && !phNo.getText().isEmpty() && !password.getText().isEmpty()) {
                emp.setUserId(empID.getText());
                emp.setName(name.getText());
                emp.setCnic(cnic.getText());
                emp.setPh_no(phNo.getText());
                emp.setPassword(password.getText());
                EmployeeManager.deleteEmployee(emp);
                empID.setText("");
                name.setText("");
                cnic.setText("");
                phNo.setText("");
                password.setText("");
            }
        } else if (empTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty");
        } else {
            JOptionPane.showMessageDialog(null, "Row not Selected");
        }
    }//GEN-LAST:event_deleteEmpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addEmp;
    private javax.swing.JTextField cnic;
    private javax.swing.JPanel deleteEmp;
    private javax.swing.JTextField empID;
    private javax.swing.JTable empTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phNo;
    private javax.swing.JTextField search;
    private javax.swing.JPanel updateEmp;
    // End of variables declaration//GEN-END:variables
}
