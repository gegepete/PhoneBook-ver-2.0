package phonebook_ver2.pkg0;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GUI extends javax.swing.JFrame {   
    private DefaultListModel<Contact> dm = new DefaultListModel<>();
    
    
    public GUI() {
        super("PhoneBook ver 2.0");
        initComponents();
        readFile();
        
    }
    
    public void writeFile(){
        try(
            FileOutputStream fos = new FileOutputStream("C:/Users/granny/Documents/NetBeansProjects/PhoneBook_ver2.0/phonebook");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            out.writeObject(dm);
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    
    public void readFile(){
        File file = new File("C:/Users/granny/Documents/NetBeansProjects/PhoneBook_ver2.0/phonebook");
        if (file.isFile()) {
            try (
                    FileInputStream fis = new FileInputStream("C:/Users/granny/Documents/NetBeansProjects/PhoneBook_ver2.0/phonebook");
                    ObjectInputStream in = new ObjectInputStream(fis);) {
                dm = (DefaultListModel<Contact>) in.readObject();
                jList1.setModel(dm);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            writeFile();
        }
    }
    
    private void add(Contact c){
        jList1.setModel(dm);
        dm.addElement(c);
        writeFile();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        surnameTxtFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mobileTxtFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTxtFld = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Surname");

        surnameTxtFld.setNextFocusableComponent(mobileTxtFld);

        jLabel3.setText("Mobile");

        mobileTxtFld.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mobileTxtFld.setNextFocusableComponent(emailTxtFld);

        jLabel4.setText("Email");

        emailTxtFld.setNextFocusableComponent(addBtn);

        addBtn.setText("Add");
        addBtn.setNextFocusableComponent(updateBtn);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.setNextFocusableComponent(deleteBtn);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.setNextFocusableComponent(exitBtn);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(surnameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(updateBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(mobileTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(emailTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn)
                            .addComponent(updateBtn)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(1, 1, 1)
                            .addComponent(surnameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(1, 1, 1)
                            .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(1, 1, 1)
                            .addComponent(mobileTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(emailTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn)
                            .addComponent(exitBtn))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        add(new Contact(nameTxtFld.getText(), surnameTxtFld.getText(), mobileTxtFld.getText(), emailTxtFld.getText()));
        nameTxtFld.setText("");
        surnameTxtFld.setText("");
        mobileTxtFld.setText("");
        emailTxtFld.setText("");        
    }//GEN-LAST:event_addBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Contact selected = jList1.getSelectedValue();
        selected.setName(nameTxtFld.getText());
        selected.setSurname(surnameTxtFld.getText());
        selected.setMobile(mobileTxtFld.getText());
        selected.setEmail(emailTxtFld.getText());
        nameTxtFld.setText("");
        surnameTxtFld.setText("");
        mobileTxtFld.setText("");
        emailTxtFld.setText("");
        jList1.setModel(dm);
        writeFile();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int index = jList1.getSelectedIndex();
        dm.removeElementAt(index);
        nameTxtFld.setText("");
        surnameTxtFld.setText("");
        mobileTxtFld.setText("");
        emailTxtFld.setText("");
        writeFile();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        Contact selected = jList1.getSelectedValue();
        nameTxtFld.setText(selected.getName());
        surnameTxtFld.setText(selected.getSurname());
        mobileTxtFld.setText(selected.getMobile());
        emailTxtFld.setText(selected.getEmail());
    }//GEN-LAST:event_jList1MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxtFld;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<Contact> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobileTxtFld;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JTextField surnameTxtFld;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
