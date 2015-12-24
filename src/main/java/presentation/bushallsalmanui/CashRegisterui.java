/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.bushallsalmanui;

import java.awt.event.ActionEvent;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.bushallsalmanblservice.CashRegisterService;
import blservice.financialmanblservice.AccountManageService;
import blservice.queryblservice.QueryService;
import presentation.courierui.PriceAndTimeui;
import vo.bushallsalmanvo.CashRegistervo;
import vo.couriervo.Datevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

/**
 *
 * @author user
 */
public class CashRegisterui extends javax.swing.JFrame {
	static AccountManageService as;//blservice里处理账户
	static CashRegisterService crs;
	static QueryService q;
    /**
     * Creates new form CashRegisterui
     * @throws Exception 
     */
    public CashRegisterui() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        crs=RMIClient.getCashRegisterService();
        q=RMIClient.getQueryService();
        as=RMIClient.getAccountManageService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	setResizable(false);

        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kuaidiyuan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tiaoxingma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        zhanghu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("收款日期：");

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        jLabel5.setText("收款金额：");

        jLabel6.setText("收款快递员：");

        jLabel7.setText("订单条形码号：");

        jButton1.setText("确定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton1ActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton2.setText("退出");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLabel8.setText("营业厅编号：");

        jLabel9.setText("收款账户：");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kuaidiyuan)
                                    .addComponent(money)
                                    .addComponent(tiaoxingma, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(ID)
                                    .addComponent(zhanghu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kuaidiyuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tiaoxingma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(zhanghu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
    	this.dispose();
    }
    private void jButton1ActionPerformed(ActionEvent evt) throws RemoteException {
    	// TODO Auto-generated method stub
    	if(year.getText().equals("")||month.getText().equals("")||day.getText().equals("")||money.getText().equals("")||kuaidiyuan.getText().equals("")||zhanghu.getText().equals("")){
    		errormiss();
    		return;
    	}
    	Datevo date = new Datevo(Integer.parseInt(year.getText()), 
    			Integer.parseInt(month.getText()),
    			Integer.parseInt(day.getText()));
    	
    	CashRegistervo cashRegister=new CashRegistervo(date,money.getText(),kuaidiyuan.getText(),tiaoxingma.getText(),ID.getText(),zhanghu.getText());
        String tiaoxingmaID="";
        if((tiaoxingmaID=tiaoxingma.getText()).equals("")||tiaoxingmaID.length()!=10){
        	errortiaoxingmaID();
        	return;
        }
        String yID="";
        if((yID=ID.getText()).equals("")||yID.length()!=6){
        	erroryID();
        	return;
        }
        QueryOrdervo qovo;
		qovo = q.checkOrder(new Queryvo(tiaoxingma.getText()));
		
		AccountMesvo qvo=new AccountMesvo(zhanghu.getText());
        AccountUservo avo=as.findUsers(qvo);
    	if(avo == null) {
            noaccount();
            return;
        }
		
		try {
			if(!crs.checkDate(cashRegister, qovo)){
				dateError2();
				return;
			}
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        
        boolean a=errorID(year.getText());
        if(a)return;
        boolean b=errorID(month.getText());
        if(b)return;
        boolean c=errorID(day.getText());
        if(c)return;
        boolean d=errorID(money.getText());
        if(d)return;
        boolean e1=errorID(tiaoxingma.getText());
        if(e1)return;
        boolean f=errorID(ID.getText());
        if(f)return;
        try {
            boolean a1 = crs.inputcash(cashRegister);
            if(a1){
                System.out.println("成功！");
                JOptionPane.showMessageDialog(null, "写入成功", "成功", 
                		JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "写入失败", "失败！", 
                		JOptionPane.ERROR_MESSAGE);
            }
            } catch (RemoteException ex) {
                Logger.getLogger(PriceAndTimeui.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    private void noaccount() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "不存在该账户！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void errormiss() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "信息输入不完整！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void dateError2() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "日期早于订单输入日期或晚于当前日期！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private boolean errorID(String text) {
		// TODO Auto-generated method stub
    	for(int i=0;i<text.length();i++){
    		if(!(text.charAt(i)>='0'&&text.charAt(i)<='9')){
    			JOptionPane.showMessageDialog(null, "包含非法字符！", "输入有误", JOptionPane.ERROR_MESSAGE);
    			return true;
    		}
    	}
		return false;
	}

	private void erroryID() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "营业厅编号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void errortiaoxingmaID() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "条形码号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CashRegisterui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashRegisterui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashRegisterui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashRegisterui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new CashRegisterui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField day;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kuaidiyuan;
    private javax.swing.JTextField money;
    private javax.swing.JTextField month;
    private javax.swing.JTextField tiaoxingma;
    private javax.swing.JTextField year;
    private javax.swing.JTextField zhanghu;
    // End of variables declaration//GEN-END:variables
}
