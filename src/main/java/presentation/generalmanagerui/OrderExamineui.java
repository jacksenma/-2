﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.generalmanagerui;

import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import presentation.bushallsalmanui.ChangeCarLoading;
import presentation.bushallsalmanui.ChangeCashRegister;
import presentation.bushallsalmanui.ChangeReceive;
import presentation.bushallsalmanui.ChangeSend;
import presentation.financialmanui.CheckPaymentListui;
import presentation.stockmanagermanui.ChangeOutFromStock;
import presentation.stockmanagermanui.ChangePutInStore;
import blservice.generalmanagerblservice.OrderExamineService;
import RMI.client.RMIClient;

/**
 *
 * @author user zr
 */
public class OrderExamineui extends javax.swing.JFrame {

    /**
     * Creates new form OrderExamineui
     * @throws Exception 
     */
	
static OrderExamineService oes;
    public OrderExamineui() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        oes = RMIClient.getOrderExamineService();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
public void showbytype(String s[],String type){                 //显示待审批的单据
	final String news[];
	if(s==null||s.length==0){
		 news= new String[1];
		 news[0]="无";
		 System.out.println("无待审批");
	}else{
		System.out.println("有待审批");
       news = new String[s.length];
	for(int i=0;i<s.length;i++){
	   news[i]=type+"     "+s[i]+"     未审批";	
	}	
	 }
	   jList1.setModel(new javax.swing.AbstractListModel() {
           String[] strings = news;
           public int getSize() { return strings.length; }
           public Object getElementAt(int i) { return strings[i]; }
       });
	   jScrollPane1.setViewportView(jList1);


        final Window w =this;
        MouseAdapter mouseListener = new MouseAdapter() { 
    public void mouseClicked(MouseEvent mouseEvent) { 
      JList theList = (JList) mouseEvent.getSource(); 
      if (mouseEvent.getClickCount() == 2) { 
        int index = theList.locationToIndex(mouseEvent.getPoint()); 
        if (index >= 0) { 
          Object o = theList.getModel().getElementAt(index); 
         try {
			openorder((String)o);
//			System.out.println("qaq");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        } 
      } 
    }

	private void openorder(String o) throws Exception {                   //显示单据的具体信息
		// TODO Auto-generated method stub
		String split[] = o.split("     ");
		System.out.println(split[0]);
		switch(split[0]){
		case"快递单":break;
		case"营业厅到达单":new ChangeReceive(split[1]).setVisible(true); break;
		case"装车单":new ChangeCarLoading(split[1]).setVisible(true);break;
		case"收款单":new ChangeCashRegister(split[1]).setVisible(true);break;
		case"中转单":break;
		case"派件单":new ChangeSend(split[1]).setVisible(true); break;
		case"中转中心到达单":break;
		case"入库单":new ChangePutInStore(split[1]).setVisible(true);break;
		case"出库单":new ChangeOutFromStock(split[1]).setVisible(true);break;
		case"付款单":new CheckPaymentListui(split[1]).setVisible(true);break;
		}
	} 
};
  jList1.addMouseListener(mouseListener); 
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        selectall = new javax.swing.JButton();
        approve = new javax.swing.JButton();
        expressorder = new javax.swing.JButton();
        zhuangcheorder = new javax.swing.JButton();
        bushallorder = new javax.swing.JButton();
        shoukuanorder = new javax.swing.JButton();
        zhongzhuanorder = new javax.swing.JButton();
        paijianorder = new javax.swing.JButton();
        zhongzhuanzhongxinorder = new javax.swing.JButton();
        instockorder = new javax.swing.JButton();
        outstockorder = new javax.swing.JButton();
        paymentorder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        selectall.setText("全选");
        selectall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectallMouseClicked(evt);
            }
        });

