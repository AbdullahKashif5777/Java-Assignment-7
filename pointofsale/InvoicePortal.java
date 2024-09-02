/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pointofsale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class InvoicePortal extends javax.swing.JFrame {

    int qty;

    public InvoicePortal() {
        initComponents();
        this.setLocationRelativeTo(null);
        date();
        time();
        for (String s : ProductManager.products()) {
            products.addItem(s);
        }
    }

    public void date() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        String dd = sdf.format(d);
        dateD.setText(dd);

    }
    Timer t;
    SimpleDateFormat sdf;

    public void time() {

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                sdf = new SimpleDateFormat("hh:mm:ss a");
                String s = sdf.format(dt);
                time.setText(s);
            }
        });
        t.start();
    }

    public void allStock() {
        ArrayList<Stock> stock = StockManager.getStock();
        if (stock != null) {
            DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
            model.setRowCount(0);
            for (int i = 0; i < stock.size(); i++) {
                Object[] col = new Object[6];
                col[0] = stock.get(i).getProductID();
                col[1] = stock.get(i).getName();
                col[2] = stock.get(i).getRetailPrice();
                col[3] = stock.get(i).getCusQuantity();
                model.addRow(col);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        products = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        dateD = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        proID = new javax.swing.JTextField();
        billGen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        deletePro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        amountBill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1170, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        products.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        products.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productsItemStateChanged(evt);
            }
        });
        products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productsActionPerformed(evt);
            }
        });
        products.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productsKeyReleased(evt);
            }
        });
        getContentPane().add(products, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 420, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Products:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("0");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 116, 20));

        dateD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dateD.setForeground(new java.awt.Color(255, 255, 255));
        dateD.setText("0-0-0");
        getContentPane().add(dateD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, 100, 20));

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stockTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 610, 470));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ProductID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, 20));

        quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 420, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 20));

        proID.setEditable(false);
        proID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        proID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proIDActionPerformed(evt);
            }
        });
        getContentPane().add(proID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 420, 30));

        billGen.setBackground(new java.awt.Color(255, 255, 255, 200));
        billGen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        billGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billGenMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Generate");

        javax.swing.GroupLayout billGenLayout = new javax.swing.GroupLayout(billGen);
        billGen.setLayout(billGenLayout);
        billGenLayout.setHorizontalGroup(
            billGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billGenLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );
        billGenLayout.setVerticalGroup(
            billGenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billGenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(billGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 140, 40));

        deletePro.setBackground(new java.awt.Color(255, 255, 255, 200));
        deletePro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletePro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(42, 130, 199));
        jLabel7.setText("Delete");

        javax.swing.GroupLayout deleteProLayout = new javax.swing.GroupLayout(deletePro);
        deletePro.setLayout(deleteProLayout);
        deleteProLayout.setHorizontalGroup(
            deleteProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteProLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        deleteProLayout.setVerticalGroup(
            deleteProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteProLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(deletePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TotalBill:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255, 200));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(42, 130, 199));
        jLabel9.setText("Add");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 140, 40));

        price.setEditable(false);
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 420, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pointofsale/icons/back-arrow (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jPanel1.setBackground(new java.awt.Color(42, 130, 199));

        amountBill.setEditable(false);
        amountBill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amountBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(amountBill, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(708, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(amountBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void proIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proIDActionPerformed

    private void amountBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountBillActionPerformed

    private void productsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productsKeyReleased

    }//GEN-LAST:event_productsKeyReleased

    private void productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productsActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        Product p = ProductManager.stock(products.getSelectedItem().toString());
        if (p != null) {
            for (int i = 0; i < stockTable.getRowCount(); i++) {
                if (model.getValueAt(i, 1).equals(products.getSelectedItem().toString())) {
                    JOptionPane.showMessageDialog(null, "Product is already selected");
                    return;
                }
            }
            proID.setText(p.getProductID() + "");
            price.setText(p.getRetailPrice() + "");
            qty = p.getQuantity();
        }
    }//GEN-LAST:event_productsActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        Stock stock = new Stock();
        try {
            stock.setProductID(proID.getText());
            stock.setName(products.getSelectedItem().toString());
            stock.setRetailPrice(price.getText());
            if (Integer.parseInt(quantity.getText()) > qty) {
                JOptionPane.showMessageDialog(null, "Avaliable quantity is " + qty);
            } else if (qty == 0) {
                JOptionPane.showMessageDialog(null, "Out of stock");
                stock.setStatus(true);
            } else {
                stock.setCusQuantity(Integer.parseInt(quantity.getText()));
            }
            stock.setQuantity((qty - Integer.parseInt(quantity.getText())) + "");
            if (!proID.getText().isEmpty() && !price.getText().isEmpty() && !quantity.getText().isEmpty() && Integer.parseInt(quantity.getText()) < qty && qty != 0) {
                StockManager.addstock(stock);
                allStock();
                proID.setText("");
                price.setText("");
                quantity.setText("");

            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void productsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productsItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_productsItemStateChanged

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        int index = stockTable.getSelectedRow();
        products.setSelectedItem(model.getValueAt(index, 1).toString());
        proID.setText(model.getValueAt(index, 0).toString());
        price.setText(model.getValueAt(index, 2).toString());
        quantity.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_stockTableMouseClicked

    private void deleteProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        if (stockTable.getSelectedRowCount() == 1) {
            Stock s = new Stock();
            if (!proID.getText().isEmpty() && !price.getText().isEmpty() && !quantity.getText().isEmpty() && Integer.parseInt(quantity.getText()) < qty && qty != 0) {
                s.setProductID(proID.getText());
                s.setName(products.getSelectedItem().toString());
                s.setRetailPrice(price.getText());
                s.setCusQuantity(Integer.parseInt(quantity.getText()));
                s.setQuantity((qty - s.getCusQuantity() + Integer.parseInt(quantity.getText())) + "");
                if (qty != 0) {
                    s.setStatus(false);
                }
                StockManager.deleteStock(new Stock(s.getName(), s.getProductID(), s.getRetailPrice() + "", s.getCusQuantity(), s.getQuantity() + "", s.isStatus()));
                model.removeRow(stockTable.getSelectedRow());
                proID.setText("");
                price.setText("");
                quantity.setText("");
            }
        } else if (stockTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Table is empty");
        } else {
            JOptionPane.showMessageDialog(null, "Row not Selected");
        }
    }//GEN-LAST:event_deleteProMouseClicked

    private void billGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billGenMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        double amount = 0;
        for (int i = 0; i < stockTable.getRowCount(); i++) {
            amount += Double.parseDouble(model.getValueAt(i, 2).toString()) * Double.parseDouble(model.getValueAt(i, 3).toString());
        }
        amountBill.setText(amount + "");
    }//GEN-LAST:event_billGenMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Do you really want to logout?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            this.dispose();
            new FirstPanel().setVisible(true);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(InvoicePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoicePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoicePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoicePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoicePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountBill;
    private javax.swing.JPanel billGen;
    private javax.swing.JLabel dateD;
    private javax.swing.JPanel deletePro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField proID;
    private javax.swing.JComboBox<String> products;
    private javax.swing.JTextField quantity;
    private javax.swing.JTable stockTable;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
