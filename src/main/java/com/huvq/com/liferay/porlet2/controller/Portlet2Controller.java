package com.huvq.com.liferay.porlet2.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class Portlet2Controller {

	@RenderMapping
	public String defaultView() {
	    return "port2";
	}
}
