/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

/**
 *
 * @author 20191
 */
public class Menu_emp extends javax.swing.JPanel {
	
	public Menu_emp() {
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

        menu_emp = new javax.swing.JPanel();
        lb_emp_menu_title = new javax.swing.JLabel();
        lb_emp_menu1_main = new javax.swing.JLabel();
        lb_emp_menu2_log = new javax.swing.JLabel();
        lb_emp_menu3_attendance = new javax.swing.JLabel();
        lb_emp_menu4_file = new javax.swing.JLabel();
        lb_emp_menu5_view = new javax.swing.JLabel();
        EmptyBorder emptyBorder = new EmptyBorder(200, 10, 200, 10);
        empty1 = new javax.swing.JLabel();
        empty2 = new javax.swing.JLabel();
        empty3 = new javax.swing.JLabel();
        empty4 = new javax.swing.JLabel();
        lb_emp_menue6_logout3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(200, 700));
        setMinimumSize(new java.awt.Dimension(200, 700));
        setPreferredSize(new java.awt.Dimension(200, 700));

        menu_emp.setBackground(new java.awt.Color(125, 146, 173));
        menu_emp.setMaximumSize(new java.awt.Dimension(200, 700));
        menu_emp.setMinimumSize(new java.awt.Dimension(200, 700));
        menu_emp.setPreferredSize(new java.awt.Dimension(200, 700));
        menu_emp.setLayout(new java.awt.GridLayout(11, 1));

        lb_emp_menu_title.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lb_emp_menu_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_emp_menu_title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/title.png"))); // NOI18N
        lb_emp_menu_title.setText("메뉴");
        lb_emp_menu_title.setIconTextGap(10);
        menu_emp.add(lb_emp_menu_title);

        lb_emp_menu1_main.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menu1_main.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_emp_menu1_main.setBorder(emptyBorder);
        lb_emp_menu1_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mian.png"))); // NOI18N
        lb_emp_menu1_main.setText("메인화면");
        lb_emp_menu1_main.setToolTipText("");
        lb_emp_menu1_main.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_emp_menu1_main.setIconTextGap(10);
        lb_emp_menu1_main.setName(""); // NOI18N
        lb_emp_menu1_main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menu1_mainMouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menu1_main);

        lb_emp_menu2_log.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menu2_log.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_emp_menu2_log.setBorder(emptyBorder);
        lb_emp_menu2_log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log.png"))); // NOI18N
        lb_emp_menu2_log.setText("<html>업무일지<br>조회<html>");
        lb_emp_menu2_log.setIconTextGap(10);
        lb_emp_menu2_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menu2_logMouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menu2_log);

        lb_emp_menu3_attendance.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menu3_attendance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_emp_menu3_attendance.setBorder(emptyBorder);
        lb_emp_menu3_attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/attendance.png"))); // NOI18N
        lb_emp_menu3_attendance.setText("근태 관리");
        lb_emp_menu3_attendance.setToolTipText("");
        lb_emp_menu3_attendance.setIconTextGap(11);
        lb_emp_menu3_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menu3_attendanceMouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menu3_attendance);

        lb_emp_menu4_file.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menu4_file.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_emp_menu4_file.setBorder(emptyBorder);
        lb_emp_menu4_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/file.png"))); // NOI18N
        lb_emp_menu4_file.setText("문서함");
        lb_emp_menu4_file.setIconTextGap(12);
        lb_emp_menu4_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menu4_fileMouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menu4_file);

        lb_emp_menu5_view.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menu5_view.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_emp_menu5_view.setBorder(emptyBorder);
        lb_emp_menu5_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view.png"))); // NOI18N
        lb_emp_menu5_view.setText("출퇴근 조회");
        lb_emp_menu5_view.setIconTextGap(11);
        lb_emp_menu5_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menu5_viewMouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menu5_view);

        empty1.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        empty1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empty1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_emp.add(empty1);

        empty2.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        empty2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empty2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_emp.add(empty2);

        empty3.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        empty3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empty3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_emp.add(empty3);

        empty4.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        empty4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empty4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_emp.add(empty4);

        lb_emp_menue6_logout3.setFont(new java.awt.Font("맑은 고딕", 1, 20)); // NOI18N
        lb_emp_menue6_logout3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_emp_menue6_logout3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        lb_emp_menue6_logout3.setText("로그아웃");
        lb_emp_menue6_logout3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb_emp_menue6_logout3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_emp_menue6_logout3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_emp_menue6_logout3MouseClicked(evt);
            }
        });
        menu_emp.add(lb_emp_menue6_logout3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(menu_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(menu_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lb_emp_menu1_mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menu1_mainMouseClicked
    	A_card1 card1 = new A_card1();
        Background.content_card.add(card1, "A_card1");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card1");
    }//GEN-LAST:event_lb_emp_menu1_mainMouseClicked

    private void lb_emp_menu2_logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menu2_logMouseClicked
    	A_card2 card2 = new A_card2();
        Background.content_card.add(card2, "A_card2");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card2");
    }//GEN-LAST:event_lb_emp_menu2_logMouseClicked

    private void lb_emp_menu3_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menu3_attendanceMouseClicked
    	A_card3 card3 = new A_card3();
        Background.content_card.add(card3, "A_card3");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card3");
    }//GEN-LAST:event_lb_emp_menu3_attendanceMouseClicked

    private void lb_emp_menu4_fileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menu4_fileMouseClicked
    	A_card4 card4 = new A_card4();
        Background.content_card.add(card4, "A_card4");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card4");
    }//GEN-LAST:event_lb_emp_menu4_fileMouseClicked

    private void lb_emp_menu5_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menu5_viewMouseClicked
        A_card5 card5 = new A_card5();
        Background.content_card.add(card5, "A_card5");
    	CardLayout card = (CardLayout)Background.content_card.getLayout();
    	card.show(Background.content_card, "A_card5");
    }//GEN-LAST:event_lb_emp_menu5_viewMouseClicked
    
    private void lb_emp_menue6_logout3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_emp_menue6_logout3MouseClicked
    	CardLayout card = (CardLayout) Login.login_card.getLayout();
        card.show(Login.login_card, "login");
    }//GEN-LAST:event_lb_emp_menue6_logout3MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empty1;
    private javax.swing.JLabel empty2;
    private javax.swing.JLabel empty3;
    private javax.swing.JLabel empty4;
    private javax.swing.JLabel lb_emp_menu1_main;
    private javax.swing.JLabel lb_emp_menu2_log;
    private javax.swing.JLabel lb_emp_menu3_attendance;
    private javax.swing.JLabel lb_emp_menu4_file;
    private javax.swing.JLabel lb_emp_menu5_view;
    private javax.swing.JLabel lb_emp_menu_title;
    private javax.swing.JLabel lb_emp_menue6_logout3;
    private javax.swing.JPanel menu_emp;
    // End of variables declaration//GEN-END:variables
}
