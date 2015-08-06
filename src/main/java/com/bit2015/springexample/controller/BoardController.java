package com.bit2015.springexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit2015.springexample.service.BoardService;
import com.bit2015.springexample.vo.BoardVo;

@Controller
@RequestMapping( "/board" )
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	
	@RequestMapping( "/insert" )
	public String insert(@ModelAttribute BoardVo vo) {
		
		
		boardService.registerBoard(vo);		
		return "index";
	}
	
	
	@RequestMapping( "/list" )
	public String list(Model model) {
		
		List<BoardVo> list = boardService.boardList();
		model.addAttribute("list", list);
		return "index2";
	}
}
