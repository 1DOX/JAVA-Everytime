package UserController;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import MementoPattern.CareTaker;
import MementoPattern.Originator;
import java.text.DecimalFormat;
import static javax.swing.JOptionPane.showMessageDialog;


public  class ScoreCalculController extends javax.swing.JFrame implements MouseListener, KeyListener,ListSelectionListener {
   String tmp;
    
    public ScoreCalculController() {
        initComponents();
        LoadData.addMouseListener(this);
        Calculation.addMouseListener(this);
        Save.addMouseListener(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Score1 = new javax.swing.JComboBox<>();
        Score3 = new javax.swing.JComboBox<>();
        Score4 = new javax.swing.JComboBox<>();
        Score6 = new javax.swing.JComboBox<>();
        Score7 = new javax.swing.JComboBox<>();
        Score8 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Calculation = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        TotalCredit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Score2 = new javax.swing.JComboBox<>();
        Score5 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        LoadCredit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        LoadData = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("???????????????", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Everytime");

        jLabel2.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 14)); // NOI18N
        jLabel2.setText("?????? ?????????");

        Score1.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score3.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score4.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score6.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score7.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score8.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        jLabel3.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        jLabel3.setText("??????");

        jLabel4.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        jLabel4.setText("??????");

        Calculation.setBackground(new java.awt.Color(153, 0, 0));
        Calculation.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Calculation.setForeground(new java.awt.Color(255, 255, 255));
        Calculation.setText("????????????");
        Calculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculationActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 12)); // NOI18N
        Back.setText("????????????");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        TotalCredit.setFont(new java.awt.Font("?????? ??????", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        jLabel5.setText("??????");

        jLabel6.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        jLabel6.setText("??????");

        jLabel7.setFont(new java.awt.Font("?????? ??????", 0, 15)); // NOI18N
        jLabel7.setText("???????????? :");

        Score2.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        Score5.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Score5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "??????", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" }));

        LoadCredit.setFont(new java.awt.Font("?????? ??????", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("?????? ??????", 0, 15)); // NOI18N
        jLabel9.setText("????????? :");

        LoadData.setBackground(new java.awt.Color(153, 0, 0));
        LoadData.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        LoadData.setForeground(new java.awt.Color(255, 255, 255));
        LoadData.setText("????????????");
        LoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadDataActionPerformed(evt);
            }
        });

        Save.setBackground(new java.awt.Color(153, 0, 0));
        Save.setFont(new java.awt.Font("?????? ?????? Semilight", 0, 15)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("??????");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel3)
                            .addGap(59, 59, 59)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Score1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Score2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(TotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Calculation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Save)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Score6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Score7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Score8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Score5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(20, 20, 20)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LoadCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LoadData)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(Back, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Score5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Score8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(LoadCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoadData)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Calculation)
                        .addComponent(Save)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculationActionPerformed
        //?????? ??????
        String C1 =c1.getText().toString();
        if (C1.isEmpty()==true){
            C1 = "0";
        }
        String C2 = c2.getText().toString();
        if (C2.isEmpty()==true){
            C2 = "0";
        }
        String C3 =c3.getText().toString(); 
        if (C3.isEmpty()==true){
            C3 = "0";
        }
        String C4 = c4.getText().toString(); 
        if (C4.isEmpty()==true){
            C4 = "0";
        }
        String C5 =c5.getText().toString();
        if (C5.isEmpty()==true){
            C5 = "0";
        }
        String C6 = c6.getText().toString();
        if (C6.isEmpty()==true){
            C6 = "0";
        }
        String C7 =c7.getText().toString();
        if (C7.isEmpty()==true){
            C7 = "0";
        }
        String C8 = c8.getText().toString();
        if (C8.isEmpty()==true){
            C8 = "0";
        }     

        String[] carray = {C1,C2,C3,C4,C5,C6,C7,C8};

        double result = 0;
        //???????????? ??????
        String s1= Score1.getSelectedItem().toString();
        if (s1=="??????"){
            s1 = "";
        } 
        String s2= Score2.getSelectedItem().toString();
        if (s2=="??????"){
            s2 = "";
        }
        String s3= Score3.getSelectedItem().toString();
        if (s3=="??????"){
            s3 = "";
        }
        String s4= Score4.getSelectedItem().toString();
        if (s4=="??????"){
            s4 = "";
        }
        String s5= Score5.getSelectedItem().toString();
        if (s5=="??????"){
            s5 = "";
        }
        String s6= Score6.getSelectedItem().toString();
        if (s6=="??????"){
            s6 = "";
        }
        String s7= Score7.getSelectedItem().toString();
        if (s7=="??????"){
            s7 = "";
        }
        String s8= Score8.getSelectedItem().toString();
        if (s8=="??????"){
            s8 = "";
        }
        String[] ss = {s1,s2,s3,s4,s5,s6,s7,s8};
       
        double[] CC = new double[carray.length];
        for (int i=1;i<=carray.length;i++){
            CC[i-1] = Double.parseDouble(carray[i-1]);
        }
        double[] q = new double[carray.length];

       for (int i=1;i<=carray.length;i++){
        if (ss[i-1].equals("A+")){
            q[i-1] = 4.5 * CC[i-1];
        }else if(ss[i-1].equals("A0")){
            q[i-1] = 4* CC[i-1];
        }else if(ss[i-1].equals("B+")){
            q[i-1] = 3.5 * CC[i-1];
        }else if(ss[i-1].equals("B0")){
            q[i-1] = 3 * CC[i-1];
        }else if(ss[i-1].equals("C+")){
            q[i-1] = 2.5 * CC[i-1];
        }else if(ss[i-1].equals("C0")){
            q[i-1] = 2 * CC[i-1];
        }else if(ss[i-1].equals("D+")){
            q[i-1] = 1.5 * CC[i-1];
        }else if(ss[i-1].equals("D0")){
            q[i-1] = 1 * CC[i-1];
        }else if(ss[i-1].equals("F")){
            q[i-1] = 0;
        }else{
            q[i-1] = 0;
        }
        result += q[i-1];

        }
       
       double sum = 0;
       int sum2 = 0;
        for (int i=0;i<CC.length;i++){
            sum2 += CC[i];
        }
        
        DecimalFormat form = new DecimalFormat("#.##");
        double re= result/sum2;
        String re3 = form.format(re);
        TotalCredit.setText(re3);
        
    //?????? ???*/
    }//GEN-LAST:event_CalculationActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void LoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadDataActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

    }//GEN-LAST:event_SaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Calculation;
    private javax.swing.JTextField LoadCredit;
    private javax.swing.JButton LoadData;
    private javax.swing.JButton Save;
    private javax.swing.JComboBox<String> Score1;
    private javax.swing.JComboBox<String> Score2;
    private javax.swing.JComboBox<String> Score3;
    private javax.swing.JComboBox<String> Score4;
    private javax.swing.JComboBox<String> Score5;
    private javax.swing.JComboBox<String> Score6;
    private javax.swing.JComboBox<String> Score7;
    private javax.swing.JComboBox<String> Score8;
    private javax.swing.JTextField TotalCredit;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
         
        if(e.getSource()==Save){   //????????? ?????? ??????
            int result = JOptionPane.showConfirmDialog(null, "????????? ?????? ???????????????????.","Save",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.CLOSED_OPTION || result ==JOptionPane.NO_OPTION){
            }
            else if(result==JOptionPane.YES_OPTION){
         Originator org = new Originator(); 
         CareTaker ct = new CareTaker();
         org.SetState(TotalCredit.getText());
         ct.add(org.saveStateToMemento()); //??????
         tmp = org.GetState();
         showMessageDialog(null,"????????????!");
            }
        }
        if(e.getSource()==LoadData){
            if (tmp==null){
             showMessageDialog(null,"????????? ????????? ????????????!");
            }else{
           LoadCredit.setText(tmp);
           showMessageDialog(null,"????????? ????????? ??????????????????!");
            }
        }
            }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}