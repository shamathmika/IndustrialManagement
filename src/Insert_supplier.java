import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class Insert_supplier extends javax.swing.JFrame {
    
    String name = new String();
    float price1;
    String ph = new String();
    String rawmat1 = new String();
    String city1 = new String();
    String rely = new String();
    char r;
    int f_id;
    String date = new String();
    int qty;
    int fid,sid;
            
    
    /**
     * Creates new form Insert_supplier
     */
    public Insert_supplier() {
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
        city_panel = new javax.swing.JPanel();
        city_text = new javax.swing.JTextField();
        city_label = new javax.swing.JLabel();
        price_panel = new javax.swing.JPanel();
        price_label = new javax.swing.JLabel();
        price_text = new javax.swing.JTextField();
        rawmat_panel = new javax.swing.JPanel();
        rawmat_label = new javax.swing.JLabel();
        rawmat_text = new javax.swing.JTextField();
        name_panel = new javax.swing.JPanel();
        name_text = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        insert_panel = new javax.swing.JPanel();
        insert_button = new javax.swing.JButton();
        reliable_panel = new javax.swing.JPanel();
        reliable_label1 = new javax.swing.JLabel();
        reliable_list = new java.awt.Choice();
        contact_panel = new javax.swing.JPanel();
        contact_label = new javax.swing.JLabel();
        contact_text = new javax.swing.JTextField();
        f_id_panel = new javax.swing.JPanel();
        f_id_text = new javax.swing.JTextField();
        f_id_label = new javax.swing.JLabel();
        date_panel = new javax.swing.JPanel();
        date_text = new javax.swing.JTextField();
        date_label = new javax.swing.JLabel();
        today = new javax.swing.JCheckBox();
        qty_panel = new javax.swing.JPanel();
        qty_text = new javax.swing.JTextField();
        qty_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier insertion (Owner)");

        purple_panel.setBackground(new java.awt.Color(102, 0, 102));

        city_panel.setBackground(new java.awt.Color(255, 255, 255));

        city_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        city_text.setBorder(null);

        city_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        city_label.setText("City:");

        javax.swing.GroupLayout city_panelLayout = new javax.swing.GroupLayout(city_panel);
        city_panel.setLayout(city_panelLayout);
        city_panelLayout.setHorizontalGroup(
            city_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(city_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(city_text))
        );
        city_panelLayout.setVerticalGroup(
            city_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(city_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(city_text)
                .addComponent(city_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        price_panel.setBackground(new java.awt.Color(255, 255, 255));

        price_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        price_label.setText("Price:");

        price_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        price_text.setBorder(null);

        javax.swing.GroupLayout price_panelLayout = new javax.swing.GroupLayout(price_panel);
        price_panel.setLayout(price_panelLayout);
        price_panelLayout.setHorizontalGroup(
            price_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(price_label, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(price_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, price_panelLayout.createSequentialGroup()
                    .addGap(0, 99, Short.MAX_VALUE)
                    .addComponent(price_text, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        price_panelLayout.setVerticalGroup(
            price_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(price_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(price_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(price_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(price_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        rawmat_panel.setBackground(new java.awt.Color(255, 255, 255));

        rawmat_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        rawmat_label.setText("Raw Material:");

        rawmat_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        rawmat_text.setBorder(null);
        rawmat_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawmat_textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rawmat_panelLayout = new javax.swing.GroupLayout(rawmat_panel);
        rawmat_panel.setLayout(rawmat_panelLayout);
        rawmat_panelLayout.setHorizontalGroup(
            rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rawmat_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rawmat_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rawmat_text, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        rawmat_panelLayout.setVerticalGroup(
            rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rawmat_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rawmat_text, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addComponent(rawmat_label))
        );

        name_panel.setBackground(new java.awt.Color(255, 255, 255));

        name_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        name_text.setBorder(null);
        name_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_textActionPerformed(evt);
            }
        });

        name_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        name_label.setText("Supplier Name:");

        javax.swing.GroupLayout name_panelLayout = new javax.swing.GroupLayout(name_panel);
        name_panel.setLayout(name_panelLayout);
        name_panelLayout.setHorizontalGroup(
            name_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name_text, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        name_panelLayout.setVerticalGroup(
            name_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(name_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(name_text, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addComponent(name_label))
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
            .addComponent(insert_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        insert_panelLayout.setVerticalGroup(
            insert_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(insert_button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        reliable_panel.setBackground(new java.awt.Color(255, 255, 255));

        reliable_label1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        reliable_label1.setText("Reliable:");

        reliable_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reliable_list.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        reliable_list.removeAll();
        reliable_list.addItem("Choose one:");
        reliable_list.addItem("Yes");
        reliable_list.addItem("No");
        reliable_list.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reliable_listItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout reliable_panelLayout = new javax.swing.GroupLayout(reliable_panel);
        reliable_panel.setLayout(reliable_panelLayout);
        reliable_panelLayout.setHorizontalGroup(
            reliable_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reliable_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reliable_label1)
                .addGap(23, 23, 23)
                .addComponent(reliable_list, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reliable_panelLayout.setVerticalGroup(
            reliable_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reliable_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reliable_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reliable_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reliable_label1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        contact_panel.setBackground(new java.awt.Color(255, 255, 255));

        contact_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        contact_label.setText("Phone no:");

        contact_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        contact_text.setBorder(null);

        javax.swing.GroupLayout contact_panelLayout = new javax.swing.GroupLayout(contact_panel);
        contact_panel.setLayout(contact_panelLayout);
        contact_panelLayout.setHorizontalGroup(
            contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contact_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contact_label, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contact_panelLayout.createSequentialGroup()
                    .addGap(0, 99, Short.MAX_VALUE)
                    .addComponent(contact_text, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        contact_panelLayout.setVerticalGroup(
            contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contact_panelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(contact_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(contact_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contact_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        f_id_panel.setBackground(new java.awt.Color(255, 255, 255));

        f_id_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        f_id_text.setBorder(null);
        f_id_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_id_textActionPerformed(evt);
            }
        });

        f_id_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        f_id_label.setText("Factory ID:");

        javax.swing.GroupLayout f_id_panelLayout = new javax.swing.GroupLayout(f_id_panel);
        f_id_panel.setLayout(f_id_panelLayout);
        f_id_panelLayout.setHorizontalGroup(
            f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f_id_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(f_id_label)
                .addGap(18, 18, 18)
                .addComponent(f_id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        f_id_panelLayout.setVerticalGroup(
            f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f_id_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(f_id_text, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addComponent(f_id_label))
        );

        date_panel.setBackground(new java.awt.Color(255, 255, 255));

        date_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        date_text.setText("YYYY-MM-DD");
        date_text.setBorder(null);
        date_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_textActionPerformed(evt);
            }
        });

        date_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        date_label.setText("Date:");

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
                .addComponent(date_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date_text, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(today)
                .addGap(40, 40, 40))
        );
        date_panelLayout.setVerticalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(date_text, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addComponent(date_label)
                .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        qty_panel.setBackground(new java.awt.Color(255, 255, 255));

        qty_text.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        qty_text.setBorder(null);
        qty_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qty_textActionPerformed(evt);
            }
        });

        qty_label.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        qty_label.setText("Quantity:");

        javax.swing.GroupLayout qty_panelLayout = new javax.swing.GroupLayout(qty_panel);
        qty_panel.setLayout(qty_panelLayout);
        qty_panelLayout.setHorizontalGroup(
            qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qty_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(qty_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qty_text))
        );
        qty_panelLayout.setVerticalGroup(
            qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qty_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(qty_text)
                .addComponent(qty_label, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
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
            .addComponent(insert_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, purple_panelLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(city_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rawmat_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reliable_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contact_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f_id_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(qty_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        purple_panelLayout.setVerticalGroup(
            purple_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(purple_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rawmat_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(city_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(price_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contact_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reliable_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f_id_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qty_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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

    private void rawmat_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawmat_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rawmat_textActionPerformed

    private void name_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_textActionPerformed

    private void insert_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_buttonActionPerformed

        try{

            name = name_text.getText();
            price1 = Float.parseFloat(price_text.getText());
            ph = contact_text.getText();
            rawmat1 = rawmat_text.getText();
            city1 = city_text.getText();
            f_id = Integer.parseInt(f_id_text.getText());
            date = date_text.getText();
            qty = Integer.parseInt(qty_text.getText());
            

            login.load();
            Class.forName("java.sql.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "table");
            Statement st= conn.createStatement();
            Statement st1 = conn.createStatement();
            Statement st2 = conn.createStatement();
            Statement st3 = conn.createStatement();
            String query2 = "select * from supplier;";
            String query3 = "select * from purchase where purchase.s_id in (select s_id from supplier where s_name = '" + name_text.getText() + "');";
            ResultSet rs200 = st2.executeQuery(query2);
            ResultSet rs100 = st3.executeQuery(query3);
            
            int flag = 0;
            while (rs200.next())
            {
                String s_name_import = rs200.getString("s_name");
                if(s_name_import.equals(name_text.getText()))
                {
                    flag = 1;
                    
                    while(rs100.next())
                    {
                        String dat = rs100.getDate("date_of_purchase").toString();
                        if((dat.equals(date_text.getText())))
                        {
                            throw new ArithmeticException();
                            
                        }
                        else
                        {
                            sid = rs200.getInt("s_id");
                            
                            break;
                        }
                    }
                }
                
            }
            st3.close();
            rs200.close();
            rs100.close();
            
            
            if(flag == 0)
                {
            
            
            String query= "insert into supplier values(" + (login.s_id) + ",'"  + name + "','" + city1 + "','"  + r + "','" + ph + "')";
            String query1 = "insert into purchase values(" + f_id +"," + (login.s_id) + "," + price1 + ",'" + rawmat1 + "','" + date + "'," + qty + ");";
            st.executeUpdate(query);
            st1.executeUpdate(query1);

            st.close();
            st1.close();
            conn.close();
            JOptionPane.showMessageDialog(this,"Inserted new supplier " + name);
                }
            else
            {
                String query1 = "insert into purchase values(" + f_id +"," + sid + "," + price1 + ",'" + rawmat1 + "','" + date + "'," + qty + ");";
                st1.executeUpdate(query1);
                JOptionPane.showMessageDialog(this,"Inserted new transaction with supplier " + name_text.getText());
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error in insertion");
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_insert_buttonActionPerformed

    private void reliable_listItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reliable_listItemStateChanged

        rely = reliable_list.getSelectedItem();
        if (rely.equals("Yes"))
        r = 'y';
        else if(rely.equals("No"))
        r = 'n';
        else
        r = ' ';

        // TODO add your handling code here:
    }//GEN-LAST:event_reliable_listItemStateChanged

    private void f_id_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_id_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_id_textActionPerformed

    private void date_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_textActionPerformed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_date_textActionPerformed

    private void qty_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qty_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qty_textActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();
        new Owner_insert().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todayActionPerformed
        if(today.isSelected())
        {
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            date_text.setText(sdf.format(date));

            date_text.setEditable(false);
            //date = "current_date()";

        }
        else if(today.isSelected()!=true)
        {
            date_text.setEditable(true);

        }

        System.out.println(date);
        // TODO add your handling code here:
    }//GEN-LAST:event_todayActionPerformed

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
            java.util.logging.Logger.getLogger(Insert_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel city_label;
    private javax.swing.JPanel city_panel;
    private javax.swing.JTextField city_text;
    private javax.swing.JLabel contact_label;
    private javax.swing.JPanel contact_panel;
    private javax.swing.JTextField contact_text;
    private javax.swing.JLabel date_label;
    private javax.swing.JPanel date_panel;
    private javax.swing.JTextField date_text;
    private javax.swing.JLabel f_id_label;
    private javax.swing.JPanel f_id_panel;
    private javax.swing.JTextField f_id_text;
    private javax.swing.JButton insert_button;
    private javax.swing.JPanel insert_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel name_label;
    private javax.swing.JPanel name_panel;
    private javax.swing.JTextField name_text;
    private javax.swing.JLabel price_label;
    private javax.swing.JPanel price_panel;
    private javax.swing.JTextField price_text;
    private javax.swing.JPanel purple_panel;
    private javax.swing.JLabel qty_label;
    private javax.swing.JPanel qty_panel;
    private javax.swing.JTextField qty_text;
    private javax.swing.JLabel rawmat_label;
    private javax.swing.JPanel rawmat_panel;
    private javax.swing.JTextField rawmat_text;
    private javax.swing.JLabel reliable_label1;
    private java.awt.Choice reliable_list;
    private javax.swing.JPanel reliable_panel;
    private javax.swing.JCheckBox today;
    // End of variables declaration//GEN-END:variables
}
