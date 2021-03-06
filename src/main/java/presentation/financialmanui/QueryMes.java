/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.financialmanui;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.financialmanblservice.AccountManageService;
import presentation.courierui.PriceAndTimeui;
import vo.financialmanvo.AccountUservo;

/**
 *
 * @author user
 */
public class QueryMes extends javax.swing.JFrame {
	static AccountManageService as;
	static AccountUservo avo;
	static  String Name;
	static  int Money;
    /**
     * Creates new form QueryMes
     * @throws Exception 
     */
    public QueryMes(String name,int money) throws Exception {
        initComponents();
        RMIClient.init();
        this.Name=name;
        this.Money=money;
        this.avo=avo;
        as= RMIClient.getAccountManageService();
        setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        jLabel1.setText("账户名称：     "+name);
        jLabel2.setText("账户余额 ：    "+money+"  元");
        Init.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Modify = new javax.swing.JButton();
        Init = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("账户名称：");

        jLabel2.setText("账户金额：");

        Modify.setText("修改账户属性");
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					ModifyMouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        Init.setText("初始化当前账户");
        Init.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InitMouseClicked(evt);
            }
        });

        jButton4.setText("退出");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        delete.setText("删除当前账户");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Modify, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(Init, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton4)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(Modify)
                .addGap(18, 18, 18)
                .addComponent(Init)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void InitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_InitMouseClicked

    private void ModifyMouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_ModifyMouseClicked
        // TODO add your handling code here:
    	System.out.println(Name+"  "+Money);
    	 new ModifyAccountui(Name,Money).setVisible(true);
    }//GEN-LAST:event_ModifyMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    	 try {
             boolean b = as.deleteAccount(Name);
             if(b){
                 System.out.println("成功！");
                 JOptionPane.showMessageDialog(null, "删除成功", "成功", 
                 		JOptionPane.INFORMATION_MESSAGE);
                 this.dispose();
             }
             else{
                 
             }
             // TODO add your handling code here:
         } catch (RemoteException ex) {
             Logger.getLogger(PriceAndTimeui.class.getName()).log(Level.SEVERE, null, ex);}
    	
    	
    }//GEN-LAST:event_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(QueryMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Init;
    private javax.swing.JButton Modify;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
