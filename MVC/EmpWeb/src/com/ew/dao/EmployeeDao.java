package com.ew.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ew.hlo.EmployeeHLO;

public class EmployeeDao {
	private HibernateTemplate hibernateTemplate;

	public EmployeeDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void insert(EmployeeHLO employeeHLO) {
		hibernateTemplate.save(employeeHLO);
	}
}
