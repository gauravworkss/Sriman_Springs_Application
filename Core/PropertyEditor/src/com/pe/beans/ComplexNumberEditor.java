package com.pe.beans;

import java.beans.PropertyEditorSupport;

public class ComplexNumberEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		int base = 0;
		int expo = 0;

		if (text != null && !text.equals("")) {
			base = Integer.parseInt(text.substring(0, text.indexOf("/")));
			expo = Integer.parseInt(text.substring(text.indexOf("/")+1,
					text.length()));
			ComplexNumber number = new ComplexNumber(base, expo);
			setValue(number);
		}
	}

}
