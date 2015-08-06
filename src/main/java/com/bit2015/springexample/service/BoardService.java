package com.bit2015.springexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.springexample.dao.BoardDao;
import com.bit2015.springexample.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	BoardDao boardDao;
	
	public void registerBoard( BoardVo vo ) {
		System.out.println( "BoardService.registerBoard" );
		boardDao.insert(vo);
	}
	
	public List<BoardVo> boardList(){
		List<BoardVo> boardList = boardDao.getList();	
		return boardList;
	}
}
