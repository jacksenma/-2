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
import javax.swing.ListSelectionModel;

import RMI.client.RMIClient;
import blservice.financialmanblservice.CostManageService;
import presentation.courierui.PriceAndTimeui;
import vo.financialmanvo.RecieveListvo;
import vo.financialmanvo.Recordvo;
//import blservice.generalmanagerblservice.RecordService;

/**
 *
 * @author user
 */

public class recordui extends javax.swing.JFrame {
    /**
     * Creates new form recordui
     */
	static CostManageService rs;
	
	
	Date date=new Date();
	DateFormat format=new SimpleDateFormat("yyyy");
	String time1=format.format(date);

	Date date2=new Date();
	DateFormat format2=new SimpleDateFormat("MM");
	String time2=format2.format(date2);

	Date date3=new Date();
	DateFormat format3=new SimpleDateFormat("dd");
	String time3=format3.format(date3);
	
	
	static String name;
    public recordui(String n) throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setVisible(true);
        RMIClient.init();
        rs = RMIClient.getCostManageService();
        year.setText(time1);
        month.setText(time2);
        day.setText(time3);
        name=n;
    }
    
    private void SearchAllRecord(Recordvo[] rv){
 	   final String s[] = new String [100];
// 	   int j=0;
 	   if(rv!=null){	   
 	   for(int i=0;i<rv.length;i++){
 		   s[i]=rv[i].year+"  年       "+rv[i].month+"  月       "+rv[i].day+"  日"+"                                        "+rv[i].behavior;
 		   System.out.println(s[i]);
// 		   j++;
// 		   System.out.println(s[i]+"    "+jqRe[i]);
 	   }
 	  jList1.setModel(new javax.swing.AbstractListModel() {
          String[] strings = s;
          public int getSize() { return strings.length; }
          public Object getElementAt(int i) { return strings[i]; }
      });
	   jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    jScrollPane1.setViewportView(jList1);
 	    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save = new javax.swing.JButton();
        all = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        behavior = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        save.setText("保存");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        all.setText("查看所有记录");
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

        jLabel2.setText("记录重要操作的时间和具体操作");

        jLabel3.setText("具体时间：");

        jLabel4.setText("具体操作：");

        jLabel5.setText("年");

        jLabel6.setText("月");

        jLabel7.setText("日");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("具体时间");

        jLabel8.setText("具体操作");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(behavior, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(31, 31, 31))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(all))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)))
                                .addGap(34, 34, 34)
                                .addComponent(save)))
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(save))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(behavior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(all)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
    	String mes1=year.getText();
    	String mes2=month.getText();
    	String mes3=day.getText();
    	String mes4=name+":"+behavior.getText();
    	
    	//完整性
    	if(mes1.equals("")||mes2.equals("")||mes3.equals("")||mes4.equals("")){
    		missMes();
    		return;
    		}
    	
    	//非法字符
    	for(int i=0;i<mes1.length();i++){
    		if('0'>mes1.charAt(i)||mes1.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	for(int i=0;i<mes2.length();i++){
    		if('0'>mes2.charAt(i)||mes2.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	for(int i=0;i<mes3.length();i++){
    		if('0'>mes3.charAt(i)||mes3.charAt(i)>'9'){
    			Wrong();
    		    return;
    		}
    	}
    	
    	//时间判断
    	
		
		if(Integer.parseInt(time1)<Integer.parseInt(mes1)||Integer.parseInt(time2)<Integer.parseInt(mes2)||
    			Integer.parseInt(time3)<Integer.parseInt(mes3)){
    		WrongTime();
    		return;
    	}
    	
    	Recordvo rvo=new Recordvo(mes1, mes2, mes3, mes4);
    	 try {
             boolean b = rs.record(rvo);
             if(b){
                 System.out.println("成功！");
                 JOptionPane.showMessageDialog(null, "增加操作记录成功", "成功", 
                 		JOptionPane.INFORMATION_MESSAGE);
//                 SearchAllRecord(rs.AllRecordSearch());
//                 this.dispose();
             }
             else{
                 JOptionPane.showMessageDialog(null, "写入失败", "已存在相同账户！", 
                 		JOptionPane.ERROR_MESSAGE);
             }
             year.setText("");
             month.setText("");
             day.setText("");
             behavior.setText("");
             // TODO add your handling code here:
         } catch (RemoteException ex) {
             Logger.getLogger(PriceAndTimeui.class.getName()).log(Level.SEVERE, null, ex);
         }
    	
    	
    }//GEN-LAST:event_saveMouseClicked
    private void Wrong(){
   	 JOptionPane.showMessageDialog(null, "非法字符", "输入有误", JOptionPane.ERROR_MESSAGE);
   }
   private void WrongTime(){
   	 JOptionPane.showMessageDialog(null, "请输入正确时间","输入有误",  JOptionPane.ERROR_MESSAGE);
   }
   private void missMes(){
     	 JOptionPane.showMessageDialog(null, "信息输入不完整","输入有误", JOptionPane.ERROR_MESSAGE);
     }

    private void allMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_allMouseClicked
        // TODO add your handling code here:
//    	String mes1=year.getText();
//    	String mes2=month.getText();
//    	String mes3=day.getText();
//    	String mes4=behavior.getText();
//    	Recordvo rvo=new Recordvo(mes1, mes2, mes3, mes4);
    	SearchAllRecord(rs.AllRecordSearch());
//    	System.out.println("zz");
    	
    	
    	
    }//GEN-LAST:event_allMouseClicked

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
            java.util.logging.Logger.getLogger(recordui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all;
    private javax.swing.JTextField behavior;
    private javax.swing.JTextField day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField month;
    private javax.swing.JButton save;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
