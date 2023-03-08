package org.hdcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
		
	@RequestMapping(value="/register")
	public void registerForm() {
		log.info("modifyForm");
	}
	
	@RequestMapping(value="/modify")
	public void modifyForm() {
		log.info("modifyForm");
	}
	
	@RequestMapping("/list")
	public void list() {
		log.info("list");
	}
	
	@RequestMapping("/read/{boardNo}")
	public String read(@PathVariable int boardNo) {
		log.info("read boardNo :" + boardNo);
		
		return "board/read";
	}
	
	
}
