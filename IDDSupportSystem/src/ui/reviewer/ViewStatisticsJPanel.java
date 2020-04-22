/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.reviewer;

import business.enterprise.Enterprise;
import business.individuals.Individual;
import business.individuals.IndividualDirectory;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author kales
 */
public class ViewStatisticsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStatisticsJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    IndividualDirectory individualDirectory;
    Individual individual;
    Enterprise enterprise;
    List<WorkRequest> completedList;
    int countBad = 0;
    int countGood = 0;
    int countAverage = 0;
    int countVeryGood = 0;

    public ViewStatisticsJPanel(JPanel userProcessContainer, UserAccount userAccount, IndividualDirectory individualDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.individualDirectory = individualDirectory;
        this.enterprise = enterprise;
        this.completedList = new ArrayList<>();
        getStatistics();
    }

    public void getStatistics() {
        for (WorkRequest wr : userAccount.getWorkQueue().getWorkRequestList()) {
            if (wr.getStatus().equalsIgnoreCase("Completed") || wr.getStatus().equalsIgnoreCase("Request Completed")) {
                completedList.add(wr);
            }
        }
        if (completedList.isEmpty()) {
            this.notificationTxt.setText("No work requests present to show statistics");
            chartPanel.setVisible(false);
        } else {
            this.notificationTxt.setText("");
            chartPanel.setVisible(true);
            for (WorkRequest wr : completedList) {
                if (wr.getStatus().equals("Bad")) {
                    countBad++;
                } else  if (wr.getStatus().equals("Good")) {
                    countGood++;
                }else  if (wr.getStatus().equals("Very Good")) {
                    countVeryGood++;
                }else if(wr.getStatus().equals("Average")){
                    countAverage++;
                }
              
            }
            populateChart();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        notificationTxt = new javax.swing.JLabel();
        chartPanel = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NewImages/reviewER.png"))); // NOI18N
        jLabel2.setText("FEEDBACK STATISTICS");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(260, 40, 439, 50);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/BackgroundBlue.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 30, 630, 60);

        backBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/backbutton.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn);
        backBtn.setBounds(30, 100, 110, 40);
        jPanel2.add(notificationTxt);
        notificationTxt.setBounds(320, 170, 270, 50);

        chartPanel.setBackground(new java.awt.Color(255, 255, 255));
        chartPanel.setLayout(new java.awt.BorderLayout());
        jPanel2.add(chartPanel);
        chartPanel.setBounds(0, 250, 940, 490);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 940, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ReviewerWorkAreaJPanel reviewerJPanel = (ReviewerWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    public void populateChart() {
        System.out.println("in chart");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(countBad, "Count", "Bad");
        dataset.setValue(countAverage, "Count", "Average");
        dataset.setValue(countGood, "Count", "Good");
        dataset.setValue(countVeryGood, "Count", "Very Good");
        JFreeChart jfreeChart = ChartFactory.createBarChart("Feedback Statistics", "Feedback", "Count of Feedbacks", dataset, PlotOrientation.VERTICAL, false, true, false);
        //    CategoryPlot p = jfreeChart.getCategoryPlot();
        //    p.setRangeGridlinePaint(Color.BLACK);
        ChartPanel panel = new ChartPanel(jfreeChart);
        chartPanel.removeAll();
        chartPanel.add(panel, BorderLayout.CENTER);
        chartPanel.validate();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel chartPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel notificationTxt;
    // End of variables declaration//GEN-END:variables
}
