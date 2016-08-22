package com.example.web.rest;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

	private String helloString = "Hello World!";

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return helloString;
	}

	@RequestMapping(method = RequestMethod.POST)
	public void index(@NotNull @NotEmpty String helloString) {
		this.helloString = helloString;
	}

}
