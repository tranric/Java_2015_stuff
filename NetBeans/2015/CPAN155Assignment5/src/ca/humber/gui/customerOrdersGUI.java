package ca.humber.gui;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class customerOrdersGUI extends javax.swing.JFrame {
 List array = new ArrayList();
    public customerOrdersGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupRadio = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblSize = new javax.swing.JLabel();
        rbtnSmall = new javax.swing.JRadioButton();
        rbtnMedium = new javax.swing.JRadioButton();
        rbtnLarge = new javax.swing.JRadioButton();
        lblType = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("NAME:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblNumber.setText("NUMBER:");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        lblSize.setText("SIZE:");

        btnGroupRadio.add(rbtnSmall);
        rbtnSmall.setText("SMALL");

        btnGroupRadio.add(rbtnMedium);
        rbtnMedium.setText("MEDIUM");

        btnGroupRadio.add(rbtnLarge);
        rbtnLarge.setText("LARGE");

        lblType.setText("CAKE TYPE:");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Apple", "Carrot", "Cheesecake", "Chocolate", "Coffee", "Opera", "Tiramisu" }));

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(12, 12, 12)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQuit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSize)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnSmall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnMedium)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnLarge)
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblName)
                                    .addComponent(lblNumber))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(lblType)))
                                .addGap(43, 43, 43))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSmall)
                    .addComponent(rbtnMedium)
                    .addComponent(rbtnLarge)
                    .addComponent(lblSize))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnQuit)
                    .addComponent(btnAdd))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String message1 = (String) JOptionPane.showInputDialog(null, "CHOOSE FILE",
        "EDIT LIST", JOptionPane.QUESTION_MESSAGE, null,
        array.toArray(), array.indexOf(0));
        if (!message1.equals(0)){
            String message2 = JOptionPane.showInputDialog("ENTER NAME:");
             while (message2.equalsIgnoreCase("")){
                message2 = JOptionPane.showInputDialog("INVALIVE NAME. PLEASE ENTER VALIDE NAME:");
            }
            String message3 = JOptionPane.showInputDialog("ENTER NUMBER:");
            while (message3.equalsIgnoreCase("")){
                message3 = JOptionPane.showInputDialog("INVALIVE NUMBER. PLEASE ENTER VALIDE NUMBER:");
            }
            String message4 = JOptionPane.showInputDialog("ENTER SIZE:");
            while(!message4.equalsIgnoreCase("Small") && !message4.equalsIgnoreCase("Medium")
                 && !message4.equalsIgnoreCase("Large") && message4.equalsIgnoreCase("")){
           message4 = JOptionPane.showInputDialog("INVALIVE SIZE. PLEASE ENTER VALIDE SIZE:");
            }
            String message5 = JOptionPane.showInputDialog("ENTER NEW TYPE:");
                    while(!message5.equalsIgnoreCase("Apple") && !message5.equalsIgnoreCase("Carrot")
                    && !message5.equalsIgnoreCase("Cheesecake") && !message5.equalsIgnoreCase("Chocolate") &&
                    !message5.equalsIgnoreCase("Coffee") && !message5.equalsIgnoreCase("Opera") &&
                    !message5.equalsIgnoreCase("Tiramisu")&& message5.equalsIgnoreCase("")){
           message5 = JOptionPane.showInputDialog("INVALIDE INPUT. PLEASE ENTER TYPE.");
            }
            array.remove(message1);
            array.add("NAME:\r\t\r\t"+message2+"\r\nNUMBER:\r\t\r\t"+ message3+"\r\nCAKE TYPE:\r\t" +message5+"\r\nCAKE SIZE:\r\t" + message4);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Orders.txt", true)))){
            for (int i=0; i<array.size(); i++){
                out.println("-------Save Info-------");
                out.println(array.get(i));
            }
   }catch (IOException e) {
        JOptionPane.showMessageDialog(null, "THERE WAS AN ERROR.");
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
           String message = (String) JOptionPane.showInputDialog(null, "CHOOSE FILE TO DELETE",
        "DELETE FROM LIST", JOptionPane.QUESTION_MESSAGE, null,
        array.toArray(), array.indexOf(0));
        
            array.remove(message);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String size = "";
        if (txtNumber.getText().equals("")){
           JOptionPane.showMessageDialog(null, "NUMBER IS EMPTY");
           return;
       }
        if (rbtnSmall.isSelected() == true){
            size = "SMALL";
        }
        else if (rbtnMedium.isSelected() == true){
            size = "MEDIUM";
        }
        else if (rbtnLarge.isSelected() == true){
            size = "LARGE";
        }
        else{
           JOptionPane.showMessageDialog(null, "PLEASE SELECT A CAKE SIZE.");
           return;
        }
       
       File saveFile = new File("Orders.txt");
      array.add("NAME:\r\t\r\t" + txtName.getText()+"\r\nNUMBER:\r\t\r\t" + txtNumber.getText()+"\r\nCAKE TYPE:\r\t" + cmbType.getSelectedItem()+"\r\nCAKE SIZE:\r\t" + size);
    }//GEN-LAST:event_btnAddActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(customerOrdersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerOrdersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerOrdersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerOrdersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerOrdersGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGroupRadio;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblType;
    private javax.swing.JRadioButton rbtnLarge;
    private javax.swing.JRadioButton rbtnMedium;
    private javax.swing.JRadioButton rbtnSmall;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}