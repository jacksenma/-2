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
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.financialmanblservice.AccountManageService;
import blservice.financialmanblservice.CostManageService;
import presentation.courierui.PriceAndTimeui;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.Beizhuvo;
import vo.financialmanvo.Datevo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.Payvo;
import vo.financialmanvo.Tiaomuvo;



/**
 *
 * @author user
 */

public class PaymentList extends javax.swing.JFrame {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 7752463845942510707L;
	static CostManageService cm;
	static AccountManageService as;
    /**
     * Creates new form PaymentList
     * @throws Exception 
     */
	Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy");
		String time1=format.format(date);
		
		Date date2=new Date();
		DateFormat format2=new SimpleDateFormat("MM");
		String time2=format2.format(date2);
		
		Date date3=new Date();
		DateFormat format3=new SimpleDateFormat("dd");
		String time3=format3.format(date3);
    public PaymentList() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        cm = RMIClient.getCostManageService();
        as= RMIClient.getAccountManageService();
        year.setText(time1);
        mouth.setText(time2);
        day.setText(time3);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	this.setLocationRelativeTo(null);
    	setResizable(false);

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mouth = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        person = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        account = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        yearfee = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        trafficfee = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        moneyyear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        moneymouth = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("付款单"));

        jLabel1.setText("付款日期：");

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        jLabel5.setText("付款金额：");

        jLabel6.setText("付款人：");

        jLabel7.setText("付款账号：");

        jLabel15.setText("元");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(account))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(person))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(money))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mouth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(mouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(person, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("条目"));

        jLabel8.setText("年租金：");

        jLabel9.setText("运费：");

        jLabel10.setText("员工工资：");

        jLabel11.setText("奖励：");

        jLabel16.setText("元");

        jLabel17.setText("元");

        jLabel18.setText("元");

        jLabel19.setText("元");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salary))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearfee, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(trafficfee, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(yearfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(trafficfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("备注"));

        jLabel12.setText("租金年份：");

        jLabel13.setText("运单号：");

        jLabel14.setText("标记租金月份：");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(18, 18, 18)
                            .addComponent(number))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(moneyyear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneymouth, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(moneyyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(moneymouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton1.setText("确定");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jButton1MouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton2.setText("退出");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButton1)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
//    	System.out.println(number.getText());
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {                                      
        // TODO add your handling code here:
    	Datevo paydv=new Datevo(year.getText(),mouth.getText(),day.getText());
    	Payvo p=new Payvo(money.getText(),person.getText(),account.getText());
    	Tiaomuvo t=new Tiaomuvo(yearfee.getText(), trafficfee.getText(),
    			salary.getText(), bonus.getText());
    	Beizhuvo b=new Beizhuvo(moneyyear.getText(), number.getText(),
    			moneymouth.getText());
    	
    	
    	//判断信息完整性
    	 if(year.getText().equals("")||mouth.getText().equals("")
        		 ||day.getText().equals("")||money.getText().equals("")
        		 ||person.getText().equals("")||account.getText().equals("")
        		 ||yearfee.getText().equals("")||trafficfee.getText().equals("")
        		 ||salary.getText().equals("")||bonus.getText().equals("")
        		 ||moneyyear.getText().equals("")||number.getText().equals("")
        		 ||moneymouth.getText().equals("")){
        	lackMes();
        	return;
         }
    	 
    	String y=year.getText();
      	String m=mouth.getText();
      	String d=day.getText();
      //判断单号是否为10位
   	 String ID = "";

        if((ID = number.getText()).equals("") || ID.length() != 10) {
       	 errorID();
            return;
        }
    	 
    	//判断是否有非法字符

         for(int i = 0 ; i < ID.length(); i++){
         	if(!(ID.charAt(i) >= '0' && ID.charAt(i) <= '9')){
         		error();
         		return;
         	}
         }
         for(int i = 0 ; i < y.length(); i++){
          	if(!(y.charAt(i) >= '0' && y.charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < m.length(); i++){
          	if(!(m.charAt(i) >= '0' && m.charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < d.length(); i++){
          	if(!(d.charAt(i) >= '0' && d.charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < money.getText().length(); i++){
          	if(!(money.getText().charAt(i) >= '0' && money.getText().charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < yearfee.getText().length(); i++){
          	if(!(yearfee.getText().charAt(i) >= '0' && yearfee.getText().charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < trafficfee.getText().length(); i++){
          	if(!(trafficfee.getText().charAt(i) >= '0' && trafficfee.getText().charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < salary.getText().length(); i++){
          	if(!(salary.getText().charAt(i) >= '0' &&salary.getText().charAt(i) <= '9')){
          		error();
          		return;
          	}
          }
         for(int i = 0 ; i < bonus.getText().length(); i++){
           	if(!(bonus.getText().charAt(i) >= '0' && bonus.getText().charAt(i) <= '9')){
           		error();
           		return;
           	}
           }
          for(int i = 0 ; i < moneyyear.getText().length(); i++){
           	if(!(moneyyear.getText().charAt(i) >= '0' && moneyyear.getText().charAt(i) <= '9')){
           		error();
           		return;
           	}
           }
          for(int i = 0 ; i < moneymouth.getText().length(); i++){
           	if(!(moneymouth.getText().charAt(i) >= '0' &&moneymouth.getText().charAt(i) <= '9')){
           		error();
           		return;
           	}
           }
    	 
    	 
    	
        //时间判断
     	
     	
 		if(Integer.parseInt(time1)<Integer.parseInt(y)||Integer.parseInt(time2)<Integer.parseInt(m)
    			||Integer.parseInt(time3)<Integer.parseInt(d)||Integer.parseInt(y)<Integer.parseInt(time1)-1){
    		WrongTime();
    		return;
    	}
 		
 		AccountMesvo qvo=new AccountMesvo(account.getText());
        AccountUservo avo=as.findUsers(qvo);
        if(avo==null){
        	noAccount();
        	return;
        }
    	 
    	
        
         
         
      
         
         try {
        	 PaymentInputvo pivo=new PaymentInputvo(paydv, p, t, b);
        	 System.out.println(pivo.beizhu.moneymouth);
//        	 System.out.println("ssssssss");
             boolean ax = cm.getOrder(pivo);
//             System.out.println("sdsd");
             if(ax){
                 System.out.println("成功！");
                 JOptionPane.showMessageDialog(null, "写入成功", "成功", 
                 		JOptionPane.INFORMATION_MESSAGE);
                 this.dispose();
             }
             else{
                 JOptionPane.showMessageDialog(null, "写入失败", "可能存在相同订单！", 
                 		JOptionPane.ERROR_MESSAGE);
             }
             // TODO add your handling code here:
         } catch (RemoteException ex) {
             Logger.getLogger(PriceAndTimeui.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    
    }
    
    private void errorID(){
        JOptionPane.showMessageDialog(null, "运单号输入错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    private void lackMes(){
        JOptionPane.showMessageDialog(null, "信息输入不完整！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    private void WrongTime(){
   	 JOptionPane.showMessageDialog(null, "请输入正确时间", "输入有误", JOptionPane.ERROR_MESSAGE);
   }
    private void error(){
        JOptionPane.showMessageDialog(null, "非法字符！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    private void noAccount(){
        JOptionPane.showMessageDialog(null, "不存在此账户", "输入有误", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(PaymentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new PaymentList().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account;
    private javax.swing.JTextField bonus;
    private javax.swing.JTextField day;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField money;
    private javax.swing.JTextField moneymouth;
    private javax.swing.JTextField moneyyear;
    private javax.swing.JTextField mouth;
    private javax.swing.JTextField number;
    private javax.swing.JTextField person;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField trafficfee;
    private javax.swing.JTextField year;
    private javax.swing.JTextField yearfee;
    // End of variables declaration//GEN-END:variables
}
