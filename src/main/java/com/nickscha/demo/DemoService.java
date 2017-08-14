package com.nickscha.demo;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DemoService implements Serializable {

	private static final long serialVersionUID = -6217554446261716101L;

	@PostConstruct
	public void init() {
		Logger.getLogger(DemoService.class.getName()).info(() -> "Initialized DemoService !");
	}

	public String text() {
		return "Hello from Demo service !";
	}

}
