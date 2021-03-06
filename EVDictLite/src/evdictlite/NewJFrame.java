/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evdictlite;

import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Huu Hien
 */

public class NewJFrame extends javax.swing.JFrame {
    private Timer timer;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() throws Exception {
        initComponents();
        ReadFile read = new ReadFile("anhviet109K.txt");
        data = read.getData();
        setTimer();
        timer.start();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxResult = new javax.swing.JTextArea();
        jScrListWordPane = new javax.swing.JScrollPane();
        jTextLisWordArea = new javax.swing.JTextArea();
        jTfTypeSearch = new javax.swing.JTextField();
        jBtSearch = new javax.swing.JButton();
        JlbTimer = new javax.swing.JLabel();
        JlbTimer1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Dictionary");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLbSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLbSearch.setText("Nhập để tìm kiếm:");

        jTxResult.setColumns(20);
        jTxResult.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTxResult.setRows(5);
        jScrollPane1.setViewportView(jTxResult);

        jTextLisWordArea.setColumns(20);
        jTextLisWordArea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextLisWordArea.setRows(5);
        jScrListWordPane.setViewportView(jTextLisWordArea);

        jTfTypeSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTfTypeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTfTypeSearchMouseClicked(evt);
            }
        });
        jTfTypeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfTypeSearchActionPerformed(evt);
            }
        });
        jTfTypeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTfTypeSearchKeyPressed(evt);
            }
        });

        jBtSearch.setIcon(new ImageIcon("Image/search.png"));
        jBtSearch.setIcon(new javax.swing.ImageIcon("D:\\MyProject\\EVDictLite\\EVDictLite\\Image\\search.png")); // NOI18N
        jBtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSearchActionPerformed(evt);
            }
        });

        JlbTimer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JlbTimer.setText("Time: ");

        JlbTimer1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLbSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addGap(594, 594, 594))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrListWordPane, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTfTypeSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JlbTimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JlbTimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTfTypeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrListWordPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlbTimer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlbTimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setTimer(){
        
        timer = new Timer(1000, new ActionListener() {
            int min=0, sec=-1;
            String stmin= "00", stsec;
            @Override
            public void actionPerformed(ActionEvent e) {
                sec++;
                
                if(sec == 60){
                    sec =0;
                    min++;
                }
                if(min<10)
                    stmin= '0'+ String.valueOf(min);
                else stmin = Integer.toString(min);
                
                if(sec<10)
                    stsec = '0'+ String.valueOf(sec);
                else stsec = Integer.toString(sec);
                JlbTimer1.setText(stmin+ ':'+ stsec);
            }
        }
        );
    }
    
    
    
    private void jBtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSearchActionPerformed
        String eWord; 
        Vector result;
        jTxResult.setText("");
        if(jTfTypeSearch.isEditable() == true){
            eWord = jTfTypeSearch.getText();
            result = data.decoding(eWord);
            if(result.size() > 0){
                for(int i=0; i<result.size(); i++){
                    jTxResult.append((String)result.elementAt(i));
                    jTxResult.append("\n");
                }
            }            
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jBtSearchActionPerformed

    private void jTfTypeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfTypeSearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTfTypeSearchActionPerformed

    private void jTfTypeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTfTypeSearchMouseClicked
        // TODO add your handling code here:
        jTfTypeSearch.setText("");
    }//GEN-LAST:event_jTfTypeSearchMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ALT){
            this.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_F4){
                        System.exit(1);
                    }
                }

                @Override
                public void keyPressed(java.awt.event.KeyEvent e) {}

                @Override
                public void keyReleased(java.awt.event.KeyEvent e) {}
            });
        }
    }//GEN-LAST:event_formKeyPressed

    private void jTfTypeSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTfTypeSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String eWord; 
            Vector result;
            jTxResult.setText("");
            if(jTfTypeSearch.isEditable() == true){
                eWord = jTfTypeSearch.getText();
                result = data.decoding(eWord);
                if(result.size() > 0){
                    for(int i=0; i<result.size(); i++){
                        jTxResult.append((String)result.elementAt(i));
                        jTxResult.append("\n");
                    }
                }            
            }
        }
    }//GEN-LAST:event_jTfTypeSearchKeyPressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new NewJFrame().setVisible(true);
//                } catch (Exception ex) {
//                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbTimer;
    private javax.swing.JLabel JlbTimer1;
    private javax.swing.JButton jBtSearch;
    private javax.swing.JLabel jLbSearch;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrListWordPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextLisWordArea;
    private javax.swing.JTextField jTfTypeSearch;
    private javax.swing.JTextArea jTxResult;
    // End of variables declaration//GEN-END:variables
    private static DataStorage data;
}
