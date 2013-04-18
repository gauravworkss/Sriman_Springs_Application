package com.sfw.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sfw.beans.Employee;

public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return Employee.class.isAssignableFrom(classType);
	}

	@Override
	public void validate(Object command, Errors errors) {
		Employee emp = (Employee) command;

		if (emp.getId() <= 0) {
			errors.reject("emp.id.invalid");
		}
		if (emp.getName() == null || emp.getName().equals("")) {
			errors.reject("emp.name.invalid");
		}
	}

}
