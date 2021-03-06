/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.administratorui;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.administratorblservice.UserAuthorityManagerService;
import vo.administratorvo.UserAuthorityManagervo;

/**
 *
 * @author user
 */
public class ChangeMesui extends javax.swing.JFrame {
	String Id;
	String Password;
	String Name;
	static UserAuthorityManagerService u;

    /**
     * Creates new form ChangeMesui
     * @throws Exception 
     */
    public ChangeMesui(String id,String password,String name) throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);

        this.Id=id;
        this.Password=password;
        this.Name=name;
       
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.id.setText("账户ID：        "+id);
        this.mm.setText("账户密码：    "+password);
        this.xm.setText("员工姓名：    "+name);
        RMIClient.init();
        u= RMIClient.getUserAuthorityManagerService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kdy = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        id = new javax.swing.JLabel();
        mm = new javax.swing.JLabel();
        xm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kuai = new javax.swing.JRadioButton();
        yingywy = new javax.swing.JRadioButton();
        zhongywy = new javax.swing.JRadioButton();
        yibancwy = new javax.swing.JRadioButton();
        gaojicwy = new javax.swing.JRadioButton();
        zongjl = new javax.swing.JRadioButton();
        zhongkc = new javax.swing.JRadioButton();
        guanly = new javax.swing.JRadioButton();
        ok = new javax.swing.JButton();
        back = new javax.swing.JButton();

        kdy.setText("快递员");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        id.setText("账户ID：");

        mm.setText("账户密码：");

        xm.setText("员工姓名：");

        jLabel4.setText("员工权限：");

        buttonGroup1.add(kuai);
        kuai.setText("快递员");
        kuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuaiActionPerformed(evt);
            }
        });

        buttonGroup1.add(yingywy);
        yingywy.setText("营业厅业务员");

        buttonGroup1.add(zhongywy);
        zhongywy.setText("中转中心业务员");

        buttonGroup1.add(yibancwy);
        yibancwy.setText("一般财务员");

        buttonGroup1.add(gaojicwy);
        gaojicwy.setText("高级财务员");

        buttonGroup1.add(zongjl);
        zongjl.setText("总经理");

        buttonGroup1.add(zhongkc);
        zhongkc.setText("中转中心库存管理员");

        buttonGroup1.add(guanly);
        guanly.setText("管理员");

        ok.setText("确定");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					okMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        back.setText("返回");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mm)
                    .addComponent(id)
                    .addComponent(xm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(kuai)
                                        .addGap(18, 18, 18)
                                        .addComponent(yingywy))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yibancwy)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gaojicwy))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ok)
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zhongywy)
                                    .addComponent(zongjl))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(zhongkc)
                                    .addComponent(guanly)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(back)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(id)
                .addGap(18, 18, 18)
                .addComponent(mm)
                .addGap(18, 18, 18)
                .addComponent(xm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kuai)
                        .addComponent(yingywy)
                        .addComponent(zhongywy)
                        .addComponent(zhongkc)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guanly)
                    .addComponent(zongjl)
                    .addComponent(gaojicwy)
                    .addComponent(yibancwy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(back))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuaiActionPerformed

    private void okMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_okMouseClicked
        // TODO add your handling code here:
    	
    	int type=0;
    	if(kuai.isSelected()) type=1;
    	else if(yingywy.isSelected())type=2;
    	else if(zhongywy.isSelected())type=3;
    	else if(zhongkc.isSelected())type=4;
    	else if(yibancwy.isSelected())type=5;
    	else if(gaojicwy.isSelected())type=6;
    	else if(zongjl.isSelected())type=7;
    	else if(guanly.isSelected())type=8;
    	System.out.println(Id+"   "+Password+"    "+Name+"    "+type);
    	UserAuthorityManagervo o=new
    			UserAuthorityManagervo(Id, Password, Name, 0);
    	UserAuthorityManagervo n=new
    			UserAuthorityManagervo(Id, Password, Name, type);
    	
    	boolean b = u.changeOrder(o,n);
    	System.out.println("lalalalaalalalal");
    	if(type==0){
    		missMes();
    		return;
    	}
		if(b){
		    System.out.println("成功！");
		    JOptionPane.showMessageDialog(null, "修改成功", "成功", 
		    		JOptionPane.INFORMATION_MESSAGE);
		    this.dispose();
		}
		else{
		    JOptionPane.showMessageDialog(null, "修改失败", "可能不存在此ID！", 
		    		JOptionPane.ERROR_MESSAGE);
		}
		// TODO add your handling code here:
       }
////GEN-LAST:event_okMouseClicked
//
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
   }//GEN-LAST:event_backMouseClicked
    private void missMes(){
        JOptionPane.showMessageDialog(null, "请选择修改项", "输入有误", JOptionPane.ERROR_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(ChangeMesui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeMesui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeMesui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeMesui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ChangeMesui().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton gaojicwy;
    private javax.swing.JRadioButton guanly;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton kdy;
    private javax.swing.JRadioButton kuai;
    private javax.swing.JLabel mm;
    private javax.swing.JButton ok;
    private javax.swing.JLabel xm;
    private javax.swing.JRadioButton yibancwy;
    private javax.swing.JRadioButton yingywy;
    private javax.swing.JRadioButton zhongkc;
    private javax.swing.JRadioButton zhongywy;
    private javax.swing.JRadioButton zongjl;
    // End of variables declaration//GEN-END:variables
}
