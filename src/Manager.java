import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
public class Manager extends javax.swing.JFrame {
    
    public static int f_id, p_id;
   

    public static void load()
    {
        f_id = login.fid;
        p_id = login.pid;
        System.out.println(f_id);
        System.out.println(p_id);
    }
    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        load();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        purple_panel = new javax.swing.JPanel();
        insert_panel = new javax.swing.JPanel();
        insert_button = new javax.swing.JButton();
        black_panel_1 = new javax.swing.JPanel();
        view_panel = new javax.swing.JPanel();
        view_button = new javax.swing.JButton();
        black_panel_7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        purple_panel.setBackground(new java.awt.Color(102, 0, 102));

        insert_panel.setBackground(new java.awt.Color(255, 255, 255));

        insert_button.setBackground(new java.awt.Color(0, 0, 0));
        insert_button.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        insert_button.setText("Insert");
        insert_button.setBorderPainted(false);
        insert_button.setContentAreaFilled(false);
        insert_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        insert_button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_panelLayout = new javax.swing.GroupLayout(insert_panel);
        insert_panel.setLayout(insert_panelLayout);
        insert_panelLayout.setHorizontalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insert_panelLayout.setVerticalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(insert_button, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        black_panel_1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout black_panel_1Layout = new javax.swing.GroupLayout(black_panel_1);
        black_panel_1.setLayout(black_panel_1Layout);
        black_panel_1Layout.setHorizontalGroup(
            black_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        black_panel_1Layout.setVerticalGroup(
            black_panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        view_panel.setBackground(new java.awt.Color(255, 255, 255));

        view_button.setBackground(new java.awt.Color(0, 0, 0));
        view_button.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        view_button.setText("View");
        view_button.setBorderPainted(false);
        view_button.setContentAreaFilled(false);
        view_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        view_button.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        view_button.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view_panelLayout = new javax.swing.GroupLayout(view_panel);
        view_panel.setLayout(view_panelLayout);
        view_panelLayout.setHorizontalGroup(
            view_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        view_panelLayout.setVerticalGroup(
            view_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view_panelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(view_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        black_panel_7.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout black_panel_7Layout = new javax.swing.GroupLayout(black_panel_7);
        black_panel_7.setLayout(black_panel_7Layout);
        black_panel_7Layout.setHorizontalGroup(
            black_panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        black_panel_7Layout.setVerticalGroup(
            black_panel_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout purple_panelLayout = new javax.swing.GroupLayout(purple_panel);
        purple_panel.setLayout(purple_panelLayout);
        purple_panelLayout.setHorizontalGroup(
            purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(purple_panelLayout.createSequentialGroup()
                        .addComponent(black_panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(view_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(purple_panelLayout.createSequentialGroup()
                        .addComponent(black_panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purple_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        purple_panelLayout.setVerticalGroup(
            purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insert_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(black_panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(black_panel_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purple_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purple_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed
        this.dispose();                                                      //going to a new frame. right click on project name under projects tab, new->jframe form.
        new Manager_insert().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed

        this.dispose();                                                      //going to a new frame. right click on project name under projects tab, new->jframe form.
        new Manager_view().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_view_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this,"You have successfully logged out.");
        this.dispose();
        new login().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel black_panel_1;
    private javax.swing.JPanel black_panel_7;
    private javax.swing.JButton insert_button;
    private javax.swing.JPanel insert_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel purple_panel;
    private javax.swing.JButton view_button;
    private javax.swing.JPanel view_panel;
    // End of variables declaration//GEN-END:variables
}
