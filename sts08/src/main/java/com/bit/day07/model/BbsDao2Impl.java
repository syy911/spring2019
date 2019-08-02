package com.bit.day07.model;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.day07.model.entity.BbsVo;

@Repository
public class BbsDao2Impl implements BbsDao {
	@Inject
	SqlSession sqlSesstion;
	
	@Override
	public List<BbsVo> selectAll() throws SQLException {
		
		return sqlSesstion.selectList("bbs.selectAll");
	}

	@Override
	public void InsertOne(BbsVo bean) throws SQLException {
		sqlSesstion.insert("bbs.insertOne", bean);
	}

	@Override
	public BbsVo selectOne(int num) throws SQLException {
		return sqlSesstion.selectOne("bbs.selectOne",num);
	}

}
