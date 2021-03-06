/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseClient;

import CourseInterface.CourseInterface;
import helper.StudentView;
import java.rmi.ConnectException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Frank.Tilugulilwa
 */
public class CourseClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form CourseClientGUI
     */
    public CourseClientGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextRegNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextYears = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSemesters = new javax.swing.JTextField();
        jButtonViewStudentCW = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStudent = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextCourseCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextYearL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextSemesterL = new javax.swing.JTextField();
        jButtonViewOverallCourse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaLecturer = new javax.swing.JTextArea();
        jButtonClear = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COURSE CLIENT APP - REMOTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Student View"));

        jLabel1.setText("Registration Number");

        jTextRegNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRegNumberActionPerformed(evt);
            }
        });

        jLabel2.setText("Year");

        jLabel3.setText("Semester");

        jButtonViewStudentCW.setText("View  Course Work");
        jButtonViewStudentCW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewStudentCWActionPerformed(evt);
            }
        });

        jTextAreaStudent.setColumns(20);
        jTextAreaStudent.setRows(5);
        jScrollPane1.setViewportView(jTextAreaStudent);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jTextRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(58, 58, 58)
                        .addComponent(jTextYears, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jTextSemesters, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jButtonViewStudentCW)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonViewStudentCW)
                            .addComponent(jTextSemesters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lecturer View"));

        jLabel4.setText("Course Code");

        jLabel5.setText("Year");

        jLabel6.setText("Semester");

        jButtonViewOverallCourse.setText("View Course Work");
        jButtonViewOverallCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewOverallCourseActionPerformed(evt);
            }
        });

        jTextAreaLecturer.setColumns(20);
        jTextAreaLecturer.setRows(5);
        jScrollPane2.setViewportView(jTextAreaLecturer);

        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonExit.setText("EXIT");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(71, 71, 71)
                        .addComponent(jTextCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addComponent(jTextYearL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6)
                        .addGap(56, 56, 56)
                        .addComponent(jTextSemesterL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jButtonViewOverallCourse))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonViewOverallCourse)
                            .addComponent(jTextSemesterL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextYearL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonExit))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextRegNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRegNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRegNumberActionPerformed

    
    //Displays the course details of a given students
    private void jButtonViewStudentCWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewStudentCWActionPerformed
           
            
        if(this.jTextRegNumber.getText().trim().isEmpty()||this.jTextYears.getText().trim().isEmpty()||this.jTextSemesters.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "One or more field is empty !!!");   
        }else{     
        
        try {
            /* Creates the registry and does look of the binded remote object*/
            
            Registry reg = LocateRegistry.getRegistry("192.168.8.102",1099);
            CourseInterface c = (CourseInterface) reg.lookup("results");
            
            ArrayList<StudentView> slist = new ArrayList<StudentView>();
            slist = c.diplayStudentScores(this.jTextRegNumber.getText().trim(), Integer.parseInt(this.jTextYears.getText().trim()), Integer.parseInt(this.jTextSemesters.getText().trim()));
            
            //System.out.print(slist.size());
            String outputResults = "Names \t\t Course Code \t Test 1 \t Test 2 \t Assign 1 \t Assign 2 \t Presentation \t Total\n";
            String line ="";
            
            for (int i=0; i<slist.size();i++){
                
                line = slist.get(i).getNames()+"\t";
                line += slist.get(i).getCourseCode()+"\t";
                line += slist.get(i).getTest1Score()+"\t";
                line += slist.get(i).getTest2Score()+"\t";
                line += slist.get(i).getAssignment1Score()+"\t";
                line += slist.get(i).getAssignment2score()+"\t";
                line += slist.get(i).getPresentationScore()+"\t";
                
                int a = slist.get(i).getTest1Score();
                int b = slist.get(i).getTest2Score();
                int f = slist.get(i).getAssignment1Score();
                int d = slist.get(i).getAssignment2score();
                int e = slist.get(i).getPresentationScore();
                
                int total = ((a+b+f+d+e)*100)/500;
                
                line += total;
                
                outputResults += line+"\n";
                
                //System.out.println(slist.get(i).getAssignment1Score());
            }
            this.jTextAreaStudent.setText(outputResults);
            }catch (ConnectException e) {
                JOptionPane.showMessageDialog(this, "Server is not reachable");            
            }catch(NumberFormatException en){
                JOptionPane.showMessageDialog(this, "One or more fields have text instead of numerals");
            }catch(Exception ex){
                ex.printStackTrace();
            }


            }
           
    }//GEN-LAST:event_jButtonViewStudentCWActionPerformed

    
    //Displays courseworks per course per year per semester
    private void jButtonViewOverallCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewOverallCourseActionPerformed
        
        if(this.jTextCourseCode.getText().trim().isEmpty()||this.jTextYearL.getText().trim().isEmpty()||this.jTextSemesterL.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "One or more field is empty !!!");   
        }else{ 
        try {
            /* Creates the registry and does look of the binded remote object*/
            
            Registry reg = LocateRegistry.getRegistry("192.168.8.102",1099);
            CourseInterface c = (CourseInterface) reg.lookup("results");
            
            ArrayList<StudentView> slist = new ArrayList<StudentView>();
            slist = c.displayStudentsPerCourse(this.jTextCourseCode.getText().trim(), Integer.parseInt(this.jTextYearL.getText().trim()), Integer.parseInt(this.jTextSemesterL.getText().trim()));
            
            //System.out.print(slist.size());
            String outputResults = "Names \t\t Course Code \t Test 1 \t Test 2 \t Assign 1 \t Assign 2 \t Presentation \t Total \n";
            String line ="";
            
            for (int i=0; i<slist.size();i++){
                
                line = slist.get(i).getNames()+"\t\t";
                line += slist.get(i).getCourseCode()+"\t";
                line += slist.get(i).getTest1Score()+"\t";
                line += slist.get(i).getTest2Score()+"\t";
                line += slist.get(i).getAssignment1Score()+"\t";
                line += slist.get(i).getAssignment2score()+"\t";
                line += slist.get(i).getPresentationScore()+"\t";
                
                int a = slist.get(i).getTest1Score();
                int b = slist.get(i).getTest2Score();
                int f = slist.get(i).getAssignment1Score();
                int d = slist.get(i).getAssignment2score();
                int e = slist.get(i).getPresentationScore();
                
                int total = ((a+b+f+d+e)*100)/500;
                line += total+"\n";
                outputResults += line;
                
                //System.out.println(slist.get(i).getAssignment2score());
            }
            this.jTextAreaLecturer.setText(outputResults);
        } catch (ConnectException e) {
            JOptionPane.showMessageDialog(this, "Server is not reachable");  
        } catch(NumberFormatException en){
            JOptionPane.showMessageDialog(this, "One or more fields have text instead of numerals");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        }
                 

    }//GEN-LAST:event_jButtonViewOverallCourseActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        this.jTextAreaLecturer.setText("");
        this.jTextAreaStudent.setText("");
        this.jTextRegNumber.setText("");
        this.jTextYearL.setText("");
        this.jTextYears.setText("");
        this.jTextSemesterL.setText("");
        this.jTextSemesters.setText("");
        this.jTextCourseCode.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(CourseClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//        try {
//            /* Create and display the form */
//            
//            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
//            CourseInterface c = (CourseInterface) reg.lookup("results");
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonViewOverallCourse;
    private javax.swing.JButton jButtonViewStudentCW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaLecturer;
    private javax.swing.JTextArea jTextAreaStudent;
    private javax.swing.JTextField jTextCourseCode;
    private javax.swing.JTextField jTextRegNumber;
    private javax.swing.JTextField jTextSemesterL;
    private javax.swing.JTextField jTextSemesters;
    private javax.swing.JTextField jTextYearL;
    private javax.swing.JTextField jTextYears;
    // End of variables declaration//GEN-END:variables
}
