
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
public class Sells extends javax.swing.JFrame {
    String choice = new String();
    char ch;
    int f_id;
    int c_id;
    int qty;
    float price;
    String date = new String();

    /**
     * Creates new form Sells
     */
    public Sells() {
        initComponents();
        date_text.addMouseListener(new MouseAdapter(){
           
            public void mouseClicked(MouseEvent e){
                date_text.setText(null);
                date_text.setEditable(true);
            }
        });
        
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
        p_id_panel = new javax.swing.JPanel();
        p_id_label = new javax.swing.JLabel();
        price_text = new javax.swing.JTextField();
        insert_panel = new javax.swing.JPanel();
        insert_button = new javax.swing.JButton();
        qty_panel = new javax.swing.JPanel();
        qty_label = new javax.swing.JLabel();
        qty_text = new javax.swing.JTextField();
        date_panel = new javax.swing.JPanel();
        date_label = new javax.swing.JLabel();
        date_text = new javax.swing.JTextField();
        today = new javax.swing.JCheckBox();
        rawmat_panel = new javax.swing.JPanel();
        rawmat_label = new javax.swing.JLabel();
        delivered_list = new java.awt.Choice();
        f_id_panel = new javax.swing.JPanel();
        f_id_label = new javax.swing.JLabel();
        c_id_text = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sold details");

        purple_panel.setBackground(new java.awt.Color(102, 0, 102));

        p_id_panel.setBackground(new java.awt.Color(255, 255, 255));

        p_id_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        p_id_label.setText("Price:");

        price_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        price_text.setBorder(null);
        price_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_id_panelLayout = new javax.swing.GroupLayout(p_id_panel);
        p_id_panel.setLayout(p_id_panelLayout);
        p_id_panelLayout.setHorizontalGroup(
            p_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_id_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_text)
                .addGap(3, 3, 3))
        );
        p_id_panelLayout.setVerticalGroup(
            p_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(price_text)
                .addComponent(p_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        insert_panel.setBackground(new java.awt.Color(0, 0, 0));

        insert_button.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        insert_button.setForeground(new java.awt.Color(255, 255, 255));
        insert_button.setText("Insert");
        insert_button.setContentAreaFilled(false);
        insert_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_panelLayout = new javax.swing.GroupLayout(insert_panel);
        insert_panel.setLayout(insert_panelLayout);
        insert_panelLayout.setHorizontalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insert_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        insert_panelLayout.setVerticalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        qty_panel.setBackground(new java.awt.Color(255, 255, 255));

        qty_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        qty_label.setText("Quantity:");

        qty_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        qty_text.setBorder(null);
        qty_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout qty_panelLayout = new javax.swing.GroupLayout(qty_panel);
        qty_panel.setLayout(qty_panelLayout);
        qty_panelLayout.setHorizontalGroup(
            qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qty_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qty_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty_text, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        qty_panelLayout.setVerticalGroup(
            qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(qty_text, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addComponent(qty_label))
        );

        date_panel.setBackground(new java.awt.Color(255, 255, 255));

        date_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        date_label.setText("Sold Date and Time:");

        date_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        date_text.setText("YYYY-MM-DD HH:MM:SS");
        date_text.setBorder(null);
        date_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_textActionPerformed(evt);
            }
        });

        today.setBackground(new java.awt.Color(255, 255, 255));
        today.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        today.setText("Today");
        today.setBorder(null);
        today.setContentAreaFilled(false);
        today.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout date_panelLayout = new javax.swing.GroupLayout(date_panel);
        date_panel.setLayout(date_panelLayout);
        date_panelLayout.setHorizontalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(today)
                .addContainerGap())
            .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, date_panelLayout.createSequentialGroup()
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addComponent(date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
        );
        date_panelLayout.setVerticalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(date_label, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(date_text, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        );

        rawmat_panel.setBackground(new java.awt.Color(255, 255, 255));

        rawmat_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        rawmat_label.setText("Delivered:");

        delivered_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delivered_list.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        delivered_list.removeAll();
        delivered_list.addItem("Choose one:");
        delivered_list.addItem("Yes");
        delivered_list.addItem("No");
        delivered_list.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                delivered_listItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout rawmat_panelLayout = new javax.swing.GroupLayout(rawmat_panel);
        rawmat_panel.setLayout(rawmat_panelLayout);
        rawmat_panelLayout.setHorizontalGroup(
            rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rawmat_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rawmat_label, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rawmat_panelLayout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(delivered_list, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        rawmat_panelLayout.setVerticalGroup(
            rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rawmat_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rawmat_panelLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(delivered_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        f_id_panel.setBackground(new java.awt.Color(255, 255, 255));

        f_id_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        f_id_label.setText("Customer ID:");

        c_id_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        c_id_text.setBorder(null);
        c_id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_id_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout f_id_panelLayout = new javax.swing.GroupLayout(f_id_panel);
        f_id_panel.setLayout(f_id_panelLayout);
        f_id_panelLayout.setHorizontalGroup(
            f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f_id_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(f_id_label, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(c_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        f_id_panelLayout.setVerticalGroup(
            f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(c_id_text, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addComponent(f_id_label))
        );

        jButton3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout purple_panelLayout = new javax.swing.GroupLayout(purple_panel);
        purple_panel.setLayout(purple_panelLayout);
        purple_panelLayout.setHorizontalGroup(
            purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insert_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(purple_panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f_id_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qty_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_id_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rawmat_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(purple_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        purple_panelLayout.setVerticalGroup(
            purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(1, 1, 1)
                .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f_id_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qty_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_id_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rawmat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(insert_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purple_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purple_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void price_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_textActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed

        try{

            Manager.load();

            f_id = Manager.f_id;
            date = date_text.getText();
            qty = Integer.parseInt(qty_text.getText());
            c_id = Integer.parseInt(c_id_text.getText());
            price = Float.parseFloat(price_text.getText());
            

            login.load();
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "table");
            Statement st= conn.createStatement();

            String query= "insert into sells values(" + f_id + "," + c_id + "," + qty + ",'" + ch + "'," + price + ",'" + date + "');";

            st.executeUpdate(query);

            st.close();

            conn.close();
            JOptionPane.showMessageDialog(this, "Inserted new details");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void qty_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty_textActionPerformed

    private void date_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_textActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_date_textActionPerformed

    private void todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayActionPerformed
        if(today.isSelected())
        {
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            date_text.setText(sdf.format(date));

            date_text.setEditable(false);
            //date = "current_date()";

        }
        else if(today.isSelected()!=true)
        {
            date_text.setEditable(true);

        }


        // TODO add your handling code here:
    }//GEN-LAST:event_todayActionPerformed

    private void c_id_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_id_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_id_textActionPerformed

    private void delivered_listItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_delivered_listItemStateChanged

        choice = delivered_list.getSelectedItem();
        if (choice.equals("Yes"))
        ch = 'y';
        else if(choice.equals("No"))
        ch = 'n';
        else
        ch = ' ';

        // TODO add your handling code here:
    }//GEN-LAST:event_delivered_listItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(true)
        {
            this.dispose();
            new Manager_insert().setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Sells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sells.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sells().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c_id_text;
    private javax.swing.JLabel date_label;
    private javax.swing.JPanel date_panel;
    private javax.swing.JTextField date_text;
    private java.awt.Choice delivered_list;
    private javax.swing.JLabel f_id_label;
    private javax.swing.JPanel f_id_panel;
    private javax.swing.JButton insert_button;
    private javax.swing.JPanel insert_panel;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel p_id_label;
    private javax.swing.JPanel p_id_panel;
    private javax.swing.JTextField price_text;
    private javax.swing.JPanel purple_panel;
    private javax.swing.JLabel qty_label;
    private javax.swing.JPanel qty_panel;
    private javax.swing.JTextField qty_text;
    private javax.swing.JLabel rawmat_label;
    private javax.swing.JPanel rawmat_panel;
    private javax.swing.JCheckBox today;
    // End of variables declaration//GEN-END:variables
}
