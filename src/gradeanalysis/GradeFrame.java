/*
 * GradeFrame
 * created by WilliamBD on May 24 2018
 * to analyse a collection of grades
 */
package gradeanalysis;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author widea9928
 */
public class GradeFrame extends javax.swing.JFrame {

    private Component frame;

    /**
     * Creates new form GradeFrame
     */
    public GradeFrame() {
        initComponents();
        Grades.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Grades = new javax.swing.JTextArea();
        newGrade = new javax.swing.JTextField();
        AddGrade = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Analysis = new javax.swing.JTextArea();
        analysisLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title.setText("Grade Analysis");

        Grades.setEditable(false);
        Grades.setColumns(3);
        Grades.setRows(5);
        jScrollPane1.setViewportView(Grades);

        newGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGradeActionPerformed(evt);
            }
        });

        AddGrade.setText("AddGrade");
        AddGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGradeActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Analysis.setEditable(false);
        Analysis.setColumns(20);
        Analysis.setRows(5);
        Analysis.setAutoscrolls(false);
        jScrollPane2.setViewportView(Analysis);

        analysisLabel.setText("Analysis:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(AddGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(analysisLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(AddGrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1)))
                        .addContainerGap())
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void AddGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGradeActionPerformed
        MainFunction();
    }//GEN-LAST:event_AddGradeActionPerformed

    private void newGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGradeActionPerformed
        MainFunction();
    }//GEN-LAST:event_newGradeActionPerformed

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
            java.util.logging.Logger.getLogger(GradeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGrade;
    private javax.swing.JTextArea Analysis;
    private javax.swing.JTextArea Grades;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel analysisLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField newGrade;
    // End of variables declaration//GEN-END:variables
    ArrayList<Integer> grades = new ArrayList();
    
    private void MainFunction() {
        //takes the text box mark
        int newGr = newMark();
        
        //ends program if the grade entered is invalid
        if (newGr == -1){
            return;
        }
        
        Grades.append(newGr+"\n");
        
        grades.add(newGr);

        //collects average of the marks
        double average = calculateAverage(grades);
        //rounds average to two decimal places
        average = (Math.round(average*100))/100;
        
        //sorts the marks for use by later functions
        Collections.sort(grades);
        
        //gets max and min
        int max = getMax(grades);
        int min = getMin(grades);
        
        //gets range
        int range = getRange(min,max);
        
        //gets the number of students at each level
        int rStudents = rTally(grades);
        int firstLevStudents = firstLevTally(grades);
        int secondLevStudents = secondLevTally(grades);
        int thirdLevStudents = thirdLevTally(grades);
        int fourthLevStudents = fourthLevTally(grades);
        
        //outputs all the info
        Analysis.setText("Class Average: "+average+"%\n");
        Analysis.append("Highest Score: "+max+"\n");
        Analysis.append("Lowest Score: "+min+"\n");
        Analysis.append("Number of 'R' Level Students: "+rStudents+"\n");
        Analysis.append("Number of Level 1 Students: "+firstLevStudents+"\n");
        Analysis.append("Number of Level 2 Students: "+secondLevStudents+"\n");
        Analysis.append("Number of Level 3 Students: "+thirdLevStudents+"\n");
        Analysis.append("Number of Level 4 Students: "+fourthLevStudents+"\n");
        
    }
    
    /**
    *  newMark
    *  Analyses the data in the newGrade textfield and returns the it, catching exceptions.
    * 
    *  @return the data inputted to the newGrade textfield
    *  @exception returns -1
    */
    private int newMark() {
        //initialises newG
        int newG = -1;
        
        //parses the integer and catches if the grade is not a integer.
        try {
            newG = Integer.parseInt(newGrade.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid mark entered!");
            return -1;
        }
        
        //if the integer is outside of the acceptable range, return -1.
        if (newG<=100 && newG>=0){
            return newG;
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid mark entered!");
            return -1;
        }
    }
    
    /**
     * calculateAverage
     * Calculates the average of the array
     * 
     * @param grades
     * @return average
     */
    private double calculateAverage(ArrayList<Integer> grades) {
        double sum = 0;
        for (Integer grade : grades) {
           sum+=grade;
        }
        double average = sum/grades.size();
        return average;
    }

    /**
     * getMax
     * Takes the sorted grades Arraylist, and returns the largest number.
     * 
     * @param grades
     * @return highest mark
     */
    private int getMax(ArrayList<Integer> grades) {
        int max = grades.get(grades.size()-1);
        return max;
    }

    /**
     * getMin
     * Takes the sorted grades Arraylist, and returns the lowest number.
     * 
     * @param grades
     * @return lowest mark
     */
    private int getMin(ArrayList<Integer> grades) {
        int min = grades.get(grades.size()-1);
        return min;
    }

    /**
     * getRange
     * returns the difference between two numbers.
     * 
     * @param min
     * @param max
     * @return range
     */
    private int getRange(int min, int max) {
         int range = max-min;
         return range;
    }

    /**
     * rTally
     * 
     * takes the grades ArrayList and then returns the number of students who got below 50 
     * @param grades
     * @return number of students with marks below 50%
     */
    private int rTally(ArrayList<Integer> grades) {
        int tally =0;
        for (Integer grade: grades){
            if (grade<50){
                tally+=1;
            }
        }
        return tally;
    }

    /**
     * firstLevTally
     * 
     * returns the number of students with level 1's
     * @param grades
     * @return number of students at level 1
     */
    private int firstLevTally(ArrayList<Integer> grades) {
        int tally =0;
        for (Integer grade: grades){
            if (grade>=50 && grade<60){
                tally+=1;
            }
        }
        return tally;
    }
    
    /**
     * secondLevTally
     * 
     * @param grades
     * @return the number of students with a Level 2
     */
    private int secondLevTally(ArrayList<Integer> grades) {
        int tally =0;
        for (Integer grade: grades){
            if (grade>=60 && grade<70){
                tally+=1;
            }
        }
        return tally;
    }

    /**
     * thirdLevTally
     * 
     * @param grades
     * @return number of students with a Level 3
     */
    private int thirdLevTally(ArrayList<Integer> grades) {
        int tally =0;
        for (Integer grade: grades){
            if (grade>=70 && grade<80){
                tally+=1;
            }
        }
        return tally;
    }
    
    /**
     * fourthLevTally
     * 
     * @param grades
     * @return number of students with a Level 4
     */
    private int fourthLevTally(ArrayList<Integer> grades) {
        int tally =0;
        for (Integer grade: grades){
            if (grade>=80){
                tally+=1;
            }
        }
        return tally;
    }
}
