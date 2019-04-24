package com.app.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.Model.SaleOrder;
import com.app.dao.ISaleOrderDao;

@Repository
public class SaleOrderDaoImpl implements ISaleOrderDao {
   @Autowired
	private HibernateTemplate ht;
	
	
	
	@Override
	public Integer save(SaleOrder s) {
		return (Integer) ht.save(s);
		
	}
}
