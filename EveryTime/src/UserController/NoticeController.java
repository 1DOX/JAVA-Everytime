/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserController;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.databaseSQL;
import javax.swing.table.DefaultTableModel;
import SingletonPattern.UserInfo;
import TemplateMethodPattern.normal;
import TemplateMethodPattern.updateTable;

public class NoticeController extends databaseSQL {
    /**
     * Creates new form NoticeController
     */
    UserInfo userinfo = UserInfo.getInstance();
    
    public NoticeController() {
        initComponents();
        updateTable();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NoticeTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        deleteContent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("휴먼편지체", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        jLabel2.setText("알림");

        NoticeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "종류", "내용","날짜"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [0];
            }
        });
        jScrollPane1.setViewportView(NoticeTable);
        if (NoticeTable.getColumnModel().getColumnCount() > 0) {
            NoticeTable.getColumnModel().getColumn(0).setResizable(false);
            NoticeTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteContent.setBackground(new java.awt.Color(153, 0, 0));
        deleteContent.setFont(new java.awt.Font("맑은 고딕", 0, 15)); // NOI18N
        deleteContent.setForeground(new java.awt.Color(255, 255, 255));
        deleteContent.setText("삭 제");
        deleteContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteContent)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(deleteContent))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new MainPageController().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteContentActionPerformed
        // 삭제 버튼
        try {
        dbLoad();
        try {
            int row = NoticeTable.getSelectedRow();
            deleteData("notice", "receiverNum", "noticeContent", userinfo.UserNum, (String)NoticeTable.getValueAt(row, 1));
             JOptionPane.showMessageDialog(this, "선택된 알림 삭제완료", "메세지", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "sql오류 : ."+ex, "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
        updateTable();
        dbClose();
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "삭제할 알림을 선택하세요", "메세지", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_deleteContentActionPerformed

    private void updateTable() {
        // 현재 사용자가 받은 알림들을 보여줌
        DefaultTableModel model = (DefaultTableModel) NoticeTable.getModel(); // DefaultTableModel클래스로 테이블의 모델을 get
        model.setNumRows(0);
        updateTable tb = new normal();
        tb.upTable("notice" , "receiverNum" , "noticeType" ,"noticeContent", "noticeDate");
       
       for(int i=0; i < tb.columndata1.size() ; i++) {
           Object data[] = {tb.columndata1.get(i),tb.columndata2.get(i), tb.columndata3.get(i)};
           model.addRow(data);
        }
        
        NoticeTable.getTableHeader().setReorderingAllowed(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NoticeTable;
    private javax.swing.JButton deleteContent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