        approve.setText("审批通过");
        approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					approveMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        expressorder.setText("快递单");
        expressorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					expressorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        zhuangcheorder.setText("装车单");
        zhuangcheorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					zhuangcheorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        bushallorder.setText("营业厅到达单");
        bushallorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					bushallorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        shoukuanorder.setText("收款单");
        shoukuanorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					shoukuanorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        zhongzhuanorder.setText("中转单");
        zhongzhuanorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					zhongzhuanorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        paijianorder.setText("派件单");
        paijianorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					paijianorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        zhongzhuanzhongxinorder.setText("中转中心到达单");
        zhongzhuanzhongxinorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					zhongzhuanzhongxinorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        instockorder.setText("入库单");
        instockorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					instockorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        outstockorder.setText("出库单");
        outstockorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					outstockorderMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        paymentorder.setText("付款单");
        paymentorder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					paymentorderMouseClicked(evt);
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bushallorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zhuangcheorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expressorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shoukuanorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zhongzhuanorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paijianorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zhongzhuanzhongxinorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instockorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outstockorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(selectall)
                        .addGap(18, 18, 18)
                        .addComponent(approve))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(expressorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zhuangcheorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bushallorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shoukuanorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zhongzhuanorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paijianorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(zhongzhuanzhongxinorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instockorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outstockorder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paymentorder)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectall)
                            .addComponent(approve)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void selectallMouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
    	int indices[] = new int[jList1.getModel().getSize()];
    	for(int i = 0;i<jList1.getModel().getSize();i++)
    		indices[i]=i;
   	 jList1.setSelectedIndices(indices);
	}


	private void expressorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_expressorderMouseClicked
    // TODO add your handling code here:
    	showbytype(oes.showexpressorder(),"快递单");
    }//GEN-LAST:event_expressorderMouseClicked

    private void zhuangcheorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_zhuangcheorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showcarloadingorder(),"装车单");
    }//GEN-LAST:event_zhuangcheorderMouseClicked

    private void bushallorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_bushallorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showyingyetingorder(),"营业厅到达单");
    }//GEN-LAST:event_bushallorderMouseClicked

    private void shoukuanorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_shoukuanorderMouseClicked
        // TODO add your handling code here
    	showbytype(oes.showshoukuanorder(),"收款单");
    }//GEN-LAST:event_shoukuanorderMouseClicked

    private void zhongzhuanorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_zhongzhuanorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showzhongzhuanorder(),"中转单");
    }//GEN-LAST:event_zhongzhuanorderMouseClicked

    private void paijianorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_paijianorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showpaijianorder(),"派件单");
    }//GEN-LAST:event_paijianorderMouseClicked

    private void zhongzhuanzhongxinorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_zhongzhuanzhongxinorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showzhongzhuanzhongxinorder(),"中转中心到达单");
    }//GEN-LAST:event_zhongzhuanzhongxinorderMouseClicked

    private void instockorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_instockorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showinstockorder(),"入库单");
    }//GEN-LAST:event_instockorderMouseClicked

    private void outstockorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_outstockorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showoutstockorder(),"出库单");
    }//GEN-LAST:event_outstockorderMouseClicked

    private void paymentorderMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_paymentorderMouseClicked
        // TODO add your handling code here:
    	showbytype(oes.showpaymentorder(),"付款单");
    }//GEN-LAST:event_paymentorderMouseClicked

    private void approveMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_paymentorderMouseClicked
        // TODO add your handling code here:
    	int selected[] = jList1.getSelectedIndices();
    	int length=selected.length;
		for(int i=0;i<length;i++){
			approve((String)jList1.getModel().getElementAt(i));
			length--;
			i--;
		}
		JOptionPane.showMessageDialog(null, "审批成功", "成功", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_paymentorderMouseClicked

	private void approve(String s) throws RemoteException {
		// TODO Auto-generated method stub
		String split[] = s.split("     ");
	switch(split[0]){
	case "快递单":oes.approveexpressorder(split[1]); showbytype(oes.showexpressorder(),"快递单"); 
	break;
	case "装车单":oes.approvecarloadingorde(split[1]); showbytype(oes.showcarloadingorder(),"装车单");
    break;         
	case "营业厅到达单":oes.approvecarloadingorde(split[1]);showbytype(oes.showyingyetingorder(),"营业厅到达单"); 
    break;  
	case "收款单":oes.approvecarshoukuanorder(split[1]); showbytype(oes.showshoukuanorder(),"收款单");
    break;  
	case "中转单":oes.approvezhongzhuanorder(split[1]); showbytype(oes.showzhongzhuanorder(),"中转单");
    break;  
	case "派件单":oes.approvepaijianorder(split[1]);showbytype(oes.showpaijianorder(),"派件单"); showbytype(oes.showpaijianorder(),"派件单");
    break;  
	case "中转中心到达单":oes.approvezhongzhuanzhongxinorder(split[1]); showbytype(oes.showzhongzhuanzhongxinorder(),"中转中心到达单");
    break;  
	case "入库单":oes.approveinstockorder(split[1]); showbytype(oes.showinstockorder(),"入库单");
    break;  
	case "出库单":oes.approveoutstockorder(split[1]); showbytype(oes.showoutstockorder(),"出库单");
    break;  
	case "付款单":oes.approvepaymentorder(split[1]); showbytype(oes.showpaymentorder(),"付款单");
    break;  
                
	}
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
            java.util.logging.Logger.getLogger(OrderExamineui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderExamineui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderExamineui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderExamineui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new OrderExamineui().setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve;
    private javax.swing.JButton bushallorder;
    private javax.swing.JButton expressorder;
    private javax.swing.JButton instockorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton outstockorder;
    private javax.swing.JButton paijianorder;
    private javax.swing.JButton paymentorder;
    private javax.swing.JButton selectall;
    private javax.swing.JButton shoukuanorder;
    private javax.swing.JButton zhongzhuanorder;
    private javax.swing.JButton zhongzhuanzhongxinorder;
    private javax.swing.JButton zhuangcheorder;
    // End of variables declaration//GEN-END:variables
}
