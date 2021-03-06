/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.text.*;
/**
 *
 * @author EvMcQ5970
 */
public class FamilyBudget extends javax.swing.JFrame {
    String b1 = "", b2 = "", b3 = "", b4 = "";
    /**
     * Creates new form FamilyBudget
     */
    public FamilyBudget() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        subTitle = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        transField = new javax.swing.JTextField();
        houseField = new javax.swing.JTextField();
        lifeField = new javax.swing.JTextField();
        saveField = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        incomeField = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        middle = new javax.swing.JPanel();
        title2 = new javax.swing.JLabel();
        bLabel1 = new javax.swing.JLabel();
        bLabel2 = new javax.swing.JLabel();
        bLabel3 = new javax.swing.JLabel();
        bLabel4 = new javax.swing.JLabel();
        per1 = new javax.swing.JLabel();
        per2 = new javax.swing.JLabel();
        per3 = new javax.swing.JLabel();
        per4 = new javax.swing.JLabel();
        bar1 = new javax.swing.JLabel();
        bar2 = new javax.swing.JLabel();
        bar3 = new javax.swing.JLabel();
        bar4 = new javax.swing.JLabel();
        bottom = new javax.swing.JPanel();
        oLabel1 = new javax.swing.JLabel();
        oLabel2 = new javax.swing.JLabel();
        oLabel3 = new javax.swing.JLabel();
        oLabel4 = new javax.swing.JLabel();
        failLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top.setBackground(new java.awt.Color(255, 255, 255));
        top.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));
        top.setForeground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        title.setText("Family Budget");

        subTitle.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        subTitle.setText("Enter the amount you spend in each category per month.");

        label1.setText("Housing:");

        label2.setText("Transportation:");

        label3.setText("Life:");

        label4.setText("Savings:");

        label5.setText("Enter your net monthly income:");

        button.setText("Calculate");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(title))
                    .addGroup(topLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, topLayout.createSequentialGroup()
                                .addComponent(label5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(incomeField))
                            .addComponent(subTitle, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(houseField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(transField)
                    .addComponent(lifeField)
                    .addComponent(saveField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button)
                .addGap(53, 53, 53))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subTitle)
                .addGap(18, 18, 18)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(transField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(lifeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(saveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label5)
                    .addComponent(incomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        middle.setBackground(new java.awt.Color(204, 255, 204));
        middle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));

        title2.setFont(new java.awt.Font("Swis721Cyrillic BT", 0, 18)); // NOI18N
        title2.setText("Monthly Spending");

        bLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bLabel1.setText("Housing:");

        bLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bLabel2.setText("Transportation:");

        bLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bLabel3.setText("Life:");

        bLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bLabel4.setText("Savings:");

        per1.setFont(new java.awt.Font("Pakenham Kayo", 0, 14)); // NOI18N
        per1.setText("0%");

        per2.setFont(new java.awt.Font("Pakenham Kayo", 0, 14)); // NOI18N
        per2.setText("0%");

        per3.setFont(new java.awt.Font("Pakenham Kayo", 0, 14)); // NOI18N
        per3.setText("0%");

        per4.setFont(new java.awt.Font("Pakenham Kayo", 0, 14)); // NOI18N
        per4.setText("0%");

        bar1.setBackground(new java.awt.Color(255, 0, 0));
        bar1.setForeground(new java.awt.Color(255, 0, 0));
        bar1.setOpaque(true);

        bar2.setBackground(new java.awt.Color(255, 255, 0));
        bar2.setForeground(new java.awt.Color(255, 255, 0));
        bar2.setOpaque(true);

        bar3.setBackground(new java.awt.Color(0, 0, 255));
        bar3.setForeground(new java.awt.Color(0, 0, 255));
        bar3.setOpaque(true);

        bar4.setBackground(new java.awt.Color(153, 0, 255));
        bar4.setForeground(new java.awt.Color(153, 0, 255));
        bar4.setOpaque(true);

        javax.swing.GroupLayout middleLayout = new javax.swing.GroupLayout(middle);
        middle.setLayout(middleLayout);
        middleLayout.setHorizontalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleLayout.createSequentialGroup()
                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(middleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bLabel2)
                            .addComponent(bLabel3)
                            .addComponent(bLabel4)
                            .addComponent(bLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(middleLayout.createSequentialGroup()
                                    .addComponent(per2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bar2, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE))
                                .addGroup(middleLayout.createSequentialGroup()
                                    .addComponent(per1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(middleLayout.createSequentialGroup()
                                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(per4)
                                    .addComponent(per3))
                                .addGap(12, 12, 12)
                                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bar3, javax.swing.GroupLayout.DEFAULT_SIZE, 6, Short.MAX_VALUE)
                                    .addComponent(bar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(middleLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(title2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        middleLayout.setVerticalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title2)
                .addGap(41, 41, 41)
                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel1)
                    .addComponent(per1)
                    .addComponent(bar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel2)
                    .addComponent(per2)
                    .addComponent(bar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel3)
                    .addComponent(per3)
                    .addComponent(bar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bLabel4)
                    .addComponent(per4)
                    .addComponent(bar4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        bottom.setBackground(new java.awt.Color(204, 204, 204));
        bottom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));

        oLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        oLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        oLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        oLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        failLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(failLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(oLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(oLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(failLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(top, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        // Variables
        double hSpent, tSpent, lSpent, sSpent;
                
        double netIn;
        
        int hFail = 0, tFail = 0, lFail = 0, sFail = 0;
        
        
        
        // Number Format
        DecimalFormat rounded = new DecimalFormat("#,###,###");
        
        // Getting values
        hSpent = Double.parseDouble(houseField.getText());
        tSpent = Double.parseDouble(transField.getText());
        lSpent = Double.parseDouble(lifeField.getText());
        sSpent = Double.parseDouble(saveField.getText());
        netIn = Double.parseDouble(incomeField.getText());
        
        // Calculating percentages
        double hPer = (hSpent / netIn) * 100;
        double tPer = (tSpent / netIn) * 100;
        double lPer = (lSpent / netIn) * 100;
        double sPer = (sSpent / netIn) * 100;
        
        System.out.println(hSpent);
        
        // Displaying percentages
        per1.setText((int)hPer + "%");
        per2.setText((int)tPer + "%");
        per3.setText((int)lPer + "%");
        per4.setText((int)sPer + "%");
        
        // Creating bars
        for (int i = 0; i < hPer; i++) {
            b1 = b1 + "-";
            
             
        }
        
        for (int j = 0; j < tPer; j++) {
            b2 = b2 + " ";
            
        }
        
        for (int u = 0; u < lPer; u++) {
            b3 = b3 + " ";
            
        }
        
        for (int g = 0; g < sPer; g++) {
            b4 = b4 + " ";
            
        }
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        // Setting bars
        bar1.setText(b1);
        bar2.setText(b2);
        bar3.setText(b3);
        bar4.setText(b4);
        
        // Displaying messages
        if (hPer > 35) {
            oLabel1.setText("You're spending too much on your house. Chill out.");
            hFail = 1;
        } else {
            oLabel1.setText("Good job! Your spending on housing is okay!");
        }
        
        if (tPer > 15) {
            oLabel2.setText("You're spending too much on your car. Chill out.");
            tFail = 1;
        } else {
            oLabel2.setText("Good job! Your spending on transportation is okay!");
        }
        
        if (lPer > 25) {
            oLabel3.setText("You're spending too much on life. Not even a good cereal.");
            lFail = 1;
        } else {
            oLabel3.setText("Good job! Your spending on transportation is okay!");
        }
        
        if (sPer > 10) {
            oLabel4.setText("Nice! Putting money in the bank I see.");
        } else {
            oLabel4.setText("You gon' die poor");
            sFail = 1;
        }
        
        // Bonus if you're really awful
        if (hFail == 1 && tFail == 1 && lFail == 1 && sFail == 1) {
            failLabel.setText("You are not very good at budgeting money");
        }
        
    }//GEN-LAST:event_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(FamilyBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FamilyBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FamilyBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FamilyBudget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FamilyBudget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bLabel1;
    private javax.swing.JLabel bLabel2;
    private javax.swing.JLabel bLabel3;
    private javax.swing.JLabel bLabel4;
    private javax.swing.JLabel bar1;
    private javax.swing.JLabel bar2;
    private javax.swing.JLabel bar3;
    private javax.swing.JLabel bar4;
    private javax.swing.JPanel bottom;
    private javax.swing.JButton button;
    private javax.swing.JLabel failLabel;
    private javax.swing.JTextField houseField;
    private javax.swing.JTextField incomeField;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JTextField lifeField;
    private javax.swing.JPanel middle;
    private javax.swing.JLabel oLabel1;
    private javax.swing.JLabel oLabel2;
    private javax.swing.JLabel oLabel3;
    private javax.swing.JLabel oLabel4;
    private javax.swing.JLabel per1;
    private javax.swing.JLabel per2;
    private javax.swing.JLabel per3;
    private javax.swing.JLabel per4;
    private javax.swing.JTextField saveField;
    private javax.swing.JLabel subTitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JPanel top;
    private javax.swing.JTextField transField;
    // End of variables declaration//GEN-END:variables
}
