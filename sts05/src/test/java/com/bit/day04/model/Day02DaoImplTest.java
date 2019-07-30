package com.bit.day04.model;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.day04.model.entity.Day02Vo;

//이름순으로 테스트 진행
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Day02DaoImplTest {
	private static Day02Dao day02Dao;
	private static Day02Vo target;	
	private Logger log=Logger.getLogger(this.getClass());

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ctxt=new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		day02Dao=(Day02Dao) ctxt.getBean("day02Dao");
	}

	@Before
	public void setUp() throws Exception {
		target= new Day02Vo(2, "테스터","제목2","내용2",null);
	}

	@Test
	public void test1SelectAll() {
		assertNotNull("null",day02Dao.selectAll());
		log.debug(day02Dao.selectAll().toString());
	}

	@Test
	public void test2SelectOne() {
		//2번째 출력물
		//Day02Vo [num=2, name=테스터, sub=제목2, content=내용2, nalja=2019-07-25]
		assertEquals(target, day02Dao.selectOne(target.getNum()));
	}

	@Test
	public void test3InsertOne() {
		int before = day02Dao.selectAll().size();
		day02Dao.insertOne(target);
		int after = day02Dao.selectAll().size();
		assertSame(after, before+1);
	}

	@Test
	public void test4UpdateOne() {
		target.setName("test");
		day02Dao.updateOne(target);
		assertEquals(target, day02Dao.selectOne(target.getNum()));
		target.setName("테스터");
		day02Dao.updateOne(target);
	}

	@Test
	@Ignore	//무시
	public void test5DeleteOne() {
		int before = day02Dao.selectAll().size();
		day02Dao.deleteOne(7);
		int after = day02Dao.selectAll().size();
		assertSame(after, before-1);
	}

}
