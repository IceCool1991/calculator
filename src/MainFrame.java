
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alu26600537w
 */
public class MainFrame extends javax.swing.JFrame {

    private enum OperatorType {
        NONE, ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    private double accumulator, operand;
    private OperatorType operator;
    private char decimalSeparator;
    private boolean erase;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        initMyFields();
    }

    public void initMyFields() {
        accumulator = 0;
        operand = 0;
        erase = false;
        operator = OperatorType.NONE;
        decimalSeparator = getDecimalSeparator();
    }

    public char getDecimalSeparator() {
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());
        return dfs.getDecimalSeparator();
    }

    private void displayResult() {
        inputField.setText("" + accumulator);
    }

    private void eraseIfNeededAndWrite(String number) {
        if (!erase) {
            String field = inputField.getText();
            inputField.setText(field + number);
        } else {
            inputField.setText(number);
            erase = false;
        }
    }

    private void calculateResult() {
        operand = Double.parseDouble(inputField.getText());
        switch (operator) {
            case ADD:
                accumulator += operand;
                break;
            case MULTIPLY:
                accumulator *= operand;
                break;
            case SUBTRACT:
                accumulator -= operand;
                break;
            case DIVIDE:
                accumulator /= operand;
                break;
            case NONE:
                accumulator = operand;
                break;
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

        inputField = new javax.swing.JTextField();
        oneBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        commaBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        minusBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        divideBtn = new javax.swing.JButton();
        eraseBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oneBtn.setText("1");
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        fourBtn.setText("4");
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        commaBtn.setText(",");
        commaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commaBtnActionPerformed(evt);
            }
        });

        twoBtn.setText("2");
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        fiveBtn.setText("5");
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        eightBtn.setText("8");
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        threeBtn.setText("3");
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        sixBtn.setText("6");
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        nineBtn.setText("9");
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("C");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        plusBtn.setText("+");
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });

        minusBtn.setText("-");
        minusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusBtnActionPerformed(evt);
            }
        });

        multiplyBtn.setText("x");
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });

        divideBtn.setText("/");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        eraseBtn.setText("<--");
        eraseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseBtnActionPerformed(evt);
            }
        });

        equalBtn.setText("=");
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(equalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eraseBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oneBtn)
                                    .addComponent(fourBtn)
                                    .addComponent(sevenBtn)
                                    .addComponent(commaBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(twoBtn)
                                    .addComponent(fiveBtn)
                                    .addComponent(eightBtn)
                                    .addComponent(zeroBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(threeBtn)
                                    .addComponent(sixBtn)
                                    .addComponent(nineBtn)
                                    .addComponent(resetBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(plusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(minusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(multiplyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(oneBtn)
                        .addGap(18, 18, 18)
                        .addComponent(fourBtn)
                        .addGap(18, 18, 18)
                        .addComponent(sevenBtn)
                        .addGap(18, 18, 18)
                        .addComponent(commaBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(threeBtn)
                            .addGap(18, 18, 18)
                            .addComponent(sixBtn)
                            .addGap(18, 18, 18)
                            .addComponent(nineBtn)
                            .addGap(18, 18, 18)
                            .addComponent(resetBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(twoBtn)
                            .addGap(18, 18, 18)
                            .addComponent(fiveBtn)
                            .addGap(18, 18, 18)
                            .addComponent(eightBtn)
                            .addGap(18, 18, 18)
                            .addComponent(zeroBtn))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(plusBtn)
                            .addGap(18, 18, 18)
                            .addComponent(minusBtn)
                            .addGap(18, 18, 18)
                            .addComponent(multiplyBtn)
                            .addGap(18, 18, 18)
                            .addComponent(divideBtn))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equalBtn)
                    .addComponent(eraseBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        if(!erase){
        erase = true;
        calculateResult();
        displayResult();
        operator = OperatorType.ADD;
        }
    }//GEN-LAST:event_plusBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        eraseIfNeededAndWrite("1");
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        eraseIfNeededAndWrite("2");
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        eraseIfNeededAndWrite("3");
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        eraseIfNeededAndWrite("4");
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        eraseIfNeededAndWrite("5");
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        eraseIfNeededAndWrite("6");
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        eraseIfNeededAndWrite("7");
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        eraseIfNeededAndWrite("8");
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        eraseIfNeededAndWrite("9");
    }//GEN-LAST:event_nineBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        eraseIfNeededAndWrite("0");
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void eraseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseBtnActionPerformed
        String field = inputField.getText();
        if (field.length() != 0) {
            field = field.substring(0, field.length() - 1);
            inputField.setText(field);
        }
    }//GEN-LAST:event_eraseBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        initMyFields();
        inputField.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void minusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusBtnActionPerformed
        if(!erase){
        erase = true;
        calculateResult();
        displayResult();
        operator = OperatorType.SUBTRACT;
        }
    }//GEN-LAST:event_minusBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        erase = true;
        calculateResult();
        displayResult();
        //operator = OperatorType.NONE;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        if(!erase){
        erase = true;
        calculateResult();
        displayResult();
        operator = OperatorType.MULTIPLY;
        }
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        if(!erase){
        erase = true;
        calculateResult();
        displayResult();
        operator = OperatorType.DIVIDE;
        }
    }//GEN-LAST:event_divideBtnActionPerformed

    private void commaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commaBtnActionPerformed


    }//GEN-LAST:event_commaBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commaBtn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton eraseBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton minusBtn;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
