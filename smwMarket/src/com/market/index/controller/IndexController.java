package com.market.index.controller;

import javax.servlet.http.HttpServletRequest;

import common.frontController.Controller;
import common.frontController.ModelAndView;

public class IndexController implements Controller {

	public ModelAndView index(HttpServletRequest request) {

		ModelAndView mav = new ModelAndView();
		mav.setView("index/index");
		return mav;
	}
}
