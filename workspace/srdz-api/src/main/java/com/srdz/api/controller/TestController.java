package com.srdz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srdz.dao.EErrorsMapper;
import com.srdz.entity.EErrors;
import com.srdz.service.EErrorsService;


@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Autowired
	private EErrorsService errorMapper;
	
	@ResponseBody
	@RequestMapping(value = "/pushOrder")
	public String downloadorder(long a) throws Exception {
		try {
			EErrors mode= errorMapper.selectById(a);
			if(mode!=null){
				return mode.getClassname();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e); 
		}
		
		return String.valueOf(a);
	}
	
}
