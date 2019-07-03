package com.encore.coffee.view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
<<<<<<< HEAD
    
    JPanel p1,p2;
   
    Canvas can; // 부모타입
    public MyHandler my;
    
    public MyDrawing(){
     //super("::MyDrawing::");
    // System.out.println("MyDrawing생성자");
       
     p1=new JPanel(); add(p1, "North");
     p2=new JPanel(){ // 여백주기
      public Insets getInsets(){
       return new Insets(0,10,0,10);
      }
     }; add(p2, "Center");
     p2.setBackground(Color.lightGray);
     
     createCanvas();
     
     //리스너 부착 -------------------
      my=new MyHandler();
     can.addMouseMotionListener(my); // 캔버스 객체에 마우스모션리스너를 부착한다.
       
     //이번에는 메인에서 안하고 생성자에서 한다
     setSize(500,500);
     setVisible(true);
    }    
    
    /*이벤트소스: 캔버스
     * 이벤트: MouseEvent
     * 이벤트 핸들러: MouseMotionListener를 구현
     * */
    
    public void createCanvas() {
       
       can=new MyCanvas(); // 도화지 역할을 하는 컴포넌트 MyCanvas는 can을 상속 받는 자식->원이 갑자기 생김
       can.setSize(300, 150); // 도화지 크기
       can.setBackground(Color.white); // 도화지 배경색 주기
       p2.add(can);
       can.addMouseMotionListener(my);
    }
    
    
    
    //내부클래스    
    public class MyHandler implements MouseMotionListener, ActionListener{
      ArrayList<Point> list = new ArrayList();
=======
	 
	 JPanel p1,p2;
	
	 Canvas can; // 부모타입
	 public MyHandler my;
	 
	 public MyDrawing(){
	  //super("::MyDrawing::");
	  System.out.println("MyDrawing생성자");
		 
	  p1=new JPanel(); add(p1, "North");
	  p2=new JPanel(){ // 여백주기
	   public Insets getInsets(){
	    return new Insets(0,10,0,10);
	   }
	  }; add(p2, "Center");
	  p2.setBackground(Color.lightGray);
	  
	  createCanvas();
	  
	  //리스너 부착 -------------------
	   my=new MyHandler();
	  can.addMouseMotionListener(my); // 캔버스 객체에 마우스모션리스너를 부착한다.
	    
	  //이번에는 메인에서 안하고 생성자에서 한다
	  setSize(500,500);
	  setVisible(true);
	 }	 
	 
	 /*이벤트소스: 캔버스
	  * 이벤트: MouseEvent
	  * 이벤트 핸들러: MouseMotionListener를 구현
	  * */
	 
	 public void createCanvas() {
		 
		 can=new MyCanvas(); // 도화지 역할을 하는 컴포넌트 MyCanvas는 can을 상속 받는 자식->원이 갑자기 생김
		 can.setSize(300, 150); // 도화지 크기
		 can.setBackground(Color.white); // 도화지 배경색 주기
		 p2.add(can);
		 can.addMouseMotionListener(my);
	 }
	 
	 
	 
	 //내부클래스	 
	 public class MyHandler implements MouseMotionListener, ActionListener{
		ArrayList<Point> list = new ArrayList();
>>>>>>> refs/remotes/origin/master

<<<<<<< HEAD
      public MyHandler() {
         //System.out.println("MyHandler생성자");
      }
      
      
     public void mouseDragged(MouseEvent e){
        Point location = new Point();
      
      //마우스를 드래그한 지점의 x좌표,y좌표를 얻어와서 can의 x,y 좌표값에 전달한다.
      int xx=e.getX();  int yy=e.getY();
      
      ((MyCanvas)can).x=xx; ((MyCanvas)can).y=yy;
      location.x=xx;
=======
		public MyHandler() {
		   System.out.println("MyHandler생성자");
		}
		
		
	  public void mouseDragged(MouseEvent e){
		  Point location = new Point();
	   
	   //마우스를 드래그한 지점의 x좌표,y좌표를 얻어와서 can의 x,y 좌표값에 전달한다.
	   int xx=e.getX();  int yy=e.getY();
	   
	   ((MyCanvas)can).x=xx; ((MyCanvas)can).y=yy;
	   location.x=xx;
>>>>>>> refs/remotes/origin/master
       location.y=yy; 
	   
	   //paint()는 JVM이 호출해주는 메소드으로 변경x, repaint을 써서 재사용하자
	      can.repaint();
	      list.add(location);
	  }
	  
	  
	  public boolean checkSign() {
		  System.out.println("list size>>>"+ list.size());
		  if(list.size()==0) {
			  JOptionPane.showMessageDialog(null, "사인해주세요!!");
		  }
		  return false;
	  }
	  
	  public void clearCanvas() {	
		  p2.remove(can);
		  createCanvas();	  
		  p2.updateUI();
	  }
	
	  public void mouseMoved(MouseEvent e){
	  }
	  
	  public void actionPerformed(ActionEvent e){
	   Object o=e.getSource();
	   MyCanvas can2 = (MyCanvas)can;	 
	  }
	 }
	 
	 
	 public static void main(String[] args) {
	    new MyDrawing(); 
	 }
		 
	}
