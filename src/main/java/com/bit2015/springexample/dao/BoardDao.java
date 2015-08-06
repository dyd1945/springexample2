package com.bit2015.springexample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.springexample.vo.BoardVo;

@Repository
public class BoardDao {
	
	@Autowired
	SqlSession sqlSessionTemplate;
	
	//crud
	public void insert( BoardVo vo ) {
		sqlSessionTemplate.insert( "BoardMapper.insert", vo );
	}
	
	public List<BoardVo> getList() {
		System.out.println( "BoardDao.getList" );
		return sqlSessionTemplate.selectList("BoardMapper.list");

	}
}
