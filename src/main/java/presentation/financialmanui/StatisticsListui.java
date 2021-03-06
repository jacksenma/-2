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
import javax.swing.ListSelectionModel;

import RMI.client.RMIClient;
import blservice.financialmanblservice.CostManageService;
import blservice.financialmanblservice.StatisticsListService;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;

/**
 *
 * @author user
 */

public class StatisticsListui extends javax.swing.JFrame {
	static StatisticsListService sm;
    /**
     * Creates new form StatisticsListui
     * @throws Exception 
     */
	    static boolean isOk;//记录确定按钮是否被点过  
	
	
	    Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy");
		String time1=format.format(date);
		
		Date date2=new Date();
		DateFormat format2=new SimpleDateFormat("MM");
		String time2=format2.format(date2);
		
		Date date3=new Date();
		DateFormat format3=new SimpleDateFormat("dd");
		String time3=format3.format(date3);
		
		
    public StatisticsListui() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setVisible(true);
        RMIClient.init();
        sm = RMIClient.getStatisticsListService();
        year2.setText(time1);
		month2.setText(time2);
		day2.setText(time3);
    }
    private void SearchAll1(RecieveListvo[] uv){
   	   final String s[] = new String [100];
   	   if(uv!=null){	   
   	   for(int i=0;i<uv.length;i++){
   		   s[i]=uv[i].yearq+"-"+uv[i].monthq+"-"+uv[i].dayq+"             "+uv[i].moneyq+"元"+"                      "
   				   +uv[i].IDq+"          "+uv[i].Zhanghu;
   	   }
   	   jList1.setModel(new javax.swing.AbstractListModel() {
              String[] strings = s;
              public int getSize() { return strings.length; }
              public Object getElementAt(int i) { return strings[i]; }
          });
   	   jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   	    jScrollPane1.setViewportView(jList1);
   	    }}
    
    private void SearchAll2(PaymentInputvo[] pv){
   	   final String s1[] = new String [100];
   	   if(pv!=null){	   
   	   for(int i=0;i<pv.length;i++){
   		   s1[i]=pv[i].date.year+"-"+pv[i].date.mouth+"-"+pv[i].date.day+"                 "+pv[i].pay.money+"元"+"                    "
   				   +pv[i].pay.account;
   	   }
   	   jList2.setModel(new javax.swing.AbstractListModel() {
              String[] strings = s1;
              public int getSize() { return strings.length; }
              public Object getElementAt(int i) { return strings[i]; }
          });
   	   jList2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   	    jScrollPane2.setViewportView(jList2);
   	    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        year1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        month1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        year2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        month2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        day2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        daochu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("开始日期：");

        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        jLabel5.setText("结束日期：");

        jLabel6.setText("年");

        jLabel7.setText("月");

        jLabel8.setText("日");

        OK.setText("确定");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					OKMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton2.setText("返回");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel9.setText("期间收款单信息");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel10.setText("收款营业厅编号");

        jLabel11.setText("收款日期");

        jLabel12.setText("收款金额");

        jLabel13.setText("期间付款单信息");

        jList2.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel14.setText("付款账户");

        jLabel15.setText("付款日期");

        jLabel16.setText("付款金额");

        daochu.setText("导出Excel");
        daochu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					daochuMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addComponent(OK))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(75, 113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(daochu)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel10))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addGap(61, 61, 61)
                            .addComponent(jLabel14))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(year2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(month2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(day2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(OK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(daochu))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void OKMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_OKMouseClicked
        // TODO add your handling code here:
    	
    	
    	//检查完整性
    	String yy=year1.getText();
    	String mm=month1.getText();
    	String dd=day1.getText();
    	String y=year2.getText();
    	String m=month2.getText();
    	String d=day2.getText();
    	if(yy.equals("")||mm.equals("")||dd.equals("")||y.equals("")||m.equals("")||d.equals("")){
    		lackMes();
    		return;
    	}
    	
    	//检查非法字符
    	 for(int i = 0 ; i < yy.length(); i++){
           	if(!(yy.charAt(i) >= '0' && yy.charAt(i) <= '9')){
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
    	 for(int i = 0 ; i < mm.length(); i++){
            	if(!(mm.charAt(i) >= '0' && mm.charAt(i) <= '9')){
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
    	 for(int i = 0 ; i < dd.length(); i++){
            	if(!(dd.charAt(i) >= '0' && dd.charAt(i) <= '9')){
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
    	 
    	 //判断时间
    	
      	
  		if(Integer.parseInt(time1)<Integer.parseInt(y)||Integer.parseInt(time2)<Integer.parseInt(m)
     			||Integer.parseInt(time3)<Integer.parseInt(d)){
     		WrongTime();
     		return;
     	}
  		//起始时间和结束时间
  		int py=Integer.parseInt(yy);
  		int pm=Integer.parseInt(mm);
  		int pd=Integer.parseInt(dd);
  		int ay=Integer.parseInt(y);
  		int am=Integer.parseInt(m);
  		int ad=Integer.parseInt(d);
  		if(ay<py){
  			WrongTime1();
  			return;
  		}
  		else if(ay==py){
  			if(am<pm){
  				WrongTime1();
  	  			return;
  			}
  			else if(am==pm){
  				if(ad<pd){
  					WrongTime1();
  	  	  			return;
  				}
  					
  			}
  		}
    	 
    	SearchAll1(sm.SearchReceive(year1.getText(),month1.getText(),day1.getText(),
    			year2.getText(),month2.getText(),day2.getText()));
    	SearchAll2(sm.SearchPay(year1.getText(),month1.getText(),day1.getText(),
    			year2.getText(),month2.getText(),day2.getText()));
    	isOk=true;
    	
    	
    }//GEN-LAST:event_OKMouseClicked

    private void daochuMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_daochuMouseClicked
        // TODO add your handling code here:
    	if(isOk){
    		String pre=year1.getText()+"-"+month1.getText()+"-"+day1.getText();
    		String pro=year2.getText()+"-"+month2.getText()+"-"+day2.getText();
    		
    		sm.daochuRe(sm.SearchReceive(year1.getText(),month1.getText(),day1.getText(),
        			year2.getText(),month2.getText(),day2.getText()),pre,pro);
    		sm.daochuPay(sm.SearchPay(year1.getText(),month1.getText(),day1.getText(),
        			year2.getText(),month2.getText(),day2.getText()),pre,pro);
    		Right();
    	}
    	else{
    		Error();
    		return;
    	}
    	
    }//GEN-LAST:event_daochuMouseClicked
    private void lackMes(){
        JOptionPane.showMessageDialog(null, "信息输入不完整！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    private void WrongTime(){
   	 JOptionPane.showMessageDialog(null, "请输入正确时间", "输入有误", JOptionPane.ERROR_MESSAGE);
   }
    private void WrongTime1(){
      	 JOptionPane.showMessageDialog(null, "开始日期不能晚于结束日期", "输入有误", JOptionPane.ERROR_MESSAGE);
      }
    private void error(){
        JOptionPane.showMessageDialog(null, "非法字符！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    private void Error(){
    	 JOptionPane.showMessageDialog(null, "导出失败","导出失败", JOptionPane.ERROR_MESSAGE);
    }
   private void Right(){
   	 JOptionPane.showMessageDialog(null, "导出成功","导出成功", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(StatisticsListui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticsListui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticsListui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsListui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new StatisticsListui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JButton daochu;
    private javax.swing.JTextField day1;
    private javax.swing.JTextField day2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField month1;
    private javax.swing.JTextField month2;
    private javax.swing.JTextField year1;
    private javax.swing.JTextField year2;
    // End of variables declaration//GEN-END:variables
}
