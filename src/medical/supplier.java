/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
//import static medical.supplier.func;
/**
 *
 * @author jbj
 */
public class supplier extends javax.swing.JInternalFrame {
Connection con;
DefaultTableModel model1=new DefaultTableModel();
NewClass w=new NewClass();
String[] col_list={"Supplier ID","Supplier name","Contact","City","Address"};

    /**
     * Creates new form supplier
     */
    public supplier() {
            
                
                initComponents();
                setBounds(0,0, 1365, 680);
                this.getContentPane().setBackground(Color.white);
                 ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
                 this.setTitle("Supplier");
                  jTable1.getTableHeader().setFont(new Font("Tahoma", Font.BOLD,18));
                  model1.setColumnIdentifiers(col_list);
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try {
                        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medical", "root", "");
                    } catch (SQLException ex) {
                        
                    }
                    
                }
                
                catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane,ex.toString());
                    
                }
                //jButton4.setVisible(false);
               /* if(w.mdi1().equals("Edit"))
                {
                    jPanel2.setVisible(true);
                }*/
                jButton5.setVisible(false);
                jLabel8.setVisible(false);
                get1();
            jTextField6.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
             jTextField9.setEnabled(false);
             jButton4.setEnabled(false);
        jTable1.setModel(model1);
        /*jTabbedPane1.add(jPanel1,0);
        jTabbedPane1.add(jPanel2,1);
        jTabbedPane1.add(jPanel3,2);
        //NewMDIApplication n=new NewMDIApplication();
       e
        */
         //JTabbedPane1 j=new JTabbedPane1();
       // int count=jTabbedPane1.getTabCount();
        //JOptionPane.showMessageDialog(rootPane, jTabbedPane1.getTitleAt(1));
                     // JOptionPane.showMessageDialog(rootPane,name);

                     // JOptionPane.showMessageDialog(rootPane,name1);
int count=jTabbedPane1.getTabCount();





