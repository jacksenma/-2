/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.generalmanagerui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import blservice.generalmanagerblservice.ConstantFormulateService;
import RMI.client.RMIClient;

/**
 *
 * @author user
 */
public class modifycity extends javax.swing.JFrame {
	static ConstantFormulateService cfs;
    /**
     * Creates new form modifycity
     */
	String oldc;
    public modifycity(String s) throws Exception {
    	oldc=s;
        initComponents();
        setdefault(oldc);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        RMIClient.init();
        cfs = RMIClient.getConstantFormulateService();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    private void setdefault(String s) {
		// TODO Auto-generated method stub  
    	// String s= city1.getText()+"      距离     "+city2.getText()+"      "+distance.getText()+"      "+"km";
		String split1 []=s.split("      ");
		city1.setText(split1[0]);
		String split2 []=split1[1].split("     ");
		System.out.println(split2[0]);
		city2.setText(split2[1]);
		distance.setText(split1[2]);
	}

	/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        city1 = new javax.swing.JTextField();
        city2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        distance = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        modify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {  
      	  
      	  
        	public void windowClosing(WindowEvent e) {  
        	super.windowClosing(e);  
             try {
				new Newcontancyui().setVisible(true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	 }  
        	  
        	}); 
        jLabel1.setText("距离");

        jLabel2.setText("单位：km");

        delete.setText("删除该信息");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					deleteMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        modify.setText("保存修改");
        modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					modifyMouseClicked(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(city2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(32, 32, 32)
                .addComponent(modify)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(distance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(modify))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
    	cfs.deletecity(oldc);
    	JOptionPane.showMessageDialog(null, "删除成功", "成功", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteMouseClicked

    private void modifyMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_modifyMouseClicked
        // TODO add your handling code here:
    	String newc= city1.getText()+"      距离     "+city2.getText()+"      "+distance.getText()+"      "+"km";
    	if(!isvalid(distance.getText())){
    		JOptionPane.showMessageDialog(null, "格式错误或输入不完整", "失败", JOptionPane.ERROR_MESSAGE);
	    	return;
    	}
    	cfs.modifycity(oldc,newc);
    	JOptionPane.showMessageDialog(null, "修改成功", "成功", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_modifyMouseClicked

    private boolean isvalid(String text) {
		// TODO Auto-generated method stub
    	boolean result=true;
    	if(text.equals("")){
    		return false;
    	}
    	for(int i=0;i<text.length();i++){
    		if(!((text.charAt(i)<='9'&&text.charAt(i)>='0')||text.charAt(i)=='.'))
    			result=false;	
    	}
		return result;
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
            java.util.logging.Logger.getLogger(modifycity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifycity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifycity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifycity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new modifycity("").setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField city1;
    private javax.swing.JTextField city2;
    private javax.swing.JButton delete;
    private javax.swing.JTextField distance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton modify;
    // End of variables declaration//GEN-END:variables
}
