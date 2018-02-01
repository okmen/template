package com.srdz.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srdz.dao.EErrorsMapper;
import com.srdz.entity.EErrors;
import com.srdz.service.IEErrorService;


@Controller
@RequestMapping(value = "/test")
public class TestController {
	@Autowired
	private EErrorsMapper errorMapper;
	@Autowired
	private IEErrorService errorService;
	
	
	@ResponseBody
	@RequestMapping(value = "/pushOrder")
	public String downloadorder(long a) throws Exception {
		try {
			EErrors mode= errorService.selectById(a);
			if(mode!=null){
				return mode.getCreatetime().toGMTString();//ss
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e); 
		}
		
		return String.valueOf(a);
	}
	
}
