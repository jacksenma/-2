/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.mainui;

import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import RMI.client.RMIClient;
import blservice.administratorblservice.UserAuthorityManagerService;
import po.administratorpo.Rolepo;
import presentation.administratorui.AdministratorMainui;
import presentation.bushallsalmanui.BushallsalmanMainui;
import presentation.courierui.CourierMainui;
import presentation.financialmanui.FinancialmanMainui;
import presentation.financialmanui.LowFinancialmanMainui;
import presentation.generalmanagerui.GeneralManagerMainui;
import presentation.queryui.Queryui;
import presentation.stockmanagermanui.StockManagermanMainui;
import presentation.transitmanui.TransitmanMainui;
import vo.administratorvo.QueryMesvo;
import vo.administratorvo.QueryUservo;

/**
 *
 * @author user
 */
public class Mainui extends javax.swing.JFrame {

    /**
     * Creates new form Mainui
     */
	
	static UserAuthorityManagerService uams;
    public Mainui() {
        initComponents();
        try {
			RMIClient.init();
			uams = RMIClient.getUserAuthorityManagerService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Theme = new javax.swing.JLabel();
        QueryInfo = new javax.swing.JButton();
        StaffMessage = new javax.swing.JLabel();
        AccountInfo = new javax.swing.JLabel();
        PasswordInfo = new javax.swing.JLabel();
        Account = new javax.swing.JTextField();
        Signin = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Theme.setFont(new java.awt.Font("宋体", 3, 36)); // NOI18N
        Theme.setForeground(new java.awt.Color(0, 0, 102));
        Theme.setText("物流管理系统");

        QueryInfo.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        QueryInfo.setText("快递信息查询");
        QueryInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					QueryInfoMouseClicked(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        StaffMessage.setFont(new java.awt.Font("宋体", 1, 14)); // NOI18N
        StaffMessage.setText("员工登录：");

        AccountInfo.setText("账号：");

        PasswordInfo.setText("密码：");

        Signin.setText("登录");
        Signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SigninMouseClicked(evt);
            }
        });

        Exit.setText("退出");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(Theme, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(QueryInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StaffMessage)
                            .addComponent(AccountInfo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordInfo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Signin)
                                .addGap(36, 36, 36)
                                .addComponent(Exit))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Account)
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Theme, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QueryInfo)
                .addGap(32, 32, 32)
                .addComponent(StaffMessage)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountInfo)
                    .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordInfo)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Signin)
                    .addComponent(Exit))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void QueryInfoMouseClicked(java.awt.event.MouseEvent evt) throws RemoteException {//GEN-FIRST:event_QueryInfoMouseClicked

        Queryui q = new Queryui();
// TODO add your handling code here:
    }//GEN-LAST:event_QueryInfoMouseClicked

    private void SigninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SigninMouseClicked
        // TODO add your handling code here:
    	String ID = Account.getText();
    	try {
			QueryUservo quvo = uams.checkOrder(new QueryMesvo(ID));
			if(quvo == null) {
				errorID();
				return;
			}
			String passw = Password.getText();
			if(!passw.equals(quvo.getPassword())){
				errorPassw();
				return;
			}
			select(quvo);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_SigninMouseClicked
 

	private void select(QueryUservo quvo) {
		// TODO Auto-generated method stub
		if(quvo.getRole() == Rolepo.kdy)
			new CourierMainui(quvo.getID() , quvo.getName());
		else if(quvo.getRole() == Rolepo.gjcwy)
			new FinancialmanMainui(quvo.getID() , quvo.getName());
		else if(quvo.getRole() == Rolepo.gly)
			new AdministratorMainui(quvo.getID() , quvo.getName());
		else if(quvo.getRole() == Rolepo.ybcwy)
			new LowFinancialmanMainui(quvo.getID() , quvo.getName());
		else if(quvo.getRole() == Rolepo.yytywy)
			new BushallsalmanMainui(quvo.getID() , quvo.getName());
		else if(quvo.getRole() == Rolepo.zjl)
			new GeneralManagerMainui(quvo.getName() , quvo.getID());
		else if(quvo.getRole() == Rolepo.zzzxkcgly)
			try {
				new StockManagermanMainui(quvo.getID() , quvo.getName());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else if(quvo.getRole() == Rolepo.zzzxywy)
			new TransitmanMainui(quvo.getID() , quvo.getName());
	}

	private void errorPassw() {
		// TODO Auto-generated method stub
    	JOptionPane.showMessageDialog(null, "密码错误！", "输入有误", JOptionPane.ERROR_MESSAGE);
	}

	private void errorID(){
        JOptionPane.showMessageDialog(null, "不存在此账户！", "输入有误", JOptionPane.ERROR_MESSAGE);
    }
    
    
     /* @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Mainui m = new Mainui();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Account;
    private javax.swing.JLabel AccountInfo;
    private javax.swing.JButton Exit;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordInfo;
    private javax.swing.JButton QueryInfo;
    private javax.swing.JButton Signin;
    private javax.swing.JLabel StaffMessage;
    private javax.swing.JLabel Theme;
    // End of variables declaration//GEN-END:variables
}
