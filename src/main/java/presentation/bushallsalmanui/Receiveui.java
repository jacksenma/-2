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
import blservice.bushallsalmanblservice.ReceiveSendService;
import blservice.queryblservice.QueryService;
import data.orderdata.OrderIO;
import dataservice.otherdataservice.ExpressService;
import po.courierpo.CourierOrderpo;
import presentation.courierui.PriceAndTimeui;
import vo.bushallsalmanvo.Receivevo;
import vo.bushallsalmanvo.Receivevo1;
import vo.bushallsalmanvo.Receivevo2;
import vo.couriervo.Datevo;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;



/**
 *
 * @author user
 */
public class Receiveui extends javax.swing.JFrame {

	static ReceiveSendService rss;
	static QueryService q;
    /**
     * Creates new form ReceiveSendui
     * @throws Exception 
     */
    public Receiveui() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        rss=RMIClient.getReceiveSendService();
        q=RMIClient.getQueryService();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        zhongzhuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chufa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tiaoxingma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("货物到达信息"));

        jLabel1.setText("到达日期：");

        jLabel2.setText("年");

        jLabel3.setText("月");

        jLabel4.setText("日");

        jLabel5.setText("中转单编号：");

        jLabel6.setText("出发地：");

        jLabel7.setText("货物状态：");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("完整");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("丢失");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("损坏");

        jLabel8.setText("订单条形码号：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                            .addComponent(zhongzhuan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tiaoxingma, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chufa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
                .addGap(51, 61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(zhongzhuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tiaoxingma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chufa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton1ActionPerformed(ActionEvent evt) throws RemoteException {
    	// TODO Auto-generated method stub
    	if(year.getText().equals("")||month.getText().equals("")||day.getText().equals("")||zhongzhuan.getText().equals("")||chufa.getText().equals("")||tiaoxingma.getText().equals("")){
    		errormiss();
    		return;
    	}
    	Datevo date = new Datevo(Integer.parseInt(year.getText()), 
    			Integer.parseInt(month.getText()),
    			Integer.parseInt(day.getText()));
    	
    	Receivevo1 receive1 = new Receivevo1(date,zhongzhuan.getText(),chufa.getText(),tiaoxingma.getText());
    	
    	int zhuangtai=1;
    	 if(jRadioButton1.isSelected()) zhuangtai = 1;
         else if(jRadioButton2.isSelected()) zhuangtai = 2;
         else if(jRadioButton3.isSelected()) zhuangtai = 3;
    	 String txmID=tiaoxingma.getText();
    	 if((txmID.equals("") || txmID.length() != 10)) {
             errorID();
             return;
         }
    	 for(int i=0;i<txmID.length();i++){
    		 if(!(txmID.charAt(i)>='0'&&txmID.charAt(i)<='9')){
    			 errorID2();
    			 return;
    		 }
    	 }
    	 boolean a=errorID(year.getText());
         if(a)return;
         boolean b=errorID(month.getText());
         if(b)return;
         boolean c=errorID(day.getText());
         if(c)return;
         boolean d=errorID(zhongzhuan.getText());
         if(d)return;
         boolean e1=errorID(tiaoxingma.getText());
         if(e1)return;
         
    	 ExpressService es = new OrderIO();
         CourierOrderpo co;
 			try {
 				co = es.search(txmID);
 				if(co==null){
 					notExit(txmID);
 					return;
 				}
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}

 			QueryOrdervo qovo;
 			qovo = q.checkOrder(new Queryvo(tiaoxingma.getText()));
 			
 			try {
 				if(!rss.checkDate(receive1, qovo)){
 					dateError2();
 					return;
 				}
 			} catch (RemoteException e2) {
 				// TODO Auto-generated catch block
 				e2.printStackTrace();
 			}
 			
    	 Receivevo2 receive2 = new Receivevo2(zhuangtai);
    	 Receivevo receive = new Receivevo(receive1,receive2);
    	try {
            boolean a1 = rss.inputreceive(receive);
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

	private void errorID2() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "条形码号应全为数字！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void errorID() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "订单输入有误！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void notExit(String txmID) {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "不存在该订单"+txmID+"！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void jButton2ActionPerformed(ActionEvent evt) {
    	// TODO Auto-generated method stub
    	this.dispose();
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
            java.util.logging.Logger.getLogger(Receiveui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receiveui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receiveui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receiveui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Receiveui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chufa;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField month;
    private javax.swing.JTextField tiaoxingma;
    private javax.swing.JTextField year;
    private javax.swing.JTextField zhongzhuan;
    // End of variables declaration//GEN-END:variables
}
