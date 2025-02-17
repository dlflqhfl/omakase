/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import vo.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.apache.ibatis.session.SqlSession;

import factory.Factory;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class A_card2_1 extends javax.swing.JPanel {

	String w_idx; //상세하게 볼 Wlog의 인덱스 번호
	WLogVO selectWlog; //상세하게 볼 Wlog의 객체
	FileVO selectFile; //상세하게 볼 File의 객체
	
	File selectedFile; // 수정할 때 선택된 파일
	String fileName; // 수정할 때 선택된 파일 이름
	
	
    public A_card2_1(String selectData) { //해당 업무 일지의 idx를 인자로 받음
    	this.w_idx = selectData;
    	initComponents(); // 화면 구성
    	
    	getInfo();
    	viewInfo();
	}
    
    private void getInfo() {
    	SqlSession ss = Factory.getFactory().openSession();
    	
    	selectWlog = ss.selectOne("w_log.selectWlog", this.w_idx); // w_log의 인덱스 번호 -> 해당하는 WLogVO를 반환
    	selectFile = ss.selectOne("file.selectFileData", this.w_idx); // // w_log의 인덱스 번호 -> 해당하는 FileVO를 반환
    	
    	if (selectFile != null) {
            int selectCate = Integer.parseInt(selectFile.getCate());
            comboBox.setSelectedIndex(selectCate);
         }
    	
    	if(ss!=null)
    		ss.close();
    }
    
    private void viewInfo() {
    	A_2_1_tf_title.setText(selectWlog.getW_name());
    	A_2_1_tf_writer.setText(A_card1.evo.getEname());
    	String W_date = selectWlog.getW_date().toString();
    	int indexOfSpace = W_date.indexOf(' ');
    	String formattedW_date = W_date.substring(0, indexOfSpace);
    	A_2_1_tf_add_date.setText(formattedW_date);
    	A_2_1_ta_content.setText(selectWlog.getW_content());
    	if(selectFile!=null) {
    		A_2_1_tf_file.setText(selectFile.getFile_url());
    	}
    	
    	A_2_1_tf_title.enable(false);
    	A_2_1_tf_writer.enable(false);
    	A_2_1_tf_add_date.enable(false);
    	A_2_1_tf_file.enable(false);
    	A_2_1_ta_content.enable(false);
    	comboBox.enable(false);
    	A_2_1_bt_addfile.setEnabled(false);
    	A_2_1_bt_save.setEnabled(false);
    	
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A_card2_1 = new javax.swing.JPanel();
        A_2_1_jp = new javax.swing.JPanel();
        A_2_1_lb_title2 = new javax.swing.JLabel();
        A_2_1_lb_writer = new javax.swing.JLabel();
        A_2_1_lb_add_date = new javax.swing.JLabel();
        A_2_1_lb_category = new javax.swing.JLabel();
        A_2_1_lb_file = new javax.swing.JLabel();
        A_2_1_tf_title = new java.awt.TextField();
        A_2_1_tf_writer = new java.awt.TextField();
        A_2_1_tf_add_date = new java.awt.TextField();
        A_2_1_tf_file = new java.awt.TextField();
        A_2_1_sp_content = new javax.swing.JScrollPane();
        A_2_1_ta_content = new javax.swing.JTextArea();
        A_2_1_bt_change = new javax.swing.JButton();
        A_2_1_bt_change.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
            	A_2_1_tf_title.enable(true);
            	A_2_1_tf_add_date.enable(true);
            	A_2_1_tf_file.enable(true);
            	A_2_1_ta_content.enable(true);
            	comboBox.enable(true);
            	A_2_1_bt_addfile.setEnabled(true);
            	A_2_1_bt_change.setEnabled(false);
            	A_2_1_bt_save.setEnabled(true);
        	}
        });
        A_2_1_bt_back = new javax.swing.JButton();
        A_2_1_bt_save = new javax.swing.JButton();
        A_2_1_bt_save.setEnabled(false);
        A_2_1_pl_title = new javax.swing.JPanel();
        A_2_1_lb_title = new javax.swing.JLabel();
        A_2_1_lb_content = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        A_card2_1.setBackground(new java.awt.Color(233, 240, 248));
        A_card2_1.setMaximumSize(new java.awt.Dimension(1100, 700));
        A_card2_1.setMinimumSize(new java.awt.Dimension(1100, 700));
        A_card2_1.setPreferredSize(new java.awt.Dimension(1100, 700));

        A_2_1_jp.setBackground(new java.awt.Color(233, 240, 248));

        A_2_1_lb_title2.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_title2.setText("제목");

        A_2_1_lb_writer.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_writer.setText("작성자");

        A_2_1_lb_add_date.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_add_date.setText("등록일");

        A_2_1_lb_category.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_category.setText("첨부파일 유형");

        A_2_1_lb_file.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_file.setText("첨부파일");
        
        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"없음", "세금계산서", "기안서", "제안서", "보고서"}));
        
        A_2_1_bt_addfile = new JButton("파일추가");
        A_2_1_bt_addfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		A_2_1_bt_addfileActionPerformed(e);
        	}
        });
        
        javax.swing.GroupLayout A_2_1_jpLayout = new javax.swing.GroupLayout(A_2_1_jp);
        A_2_1_jpLayout.setHorizontalGroup(
        	A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_2_1_jpLayout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(A_2_1_jpLayout.createSequentialGroup()
        					.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(A_2_1_lb_add_date)
        						.addComponent(A_2_1_lb_writer)
        						.addComponent(A_2_1_lb_title2))
        					.addGap(30)
        					.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(A_2_1_tf_title, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)
        						.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(A_2_1_tf_add_date, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(A_2_1_tf_writer, GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))))
        				.addGroup(A_2_1_jpLayout.createSequentialGroup()
        					.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(A_2_1_lb_category)
        						.addComponent(A_2_1_lb_file))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
        						.addGroup(A_2_1_jpLayout.createSequentialGroup()
        							.addComponent(A_2_1_tf_file, GroupLayout.PREFERRED_SIZE, 465, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(A_2_1_bt_addfile, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap(375, Short.MAX_VALUE))
        );
        A_2_1_jpLayout.setVerticalGroup(
        	A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(A_2_1_jpLayout.createSequentialGroup()
        			.addGap(17)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(A_2_1_lb_title2)
        				.addComponent(A_2_1_tf_title, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(A_2_1_lb_writer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(A_2_1_tf_writer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(A_2_1_lb_add_date, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(A_2_1_tf_add_date, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(A_2_1_lb_category)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(A_2_1_bt_addfile)
        				.addGroup(A_2_1_jpLayout.createParallelGroup(Alignment.LEADING, false)
        					.addComponent(A_2_1_lb_file, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(A_2_1_tf_file, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        A_2_1_jp.setLayout(A_2_1_jpLayout);

        A_2_1_ta_content.setColumns(20);
        A_2_1_ta_content.setRows(5);
        A_2_1_sp_content.setViewportView(A_2_1_ta_content);

        A_2_1_bt_change.setText("수정");

        A_2_1_bt_back.setText("뒤로가기");
        A_2_1_bt_back.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		A_card2 card2 = new A_card2();
                Background.content_card.add(card2, "A_card2");
            	CardLayout card = (CardLayout)Background.content_card.getLayout();
            	card.show(Background.content_card, "A_card2");
        	}
        });

        A_2_1_bt_save.setText("저장");
        A_2_1_bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_2_1_bt_saveActionPerformed(evt);
                A_2_1_bt_save.setEnabled(false);
            }
        });

        A_2_1_pl_title.setBackground(new java.awt.Color(52, 73, 102));
        A_2_1_pl_title.setPreferredSize(new java.awt.Dimension(90, 30));

        A_2_1_lb_title.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        A_2_1_lb_title.setForeground(new java.awt.Color(255, 255, 255));
        A_2_1_lb_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        A_2_1_lb_title.setText("업무일지 상세 조회");

        javax.swing.GroupLayout A_2_1_pl_titleLayout = new javax.swing.GroupLayout(A_2_1_pl_title);
        A_2_1_pl_title.setLayout(A_2_1_pl_titleLayout);
        A_2_1_pl_titleLayout.setHorizontalGroup(
            A_2_1_pl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_1_pl_titleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(A_2_1_lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        A_2_1_pl_titleLayout.setVerticalGroup(
            A_2_1_pl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_2_1_pl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_2_1_lb_title, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        A_2_1_lb_content.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        A_2_1_lb_content.setText("내용");

        javax.swing.GroupLayout A_card2_1Layout = new javax.swing.GroupLayout(A_card2_1);
        A_card2_1.setLayout(A_card2_1Layout);
        A_card2_1Layout.setHorizontalGroup(
            A_card2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card2_1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(A_card2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(A_card2_1Layout.createSequentialGroup()
                        .addComponent(A_2_1_bt_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A_2_1_bt_change, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A_2_1_bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(A_card2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(A_2_1_lb_content)
                        .addComponent(A_2_1_sp_content, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, A_card2_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(A_2_1_jp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(A_2_1_pl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        A_card2_1Layout.setVerticalGroup(
            A_card2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(A_card2_1Layout.createSequentialGroup()
                .addComponent(A_2_1_pl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(A_2_1_jp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_2_1_lb_content)
                .addGap(18, 18, 18)
                .addComponent(A_2_1_sp_content, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(A_card2_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_2_1_bt_change, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_2_1_bt_save, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_2_1_bt_back))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(A_card2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void A_2_1_bt_addfileActionPerformed(java.awt.event.ActionEvent evt) {
    	JFileChooser chooser = new JFileChooser();
		
		int returnValue = chooser.showOpenDialog(null); // 파일 선택 대화 상자를 띄움
		
		if (returnValue == JFileChooser.APPROVE_OPTION) { // 사용자가 파일을 선택했을 때
			selectedFile = chooser.getSelectedFile();
            fileName = selectedFile.getName();
            // 선택한 파일에 대한 처리를 수행 (예: 파일 경로 출력)
            System.out.println("선택한 파일: " + selectedFile.getAbsolutePath());
            System.out.println("선택된 파일 : " + fileName);
            A_2_1_tf_file.setText(selectedFile.getAbsolutePath());
            
        } else {
            // 사용자가 파일을 선택하지 않았거나 취소했을 때
            System.out.println("파일 선택이 취소되었습니다.");
        }
    }
    
    private void A_2_1_bt_saveActionPerformed(java.awt.event.ActionEvent evt) {
    	//업무일지 데이터
    	WLogVO updateWLogData = new WLogVO();
    	updateWLogData.setW_idx(selectWlog.getW_idx());
    	updateWLogData.setW_name(A_2_1_tf_title.getText());
    	updateWLogData.setW_content(A_2_1_ta_content.getText());
    	
    	//업무일지 업데이트
    	SqlSession ss = Factory.getFactory().openSession();
    	int updateWlog = ss.update("w_log.updateWlog", updateWLogData);
    	if( updateWlog  > 0) {
			ss.commit();
    	} else {
			ss.rollback();
    	}
    	
    	int selectCate = comboBox.getSelectedIndex();
    	
    	//파일 데이터
    	FileVO updateFileData = new FileVO();
    	updateFileData.setW_idx(Integer.parseInt(w_idx));
		updateFileData.setCate(String.valueOf(selectCate));
		updateFileData.setFile_url(A_2_1_tf_file.getText());
    	
		//파일 업데이트
    	int updateFile = ss.update("file.updateFile", updateFileData);
    	if( updateFile > 0) {
			System.out.println("성공");
			ss.commit();
		} else {
			System.out.println("실패");
			ss.rollback();
		}
    	
    	if( ss != null) {
    		ss.close();
    	}
    }//GEN-LAST:event_A_2_1_bt_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_2_1_bt_back;
    private javax.swing.JButton A_2_1_bt_change;
    private javax.swing.JButton A_2_1_bt_save;
    private javax.swing.JPanel A_2_1_jp;
    private javax.swing.JLabel A_2_1_lb_add_date;
    private javax.swing.JLabel A_2_1_lb_category;
    private javax.swing.JLabel A_2_1_lb_content;
    private javax.swing.JLabel A_2_1_lb_file;
    private javax.swing.JLabel A_2_1_lb_title;
    private javax.swing.JLabel A_2_1_lb_title2;
    private javax.swing.JLabel A_2_1_lb_writer;
    private javax.swing.JPanel A_2_1_pl_title;
    private javax.swing.JScrollPane A_2_1_sp_content;
    private javax.swing.JTextArea A_2_1_ta_content;
    private java.awt.TextField A_2_1_tf_add_date;
    private java.awt.TextField A_2_1_tf_file;
    private java.awt.TextField A_2_1_tf_title;
    private java.awt.TextField A_2_1_tf_writer;
    private javax.swing.JPanel A_card2_1;
    javax.swing.JComboBox comboBox;
    javax.swing.JButton A_2_1_bt_addfile;
}
