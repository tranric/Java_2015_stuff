package ca.humber.editor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TextEditor extends javax.swing.JFrame {

    public TextEditor() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textScroll = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        subMenuNew = new javax.swing.JMenuItem();
        subMenuSave = new javax.swing.JMenuItem();
        subMenuExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        subMenuReplace = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        subMenuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textScroll.setViewportView(textArea);

        menuFile.setText("File");

        subMenuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        subMenuNew.setText("New");
        subMenuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuNewActionPerformed(evt);
            }
        });
        menuFile.add(subMenuNew);

        subMenuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        subMenuSave.setText("Save");
        subMenuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSaveActionPerformed(evt);
            }
        });
        menuFile.add(subMenuSave);

        subMenuExit.setText("Exit");
        subMenuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuExitActionPerformed(evt);
            }
        });
        menuFile.add(subMenuExit);

        menuBar.add(menuFile);

        menuEdit.setText("Edit");

        subMenuReplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        subMenuReplace.setText("Replace");
        subMenuReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuReplaceActionPerformed(evt);
            }
        });
        menuEdit.add(subMenuReplace);

        menuBar.add(menuEdit);

        menuHelp.setText("Help");

        subMenuAbout.setText("About");
        subMenuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(subMenuAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuExitActionPerformed
        if (textArea.getText().equals("")){
            System.exit(0);
        }
    }//GEN-LAST:event_subMenuExitActionPerformed

    private void subMenuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuNewActionPerformed
        if (!textArea.getText().equals("")){
            int message1 = JOptionPane.showConfirmDialog(null,
            "Do you want to save chages to file?","New File",JOptionPane.YES_NO_CANCEL_OPTION);
            if (message1 != JOptionPane.CANCEL_OPTION || message1 != JOptionPane.NO_OPTION){
                if (message1 == JOptionPane.YES_OPTION){
                    textArea.setText("");
                }
            }
        }
    }//GEN-LAST:event_subMenuNewActionPerformed

    private void subMenuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSaveActionPerformed
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Editor.txt", true)))){
            out.println(textArea.getText());
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "THERE WAS AN ERROR.");
        }
    }//GEN-LAST:event_subMenuSaveActionPerformed

    private void subMenuReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuReplaceActionPerformed
        String message1 = (String) JOptionPane.showInputDialog(null, "Find what:");
        if (message1 != null && message1.length() > 0){
            String message2 = (String) JOptionPane.showInputDialog(null, "Replace with:");
            if (message2 != null && message2.length() > 0){
                int find = textArea.getText().indexOf(message1);
                if (find >= 0 && message1.length() > 0){
                    textArea.replaceRange(message2, find, find + message2.length()-1);
                }
            }
        }
    }//GEN-LAST:event_subMenuReplaceActionPerformed

    private void subMenuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAboutActionPerformed
        String message1 = (String) JOptionPane.showInputDialog(null, "Totaly not Note pad");
    }//GEN-LAST:event_subMenuAboutActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem subMenuAbout;
    private javax.swing.JMenuItem subMenuExit;
    private javax.swing.JMenuItem subMenuNew;
    private javax.swing.JMenuItem subMenuReplace;
    private javax.swing.JMenuItem subMenuSave;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textScroll;
    // End of variables declaration//GEN-END:variables
}
