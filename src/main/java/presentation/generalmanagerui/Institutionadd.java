/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.generalmanagerui;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import vo.generalmanagervo.Institutionvo;
import RMI.client.RMIClient;
import blservice.generalmanagerblservice.StaffInstitutionManagerService;

/**
 *
 * @author user
 */
public class Institutionadd extends javax.swing.JFrame {

    /**
     * Creates new form Institutionadd
     */
	static StaffInstitutionManagerService sims;
    public Institutionadd() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        sims = RMIClient.getStaffInstitutionManagerService();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        leader = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        zhongzhuan = new javax.swing.JRadioButton();
        yingyeting = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("名称：");

        jLabel2.setText("编号：");

        jLabel3.setText("负责人：");

        save.setText("保存");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					saveMouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jLabel4.setText("机构类别：");

        buttonGroup1.add(zhongzhuan);
        zhongzhuan.setText("中转中心");

        buttonGroup1.add(yingyeting);
        yingyeting.setText("营业厅");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(zhongzhuan)
                        .addGap(31, 31, 31)
                        .addComponent(yingyeting))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(leader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(leader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(zhongzhuan)
                    .addComponent(yingyeting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
    	int type;
    	if(yingyeting.isSelected()){
    		type=1;
    		if(!isvalid(type,ID.getText())){
    		return;
    		}
    	}
    	else{
    		type=0;
    		if(!isvalid(type,ID.getText())){
        		return;
    		}		
    	}
    	if(sims.showInstitutions(ID.getText()) == null)
    	sims.addInstitution(new Institutionvo(type,name.getText(),ID.getText(),leader.getText()));
    	else{
    	JOptionPane.showMessageDialog(null, "已存在该编号的机构", "输入有误", JOptionPane.ERROR_MESSAGE);	
    	return;
    	}
    	JOptionPane.showMessageDialog(null, "写入成功", "成功", JOptionPane.INFORMATION_MESSAGE);
    	this.dispose();
    	new Institutionadd().setVisible(true);
    }//GEN-LAST:event_saveMouseClicked

    private boolean isvalid(int type, String text) {
		// TODO Auto-generated method stub
    	boolean b=true;
    	for(int i=0;i<text.length();i++){
    		if(!(text.charAt(i)<'9'&&text.charAt(i)>'0'))
             b=false;
    	}
    	if(!b){
    		JOptionPane.showMessageDialog(null, "机构编号应为数字", "输入有误", JOptionPane.ERROR_MESSAGE);
			return false;
    	}
		if(type==1&&text.length()!=6){
			JOptionPane.showMessageDialog(null, "营业厅编号应为6位数字", "输入有误", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else if(type==0&&text.length()!=4){
			JOptionPane.showMessageDialog(null, "营业厅编号应为4位数字", "输入有误", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		else
			return true;
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
            java.util.logging.Logger.getLogger(Institutionadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Institutionadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Institutionadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Institutionadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Institutionadd().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField leader;
    private javax.swing.JTextField name;
    private javax.swing.JButton save;
    private javax.swing.JRadioButton yingyeting;
    private javax.swing.JRadioButton zhongzhuan;
    // End of variables declaration//GEN-END:variables
}
