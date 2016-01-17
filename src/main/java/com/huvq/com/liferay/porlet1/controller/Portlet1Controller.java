package com.huvq.com.liferay.porlet1.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class Portlet1Controller {

	@RenderMapping
	public String defaultView(RenderRequest request,RenderResponse response,Model model) {
	    return "port1";
	}
}
