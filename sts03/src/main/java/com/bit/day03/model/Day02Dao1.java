package com.bit.day03.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.bit.day03.model.entity.Day02Vo;

public class Day02Dao1 extends JdbcDaoSupport implements Day02Dao{
//	DataSource dataSource;
	public Day02Dao1() {
//		//Tomcat 라이브러리 사용할 때
//		BasicDataSource dataSource =new BasicDataSource();
//		//dirver 최종 바뀐이름
//		dataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/xe");
//		dataSource.setUsername("scott");
//		dataSource.setPassword("tiger");
//		setDataSource(dataSource);
//		
//		//spring 라이브러리 사용할 때
//		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//		//class를 받는 것 
//		dataSource.setDriverClass(org.gjt.mm.mysql.Driver.class);
//		dataSource.setUrl("jdbc:mysql://localhost:3306/xe");
//		dataSource.setUsername("scott");
//		dataSource.setPassword("tiger");
//		setDataSource(dataSource);		
		
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(getDataSource());
//		setJdbcTemplate(jdbcTemplate);
	}
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
//	
//	public List<Day02Vo> selectAll() throws SQLException{
//		String sql="SELECT * FROM DAY02 ORDER BY NUM DESC";
//		List<Day02Vo> list = new ArrayList<Day02Vo>();
//		Connection conn= null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			conn=getDataSource().getConnection();
//			pstmt=conn.prepareStatement(sql);
//			rs=pstmt.executeQuery();
//			while(rs.next()) {
//				list.add(new Day02Vo(rs.getInt("num")
//						, rs.getString("name")
//						, rs.getString("sub")
//						, rs.getString("content")
//						, rs.getDate("nalja")));
//			}
//		}finally {
//			if(rs!=null)rs.close();
//			if(pstmt!=null)pstmt.close();
//			if(conn!=null)conn.close();
//		}
//		return list;
//	}
	
	public List<Day02Vo> selectAll() throws SQLException{
		String sql="SELECT * FROM DAY02 ORDER BY NUM DESC";
		return getJdbcTemplate().query(sql, new RowMapper<Day02Vo>() {
			
			@Override
			public Day02Vo mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Day02Vo(rs.getInt("num"), rs.getString("name"), rs.getString("sub"), rs.getString("content"), rs.getDate("nalja"));
			}
		});
	}

	@Override
	public void insertOne(Day02Vo bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Day02Vo selectOne(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOne(Day02Vo bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
