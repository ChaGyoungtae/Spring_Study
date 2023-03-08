package org.hdcd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
		
	@GetMapping("/register")
	public String registerForm() {
		log.info("registerForm");
		
		return "success";
	}
	
	@PostMapping("/register")
	public String register() {
		log.info("register");
		
		return "success";
	}
	
	@GetMapping("/modify")
	public String modifyForm() {
		log.info("modifyForm");
		
		return "success";
	}
	
	@PostMapping("/modify")
	public String modify() {
		log.info("modify");
		
		return "success";
	}
	
	@PostMapping("/remove")
	public String remove() {
		log.info("remove");
		
		return "success";
	}
	
	@GetMapping("/list")
	public String list() {
		log.info("list");
		
		return "success";
	}
	
	@RequestMapping("/read/{no}")
	public String read(@PathVariable("no") int boardNo) {
		log.info("read boardNo :" + boardNo);
		
		return "board/read";
	}
	
	
}
