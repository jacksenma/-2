/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.financialmanui;

import java.rmi.RemoteException;

import javax.swing.ListSelectionModel;

import RMI.client.RMIClient;
import blservice.financialmanblservice.AccountManageService;
import vo.financialmanvo.AccountManagevo;
import vo.financialmanvo.AccountMesvo;
import vo.financialmanvo.AccountUservo;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;

/**
 *
 * @author user
 */
public class QueryAccount extends javax.swing.JFrame {
	static AccountManageService as;
    /**
     * Creates new form QueryAccount
     * @throws Exception 
     */
    public QueryAccount() throws Exception {
    	 initComponents();
         this.setLocationRelativeTo(null);
         this.setVisible(true);
         error.setVisible(false);
         xsz.setVisible(false);
         RMIClient.init();
         as= RMIClient.getAccountManageService();
    }
    
    
    static String jqRe[]=new String [100];//记录收款
    static String jqPay[]=new String [100];//记录付款
    static int jqRecount=0;//记录次数
    static int jqPaycount=0;//同上
    
    private void SearchAll1(RecieveListvo[] uv){
//    	   final String s[] = new String [100];
    	   int j=0;
    	   if(uv!=null){	   
    	   for(int i=0;i<uv.length;i++){
//    		   s[i]=uv[i].Zhanghu+"  "+uv[i].moneyq;
    		   jqRe[i]=uv[i].moneyq;
    		   j++;
//    		   System.out.println(s[i]+"    "+jqRe[i]);
    	   }
    	   jqRecount=j;
    	   System.out.println(jqRecount+"usagidscd");
    	    }}
     
     private void SearchAll2(PaymentInputvo[] pv){
//    	   final String s1[] = new String [100];
    	   int x=0;
    	   if(pv!=null){	   
    	   for(int i=0;i<pv.length;i++){
//    		   s1[i]=pv[i].pay.account+"   "+pv[i].pay.money;
    		   jqPay[i]=pv[i].pay.money;
    		   x++;
//    		   System.out.println(s1[i]+",,,,,,,,,"+jqPay[i]);
    	   }
    	  jqPaycount=x;
    	  System.out.println(jqPaycount+"mmmmmmmmmmmmm");
    	    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void AllSearch(AccountManagevo[] uv){
  	    final String s[] = new String [100];
  	    int  allMoney=0;
    	if(uv.length==0){
    		this.error.setText("未找到账户");
    		this.error.setVisible(true);
    		return;
    	}
    	else this.error.setVisible(false);
  	   if(uv!=null){	   
  	   for(int i=0;i<uv.length;i++){
  		 try {
  			 System.out.println(uv[i].accountName);
			SearchAll1(as.searchRe(uv[i].accountName));
			SearchAll2(as.searchPay(uv[i].accountName));
			int Re=0;
	    	for(int w=0;w<jqRecount;w++){
	    		System.out.println(jqRe[w]);
	    		Re+=Integer.parseInt(jqRe[w]);
	    	}
	    	System.out.println("...");
	    	int Pay=0;
	    	for(int qw=0;qw<jqPaycount;qw++){
	    		Pay+=Integer.parseInt(jqPay[qw]);
	    	}
	    	if (!uv[i].money.equals("")){
	    	int zong=Integer.parseInt(uv[i].money)+Re-Pay;
	    	allMoney+=zong;
	    	s[i]=uv[i].accountName+"                                                "+zong+"元";}
	    	
	    		
//	    	System.out.println(zong+"zzzzzzzzzzzzzzzzzz");
	    	
//		  if(i!=uv.length-1)
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		 xsz.setText("所有账户金额总和：   "+allMoney+" 元");
  		 xsz.setVisible(true);
  		 jList1.setModel(new javax.swing.AbstractListModel() {
             String[] strings = s;
             public int getSize() { return strings.length; }
             public Object getElementAt(int i) { return strings[i]; }
         });
  	   jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
  	    jScrollPane1.setViewportView(jList1);
  		   
//  		   s[i]=uv[i].ID+kong(uv[i].ID,uv[i+1].ID)+uv[i].Mima+"                     "+uv[i].Name+"                     "+uv[i].Type;
  	   }
  	  
  	    }}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        keywords = new javax.swing.JTextField();
        queryM = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        all = new javax.swing.JButton();
        xsz = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jq = new javax.swing.JTextField();
        queryJ = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("输入关键字（模糊查找）：");

        queryM.setText("模糊查找");
        queryM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					queryMMouseClicked(evt);
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

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel3.setText("账户名称");

        jLabel4.setText("账户余额");

        all.setText("显示全部账户信息");
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					allMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        xsz.setText("总金额：");

        jLabel5.setText("输入账户名称（精确查找）：");

        queryJ.setText("精确查找");
        queryJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					queryJMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("未找到账户");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(keywords, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(jq))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(queryM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(queryJ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xsz)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(all)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(95, 140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(error)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(keywords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryM)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xsz)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(all))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void queryMMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_queryMMouseClicked
        // TODO add your handling code here:
    	System.out.println(jq.getText());
    	System.out.println(keywords.getText());
    	
    	AllSearch(as.searchMo(keywords.getText()));
    	keywords.setText("");
    }//GEN-LAST:event_queryMMouseClicked

    private void allActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
    	
    }//GEN-LAST:event_allActionPerformed

    private void allMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_allMouseClicked
        // TODO add your handling code here:
    	AllSearch(as.searchAll());
    	}//GEN-LAST:event_allMouseClicked

    private void queryJMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_queryJMouseClicked
        // TODO add your handling code here:
    	//精确查找
    	System.out.println(keywords.getText());
    	System.out.println(jq.getText());
    	SearchAll1(as.searchRe(jq.getText()));
    	SearchAll2(as.searchPay(jq.getText()));
    	String nameOfAccount=jq.getText();
    	AccountMesvo qvo=new AccountMesvo(nameOfAccount);
        AccountUservo avo=as.findUsers(qvo);
    	if(avo == null) {
            error.setText("不存在该账户！");
            this.error.setVisible(true);
            return;
        }
        try {
        	int Re=0;
        	for(int i=0;i<jqRecount;i++){
        		Re+=Integer.parseInt(jqRe[i]);
        	}
        	int Pay=0;
        	for(int i=0;i<jqPaycount;i++){
        		Pay+=Integer.parseInt(jqPay[i]);
        	}
        	System.out.println(Re+"     "+Pay);
        	int m=(Integer.parseInt(avo.getMoney())+Re-Pay);
        	
        	
        	System.out.println(avo.getaccountName());
        	System.out.println(avo.getMoney());
        	new QueryMes(avo.getaccountName(),m).setVisible(true);
 	} catch (Exception e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
        jq.setText("");
    	
    	
//    	new QueryMes().setVisible(true);
    }//GEN-LAST:event_queryJMouseClicked

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
            java.util.logging.Logger.getLogger(QueryAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new QueryAccount().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jq;
    private javax.swing.JTextField keywords;
    private javax.swing.JButton queryJ;
    private javax.swing.JButton queryM;
    private javax.swing.JLabel xsz;
    // End of variables declaration//GEN-END:variables
}
