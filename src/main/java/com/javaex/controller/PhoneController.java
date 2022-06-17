package com.javaex.controller;

import java.util.List;
import java.util.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.javaex.service.PhoneService;
import com.javaex.vo.PersonVo;

@Controller
public class PhoneController {
	//필드
	
	@Autowired
	private PhoneService phoneService;
	
	
	// 메소드
	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public String list(Model model) {
		System.out.println("PhoneController>list");
		
		List<PersonVo> pList = phoneService.personSelect();
	

		model.addAttribute("pList", pList);

		return "list";
	}

	
	//등록 폼
	@RequestMapping(value = "/writeForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeForm() {
		System.out.println("PhoneController>writeForm");
		
		return "writeForm";
	}

	//등록
	@RequestMapping(value = "/write", method = { RequestMethod.GET, RequestMethod.POST })
	public String write(@ModelAttribute PersonVo personVo) { 
		System.out.println("PhoneController>write()");

		int count = phoneService.personInsert2();

		return "redirect:/list";
	}

	//삭제 
	@RequestMapping(value = "/delete/", method = { RequestMethod.GET, RequestMethod.POST })
	public String delete(@RequestParam("no") int no) {
		System.out.println("PhoneController>delete");

		int count = phoneService.personDelete(no);

		return "redirect:/list";
	}

	
	//수정폼 
	@RequestMapping(value = "/updateForm", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateForm(Model model, @RequestParam("no") int no) {
		System.out.println("PhoneController>updateForm");

		PersonVo pVo = phoneService.getPerson(no);

		model.addAttribute("personVo", personVo);

		return "updateForm";
	}

	
	//수정
	@RequestMapping(value = "/update", method = { RequestMethod.GET, RequestMethod.POST })
	public String update(@ModelAttribute PersonVo personVo) {
		System.out.println("PhoneController>update");

		int count = phoneService.personUpdate(personVo);

		return "redirect:/list";
	}
}