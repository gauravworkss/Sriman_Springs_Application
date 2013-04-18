package com.cw.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cw.beans.Employee;
import com.cw.beans.SearchCriteria;

public class SearchValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		return SearchCriteria.class.isAssignableFrom(classType);
	}

	@Override
	public void validate(Object command, Errors errors) {
		SearchCriteria criteria = (SearchCriteria) command;

		if (criteria.getId() <= 0) {
			errors.reject("invalid employee id");
		}
	}

}
