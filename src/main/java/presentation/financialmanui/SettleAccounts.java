/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.financialmanui;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.financialmanblservice.SettlementManageService;
import vo.financialmanvo.Datevo;
import vo.financialmanvo.IncomeInputvo;
import vo.financialmanvo.Incomevo;

/**
 *
 * @author user
 */
public class SettleAccounts extends javax.swing.JFrame {
	static SettlementManageService sms;
    /**
     * Creates new form SettleAccounts
     * @throws Exception 
     */
    public SettleAccounts() throws Exception {
    	 initComponents();
         this.setLocationRelativeTo(null);
         this.setVisible(true);
         RMIClient.init();
         sms = RMIClient.getSettlementManageService();
         create.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        danwei = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        p = new javax.swing.JLabel();
        person = new javax.swing.JTextField();
        fang = new javax.swing.JLabel();
        unit2 = new javax.swing.JTextField();
        m = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        ad = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("结算清单"));

        jLabel1.setText("收款日期：");

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        danwei.setText("收款单位：");

        p.setText("收款人：");

        fang.setText("收款方：");

        m.setText("收款金额：");

        ad.setText("收款地点：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(m)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(money))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(danwei)
                            .addComponent(p)
                            .addComponent(fang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unit)
                            .addComponent(person)
                            .addComponent(unit2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(danwei)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p)
                    .addComponent(person, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fang)
                    .addComponent(unit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        create.setText("新建");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					createMouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        exit.setText("退出");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(create)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(18, 18, 18)
                .addComponent(exit)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(exit)
                    .addComponent(save))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void createMouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
    	this.dispose();
    	new SettleAccounts().setVisible(true);
    }//GEN-LAST:event_createMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
    	String y=year.getText();
    	String m=money.getText();
    	String d=day.getText();
    	String p=person.getText();
    	String mo=money.getText();
    	
    	//完整性
    	if(y.equals("")||m.equals("")||d.equals("")||p.equals("")||mo.equals("")){
    		missMes();
    		return;
    	}
    	
    	
    	//非法字符
    	for(int i=0;i<y.length();i++){
    		if('0'>y.charAt(i)||y.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	for(int i=0;i<m.length();i++){
    		if('0'>m.charAt(i)||m.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	for(int i=0;i<d.length();i++){
    		if('0'>d.charAt(i)||d.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	for(int i=0;i<mo.length();i++){
    		if('0'>mo.charAt(i)||mo.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	
    	//时间
    	Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy");
		String time1=format.format(date);
		
		Date date2=new Date();
		DateFormat format2=new SimpleDateFormat("MM");
		String time2=format2.format(date2);
		
		Date date3=new Date();
		DateFormat format3=new SimpleDateFormat("dd");
		String time3=format3.format(date3);
		if(Integer.parseInt(time1)<Integer.parseInt(y)||Integer.parseInt(time2)<Integer.parseInt(m)
    			||Integer.parseInt(time3)<Integer.parseInt(d)){
    		WrongTime();
    		return;
    	}
		
		
    	Datevo paydv=new Datevo(year.getText(),month.getText(),day.getText());
    	Incomevo invo=new Incomevo(unit.getText(), person.getText(), unit2.getText(),
    			money.getText(), address.getText());
    	IncomeInputvo iivo=new IncomeInputvo(paydv, invo);
    	 boolean ax = sms.getOrder2(iivo);
//         System.out.println("sdsd");
         if(ax){
             System.out.println("成功！");
             JOptionPane.showMessageDialog(null, "保存成功", "成功", 
             		JOptionPane.INFORMATION_MESSAGE);
             this.dispose();
             new SettleAccounts().setVisible(true);
         }
         else{
             JOptionPane.showMessageDialog(null, "写入失败", "可能存在相同订单！", 
             		JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_saveMouseClicked
    private void missMes(){
   	 JOptionPane.showMessageDialog(null, "日期，金额，收款人必填", "输入有误", JOptionPane.ERROR_MESSAGE);
   }
    private void Wrong(){
   	 JOptionPane.showMessageDialog(null, "非法字符", "输入有误", JOptionPane.ERROR_MESSAGE);
   }
    private void WrongTime(){
   	 JOptionPane.showMessageDialog(null, "请输入正确时间", "输入有误", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(SettleAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettleAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettleAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettleAccounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new SettleAccounts().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ad;
    private javax.swing.JTextField address;
    private javax.swing.JButton create;
    private javax.swing.JLabel danwei;
    private javax.swing.JTextField day;
    private javax.swing.JButton exit;
    private javax.swing.JLabel fang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel m;
    private javax.swing.JTextField money;
    private javax.swing.JTextField month;
    private javax.swing.JLabel p;
    private javax.swing.JTextField person;
    private javax.swing.JButton save;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField unit2;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
