package com.bit.day06.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bit.day06.model.entity.BbsVo;

public interface BbsDao {

	List<BbsVo> selectAll();
	
	BbsVo selectOne(int num);
	
	void insertOne(BbsVo bean);
	
	int updateCnt(int num);

	int updateOne(BbsVo bean);

	int deleteOne(int num);
	
}
