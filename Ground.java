/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sportsphere2;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author HP
 */
public class Ground extends javax.swing.JFrame {

    /**
     * Creates new form Ground
     */
    public Ground() {
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

        jLabel4 = new javax.swing.JLabel();
        daycomb = new javax.swing.JComboBox<>();
        book = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        gid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 80, -1));

        daycomb.setBackground(new java.awt.Color(204, 255, 255));
        daycomb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        getContentPane().add(daycomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 240, 30));

        book.setBackground(new java.awt.Color(0, 102, 255));
        book.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("BOOK NOW..");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 410, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ground ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 90, 20));

        gid.setBackground(new java.awt.Color(204, 255, 255));
        gid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gidActionPerformed(evt);
            }
        });
        getContentPane().add(gid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, 30));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show Ground Timetable");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 370, 40));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Project\\aaaaaa.jpg")); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gidActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        
        Main connec = new Main();
        
        String sql="";
        
        try{
        
        String[] list1=new String[100];
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection c2=DriverManager.getConnection(connec.url, connec.user, connec.pss);
       
      String mysql = "SELECT ground_id FROM GroundBooking ";
       
            int a=Integer.parseInt(gid.getText());
            
            Statement s1=c2.createStatement();
            ResultSet r1=s1.executeQuery(mysql);
            int i =0;
            while(r1.next()){
               list1[i]=r1.getString(1);
                                                                                 
                i=i+1;
            }
            
            boolean g=false;
            int k=0;
            for(int n=list1.length-1;n>=0;n--){
            
                if(list1[k].equals(a)){
                    g=true;
                    k=k+1;
                   
                   
               }
            
            }
            
            if(g){
            
             try{
            String[] list2=new String[100];
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection(connec.url, connec.user, connec.pss);
            
            String role = daycomb.getSelectedItem().toString();
            
            if(role.equals("Sunday")){
               sql = "SELECT Sunday FROM GroundBooking WHERE ground_id = ?";
            }else if(role.equals("Monday")){
               sql = "SELECT Monday FROM GroundBooking WHERE ground_id = ?";}
            else if(role.equals("Tuesday")){
               sql = "SELECT Tuesday FROM GroundBooking WHERE ground_id = ?";}
            else if(role.equals("Wednesday")){
               sql = "SELECT Wednesday FROM GroundBooking WHERE ground_id = ?";}
            else if(role.equals("Thursday")){
               sql = "SELECT Thursday FROM GroundBooking WHERE ground_id = ?";}
            else if(role.equals("Friday")){
               sql = "SELECT Friday FROM GroundBooking WHERE ground_id = ?";}
            else if(role.equals("Saturday")){
               sql = "SELECT Saturday FROM GroundBooking WHERE ground_id = ?";}
            
            int id=Integer.parseInt(gid.getText());
            PreparedStatement st = c.prepareStatement(sql);
            st.setInt(1,id) ;
            ResultSet r2=st.executeQuery();
            int j=0;
            while(r1.next()){
            
                list2[j]=r1.getString(1);
                
               
                
             
                       
                j=j+1;
            
            }
            
            boolean f=false;
            int l=0;
            for(int n=list1.length-1;n>=0;n--){
            
                if(list1[l]=="Unavailable"){
                    f=true;
                    l=l+1;
                   
                   
               }
            
            }
            
            
            if(f){
            
            JOptionPane.showMessageDialog(null, "This is not available at the moment ");
            
            
            
            }else if(!f){
            
                
        String groundid = gid.getText();
                 
        if(groundid.equals("") || groundid.matches("@#$%^&*()_+!")){
        
            gid.setText("");
            JOptionPane.showMessageDialog(null, "Please enter a valid Ground ID");
        } 
        else {
        
            
            
            try{
            
                
            
                
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1=DriverManager.getConnection(connec.url, connec.user, connec.pss);
        
  //          String mysql = "UPDATE GroundBooking SET Sunday = ? WHERE ground_id = ?";
            
            //String role = daycomb.getSelectedItem().toString();
            
            if(role=="Sunday"){
               sql = "UPDATE GroundBooking SET Sunday = ? WHERE ground_id = ?";
            }else if(role=="Monday"){
               sql = "UPDATE GroundBooking SET Monday = ? WHERE ground_id = ?";}
            else if(role=="Tuesday"){
               sql = "UPDATE GroundBooking SET Tuesday = ? WHERE ground_id = ?";}
            else if(role=="Wednesday"){
               sql = "UPDATE GroundBooking SET Wednesday = ? WHERE ground_id = ?";}
            else if(role=="Thursday"){
               sql = "UPDATE GroundBooking SET Thursday = ? WHERE ground_id = ?";}
            else if(role=="Friday"){
               sql = "UPDATE GroundBooking SET Friday = ? WHERE ground_id = ?";}
            else if(role=="Saturday"){
               sql = "UPDATE GroundBooking SET Saturday = ? WHERE ground_id = ?";}
            
            
            PreparedStatement st1 = c1.prepareStatement(sql);
            
            st1.setString(1, "Unavailable");
            st1.setString(2, gid.getText());
            
            st1.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "You Booked the Ground Succesfully ");
            
                      
        }
        
        catch(Exception e){
            
    
           System.out.println(e);
           
        }
            
        }
            
            }
            
            
        
        }
        catch(Exception e){
        
            System.out.println(e);
        }
        
        
            
            
            }
            else if(!g){
               
            JOptionPane.showMessageDialog(null, "Valid Ground ID");
                
            }
            
            
        }
        catch(Exception e){}
               
    }//GEN-LAST:event_bookActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Main connec = new Main();


         JFrame newFrame = new JFrame("New Window");
        newFrame.setSize(500, 500);
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        newFrame.setLocationRelativeTo(null);

        String[] list1=new String[100];
         String[] list2=new String[100];
         String[] list3=new String[100];
         String[] list4=new String[100];
         String[] list5=new String[100];
         String[] list6=new String[100];
         String[] list7=new String[100];
         String[] list8=new String[100];
         String[] list9=new String[100];
         String[] list10=new String[100];

        int i=2;
        list1[0]="Ground ID";
        list2[0]="Ground Name";
        list3[0]="Ground Type";
        list4[0]="Sunday";
        list5[0]="Monday";
        list6[0]="Tuesday";
        list7[0]="Wednesday";
        list8[0]="Thursday";
        list9[0]="Friday";
        list10[0]="Saturday";
        
        list1[1]="_________________";
        list2[1]="_________________";
        list3[1]="_________________";
        list4[1]="_________________";
        list5[1]="_________________";
        list6[1]="_________________";
        list7[1]="_________________";
        list8[1]="_________________";
        list9[1]="_________________";
        list10[1]="_________________";
        
       
        
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1=DriverManager.getConnection(connec.url, connec.user, connec.pss);
            Statement s1=c1.createStatement();
            ResultSet r1=s1.executeQuery("SELECT * FROM GroundBooking");
            
            
            //String id;
            while(r1.next()){
            
                list1[i]=r1.getString(1);
                list2[i]=r1.getString(2);
                list3[i]=r1.getString(3);
                list4[i]=r1.getString(4);
                list5[i]=r1.getString(5);
                list6[i]=r1.getString(6);
                list7[i]=r1.getString(7);
                list8[i]=r1.getString(8);
                list9[i]=r1.getString(9);
                list10[i]=r1.getString(10);
               
                
             //System.out.println(list1[i]+"     "+list1[i]);
                
                       
                i=i+1;
            
            };
            c1.close();
        }
        catch(Exception e){
        
            System.out.println(e);
            
        }
        
       
        JList<String> itemList1 = new JList<>(list1);
        JList<String> itemList2 = new JList<>(list2);
        JList<String> itemList3 = new JList<>(list3);
        JList<String> itemList4 = new JList<>(list4);
        JList<String> itemList5 = new JList<>(list5);
        JList<String> itemList6 = new JList<>(list6);
        JList<String> itemList7 = new JList<>(list7);
        JList<String> itemList8 = new JList<>(list8);
        JList<String> itemList9 = new JList<>(list9);
        JList<String> itemList10 = new JList<>(list10);
       
        
        
        JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(1, 5, 2, 10));
       
        panel.add(new JScrollPane(itemList1));
        panel.add(new JScrollPane(itemList2));
        panel.add(new JScrollPane(itemList3));
        panel.add(new JScrollPane(itemList4));
        panel.add(new JScrollPane(itemList5));
        panel.add(new JScrollPane(itemList6));
        panel.add(new JScrollPane(itemList7));
        panel.add(new JScrollPane(itemList8));
        panel.add(new JScrollPane(itemList9));
        panel.add(new JScrollPane(itemList10));
        
      
        
        JScrollPane scrollPane = new JScrollPane(panel);
        newFrame.add(scrollPane);
        newFrame.setVisible(true);
    
      
    
        
        
        
        
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Mainpage p1 = new Mainpage();
        p1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ground.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ground().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton book;
    private javax.swing.JComboBox<String> daycomb;
    private javax.swing.JTextField gid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
