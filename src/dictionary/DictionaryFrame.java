/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dictionary;
import java.sql.*;

/**
 *
 * @author abhis
 */
public class DictionaryFrame extends javax.swing.JFrame {

    /**
     * Creates new form DictionaryFrame
     */
    public DictionaryFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        wordField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        meaningField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Word");

        wordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Meaning");

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        meaningField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meaningFieldActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                searchButtonStateChanged(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        searchButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchButtonPropertyChange(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel3.setText("FIND MY WORD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(meaningField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(insertButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(meaningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton)
                    .addComponent(searchButton))
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordFieldActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
         String word = wordField.getText();
            String mean = meaningField.getText();
            try { 
                Class.forName("com.mysql.cj.jdbc.Driver"); 
            }catch(ClassNotFoundException e2){
                    System.out.println(e2);
            }
               try{ 
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary", "project", "Clement@123"); 
                String INSERT_SQL = "INSERT INTO dict (word, meaning) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(INSERT_SQL); 
                ps.setString(1, word); 
                ps.setString(2, mean); 
                ps.executeUpdate(); 
                ps.close();
            } catch (SQLException e1) { 
                //e1.printStackTrace(); 
            } 
    }//GEN-LAST:event_insertButtonActionPerformed

    private void meaningFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meaningFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_meaningFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
         String word = wordField.getText();
            String mean = meaningField.getText();
            try { 
                Class.forName("com.mysql.cj.jdbc.Driver"); 
            }catch(ClassNotFoundException e2){
                    System.out.println(e2);
            }
               try{ 
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary", "project", "Clement@123"); 
                String UPDATE_SQL = "UPDATE dict SET meaning=? WHERE word=?";
                PreparedStatement ps = conn.prepareStatement(UPDATE_SQL); 
                ps.setString(1, mean); 
                ps.setString(2, word); 
                ps.executeUpdate(); 
                ps.close();
            } catch (SQLException e1) { 
                //e1.printStackTrace(); 
            } 
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String word = wordField.getText();
            
            try { 
                Class.forName("com.mysql.cj.jdbc.Driver"); 
            }catch(ClassNotFoundException e2){
                    System.out.println(e2);
            }
               try{ 
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary", "project", "Clement@123"); 
                String DELETE_SQL = "DELETE FROM dict WHERE WORD=?";
                PreparedStatement ps = conn.prepareStatement(DELETE_SQL); 
                ps.setString(1, word); 
                ps.executeUpdate(); 
                ps.close();
            } catch (SQLException e1) { 
                //e1.printStackTrace(); 
            } 
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String word = wordField.getText();
            //String mean = meaningField.getText();
            try { 
                Class.forName("com.mysql.cj.jdbc.Driver"); 
            }catch(ClassNotFoundException e2){
                    System.out.println(e2);
            }
               try{ 
                  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary", "project", "Clement@123"); 
                String SEARCH_SQL = "SELECT meaning FROM dict WHERE word=?";
                PreparedStatement ps = conn.prepareStatement(SEARCH_SQL); 
                ps.setString(1, word);
                try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
//                  return rs.getString("meaning");
                    meaningField.setText(rs.getString("meaning"));
                }
                else
                {
                    meaningField.setText("NOT FOUND ");
                }
              }
            } catch (SQLException e1) { 
              throw new RuntimeException("Error while searching for word in the dictionary", e1); 
            } 
    
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonPropertyChange

    private void searchButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_searchButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonStateChanged

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
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DictionaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DictionaryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField meaningField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField wordField;
    // End of variables declaration//GEN-END:variables
}
