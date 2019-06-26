package com.encore.coffee.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.sound.midi.Sequence;


public class CoffeeDAO {//회원 가입 로그인 

	Connection conn;
	// Statement stmt;
	PreparedStatement stmt;
	ResultSet rs;

	Properties pro; // DB접속관련 정보 저장 객체
	
	ArrayList<Object> list;

	public CoffeeDAO() {
		try {
			pro = new Properties(); // 속성 담는 객체
			pro.load(new FileReader("conn/conn.properties"));
			// 속성 driver, url,user,password
			Class.forName(pro.getProperty("driver"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // 생성자

	private void connect() {
		try {
			conn = DriverManager.getConnection(pro.getProperty("url"), pro);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void disconnect() {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean findLogin(String id, String pass) { //로그인
			connect();

		

		try {
			String sql = "select count(*) from member where id=? and pass=?";
			stmt = conn.prepareStatement(sql); // DB에 sql문 전송
			stmt.setString(1, id);
			stmt.setString(2, pass); // 물음표 수만큼 셋팅
			// rs = stmt.executeQuery(sql);
			
			rs = stmt.executeQuery(); // 이미 위에서 sql 문 전송, 중복 전송 X
			if (rs.next()) { // 어자피 1행 나오니까 하지만 습관적으로 if안에 넣어주는 것이 좋음
				// rs.getInt("count(*)") ==> Error 함수명을 컬럼명으로 사용하지 못함
				// rs.getInt("cnt") ==> O <- 별명 줬을 때만
				memberVO vo = new memberVO();
				int cnt = rs.getInt(1);
				if (cnt > 0)
					return true;
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	return false;
	
}
	public Boolean create(memberVO vo) { //회원가입  
		
		connect();
		
	try {
		String sql = "insert into member (id,num, name, pwd, birth, gender, phone, mail, freq) values(?,member_seq.nextval,?,?,?,?,?,?,?)";
		stmt.executeUpdate();
		stmt.setString(1,vo.getId());
		stmt.setInt(2,vo.getNo());
		stmt.setString(3,vo.getName());
		stmt.setString(4,vo.getPwd());
		stmt.setString(5,vo.getBirth());
		stmt.setString(6,vo.getGender());
		stmt.setString(7,vo.getPhone());
		stmt.setString(8,vo.getMail());
		stmt.setInt(9,vo.getFreq());
		return true;
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		disconnect();
	}
		return false;
			
	}
	

	public int check_id (String id) { //id중복확인 
		connect();
		int cnt=0;
		
		try {
			String sql = "select count(*) cnt from member where id=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			rs = stmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt("cnt");
			
			}
						
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return cnt;
	}
	
	public String find_id(String email) { //아이디 찾기 
		connect();
		String id = null;
		
		
		try {
			String sql = "select id from member where email=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			rs = stmt.executeQuery();
			if(rs.next()) {
				id = rs.getString("id");
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return id;
	} 
	
	public String find_pass(String id, String email) { // 패스워드 찾기  
		connect();
		String pass=null;
		
		try {
			String sql = "select pwd from member where id=? and email=?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1,id);
			stmt.setString(2, email);
			rs = stmt.executeQuery();
			if(rs.next()) {
				pass = rs.getString("pwd");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
			
		return pass;
	}

	public boolean cancel_all(Collection c) {
	    boolean modified = false;
	    Iterator it = list.iterator();
	    while (it.hasNext()) {
	        if (c.contains(it.next())) {
	            it.remove();
	            modified = true;
	        }
	    }
	    return modified;
	}//cancel_all

	
}