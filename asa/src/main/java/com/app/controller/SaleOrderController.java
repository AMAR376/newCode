package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.Model.SaleOrder;
import com.app.service1.IServiceSaleOrder;

@Controller
@RequestMapping("/sale")
public class SaleOrderController {
	@Autowired	
private IServiceSaleOrder saleOrderService;
	  
	@RequestMapping("/register")
	public String register(ModelMap map) {
		map.addAttribute("saleorder",new SaleOrder());
		return "SaleOrderRegister";
		
	}
	
}
