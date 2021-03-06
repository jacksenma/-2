/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.queryui;

import java.rmi.RemoteException;

import RMI.client.RMIClient;
import blservice.queryblservice.QueryService;
import businesslogic.expressbl.Expressbl;
import vo.queryvo.QueryOrdervo;
import vo.queryvo.Queryvo;

/**
 *
 * @author user
 */
public class Queryui extends javax.swing.JFrame {

    /**
     * Creates new form Queryui
     */
    static QueryService q;
    
    public Queryui() throws RemoteException {
        initComponents();
        q = RMIClient.getQueryService();
        this.error.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("订单号");

        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });

        check.setText("查询");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					checkActionPerformed(evt);
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        exit.setText("返回");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("找不到该订单！");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(check)
                        .addGap(57, 57, 57)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error)
                            .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(error)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check)
                    .addComponent(exit))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) throws RemoteException {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        error.setVisible(false);
        String s = number.getText();
        if(s.equals("")){
            error.setText("订单格式应该为10位数！");
            error.setVisible(true);
            return;
        }
        Queryvo qvo = new Queryvo(s);
        if(!q.isValid(s)){
            error.setText("订单格式应该为10位数！");
            error.setVisible(true);
            return;
        }
        for(int i = 0 ; i < s.length(); i++){
        	if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
        		error.setText("订单格式应该为数字！");
                error.setVisible(true);
                return;
        	}
        }
        QueryOrdervo qovo = q.checkOrder(qvo);
        if(qovo == null) {
            error.setText("不存在该订单！");
            this.error.setVisible(true);
            return;
        }
        new QueryResultui(qovo);
        number.setText("");
    }//GEN-LAST:event_checkActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JLabel error;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField number;
    // End of variables declaration//GEN-END:variables
}
