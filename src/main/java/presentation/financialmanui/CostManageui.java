/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.financialmanui;

import java.text.SimpleDateFormat;
import java.util.Date;

import RMI.client.RMIClient;
import blservice.financialmanblservice.CostManageService;
import blservice.financialmanblservice.StatisticsListService;
import vo.financialmanvo.PaymentInputvo;
import vo.financialmanvo.RecieveListvo;

/**
 *
 * @author user
 */
public class CostManageui extends javax.swing.JFrame {
	static CostManageService cm;
	static StatisticsListService sm;
    /**
     * Creates new form CostManageui
     * @throws Exception 
     */
    public CostManageui() throws Exception {
    	 initComponents();
         this.setLocationRelativeTo(null);
         setResizable(false);
         this.setVisible(true);
         RMIClient.init();
         cm = RMIClient.getCostManageService();
         sm = RMIClient.getStatisticsListService();
    }
    static final String ss[] = new String [100];//计算合计收款单
    static final String sp[] = new String [100];//计算合计付款单
    static  int count=0;
    static  int chu=0;
    
    private void SearchAll1(RecieveListvo[] uv){
//    	   final String s[] = new String [100];
    	int j1=0;
    	   if(uv!=null){	   
    	   for(int i=0;i<uv.length;i++){
    		   ss[i]=uv[i].moneyq;
    		   j1++;
    				  
    	   }
    	   count=j1;
    	  
    	    }}
     
     private void SearchAll2(PaymentInputvo[] pv){
//    	   final String s1[] = new String [100];
    	 int j2=0;
    	   if(pv!=null){	   
    	   for(int i=0;i<pv.length;i++){
    		   sp[i]=pv[i].pay.money;
    		   j2++;
    				   
    	 
    	    }
    	   chu=j2;
    	   }}

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
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("查看收款单");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("新建付款单");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("成本收益表");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					jButton3MouseClicked(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton5.setText("退出");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jButton5)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jButton2)
                .addGap(28, 28, 28)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
      // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) throws Exception {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    	 Date dt=new Date();
         SimpleDateFormat matter1=new SimpleDateFormat("yyyy");
         SimpleDateFormat matter2=new SimpleDateFormat("MM");
         SimpleDateFormat matter3=new SimpleDateFormat("dd");
         String s=matter1.format(dt);
         String year2=matter1.format(dt);
         String month2=matter2.format(dt);
         String day2=matter3.format(dt);
         System.out.println(matter1.format(dt));
         System.out.println(matter2.format(dt));
         System.out.println(matter3.format(dt));
         SearchAll1(sm.SearchReceive("0","0","0",
     			year2,month2,day2));
     	 SearchAll2(sm.SearchPay("0","0","0",
     			year2,month2,day2));
     	 
     	
     	 int result[]=new int[3];
     	 result=cm.getIncome(ss,sp,count,chu);
         
//     	new CostIncome().setVisible(true);     
   new CostIncome(result[0],result[1],result[2],year2,month2,day2).setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
			new PaymentList().setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try {
			new CheckGathering().setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(CostManageui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CostManageui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CostManageui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CostManageui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new CostManageui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