//JOptionPane.showMessageDialog(rootPane, count);
 if(jTabbedPane1.getTitleAt(0).equals(NewMDIApplication.name))
         {
             
             //JOptionPane.showMessageDialog(rootPane,"0");
              jTabbedPane1.setSelectedIndex(count-3);
         }
         






         if(jTabbedPane1.getTitleAt(1).equals(NewMDIApplication.name))
         {//JOptionPane.showMessageDialog(rootPane,"1");
            // jPanel2.setVisible(true);
             //jTabbedPane1.setSelectedIndex(1);
             //jTabbedPane1 jb=
              /*JOptionPane.showMessageDialog(rootPane,"i m in 1");
             int index=new supplier().jTabbedPane1.getSelectedIndex();
             
             JOptionPane.showMessageDialog(new supplier().rootPane,index);
             index++;
             JOptionPane.showMessageDialog(new supplier().rootPane,index);
             index%=new supplier().jTabbedPane1.getTabCount();
             JOptionPane.showMessageDialog(rootPane, index);
                     
             new supplier().jTabbedPane1.setSelectedIndex(index);*/
             
             jTabbedPane1.setSelectedIndex(1);
         }
        if(jTabbedPane1.getTitleAt(2).equals(NewMDIApplication.name))
         {//JOptionPane.showMessageDialog(rootPane,"3");
           //int count=jTabbedPane1.getTabCount();
             jTabbedPane1.setSelectedIndex(count-1);   
         }
       /*   if(jTabbedPane1.getTitleAt(2).equals(NewMDIApplication.name))
         {
           JOptionPane.showMessageDialog(rootPane,"i m in 2");
             int index=jTabbedPane1.getSelectedIndex();
             
             JOptionPane.showMessageDialog(rootPane,index);
             index=index+2;
             index%=jTabbedPane1.getTabCount();
             jTabbedPane1.setSelectedIndex(index);  
         }*/
             
                    
         }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        {
            public boolean isCellEditable(int row,int column)
            {
                return false;
            }

        }
        ;
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setTitle("Supplier");
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1365, 680));
        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 116, 169));
        jLabel6.setText("           INFORMATION");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(390, 70, 450, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 116, 169));
        jLabel1.setText("Supplier Id");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 150, 100, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 116, 169));
        jLabel2.setText("Supplier Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 190, 150, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 116, 169));
        jLabel3.setText("Contact");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 230, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 116, 169));
        jLabel4.setText("City");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 270, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 116, 169));
        jLabel5.setText("Address");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 310, 110, 20);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setPreferredSize(new java.awt.Dimension(12, 23));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(570, 190, 150, 23);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setBorder(null);
        jTextField4.setPreferredSize(new java.awt.Dimension(12, 23));
        jPanel1.add(jTextField4);
        jTextField4.setBounds(570, 270, 150, 23);

        jButton1.setBackground(new java.awt.Color(37, 116, 169));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Insert");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 500, 220, 30);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.setPreferredSize(new java.awt.Dimension(12, 23));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(570, 230, 150, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("-");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(570, 150, 220, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(570, 310, 330, 90);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/potential-suppliers.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 280, 260);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(570, 220, 150, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(570, 260, 150, 10);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/supplier1600.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(860, 60, 500, 500);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(570, 300, 150, 10);

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel20.setText("X");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1340, 10, 20, 40);

        jTabbedPane1.addTab("Register", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jButton3.setBackground(new java.awt.Color(37, 116, 169));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Find");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(120, 170, 190, 30);

        jButton4.setBackground(new java.awt.Color(37, 116, 169));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Edit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(370, 170, 190, 30);

        jButton5.setBackground(new java.awt.Color(37, 116, 169));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(360, 580, 200, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Select-" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(360, 100, 250, 28);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 116, 169));
        jLabel7.setText("Supplier id");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 100, 140, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("-");
        jLabel10.setPreferredSize(new java.awt.Dimension(10, 23));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(390, 240, 190, 23);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(10, 23));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6);
        jTextField6.setBounds(390, 300, 190, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(37, 116, 169));
        jLabel11.setText("Supplier Name");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 310, 150, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(37, 116, 169));
        jLabel12.setText("Contact");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(110, 360, 80, 20);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField7.setMinimumSize(new java.awt.Dimension(10, 23));
        jTextField7.setPreferredSize(new java.awt.Dimension(10, 23));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField7);
        jTextField7.setBounds(390, 350, 190, 30);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setMinimumSize(new java.awt.Dimension(10, 23));
        jTextField8.setPreferredSize(new java.awt.Dimension(10, 23));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField8);
        jTextField8.setBounds(390, 400, 190, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(37, 116, 169));
        jLabel13.setText("City");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(110, 410, 70, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(37, 116, 169));
        jLabel14.setText("Address");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(110, 460, 100, 20);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField9.setMinimumSize(new java.awt.Dimension(10, 23));
        jTextField9.setPreferredSize(new java.awt.Dimension(10, 23));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField9);
        jTextField9.setBounds(390, 450, 190, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(37, 116, 169));
        jLabel15.setText("Supplier Id");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(110, 250, 100, 20);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/supplier1600.png"))); // NOI18N
        jPanel2.add(jLabel17);
        jLabel17.setBounds(730, 80, 540, 510);

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setText("X");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel21);
        jLabel21.setBounds(1340, 10, 20, 40);

        jTabbedPane1.addTab("Edit", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jButton2.setBackground(new java.awt.Color(30, 139, 195));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("View All Suppliers");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(530, 50, 280, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(310, 170, 720, 330);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/supplierdata.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(1100, 100, 200, 500);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medical/images/newblueplus.png"))); // NOI18N
        jLabel19.setText("jLabel19");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 250, 416);

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel22.setText("X");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel22);
        jLabel22.setBounds(1340, 10, 20, 40);

        jTabbedPane1.addTab("View All", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1390, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void get1()
{ jComboBox1.removeAllItems();
jComboBox1.addItem("-Select-");
    try{
    String str12="select s_id from supplier";
                Statement st=con.createStatement();
                ResultSet re=st.executeQuery(str12);
        while(re.next())
        {
            jComboBox1.addItem(re.getString("s_id"));
        }
                
            }
            
            catch (SQLException ex) {
                Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null,ex);
                
            }
  
}
public void insert1()
{
    
    String q="";
        try {
            //int s_id=Integer.parseInt(jLabel8.getText());
            Statement st=con.createStatement();
            String suppliername=jTextField2.getText();
            int supp_contact=0;
            try{
                supp_contact=Integer.parseInt(jTextField3.getText());
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Wrong input format of Contact number.");
                
                
                
                
                
                
                
            }
            String supp_city=jTextField4.getText();
            String supp_address=jTextArea1.getText();
            //String str= "insert into supplier(s_id,supplierName,supp_contact,supp_city) values(" +s_id+",'"+supplierName+"',"+supp_contact+",'"+supp_city+"')";
            String str= "insert into supplier(suppliername,supp_contact,supp_city,supp_address) values('"+suppliername+"',"+supp_contact+",'"+supp_city+"','"+supp_address+"')";
            
            st.executeUpdate(str);
            try{
                String str11="select s_id from supplier where suppliername='"+suppliername+"'";
                Statement st1=con.createStatement();
                ResultSet r=st1.executeQuery(str11);
                r.next();
                
                q=Long.toString(r.getLong("s_id"));
                jLabel8.setText(q);
                jLabel8.setVisible(true);
                JOptionPane.showMessageDialog(rootPane, "Saved");
            }
            
            catch (SQLException ex) {
                Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null,ex);
                
            }
            } catch (SQLException ex) {
            Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
boolean flag=false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
   
        /*  if(!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals(""))
        {
        try {
        String str1="select suppliername,supp_contact,supp_address from supplier where suppliername='"+jTextField2.getText()+"'";
        Statement st;
        st = con.createStatement();
        ResultSet r1=st.executeQuery(str1);
        
        
        {if(!r1.next())
        // while(r1.next())
        {//flag=false;
        // r1.next();
        // if(!r1.previous())
        // {
            
        insert1();
        JOptionPane.showMessageDialog(rootPane, "first");   
        }
        else
        {
        
        
        // {
       
        JOptionPane.showMessageDialog(rootPane,"second");
        int v=0;
        // while(r1.next())
        // {r1.previous();
        
        while(r1.next()){
        r1.previous();
        if(!r1.getString("supp_address").toString().equals(jTextField5.getText())&&!r1.getString("supp_contact").toString().equals(jTextField3.getText()))
        {
        //insert1();
        v++;
        }
        
        else
        {
        //r1.next();
        
        JOptionPane.showMessageDialog(rootPane, "Supplier already exists.");
        // break;
        }
        }
        String s1="select count(*) from supplier where suppliername='"+jTextField2.getText()+"'";
        Statement st1;
        st1 = con.createStatement();
        ResultSet r2=st1.executeQuery(s1);
        // r2.next();
       
        if(v==r2.getInt("count(*)"))
        {
        insert1();
        }
        }
        }
        //  }
        // }
        
        jLabel8.setText("");
        
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
        
        }
        catch (SQLException ex) {
        Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        else
        {
        JOptionPane.showMessageDialog(rootPane, "Enter the information.");
        }
        get1();*/
        int v=0;
        if(!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextArea1.getText().equals(""))
        {
            try {
                /* try {
                String s1="select count(*) from supplier where suppliername='"+jTextField2.getText()+"'";
                Statement st;
                st = con.createStatement();
                ResultSet r1=st.executeQuery(s1);
                r1.next();
                //JOptionPane.showMessageDialog(rootPane,r1.getInt("count(*)"));
                
                if(r1.getInt("count(*)")==0)
                {
                insert1();
                }
                else
                {
                String str1="select suppliername,supp_contact,supp_address from supplier where suppliername='"+jTextField2.getText()+"'";
                
                st = con.createStatement();
                ResultSet r2=st.executeQuery(str1);
                while(r2.next())
                {
                {
                if(!r2.getString("supp_address").toString().equals(jTextArea1.getText()) || !r2.getString("supp_contact").toString().equals(jTextField3.getText()))
                {
                v++;
                }
                else
                {
                JOptionPane.showMessageDialog(rootPane, "Supplier already exists.");
                break;
                }
                
                }
                if(v==r1.getInt("count(*)"))
                {
                insert1();
                }
                }
                
                
                }
                
               
                
                } catch (SQLException ex) {
                Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                String s1="select count(*) from supplier";
                Statement st;
                st = con.createStatement();
                ResultSet r1=st.executeQuery(s1);
                r1.next();
                int c=r1.getInt("count(*)");
                String str="select supp_contact, supp_address from supplier";
               // Statement st=con.createStatement();
                ResultSet r=st.executeQuery(str);
                while(r.next())
                {
                    if(!r.getString("supp_address").toString().equals(jTextArea1.getText()) && !r.getString("supp_contact").toString().equals(jTextField3.getText()))
                    {
                        v++;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Enter your details carefully");
                        break;
                    }
                    
                }
                if(v==c)
                {
                insert1();
                }
                 jLabel8.setText("");
                
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextArea1.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(supplier.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }    
        
      else
        {
        JOptionPane.showMessageDialog(rootPane, "Enter the information.");
        }
        get1();   
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!jComboBox1.getSelectedItem().equals("-Select-"))
        {
        try
        {
            String s_id=jComboBox1.getSelectedItem().toString();
            String str="select * from supplier where s_id='"+s_id+"'";
            Statement st=con.createStatement();
            ResultSet re= st.executeQuery(str);
            re.next();
            //jPanel1.setVisible(true);
            
            jLabel10.setText(Long.toString(re.getLong("s_id")));
            jLabel10.setVisible(true);
            jTextField6.setText(re.getString(2));
            jTextField7.setText(Integer.toString(re.getInt("supp_contact")));
            jTextField8.setText(re.getString(4));
            jTextField9.setText(re.getString(5));
            jTextField6.setEnabled(false);
            jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
             jTextField9.setEnabled(false);
            jButton4.setEnabled(true);
            //jButton4.setLocation(jButton3.getLocation());
            jButton4.setVisible(true);
        }catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }
        // TODO add your handling code here:
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Select the supplier name");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //if(!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")&&!jTextField9.getText().equals(""))
       //{
        jButton3.setEnabled(false);
        jTextField6.setEnabled(true);
        jTextField7.setEnabled(true);
        jTextField8.setEnabled(true);
        jTextField9.setEnabled(true);
        //jTextField1.setEnabled(false);
        jButton4.setVisible(false);
        jButton5.setLocation(jButton4.getLocation());
        jButton5.setVisible(true); 
      // }
      // else
      // {
      //     JOptionPane.showMessageDialog(rootPane, "");
      // }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int s_id=Integer.parseInt(jLabel10.getText());
        String suppliername=jTextField6.getText();
        int supp_contact=Integer.parseInt(jTextField7.getText());
        String supp_city=jTextField8.getText();
        String supp_address=jTextField9.getText();
        String str= "update supplier set suppliername='"+suppliername +"',supp_contact="+supp_contact+",supp_city='"+supp_city+"',supp_address='"+supp_address+"' where s_id="+s_id+"";
        try
        {

            Statement st=con.createStatement();
            st.executeUpdate(str);
            JOptionPane.showMessageDialog(rootPane, "Updated!");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        }        // TODO add your handling code here:
        jButton5.setVisible(false);
        jButton4.setLocation(jButton5.getLocation());
        jButton4.setVisible(true);
        jButton4.setEnabled(false);
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jLabel10.setText("");
        jTextField6.setEnabled(false);
         jTextField7.setEnabled(false);
            jTextField8.setEnabled(false);
             jTextField9.setEnabled(false);
             jComboBox1.setSelectedItem("-Select-");
             jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
model1.setRowCount(0);
        //jTable1.setSelectionMode(WHEN_FOCUSED);


   // Connection con;
//jTable1.setEnabled(false);

       jTable1.setRowSelectionAllowed(true);
       jTable1.setColumnSelectionAllowed(false);
     // jTable1.setEditingColumn(2);
      // jTable1.setCellSelectionEnabled(false);
 

try
{
String str="select * from supplier";
Statement st=con.createStatement();
ResultSet re=st.executeQuery(str);



while(re.next())
{
int col_count=col_list.length;
    Object[] new_row=new Object[col_count];
for(int i=0;i<col_count;i++)
{
    new_row[i]=re.getObject(i+1); 
 }
model1.addRow(new_row);
}



}
catch(Exception ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.toString());
}
  
        
        
  
    
        //new view_supplier().setVisible(true);        // TODO add your handling code here:  
  
        
        
  
    
        //new view_supplier().setVisible(true);        // TODO add your handling code here:  
  
        
        
  
    
        //new view_supplier().setVisible(true);        // TODO add your handling code here:  
  
        
        
  
    
        //new view_supplier().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int op=JOptionPane.showConfirmDialog(rootPane, "Do you want to delete it?", "Confirmation", JOptionPane.YES_NO_OPTION);
      if(op==0)
      {
          Long s_id=(Long) model1.getValueAt(jTable1.getSelectedRow(), 0);
        model1.removeRow(jTable1.getSelectedRow());
        //int s_id=Integer.parseInt(jLabel.getText());        //int s_id=Integer.parseInt(jLabel.getText());
        

        String str1="delete  from supplier where s_id="+s_id;

        try{
            Statement st=con.createStatement();
            st.executeUpdate(str1);
            JOptionPane.showMessageDialog(rootPane, "deleted");
        }
        catch(SQLException | HeadlessException ex)
        {
            JOptionPane.showMessageDialog(rootPane, ex.toString());
        } 
      }
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
       int c;
    c= evt.getKeyCode();
   //JOptionPane.showMessageDialog(rootPane, c);
   /*    if(c>=48&&c<=57 || c==10 || c==8 || c>=96&&c<=105 || c==37 || c==39)      
       {
          if(jTextField3.getText().equals("")&&c==37 || jTextField3.getText().equals("")&&c==39 )
           {
               //JOptionPane.showMessageDialog(rootPane, "Wrong format!");
           }
           
           //jTextField3.setText(Integer.toString(c));
       }
       else
       {
           //JOptionPane.showMessageDialog(rootPane, "Wrong format!");
           if(c==38 ||c==40)
           {
               //JOptionPane.showMessageDialog(rootPane, "Wrong format!");
               //JOptionPane.showMessageDialog(rootPane, "Wrong format!");
           }
         else
           {
               JOptionPane.showMessageDialog(rootPane, "Wrong format!");
           //jTextField3.setText(jTextField3.getText().substring(0,jTextField3.getText().length()-1 ));
               jTextField3.setText("");
           }
           
       }
        */
    if(c==16||c==32||c>=65 && c<=93 || c==192 || c==61 || c==59 ||c==222 || c>=44 && c<=47 || c>=109 && c<=111 || c==106 || c==107)
    {
        JOptionPane.showMessageDialog(rootPane, "Wrong format!");
         jTextField3.setText("");
    }
    else 
    {
        if(jTextField3.getText().length()!=0)
        {
       char ch= jTextField3.getText().charAt(jTextField3.getText().length()-1);
           
          
           if(ch=='!'||ch=='#'|| ch=='$'||ch=='%'|| ch=='^')
           {
               JOptionPane.showMessageDialog(rootPane, "Wrong format!");
         jTextField3.setText("");
           }
        }
    }
    //JOptionPane.showMessageDialog(rootPane,""+c);
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
         int c;
    c= evt.getKeyCode();
       if(c==16||c==32||c>=65 && c<=93 || c==192 || c==61 || c==59 ||c==222 || c>=44 && c<=47 || c>=109 && c<=111 || c==106 || c==107)
    {
        JOptionPane.showMessageDialog(rootPane, "Wrong format!");
         jTextField7.setText("");
    }
    else 
    {
        if(jTextField7.getText().length()!=0)
        {
       char ch= jTextField7.getText().charAt(jTextField7.getText().length()-1);
           
          
           if(ch=='!'||ch=='#'|| ch=='$'||ch=='%'|| ch=='^')
           {
               JOptionPane.showMessageDialog(rootPane, "Wrong format!");
         jTextField7.setText("");
           }
        }
    }
    
      
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel22MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

   
    }

