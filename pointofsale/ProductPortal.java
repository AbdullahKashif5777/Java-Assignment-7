/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pointofsale;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductPortal extends javax.swing.JPanel {

    public ProductPortal() {

        initComponents();
        allProducts();
    }

    void allProducts() {

        ArrayList<Product> products = ProductManager.getProducts();
        if (products != null) {
            DefaultTableModel model = (DefaultTableModel) proTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < products.size(); i++) {
                Object[] col = new Object[6];
                col[0] = products.get(i).getProductID();
                col[1] = products.get(i).getName();
                col[2] = products.get(i).getCategory();
                col[3] = products.get(i).getW_s_price();
                col[4] = products.get(i).getRetailPrice();
                col[5] = products.get(i).getQuantity();
                model.addRow(col);
            }
        }

    }

    void singleProduct(ArrayList<Product> products) {
        if (products != null) {
            DefaultTableModel model = (DefaultTableModel) proTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < products.size(); i++) {
                Object[] col = new Object[6];
                col[0] = products.get(i).getProductID();
                col[1] = products.get(i).getName();
                col[2] = products.get(i).getCategory();
                col[3] = products.get(i).getW_s_price();
                col[4] = products.get(i).getRetailPrice();
                col[5] = products.get(i).getQuantity();
                model.addRow(col);

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        proId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        proName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wsPrice = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        retailPrice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        addBtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(42, 130, 199));
        setPreferredSize(new java.awt.Dimension(1156, 622));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(42, 130, 199));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name:");

        proId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product ID:");

        proName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Category:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Retail Price:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" W_S_Price:");

        wsPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        wsPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quantity.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bakery Item", "Dairy Product", "Snacks", "Fast Food", "Drinks ", "Food", "Sweets", "Fruits", " ", " " }));
        category.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        category.setFocusable(false);

        updateBtn.setBackground(new java.awt.Color(10, 128, 113,200));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(42, 130, 199));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Update Product");

        javax.swing.GroupLayout updateBtnLayout = new javax.swing.GroupLayout(updateBtn);
        updateBtn.setLayout(updateBtnLayout);
        updateBtnLayout.setHorizontalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        updateBtnLayout.setVerticalGroup(
            updateBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updateBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        retailPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        retailPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Quantity:");

        addBtn.setBackground(new java.awt.Color(10, 128, 113,180));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(42, 130, 199));
        jLabel8.setText("Add Product");

        javax.swing.GroupLayout addBtnLayout = new javax.swing.GroupLayout(addBtn);
        addBtn.setLayout(addBtnLayout);
        addBtnLayout.setHorizontalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        addBtnLayout.setVerticalGroup(
            addBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        DeleteBtn.setBackground(new java.awt.Color(10, 128, 113,200));
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 130, 199));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Delete Product");

        javax.swing.GroupLayout DeleteBtnLayout = new javax.swing.GroupLayout(DeleteBtn);
        DeleteBtn.setLayout(DeleteBtnLayout);
        DeleteBtnLayout.setHorizontalGroup(
            DeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        DeleteBtnLayout.setVerticalGroup(
            DeleteBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeleteBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quantity)
                            .addComponent(proName, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(proId, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(retailPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wsPrice)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wsPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retailPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 510, 470));

        jPanel2.setBackground(new java.awt.Color(42, 130, 199));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Information:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Name:");

        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
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
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        proTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Name", "Category", "W_S_Price", "Retail Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        proTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proTable);
        if (proTable.getColumnModel().getColumnCount() > 0) {
            proTable.getColumnModel().getColumn(0).setResizable(false);
            proTable.getColumnModel().getColumn(1).setResizable(false);
            proTable.getColumnModel().getColumn(2).setResizable(false);
            proTable.getColumnModel().getColumn(3).setResizable(false);
            proTable.getColumnModel().getColumn(4).setResizable(false);
            proTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 590, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered

    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited

    }//GEN-LAST:event_addBtnMouseExited

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:
        Product pro = new Product();

        try {
            pro.setProductID(proId.getText());
            pro.setName(proName.getText());
            pro.setCategory(category.getSelectedItem().toString());
            pro.setW_s_price(wsPrice.getText());
            pro.setRetailPrice(retailPrice.getText());
            pro.setQuantity(quantity.getText());

            if (pro.isValid() && !wsPrice.getText().isEmpty() && wsPrice != null && !retailPrice.getText().isEmpty()
                    && retailPrice != null && !quantity.getText().isEmpty() && quantity != null) {
                ProductManager.addProduct(pro);
                allProducts();
                proId.setText("");
                proName.setText("");
                wsPrice.setText("");
                retailPrice.setText("");
                quantity.setText("");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_addBtnMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
        ArrayList<Product> obj = ProductManager.search(search.getText());
        if (obj != null) {
            singleProduct(obj);
        } else {
            allProducts();
        }
    }//GEN-LAST:event_searchKeyReleased

    private void proTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) proTable.getModel();
        int index = proTable.getSelectedRow();
        proId.setText(model.getValueAt(index, 0).toString());
        proName.setText(model.getValueAt(index, 1).toString());
        category.setSelectedItem(model.getValueAt(index, 2).toString());
        wsPrice.setText(model.getValueAt(index, 3).toString());
        retailPrice.setText(model.getValueAt(index, 4).toString());
        quantity.setText(model.getValueAt(index, 5).toString());
    }//GEN-LAST:event_proTableMouseClicked

    private void DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseEntered


    }//GEN-LAST:event_DeleteBtnMouseEntered

    private void DeleteBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseExited

    }//GEN-LAST:event_DeleteBtnMouseExited

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) proTable.getModel();
        if (proTable.getSelectedRowCount() == 1) {
            Product p = new Product();
            if (!proId.getText().isEmpty() && !proName.getText().isEmpty() && !wsPrice.getText().isEmpty()
                    && !retailPrice.getText().isEmpty() && !quantity.getText().isEmpty() && !category.getSelectedItem().toString().isEmpty()) {
                p.setProductID(proId.getText());
                p.setName(proName.getText());
                p.setCategory(category.getSelectedItem().toString());
                p.setW_s_price(wsPrice.getText());
                p.setRetailPrice(retailPrice.getText());
                p.setQuantity(quantity.getText());
                ProductManager.deleteProduct(p);
                model.removeRow(proTable.getSelectedRow());
                proId.setText("");
                proName.setText("");
                wsPrice.setText("");
                retailPrice.setText("");
                quantity.setText("");
            }
        } else if (proTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty");
        } else {
            JOptionPane.showMessageDialog(null, "Row not Selected");
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) proTable.getModel();
        try {
            if (proTable.getSelectedRowCount() == 1) {
                Product p = new Product();
                if (!proId.getText().isEmpty() && !proName.getText().isEmpty() && !wsPrice.getText().isEmpty()
                        && !retailPrice.getText().isEmpty() && !quantity.getText().isEmpty() && !category.getSelectedItem().toString().isEmpty()) {
                    p.setProductID(proId.getText());
                    p.setName(proName.getText());
                    p.setCategory(category.getSelectedItem().toString());
                    p.setW_s_price(wsPrice.getText());
                    p.setRetailPrice(retailPrice.getText());
                    p.setQuantity(quantity.getText());
                    if (p.isValid()) {
                        ProductManager.updateProduct(proName.getText(), p);
                        model.setValueAt(proId.getText(), proTable.getSelectedRow(), 0);
                        model.setValueAt(proName.getText(), proTable.getSelectedRow(), 1);
                        model.setValueAt(category.getSelectedItem(), proTable.getSelectedRow(), 2);
                        model.setValueAt(wsPrice.getText(), proTable.getSelectedRow(), 3);
                        model.setValueAt(retailPrice.getText(), proTable.getSelectedRow(), 4);
                        model.setValueAt(quantity.getText(), proTable.getSelectedRow(), 5);
                        proId.setText("");
                        proName.setText("");
                        wsPrice.setText("");
                        retailPrice.setText("");
                        quantity.setText("");
                    }
                }
            } else if (proTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Row not Selected");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_updateBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DeleteBtn;
    private javax.swing.JPanel addBtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField proId;
    private javax.swing.JTextField proName;
    private javax.swing.JTable proTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField retailPrice;
    private javax.swing.JTextField search;
    private javax.swing.JPanel updateBtn;
    private javax.swing.JTextField wsPrice;
    // End of variables declaration//GEN-END:variables
}
