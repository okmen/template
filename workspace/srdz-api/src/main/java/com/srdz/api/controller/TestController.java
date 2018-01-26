package com.srdz.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/test")
public class TestController {

	@ResponseBody
	@RequestMapping(value = "/pushOrder")
	public String downloadorder(String a) throws Exception {
		return a;
	}
	
}
