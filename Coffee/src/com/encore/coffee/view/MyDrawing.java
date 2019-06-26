package com.encore.coffee.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class MyCanvas extends Canvas {
	 
	 //처음에 까만색 점 안찍히게 하기 위해서 x,y -값 지정
	 int x=-50; int y=-50, w=7, h=7;
	 Color cr=Color.black;
	 
	 @Override
	 public void paint(Graphics g){
	  g.setColor(cr);
	  g.fillOval(x, y, w, h); // x, y 지점에 70,70 크기의 원 그리기
	 }
	 
	 @Override
	 public void update(Graphics g){
	  paint(g);
	 }
	 
	}

public class MyDrawing extends JPanel {
	 
	 JPanel p1,p2;
	
	 Canvas can; // 부모타입
	 
	 public MyDrawing(){
	  //super("::MyDrawing::");
	  
	  p1=new JPanel(); add(p1, "North");
	  p2=new JPanel(){ // 여백주기
	   public Insets getInsets(){
	    return new Insets(0,10,0,10);
	   }
	  }; add(p2, "Center");
	  p2.setBackground(Color.lightGray);
	  
	  can=new MyCanvas(); // 도화지 역할을 하는 컴포넌트 MyCanvas는 can을 상속 받는 자식->원이 갑자기 생김
	  can.setSize(300, 300); // 도화지 크기
	  can.setBackground(Color.white); // 도화지 배경색 주기
	  p2.add(can);
	  
	  //리스너 부착 -------------------
	  MyHandler my=new MyHandler();
	  can.addMouseMotionListener(my); // 캔버스 객체에 마우스모션리스너를 부착한다.
	    
	  //이번에는 메인에서 안하고 생성자에서 한다
	  setSize(500,500);
	  setVisible(true);
	 }
	 
	 /*이벤트소스: 캔버스
	  * 이벤트: MouseEvent
	  * 이벤트 핸들러: MouseMotionListener를 구현
	  * */
	 
	 class MyHandler implements MouseMotionListener, ActionListener{
	  
	  public void mouseDragged(MouseEvent e){
	   
	   //마우스를 드래그한 지점의 x좌표,y좌표를 얻어와서 can의 x,y 좌표값에 전달한다.
	   int xx=e.getX(); int yy=e.getY();
	   
	   ((MyCanvas)can).x=xx; ((MyCanvas)can).y=yy;
	   
	   //paint()는 JVM이 호출해주는 메소드으로 변경x, repaint을 써서 재사용하자
	   can.repaint();
	   
	  }
	  
	  public void mouseMoved(MouseEvent e){
	  }
	  
	  public void actionPerformed(ActionEvent e){
	   Object o=e.getSource();
	   MyCanvas can2 = (MyCanvas)can;
	   
	  
	  }
	 }
	 
	 /*
	 public static void main(String[] args) {
	  new MyDrawing(); // 생성자 불러오기
	 }
	 */
	 
	}
