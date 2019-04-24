package com.app.service.impl;

import org.springframework.stereotype.Service;

import com.app.Model.SaleOrder;
import com.app.dao.ISaleOrderDao;
import com.app.service1.IServiceSaleOrder;
@Service
public class SaleOrderServiceImpl implements IServiceSaleOrder {

	private ISaleOrderDao dao;
	
	@Override
	public Integer save(SaleOrder s) {
		return dao.save(s);
	}

}
