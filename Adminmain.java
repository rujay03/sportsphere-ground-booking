/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sportsphere2;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import sportsphere2.Main;

/**
 *
 * @author HP
 */
public class Adminmain extends javax.swing.JFrame {

    /**
     * Creates new form Adminmain
     */
    public Adminmain() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Tickets");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, 50));

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Remove Tickets");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 260, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Remove Grounds");
        jButton3.setMaximumSize(new java.awt.Dimension(92, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(92, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 260, 50));

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Remove Users");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 260, 50));

        jButton5.setBackground(new java.awt.Color(0, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Check Pay");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 260, 50));

        jButton6.setBackground(new java.awt.Color(0, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Show Ticket Timetable");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 260, 50));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Show Ground Timetable");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 260, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("A D M I N");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("P A N E L");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Project\\aaaaaa.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
      //  this.setVisible(false);
        AddTicket p1 = new AddTicket();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        //this.setVisible(false);
        DelTicket p1 = new DelTicket();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
           // this.setVisible(false);
        GroundDel p1 = new GroundDel();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
       //this.setVisible(false);
        UserDel p1 = new UserDel();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        //    this.setVisible(false);
        PaySet p1 = new PaySet();
        p1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       //     this.setVisible(false);
       
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
        list1[0]="Ticket ID";
        list2[0]="Game ID";
        list3[0]="Price ";
        list4[0]="Seat";
        list5[0]="Date";
        list6[0]="Availability";
        
        list1[1]="_________________";
        list2[1]="_________________";
        list3[1]="_________________";
        list4[1]="_________________";
        list5[1]="_________________";
        list6[1]="_________________";
        
       
        
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c1=DriverManager.getConnection(connec.url, connec.user, connec.pss);
            Statement s1=c1.createStatement();
            ResultSet r1=s1.executeQuery("SELECT * FROM TicketBooking");
            
            
            //String id;
            while(r1.next()){
            
                list1[i]=r1.getString(1);
                list2[i]=r1.getString(2);
                list3[i]=r1.getString(3);
                list4[i]=r1.getString(4);
                list5[i]=r1.getString(5);
                list6[i]=r1.getString(6);
               
                
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
       
        
        
        JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(1, 5, 2, 10));
       
        panel.add(new JScrollPane(itemList1));
        panel.add(new JScrollPane(itemList2));
        panel.add(new JScrollPane(itemList3));
        panel.add(new JScrollPane(itemList4));
        panel.add(new JScrollPane(itemList5));
        panel.add(new JScrollPane(itemList6));
              
        
        JScrollPane scrollPane = new JScrollPane(panel);
        newFrame.add(scrollPane);
        newFrame.setVisible(true);
    
      
       
       
 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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
    
      
    
        
        
 

    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
